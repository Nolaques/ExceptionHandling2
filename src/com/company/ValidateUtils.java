package com.company;

public class ValidateUtils {

    // Метод проверки 1 кандидатуры
    public static void checkPerson(Person person) throws ValidateException{

        try {
            // Проверка возраста.
            // Действительно ли в рамках 18-40
            // Этот метод может выбросить TooOldException,TooYoungException.
            AgeUtils.checkAge(person.getAge());
        }catch (Exception e){
            throw new ValidateException(e);
        }

        if (person.getGender().equals(Person.FEMALE)){
            GenderException e = new GenderException("Don't accept women");
            throw new ValidateException(e);
        }
        if (person.getGender().equals(Person.MALE)){
            GenderException e = new GenderException("Welcome");
            throw new ValidateException(e);
        }
    }
}
