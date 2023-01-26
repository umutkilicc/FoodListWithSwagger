package com.FoodListSwagger.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
Created the domain class named Employee.
Also, later in the controller class we will be performing CRUD operations for the employee object.
So we will also be overriding the equals and hashCode methods in the Employee class.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    private int id;
    private String soup;
    private String mainDish;
    private String sideDish;
    private String dessert;




}
