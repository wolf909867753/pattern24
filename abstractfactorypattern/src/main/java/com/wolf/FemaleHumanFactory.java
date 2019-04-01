package com.wolf;

/**
 * @author wolf
 * @ProjectName express
 * @Description:
 * @date 2018/12/19 18:12
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    /**
     * 创建一个女性黑种人
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    /**
     * 创建一个女性白种人
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    /**
     * 创建一个女性黄种人
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}
