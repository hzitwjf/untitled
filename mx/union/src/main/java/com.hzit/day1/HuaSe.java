package com.hzit.day1;

/**
 * Created by Administrator on 2016/8/5.
 */
@SuppressWarnings("all")
public enum HuaSe {
    方块("♦"),梅花("♣"),红心("♥"),黑桃("♠");

    //扑克上的符号
    private final String fuhao;

    private HuaSe(String fuhao) {
        this.fuhao = fuhao;
    }

    public String getFuhao() {
        return fuhao;
    }

}
