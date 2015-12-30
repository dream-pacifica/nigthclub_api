/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dream.nightclub.response.cast;

import com.dream.nightclub.response.BaseResponse;

/**
 * キャスト情報詳細レスポンスクラス
 * 
 * @author masaya.tezuka
 */
public class CastDetailResponse extends BaseResponse {

    /**
     * ID
     */
    private Integer id;

    /**
     * 名前（ローマ字）
     */
    private String nameRoman;

    /**
     * 名前（日本語）
     */
    private String name;

    /**
     * 身長
     */
    private Integer height;

    /**
     * B
     */
    private Integer bust;

    /**
     * W
     */
    private Integer west;

    /**
     * H
     */
    private Integer hip;

    /**
     * カップ
     */
    private String cup;

    /**
     * 趣味
     */
    private String hobby;

    /**
     * チャームポイント
     */
    private String charmPoint;

    /**
     * 好みのタイプ
     */
    private String favoriteTypeOf;

    /**
     * 本人コメント
     */
    private String commentsPerson;

    /**
     * スタッフより一言
     */
    private String commentsStaff;

    /**
     * 出勤曜日
     */
    private String attendanceDay;

    /**
     * 出勤時間
     */
    private String clockInTime;

    /**
     * ブログ
     */
    private String blog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRoman() {
        return nameRoman;
    }

    public void setNameRoman(String nameRoman) {
        this.nameRoman = nameRoman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getWest() {
        return west;
    }

    public void setWest(Integer west) {
        this.west = west;
    }

    public Integer getHip() {
        return hip;
    }

    public void setHip(Integer hip) {
        this.hip = hip;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCharmPoint() {
        return charmPoint;
    }

    public void setCharmPoint(String charmPoint) {
        this.charmPoint = charmPoint;
    }

    public String getFavoriteTypeOf() {
        return favoriteTypeOf;
    }

    public void setFavoriteTypeOf(String favoriteTypeOf) {
        this.favoriteTypeOf = favoriteTypeOf;
    }

    public String getCommentsPerson() {
        return commentsPerson;
    }

    public void setCommentsPerson(String commentsPerson) {
        this.commentsPerson = commentsPerson;
    }

    public String getCommentsStaff() {
        return commentsStaff;
    }

    public void setCommentsStaff(String commentsStaff) {
        this.commentsStaff = commentsStaff;
    }

    public String getAttendanceDay() {
        return attendanceDay;
    }

    public void setAttendanceDay(String attendanceDay) {
        this.attendanceDay = attendanceDay;
    }

    public String getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
    
}
