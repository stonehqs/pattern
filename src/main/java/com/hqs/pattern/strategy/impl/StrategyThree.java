package com.hqs.pattern.strategy.impl;

import com.hqs.pattern.strategy.Strategy;
import org.springframework.stereotype.Component;

/**
 * @author huangqingshi
 * @Date 2019-01-31
 */

@Component("three")
public class StrategyThree implements Strategy {
    @Override
    public String doOperation() {
        return "three";
    }
}
