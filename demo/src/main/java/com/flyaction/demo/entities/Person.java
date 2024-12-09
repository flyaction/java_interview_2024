package com.flyaction.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: action
 * @create: 2024/12/9 16:29
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person
{
    private  Integer id;
    private String personName;
    public Person(String personName){
        this.personName = personName;
    }
}
