package com.rehansoft.footballworldcup2022;

public class model2
{
    String name,cap,img;
    model2()
    {

    }
    public model2(String name,String cap, String img) {
        this.name = name;
        this.cap=cap;
        this.img = img;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
