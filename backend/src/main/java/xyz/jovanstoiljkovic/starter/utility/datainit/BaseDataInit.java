package xyz.jovanstoiljkovic.starter.utility.datainit;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseDataInit<T>{
    @Autowired
    BaseDataGenerator<T> generator;
}
