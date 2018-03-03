package com.company;

public class WrapperExceptionDemo {
    public static void main(String[] args) {

        // Кандидатура.
        Person person = new Person("Marry", Person.FEMALE, 26);

        try {

            ValidateUtils.checkPerson(person);
        }catch (ValidateException wrap){
            // Получить действительную причину.
            // Может быть TooYoungException, TooOldException, GenderException.
            Exception cause = (Exception) wrap.getCause();

            if (cause!=null){
                System.out.println("Not pass, cause: "+ cause.getMessage());
            }else{
                System.out.println(wrap.getMessage());
            }
        }

        Person person1 = new Person("John", Person.MALE, 28);

        try {
            ValidateUtils.checkPerson(person1);
        } catch (ValidateException wrap) {
            Exception cause = (Exception) wrap.getCause();
            if (cause != null){
                System.out.println("Y r passed " + cause.getMessage());
            }else{
                System.out.println(wrap.getMessage());
            }
        }


    }
}
