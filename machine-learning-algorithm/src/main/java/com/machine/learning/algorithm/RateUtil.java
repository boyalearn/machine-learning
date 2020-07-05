package com.machine.learning.algorithm;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * 数学计算工具
 */
public final class RateUtil {
    /**
     * 通过倍率和周期计算每个周期的倍率
     *
     * @param multiple 倍数
     * @param cycle    周期
     * @return 每个周期的倍率
     */
    public static BigDecimal getRate(BigDecimal multiple, BigDecimal cycle) {
        Double result=Math.pow(multiple.doubleValue(),new BigDecimal(1).divide(cycle,MathContext.DECIMAL64).doubleValue());
        return new BigDecimal(result);
    }
}
