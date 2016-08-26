package com.hzit.day1;

/**
 * Created by Administrator on 2016/8/5.
 */
@SuppressWarnings("all")
public enum NeiRong {
    zA("A"),z2("2"),z3("3"),z4("4"),
    z5("5"),z6("6"),z7("7"),z8("8"),
    z9("9"),z10("10"),zJ("J"),zQ("Q"),
    zK("K");
    private final String text;

    public String getText() {
        return text;
    }

    private NeiRong(String text) {
        this.text = text;
    }

}
