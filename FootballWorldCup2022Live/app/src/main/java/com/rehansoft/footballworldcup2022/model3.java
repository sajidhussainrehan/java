package com.rehansoft.footballworldcup2022;
public class model3
{
    String team1,team2,text1,text2;
    model3()
    {

    }
    public model3(String team1,String team2,String text1,String text2) {

        this.team1 = team1;
        this.team2 = team2;
        this.text1 = text1;
        this.text2 = text2;
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
}

