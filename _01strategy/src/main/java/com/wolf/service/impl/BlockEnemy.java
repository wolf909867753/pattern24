package com.wolf.service.impl;

import com.wolf.service.IStrategy;

/**
 * @author luwang
 * @ProjectName pattern24
 * @Description:
 * @date 2019/04/01 10:30
 */
public class BlockEnemy implements IStrategy {
    /**
     * 每个锦囊妙计都是一个可执行的算法
     */
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
