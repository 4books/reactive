package com.example.chapter4;

import java.util.List;

public class Example4_5 {
    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;

        String korBTC = "비트코인";

        cryptoCurrencies.stream()
                .filter(cc -> cc.getUnit() == CryptoCurrency.CurrencyUnit.BTC)
                .map(cc -> cc.getName() + "(" + korBTC + ")")
                .forEach(System.out::println);
    }
}
