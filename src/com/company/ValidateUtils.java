package com.company;

public class ValidateUtils {

    // ����� �������� 1 �����������
    public static void checkPerson(Person person) throws ValidateException{

        try {
            // �������� ��������.
            // ������������� �� � ������ 18-40
            // ���� ����� ����� ��������� TooOldException,TooYoungException.
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
