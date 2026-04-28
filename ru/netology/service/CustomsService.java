package ru.netology.service;

public class CustomsService {

        public static final int PRICE_RATIO = 100;
        public static final int WEIGHT_RATIO = 100;
        
        public static int calcCustoms(int price, int weight) {
           int finalPrice = price / PRICE_RATIO + weight * WEIGHT_RATIO;
           return finalPrice;
    }
}
