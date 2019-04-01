package com.wolf;

import com.wolf.service.IStrategy;

/**
 * @author luwang
 * @ProjectName pattern24
 * @Description:
 * @date 2019/04/01 10:31
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operator(){
        this.strategy.operate();
    }
}
