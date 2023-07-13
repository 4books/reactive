package com.example.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example4_13 {
    public static void main(String[] args) {
        List<CryptoCurrency> cryptoCurrencies = SampleData.cryptoCurrencies;
        List<CryptoCurrency> filtered = filter(cryptoCurrencies, cc ->
                cc.getUnit() == CryptoCurrency.CurrencyUnit.BTC ||
                        cc.getUnit() == CryptoCurrency.CurrencyUnit.ETH);

        addBookmark(filtered, Example4_13::saveBookmark);

    }

    private static List<CryptoCurrency> filter(List<CryptoCurrency> cryptoCurrencies, Predicate<CryptoCurrency> p) {
        List<CryptoCurrency> result = new ArrayList<>();
        for (CryptoCurrency cc : cryptoCurrencies) {
            if(p.test(cc)){
                result.add(cc);
            }
        }
        return result;
    }

    private static void addBookmark(List<CryptoCurrency> cryptoCurrencies, Consumer<CryptoCurrency> consumer){
        for (CryptoCurrency cc : cryptoCurrencies) {
            consumer.accept(cc);
        }
    }

    private static void saveBookmark(CryptoCurrency cryptoCurrency){
        System.out.println("# Save " + cryptoCurrency.getName());
    }
}
