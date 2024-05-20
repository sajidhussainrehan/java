package com.nfllive.nfl;

public class modelteams
{
    String text1,text2,text3,text4,text5,team1,team2,team3,team4;
    modelteams()
    {

    }
    public modelteams(String text1 ,String text2 ,String text3, String text4 ,String text5,String team1 ,
                      String team2 , String team3 , String team4) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.team4 = team4;
    }

    public String getText1() {
        return text1;
    }
    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }
    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }
    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }
    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return text5;
    }
    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam3() {
        return team3;
    }
    public void setTeam3(String team3) {
        this.team3 = team3;
    }

    public String getTeam4() {
        return team4;
    }
    public void setTeam4(String team4) {
        this.team4 = team4;
    }
}
