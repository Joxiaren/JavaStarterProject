package xyz.jovanstoiljkovic.starter.utility.datainit;

import java.util.List;

public abstract class BaseDataGenerator<T> {
    public abstract T generate();
    public abstract List<T> generateMany(int amount);
}
