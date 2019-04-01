package com.wolf;

import com.wolf.service.impl.BackDoor;
import com.wolf.service.impl.BlockEnemy;
import com.wolf.service.impl.GivenGreenLight;

/**
 * @author luwang
 * @ProjectName pattern24
 * @Description:
 * @date 2019/04/01 10:32
 */
public class ZhHandler {
    public static void main(String[] args) {
        Context context = new Context(new BackDoor());
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context.operator();
        context = new Context(new GivenGreenLight());
        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context.operator();
        context = new Context(new BlockEnemy());
        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
        context.operator();
    }
}
