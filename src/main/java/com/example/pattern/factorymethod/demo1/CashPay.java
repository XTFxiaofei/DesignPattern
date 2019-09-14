package com.example.pattern.factorymethod.demo1;

public class CashPay extends AbstractPay {
    PayMethodFactory factory;
    AbstractPay payMethod;


    public CashPay() {
        factory=new CashPayFactory();
        payMethod=factory.getPayMethod();
    }

    @Override
    public void pay() {
        payMethod.pay();
    }
}
