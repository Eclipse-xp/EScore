package com.xp.EScore.po;

import java.util.Date;

/**
 * score
 *
 * @author xiexiangpeng
 */
public class Score {

    private Integer id;
    private String student_id;
    private Date examDate;
    private Integer class_rank;
    private Integer school_rank;
    private double math;
    private double chinese;
    private double english;
    private double physics;
    private double chemistry;
    private double biology;
    private double history;
    private double geography;
    private double politics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Integer getClass_rank() {
        return class_rank;
    }

    public void setClass_rank(Integer class_rank) {
        this.class_rank = class_rank;
    }

    public Integer getSchool_rank() {
        return school_rank;
    }

    public void setSchool_rank(Integer school_rank) {
        this.school_rank = school_rank;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getBiology() {
        return biology;
    }

    public void setBiology(double biology) {
        this.biology = biology;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        this.history = history;
    }

    public double getGeography() {
        return geography;
    }

    public void setGeography(double geography) {
        this.geography = geography;
    }

    public double getPolitics() {
        return politics;
    }

    public void setPolitics(double politics) {
        this.politics = politics;
    }

}