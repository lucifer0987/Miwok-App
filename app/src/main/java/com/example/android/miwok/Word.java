package com.example.android.miwok;

import android.provider.MediaStore;

public class Word {

    //States of the class
    private String mEnglishWord;
    private String mMiwokWord;
    private int mImage = NO_IMAGE_PROVIDED;
    private int mAudioResource;
    private static final int NO_IMAGE_PROVIDED = -1;

    //constructor of the class
    public Word(String EnglishWord, String MiwokWord, int AudioResource){
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
        mAudioResource = AudioResource;
    }

    public Word(String EnglishWord, String MiwokWord, int Image, int AudioResource){
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
        mImage = Image;
        mAudioResource = AudioResource;
    }

    //Methods of the class
    public String getMiwokWord(){
        return mMiwokWord;
    }

    public String getEnglishWord(){
        return mEnglishWord;
    }

    public int getImage(){
        return mImage;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }

    public int getAudioResource(){
        return mAudioResource;
    }
}
