package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class Application {
    public static void main (String[] args){
       CurrencySet currencySet = new CurrencySetLoader().load();
       ExchangeOperation exchangeOperation = new ExchangeOperation(currencySet);
    }
}
