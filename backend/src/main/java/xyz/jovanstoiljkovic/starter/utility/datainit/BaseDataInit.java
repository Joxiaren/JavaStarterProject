package xyz.jovanstoiljkovic.starter.utility.datainit;

public class BaseDataInit<T>{
    BaseDataGenerator<T> generator;

    public BaseDataInit(BaseDataGenerator<T> generator) {
        this.generator = generator;
    }
}
