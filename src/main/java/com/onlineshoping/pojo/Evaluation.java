package com.onlineshoping.pojo;

import java.sql.Timestamp;

//评价表
public class Evaluation {
    private long id;
    private long userId;
    private String content;
    private String image;
    private int rank;
    private Timestamp time;
    private long goodsId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public Evaluation(long id, long userId, String content, String image, int rank, Timestamp time, long goodsId) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.image = image;
        this.rank = rank;
        this.time = time;
        this.goodsId = goodsId;
    }

    public Evaluation(){

    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", rank=" + rank +
                ", time=" + time +
                ", goodsId=" + goodsId +
                '}';
    }
}
