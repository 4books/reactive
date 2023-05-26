package com.example.chapter4;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Example4_6 {
    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;

        cryptoCurrencies.stream()
                .map(CryptoCurrency::getName)
                .map(StringUtils::upperCase)
                .forEach(System.out::println);
    }
}
