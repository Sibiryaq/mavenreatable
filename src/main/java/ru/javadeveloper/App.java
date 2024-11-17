package ru.javadeveloper;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Gson gson = new Gson();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите JSON => ");
        final String input = scanner.nextLine();
        try {
            gson.fromJson(input, Map.class);
            System.out.println("Был введен корректный JSON");
        } catch (JsonSyntaxException exception) {
            System.out.println("Был введён некорректный JSON");
        }
    }
}
