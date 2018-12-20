package com.wolf;

/**
 * @author luwang
 * @ProjectName express
 * @Description:
 * @date 2018/12/19 18:09
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.wolf.YellowMaleHuman"),
    YelloFemaleHuman("com.wolf.YellowFemaleHuman"),
    WhiteFemaleHuman("com.wolf.WhiteFemaleHuman"),
    WhiteMaleHuman("com.wolf.WhiteMaleHuman"),
    BlackFemaleHuman("com.wolf.BlackFemaleHuman"),
    BlackMaleHuman("com.wolf.BlackMaleHuman");
    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
