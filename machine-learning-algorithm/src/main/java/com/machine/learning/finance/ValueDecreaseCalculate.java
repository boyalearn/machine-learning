package com.machine.learning.finance;

import java.math.BigDecimal;

public class ValueDecreaseCalculate implements ValueCalculate{

    @Override
    public BigDecimal valueDecreaseCalculate(BigDecimal money, BigDecimal year, BigDecimal inflationRate, BigDecimal bankRate) {
        int num=year.intValue();
        BigDecimal totaRate=new BigDecimal(1);
        for(int i=0;i<num;i++){
            totaRate=totaRate.multiply(bankRate.add(new BigDecimal(1)));
        }
        return money.multiply(totaRate);
    }
}
