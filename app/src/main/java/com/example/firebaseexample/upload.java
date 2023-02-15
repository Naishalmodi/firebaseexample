package com.example.firebaseexample;

public class upload {
    private String mName;
    private String mImageUrl;
    public upload()
    {

    }
    public upload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        mName = name;
        mImageUrl = imageUrl;
    }
    public String getmName()
    {
        return mName;
    }
    public void setmName(String name)
    {
        mName = name;
    }
    public String getmImageUrl()
    {
        return mImageUrl;
    }
    public void setmImageUrl(String imageUrl)
    {
        mImageUrl = imageUrl;
    }
}
