package ru.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloBean {

    private final String text;

    HelloBean(@Value("${helloBean.greeting}") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
