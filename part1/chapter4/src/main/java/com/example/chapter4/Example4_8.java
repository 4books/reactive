package com.example.chapter4;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;

public class Example4_8 {
    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;
        int btcPrice = cryptoCurrencies.stream()
                .filter(cc -> cc.getUnit() == CryptoCurrency.CurrencyUnit.BTC)
                .findFirst()
                .get()
                .getPrice();

        int amount = 2;

        PaymentCalculator paymentCalculator = new PaymentCalculator();

        cryptoCurrencies.stream()
                .filter(cc -> cc.getUnit() == CryptoCurrency.CurrencyUnit.BTC)
                .map(cc -> new ImmutablePair(cc.getPrice(), amount))
                .map(paymentCalculator::getTotalPayment)
                .forEach(System.out::println);
    }
}
