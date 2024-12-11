package com.flyaction.demo.test10;

import com.flyaction.demo.entities.Person;

/**
 * @author: action
 * @create: 2024/12/9 17:04
 **/
public class TransmitValueOrRef
{
    public void changeValue1(int age){
        age = 30;
    }
    public void changeValue2(Person person){
        person.setPersonName("xxx");
    }
    public void changeValue3(String str){
        str = "xxx";
    }
    public static void main(String[] args){
        TransmitValueOrRef test = new TransmitValueOrRef();
        int age = 20;
        test.changeValue1(age);
        System.out.println("age----"+age);

        Person person = new Person("abc");
        test.changeValue2(person);
        System.out.println("personName-----"+person.getPersonName());

        String str = "abc";
        test.changeValue3(str);
        System.out.println("String-----"+str);
    }
}
