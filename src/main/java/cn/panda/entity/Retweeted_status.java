package cn.panda.entity;

import java.util.List;

public class Retweeted_status {

    private int textLength;
    private Page_info page_info;
    private String created_at;

    private String id;

    private String mid;

    private String idstr;

    private String text;

    private String source;

    private boolean favorited;

    private String thumbnail_pic;

    private String bmiddle_pic;

    private String original_pic;

    private boolean is_vip_paid_status;

    private boolean is_paid;

    private int mblog_vip_type;

    private User user;

    private int reposts_count;

    private int comments_count;

    private int attitudes_count;

    private boolean isLongText;

    private Visible visible;

    private int more_info_type;

    private String bid;

    private List<Pics> pics ;


    public int getTextLength() {
        return textLength;
    }

    public void setTextLength(int textLength) {
        this.textLength = textLength;
    }

    public Page_info getPage_info() {
        return page_info;
    }

    public void setPage_info(Page_info page_info) {
        this.page_info = page_info;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getIdstr() {
        return idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getThumbnail_pic() {
        return thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }

    public String getBmiddle_pic() {
        return bmiddle_pic;
    }

    public void setBmiddle_pic(String bmiddle_pic) {
        this.bmiddle_pic = bmiddle_pic;
    }

    public String getOriginal_pic() {
        return original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    public boolean isIs_vip_paid_status() {
        return is_vip_paid_status;
    }

    public void setIs_vip_paid_status(boolean is_vip_paid_status) {
        this.is_vip_paid_status = is_vip_paid_status;
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public int getMblog_vip_type() {
        return mblog_vip_type;
    }

    public void setMblog_vip_type(int mblog_vip_type) {
        this.mblog_vip_type = mblog_vip_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getReposts_count() {
        return reposts_count;
    }

    public void setReposts_count(int reposts_count) {
        this.reposts_count = reposts_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getAttitudes_count() {
        return attitudes_count;
    }

    public void setAttitudes_count(int attitudes_count) {
        this.attitudes_count = attitudes_count;
    }

    public boolean isLongText() {
        return isLongText;
    }

    public void setLongText(boolean longText) {
        isLongText = longText;
    }

    public Visible getVisible() {
        return visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public int getMore_info_type() {
        return more_info_type;
    }

    public void setMore_info_type(int more_info_type) {
        this.more_info_type = more_info_type;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public List<Pics> getPics() {
        return pics;
    }

    public void setPics(List<Pics> pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "Retweeted_status{" +
                "textLength=" + textLength +
                ", page_info=" + page_info +
                ", created_at='" + created_at + '\'' +
                ", id='" + id + '\'' +
                ", mid='" + mid + '\'' +
                ", idstr='" + idstr + '\'' +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                ", favorited=" + favorited +
                ", thumbnail_pic='" + thumbnail_pic + '\'' +
                ", bmiddle_pic='" + bmiddle_pic + '\'' +
                ", original_pic='" + original_pic + '\'' +
                ", is_vip_paid_status=" + is_vip_paid_status +
                ", is_paid=" + is_paid +
                ", mblog_vip_type=" + mblog_vip_type +
                ", user=" + user +
                ", reposts_count=" + reposts_count +
                ", comments_count=" + comments_count +
                ", attitudes_count=" + attitudes_count +
                ", isLongText=" + isLongText +
                ", visible=" + visible +
                ", more_info_type=" + more_info_type +
                ", bid='" + bid + '\'' +
                ", pics=" + pics +
                '}';
    }
}
