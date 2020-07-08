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
    public static BigDecimal calculateRate(BigDecimal multiple, BigDecimal cycle) {
        Double result = Math.pow(multiple.doubleValue(), new BigDecimal(1).divide(cycle, MathContext.DECIMAL64).doubleValue());
        return new BigDecimal(result);
    }

    /**
     * 计算一个数的幂次方
     *
     * @param data 基数
     * @param n    幂
     * @return 结果
     */
    public static BigDecimal calculatePower(BigDecimal data, int n) {
        return data.pow(n);
    }

    /**
     * 计算一个数的幂次方
     *
     * @param data 基数
     * @param n    幂
     * @return 结果
     */
    public static BigDecimal calculatePower(BigDecimal data, BigDecimal n) {
        Double result = Math.pow(data.doubleValue(), n.doubleValue());
        return new BigDecimal(result);
    }

    /**
     * 等比公式求和
     *
     * @param base 基数
     * @param rate 比例
     * @param time 次数
     * @return
     */
    public static BigDecimal calculateEqualRatioSum(BigDecimal base, BigDecimal rate, BigDecimal time) {
        if (rate.equals(new BigDecimal(1))) {
            return base.multiply(time);
        } else {
            return base.multiply((new BigDecimal(1).subtract(calculatePower(rate, time))).divide(new BigDecimal(1).subtract(rate), MathContext.DECIMAL64));
        }
    }
}
