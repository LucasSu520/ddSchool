package com.duoduo.ddschool.listner;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

import java.util.ArrayList;
import java.util.List;

public class OnlineUserListener implements HttpSessionBindingListener {
    private String userName;

    public OnlineUserListener(String userName){
        this.userName = userName;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();

        ServletContext servletContext = session.getServletContext();
        List<String> onlineUserList = (List<String>) servletContext.getAttribute("onlineUserList");
        if (onlineUserList == null) {
            onlineUserList = new ArrayList<>();
            servletContext.setAttribute("onlineUserList", onlineUserList);
        }
        onlineUserList.add(this.userName);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();

        ServletContext servletContext = session.getServletContext();
        List<String> onlineUserList = (List<String>) servletContext.getAttribute("onlineUserList");
        onlineUserList.remove(this.userName);
    }
}
