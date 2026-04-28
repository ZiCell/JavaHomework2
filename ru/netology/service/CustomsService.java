package ru.netology.service;

public class CustomsService {

        public static String finalPrice;
        
        public static int calcCustoms(int price, int weight) {
        int finalPrice = price / 100 + weight * 100;
        return finalPrice;
    }
}
