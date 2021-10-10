package com.xefei.propereditor;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * jdk类型转换器
 */
public class StringtoUser extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User u1 = new User();
        u1.setName(text);
        this.setValue(u1);
    }

    public static void main(String[] args) {
        StringtoUser stringtoUser = new StringtoUser();
        stringtoUser.setAsText("ss");
        User u1 = (User)stringtoUser.getValue();
        System.out.println(u1);
    }
}
