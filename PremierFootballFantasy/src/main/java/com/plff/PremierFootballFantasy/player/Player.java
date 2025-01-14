package com.plff.PremierFootballFantasy.player;

import jakarta.persistence.*;

@Entity
@Table(name = "prem_player_stats")
public class Player {
    @Id
    @Column(name = "player", unique = true)
    private String player;
    private String nation;
    private String position;
    private Integer age;
    private Integer matches_player;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private Double pk_scored;
    private Double yellow_cards;
    private Double red_cards;
    private Double expected_goals;
    private Double expected_assists;
    private String team_name;

    public Player(String player, String nation, String position, Integer age, Integer matches_player, Integer starts, Double minutes_played, Double goals, Double assists, Double pk_scored, Double yellow_cards, Double red_cards, Double expected_goals, Double expected_assists, String team_name) {
        this.player = player;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_player = matches_player;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.pk_scored = pk_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.team_name = team_name;
    }

    public Player() {

    }

    public Player(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatches_player() {
        return matches_player;
    }

    public void setMatches_player(Integer matches_player) {
        this.matches_player = matches_player;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPk_scored() {
        return pk_scored;
    }

    public void setPk_scored(Double pk_scored) {
        this.pk_scored = pk_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}