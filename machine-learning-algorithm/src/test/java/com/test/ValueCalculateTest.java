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
        System.out.println(RateUtil.calculatePower(new BigDecimal(1.06),new BigDecimal(4)));
    }

    @Test
    public void calculateEqualRatioSum(){
        System.out.println(RateUtil.calculateRate(new BigDecimal(2),new BigDecimal(10)));
        System.out.println("每年还款5W 25年后总还款:"+new BigDecimal(46).add(RateUtil.calculateEqualRatioSum(new BigDecimal(5),new BigDecimal("1"),new BigDecimal(25))));
        System.out.println("每年还款5W 25年后总还款:"+RateUtil.calculateEqualRatioSum(new BigDecimal(5),new BigDecimal("1.02"),new BigDecimal(25)));
        System.out.println("每年存10W工资25年后资产:"+RateUtil.calculateEqualRatioSum(new BigDecimal(9),new BigDecimal("1.10"),new BigDecimal(25)));
        System.out.println("每年涨10%工资25年后工资:"+RateUtil.calculatePower(new BigDecimal("1.10"),25));
        System.out.println("111万房子工资25年后价值:"+RateUtil.calculatePower(new BigDecimal("1.07"),25).multiply(new BigDecimal(111)));
    }
}
