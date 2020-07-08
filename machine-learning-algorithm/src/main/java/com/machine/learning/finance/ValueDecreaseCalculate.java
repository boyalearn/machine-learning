package com.machine.learning.finance;

import java.math.BigDecimal;

public class ValueDecreaseCalculate implements ValueCalculate {

    @Override
    public BigDecimal calculateValueOutput(ValueInput valueInput, BigDecimal ate) {
        return new BigDecimal(valueInput.getValue()).multiply(new BigDecimal(valueInput.getTime()));
    }

    public BigDecimal calculateInput(ValueInput valueInput) {
        return new BigDecimal(valueInput.getValue()).multiply(new BigDecimal(valueInput.getTime()));
    }
}
