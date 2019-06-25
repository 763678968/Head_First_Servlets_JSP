package com.example;
import javax.servlet.http.*;
import java.io.*;

public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
    private String breed;
    // 假设这里还有更多实例变量，包括一些
    // 非Serializable的实例变量

    // 假设这里是构造函数以及其他获取方法和设置方法

    public void valueBound(HttpSessionBindingEvent event) {
        // 我知道我在一个会话中时要运行的代码
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        // 我知道已经不在一个会话中时要运行的代码
    }

    public void sessionWillPassivate(HttpSessionEvent event) {
        // 这些代码将非Serializable字段置为某种状态，
        // 以便顺利地迁移到一个新VM
    }

    public void sessionDidActivate(HttpSessionBindingEvent event) {
        // 这些代码用于恢复字段……取消
        // 在sessionWillPassivate()中做的动作
    }

}
