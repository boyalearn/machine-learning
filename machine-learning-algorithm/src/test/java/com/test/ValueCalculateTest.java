package com.test;

import com.machine.learning.algorithm.RateUtil;
import com.machine.learning.finance.ValueCalculate;
import com.machine.learning.finance.ValueDecreaseCalculate;
import org.junit.Test;

import java.math.BigDecimal;

public class ValueCalculateTest {

    private ValueCalculate valueCalculate=new ValueDecreaseCalculate();

    @Test
    public void valueCalculate(){
        BigDecimal value = valueCalculate.valueDecreaseCalculate(new BigDecimal(65), new BigDecimal(10), new BigDecimal("0.03"), new BigDecimal("0.25"));
        System.out.println(value.toString());
    }

    @Test
    public void rateCalculate(){
        System.out.println(RateUtil.getRate(new BigDecimal(10),new BigDecimal(10)));
    }
}
