package cn.panda.entity;

import java.util.List;

public class Mblog {

    private int textLength;
    private String thumbnail_pic;
    private String bmiddle_pic;
    private String original_pic;
    private String picStatus;
    private List<Pics> pics;
    private String created_at;
    private String id;
    private String mid;
    private String idstr;
    private String text;
    private String source;
    private boolean favorited;
    private boolean is_vip_paid_status;
    private boolean is_paid;
    private int mblog_vip_type;
    private User user;
    private Retweeted_status retweeted_status;
    private int reposts_count;
    private int comments_count;
    private int attitudes_count;
    private boolean isLongText;
    private Visible visible;
    private int more_info_type;
    private int mblogtype;
    private String raw_text;
    private String bid;



    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return this.mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getIdstr() {
        return this.idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return this.textLength;
    }

    public void setTextLength(int textLength) {
        this.textLength = textLength;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean getFavorited() {
        return this.favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getThumbnail_pic() {
        return this.thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }

    public String getBmiddle_pic() {
        return this.bmiddle_pic;
    }

    public void setBmiddle_pic(String bmiddle_pic) {
        this.bmiddle_pic = bmiddle_pic;
    }

    public String getOriginal_pic() {
        return this.original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    public boolean getIs_vip_paid_status() {
        return this.is_vip_paid_status;
    }

    public void setIs_vip_paid_status(boolean is_vip_paid_status) {
        this.is_vip_paid_status = is_vip_paid_status;
    }

    public boolean getIs_paid() {
        return this.is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public int getMblog_vip_type() {
        return this.mblog_vip_type;
    }

    public void setMblog_vip_type(int mblog_vip_type) {
        this.mblog_vip_type = mblog_vip_type;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPicStatus() {
        return this.picStatus;
    }

    public void setPicStatus(String picStatus) {
        this.picStatus = picStatus;
    }

    public int getReposts_count() {
        return this.reposts_count;
    }

    public void setReposts_count(int reposts_count) {
        this.reposts_count = reposts_count;
    }

    public int getComments_count() {
        return this.comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getAttitudes_count() {
        return this.attitudes_count;
    }

    public void setAttitudes_count(int attitudes_count) {
        this.attitudes_count = attitudes_count;
    }

    public boolean getIsLongText() {
        return this.isLongText;
    }

    public void setIsLongText(boolean isLongText) {
        this.isLongText = isLongText;
    }

    public Visible getVisible() {
        return this.visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public int getMore_info_type() {
        return this.more_info_type;
    }

    public void setMore_info_type(int more_info_type) {
        this.more_info_type = more_info_type;
    }

    public int getMblogtype() {
        return this.mblogtype;
    }

    public void setMblogtype(int mblogtype) {
        this.mblogtype = mblogtype;
    }

    public String getBid() {
        return this.bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public List<Pics> getPics() {
        return this.pics;
    }

    public void setPics(List<Pics> pics) {
        this.pics = pics;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public boolean isIs_vip_paid_status() {
        return is_vip_paid_status;
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public Retweeted_status getRetweeted_status() {
        return retweeted_status;
    }

    public void setRetweeted_status(Retweeted_status retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    public boolean isLongText() {
        return isLongText;
    }

    public void setLongText(boolean longText) {
        isLongText = longText;
    }

    public String getRaw_text() {
        return raw_text;
    }

    public void setRaw_text(String raw_text) {
        this.raw_text = raw_text;
    }

    @Override
    public String toString() {
        return "Mblog{" +
                "textLength=" + textLength +
                ", thumbnail_pic='" + thumbnail_pic + '\'' +
                ", bmiddle_pic='" + bmiddle_pic + '\'' +
                ", original_pic='" + original_pic + '\'' +
                ", picStatus='" + picStatus + '\'' +
                ", pics=" + pics +
                ", created_at='" + created_at + '\'' +
                ", id='" + id + '\'' +
                ", mid='" + mid + '\'' +
                ", idstr='" + idstr + '\'' +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                ", favorited=" + favorited +
                ", is_vip_paid_status=" + is_vip_paid_status +
                ", is_paid=" + is_paid +
                ", mblog_vip_type=" + mblog_vip_type +
                ", user=" + user +
                ", retweeted_status=" + retweeted_status +
                ", reposts_count=" + reposts_count +
                ", comments_count=" + comments_count +
                ", attitudes_count=" + attitudes_count +
                ", isLongText=" + isLongText +
                ", visible=" + visible +
                ", more_info_type=" + more_info_type +
                ", mblogtype=" + mblogtype +
                ", raw_text='" + raw_text + '\'' +
                ", bid='" + bid + '\'' +
                '}';
    }
}
