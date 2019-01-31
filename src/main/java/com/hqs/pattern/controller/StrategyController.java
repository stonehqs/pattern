package com.hqs.pattern.controller;

import com.hqs.pattern.factory.FactoryForStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huangqingshi
 * @Date 2019-01-31
 */
@Controller
public class StrategyController {

    @Autowired
    FactoryForStrategy factoryForStrategy;

    @PostMapping("/strategy")
    @ResponseBody
    public String strategy(@RequestParam("key") String key) {
        String result;
        try {
            result = factoryForStrategy.getStrategy(key).doOperation();
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }


}
