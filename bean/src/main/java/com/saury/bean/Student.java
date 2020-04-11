package com.saury.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private int id;
    private String name;
}
