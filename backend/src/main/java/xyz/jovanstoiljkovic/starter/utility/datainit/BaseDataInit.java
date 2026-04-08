package xyz.jovanstoiljkovic.starter.utility.datainit;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseDataInit<T>{
    BaseDataGenerator<T> generator;

    public BaseDataInit(BaseDataGenerator<T> generator) {
        this.generator = generator;
    }
}
