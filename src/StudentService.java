import java.util.List;

public class StudentService {

    StudentDao studentDao = new StudentDao();

    // 根据学号查询学生
    public Student queryStudentBySno(int sno) {
        return studentDao.queryStudentBySno(sno);
    }

    // 查询全部学生
    public List<Student> queryAllStudents() {
        return studentDao.queryAllStudents();
    }


    public boolean updateStudentBySno(int sno, Student student) {
        if (studentDao.isExist(sno)) {
            return studentDao.deleteStudentBySno(sno);
        }
        return false;
    }

    public boolean deleteStudentBySno(int sno) {
        if (studentDao.isExist(sno)) {
            return studentDao.deleteStudentBySno(sno);
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (!studentDao.isExist(student.getSno())) { // 不存在
            studentDao.addStudent(student);
            return true;
        } else {
            System.out.println("此人已存在！");
            return false;
        }
    }
}
