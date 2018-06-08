package com.multithreading.pools.interview;

/**
 * Created by RANGAREJ on 5/26/2018.
 */
public class CharInfo {
    private int charIndex;
    private int charCount;

    public CharInfo(int charIndex, int charCount) {
        this.charIndex = charIndex;
        this.charCount = charCount;
    }

    public int getCharIndex() {
        return charIndex;
    }

    public void setCharIndex(int charIndex) {
        this.charIndex = charIndex;
    }

    public int getCharCount() {
        return charCount;
    }

    public void setCharCount(int charCount) {
        this.charCount = charCount;
    }

    @Override
    public String toString() {
        return "CharInfo{" +
                "charIndex=" + charIndex +
                ", charCount=" + charCount +
                '}';
    }
}
