package com.amarjeet.android.adapter;

public class Word {
    private String mData1;
    private String mData2;
    private String mData3;

    public Word(String s1, String s2,String s3) {
        mData1=s1;
        mData2=s2;
        mData3=s3;
    }
    public String getData1(){
        return mData1;
    }
    public String getData2(){
        return mData2;
    }
    public String getData3(){
        return mData3;
    }
}
