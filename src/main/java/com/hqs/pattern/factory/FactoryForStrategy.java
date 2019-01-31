package com.hqs.pattern.factory;

import com.hqs.pattern.strategy.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangqingshi
 * @Date 2019-01-31
 */
@Service
public class FactoryForStrategy {

    @Autowired
    Map<String, Strategy> strategys = new ConcurrentHashMap<>(3);

    public Strategy getStrategy(String component) throws Exception{
        Strategy strategy = strategys.get(component);
        if(strategy == null) {
            throw new RuntimeException("no strategy defined");
        }
        return strategy;
    }

}
