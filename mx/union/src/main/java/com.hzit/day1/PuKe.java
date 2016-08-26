package com.hzit.day1;

/**
 * Created by Administrator on 2016/8/5.
 */
@SuppressWarnings("all")
public class PuKe {
    //扑克有花色
    private HuaSe huaSe;
    //扑克有文本

    private NeiRong neiRong;
    public HuaSe getHuaSe() {
        return huaSe;
    }
    public void setHuaSe(HuaSe huaSe) {
        this.huaSe = huaSe;
    }
    public NeiRong getNeiRong() {
        return neiRong;
    }
    public void setNeiRong(NeiRong neiRong) {
        this.neiRong = neiRong;
    }
    @Override
    public String toString() {
        return  huaSe.getFuhao()+neiRong.getText();
    }

}
