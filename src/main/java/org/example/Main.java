package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Только нечетные");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Collections.sort(nums2);
        System.out.println(" Четные по возрастанию  ");
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0) {
                System.out.println(nums.get(i));

            }
        }


        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "три", "три", "три"));
        List<String> stringsNonDulicates = new ArrayList<>();
        String check = "";

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(check) != true) {
                stringsNonDulicates.add(strings.get(i));
                check = strings.get(i);
            }
        }

        System.out.println("Уникальные слова" + stringsNonDulicates.toString());
        int[] quantity = new int[stringsNonDulicates.size()];

        for (int i = 0; i < stringsNonDulicates.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(j) == stringsNonDulicates.get(i)) {
                    quantity[i]++;
                }

            }
            System.out.println("Слово  " + stringsNonDulicates.get(i) + " встречается " + quantity[i] + " раз");
        }


    }
}
