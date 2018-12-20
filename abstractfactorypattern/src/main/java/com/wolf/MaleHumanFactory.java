package com.wolf;

/**
 * @author luwang
 * @ProjectName express
 * @Description:
 * @date 2018/12/19 18:10
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    /**
     * 创建一个男性黑种人
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    /**
     * 创建一个男性白种人
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    /**
     * 创建一个男性黄种人
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
