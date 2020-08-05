package com.wolf.service.impl;

import com.wolf.service.IStrategy;

/**
 * @author wolf
 * @ProjectName pattern24
 * @Description:
 * @date 2019/04/01 10:29
 */
public class GivenGreenLight implements IStrategy{
    /**
     * 每个锦囊妙计都是一个可执行的算法
     * 求吴国太开个绿灯,放行！
     */
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
