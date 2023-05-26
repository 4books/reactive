package com.example.chapter4;

import java.util.List;

public class Example4_7 {
    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;
        cryptoCurrencies.stream()
                .map(cryptoCurrency -> cryptoCurrency.getName())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
