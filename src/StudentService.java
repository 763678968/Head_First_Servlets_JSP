public class StudentService {

    StudentDao studentDao = new StudentDao();

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
