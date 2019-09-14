package com.example.pattern.factorymethod.demo1;

public class CashPayFactory extends PayMethodFactory {
    @Override
    public AbstractPay getPayMethod() {
        return new CashPay();
    }
}
