package com.football.footballworldcupqatar;

public class model2
{
    String team,text;
    model2()
    {

    }
    public model2(String team, String text) {
        this.team = team;
        this.text = text;

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

