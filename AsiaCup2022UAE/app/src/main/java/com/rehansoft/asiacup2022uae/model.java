package com.rehansoft.asiacup2022uae;

public class model
{
  String date,time,stadium,group,team1,team2;
    model()
    {

    }
    public model(String date, String time, String stadium, String group,String team1,String team2) {
        this.date = date;
        this.time = time;
        this.stadium = stadium;
        this.group = group;
        this.team1 = team1;
        this.team2 = team2;
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
}
