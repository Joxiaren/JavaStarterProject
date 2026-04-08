package xyz.jovanstoiljkovic.starter.utility.datainit;

import org.springframework.stereotype.Component;
import xyz.jovanstoiljkovic.starter.models.Food;

@Component
public class FoodDataInit extends BaseDataInit<Food>{
    public FoodDataInit(BaseDataGenerator<Food> generator) {
        super(generator);
    }
}
