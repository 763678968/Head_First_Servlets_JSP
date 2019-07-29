package com;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class BeanListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("绑定Bean对象（将Bean对象增加到session域），绑定的对象：" + this + ", sessionId:" + event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("解绑Bean对象（将Bean对象从session域中移除），解绑的对象：" + this + ", sessionId:" +event.getSession().getId());
    }
}
