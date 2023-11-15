package org.geny;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.geny.dto.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish fries = new Dish("French Fries", 2.99, FoodType.VEGE);
        Beverage coke = new Beverage("Coke", 1.99, false);
        Combo cokesAndFries = new Combo("Coke & Fries");
        cokesAndFries.addDish(fries);
        cokesAndFries.addBeverage(coke);

        restaurantManagementSystem.addCombo(cokesAndFries);

        System.out.println(restaurantManagementSystem);
    }
}
