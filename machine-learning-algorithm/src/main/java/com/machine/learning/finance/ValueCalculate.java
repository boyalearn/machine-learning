package com.machine.learning.finance;

import java.math.BigDecimal;

/**
 * 价值计算
 */
public interface ValueCalculate {
    BigDecimal valueDecreaseCalculate(BigDecimal money, BigDecimal year, BigDecimal inflationRate, BigDecimal bankRate);
}
