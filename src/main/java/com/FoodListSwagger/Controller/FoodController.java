package com.FoodListSwagger.Controller;
/*
In the controller class, we will be creating a list of employees.
Then we will be exposing the REST GET, POST and DELETE endpoints.
 */

import com.FoodListSwagger.Entity.Food;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {

    private List<Food> foods = createList();

    @RequestMapping(value = "/food", method = RequestMethod.GET, produces = "application/json")
    public List<Food> firstPage() {
        return foods;
    }


    @PostMapping(value = "/add")
    public Food create(@RequestBody Food food) {
        foods.add(food);
        return food;
    }

    private static List<Food> createList() {
        List<Food> tempFoods = new ArrayList<>();
        Food emp1 = new Food(1, "Mercimek", "tavuk", "pilav", "keşkül");
        tempFoods.add(emp1);
        return tempFoods;
    }
}
