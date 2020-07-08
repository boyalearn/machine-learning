package com.machine.learning.finance;

import java.math.BigDecimal;

/**
 * 价值计算
 */
public interface ValueCalculate {
    /**
     * 计算产出
     *
     * @param valueInput 价值投入
     * @param ate 比率
     * @return 价值产出
     */
    BigDecimal calculateValueOutput(ValueInput valueInput,BigDecimal ate);

    BigDecimal calculateInput(ValueInput valueInput);


}
