package com.eurocup.uefaeuro2021;

public class model
{
  String team,team1;
    model()
    {

    }
    public model(String team,String team1) {
        this.team = team;
        this.team1 = team1;

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

}
