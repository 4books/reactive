package com.example.chapter4;

import java.util.Collections;
import java.util.List;

public class Example4_4 {

    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;

        Collections.sort(cryptoCurrencies, (cc1, cc2) -> cc1.getUnit().name().compareTo(cc2.getUnit().name()));


        for (CryptoCurrency cryptoCurrency : cryptoCurrencies) {
            System.out.println("암호화폐명 : " + cryptoCurrency.getName() + ", 가격 : " + cryptoCurrency.getPrice());
        }
    }
}
