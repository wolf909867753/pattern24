package com.wolf.service.impl;

import com.wolf.service.IStrategy;

/**
 * @author luwang
 * @ProjectName pattern24
 * @Description:
 * @date 2019/04/01 10:28
 */
public class BackDoor implements IStrategy {
    /**
     * 每个锦囊妙计都是一个可执行的算法
     * 找乔国老帮忙，使孙权不能杀刘备
     */
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，使孙权不能杀刘备");
    }
}
