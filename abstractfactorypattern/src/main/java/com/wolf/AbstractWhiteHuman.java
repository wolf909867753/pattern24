package com.wolf;

/**
 * @author luwang
 * @ProjectName express
 * @Description:
 * @date 2018/12/19 17:53
 */
public abstract class AbstractWhiteHuman implements Human{

    @Override
    public void laugh() {
        System.out.println("白色人种会大笑，侵略的笑声！");
    }

    @Override
    public void cry() {
        System.out.println("白色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节");
    }

}
