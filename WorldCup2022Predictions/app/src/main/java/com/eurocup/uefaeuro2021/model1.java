package com.eurocup.uefaeuro2021;
public class model1
{
    String date,time,stadium,group,team1,team2,text1,text2;
    model1()
    {

    }
    public model1(String date, String time, String stadium, String group,String team1,String team2,String text1,String text2) {
        this.date = date;
        this.time = time;
        this.stadium = stadium;
        this.group = group;
        this.team1 = team1;
        this.team2 = team2;
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

