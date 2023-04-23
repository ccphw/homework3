package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String [] players = {"Стив", "Марио", "Алекс"};
        System.out.println(Arrays.toString(players));
        String [] lessons = {"Кл. Ч.", "Английский язык", "Русский язык", "ИЗО", "Литература"};
        System.out.println(Arrays.toString(lessons));
        int [] numbers = new int[20];
        int o;
        for(int i = 0; i < 20; i++) {
            o = i + 1;
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}