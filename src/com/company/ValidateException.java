package com.company;

public class ValidateException extends Exception{
    // Обернуть(wrap) Exception в другой Exception
    public ValidateException(Exception e){
        super(e);
    }

}
