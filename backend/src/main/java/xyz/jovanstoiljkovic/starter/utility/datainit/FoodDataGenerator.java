package xyz.jovanstoiljkovic.starter.utility.datainit;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;
import xyz.jovanstoiljkovic.starter.models.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class FoodDataGenerator extends BaseDataGenerator<Food> {

    private final Random r = new Random();

    @Override
    public Food generate() {
        Food item = new Food();

        item.setId(r.nextLong(1000));
        item.setName(RandomStringUtils.insecure().next(10));
        item.setExpiryDate(new Date());
        item.setIngredientCount(r.nextInt(15));
        item.setCalories(r.nextDouble(1000));

        return item;
    }

    @Override
    public List<Food> generateMany(int amount) {
        if(amount <= 0) return List.of();

        ArrayList<Food> itemList = new ArrayList<>();

        for(int j = 0; j < amount; j++){
            itemList.add(this.generate());
        }

        return itemList;
    }
}
