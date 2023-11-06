package com.crud.cruddemo.dao;

import com.crud.cruddemo.entity.Student;

public interface StudentDAO {

    default void save(Student theStudent){

    }
}
