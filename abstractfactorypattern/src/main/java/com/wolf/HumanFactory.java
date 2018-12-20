package com.wolf;

/**
 * @author luwang
 * @ProjectName express
 * @Description:
 * @date 2018/12/19 18:03
 */
public interface HumanFactory {
    /**
     * 制造黄色人种
     * @return
     */
    Human createYellowHuman();

    /**
     * 制造一个白色人种
     * @return
     */
    Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     * @return
     */
    Human createBlackHuman();
}
