package com.company;

public class ValidateException extends Exception{
    // ��������(wrap) Exception � ������ Exception
    public ValidateException(Exception e){
        super(e);
    }

}
