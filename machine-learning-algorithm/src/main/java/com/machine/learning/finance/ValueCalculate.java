package com.machine.learning.finance;

import java.math.BigDecimal;

/**
 * 价值计算
 */
public interface ValueCalculate {
    /**
     * 结合多个条件因素分析通货膨胀率来分析数据走势决策
     *
     * @param money
     * @param year
     * @param inflationRate
     * @param bankRate
     * @return
     */
    BigDecimal valueDecreaseCalculate(BigDecimal money, BigDecimal year, BigDecimal inflationRate, BigDecimal bankRate);


}
