package cn.panda.entity;

public class User {
    private Long id;

    private String screen_name;

    private String profile_image_url;

    private String profile_url;

    private int statuses_count;

    private boolean verified;

    private int verified_type;

    private String description;

    private String gender;

    private int mbtype;

    private int urank;

    private int mbrank;

    private boolean follow_me;

    private boolean following;

    private int followers_count;

    private int follow_count;

    private String cover_image_phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVerified() {
        return verified;
    }

    public boolean isFollow_me() {
        return follow_me;
    }

    public boolean isFollowing() {
        return following;
    }

    public String getScreen_name() {
        return this.screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getProfile_image_url() {
        return this.profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getProfile_url() {
        return this.profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public int getStatuses_count() {
        return this.statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public boolean getVerified() {
        return this.verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getVerified_type() {
        return this.verified_type;
    }

    public void setVerified_type(int verified_type) {
        this.verified_type = verified_type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMbtype() {
        return this.mbtype;
    }

    public void setMbtype(int mbtype) {
        this.mbtype = mbtype;
    }

    public int getUrank() {
        return this.urank;
    }

    public void setUrank(int urank) {
        this.urank = urank;
    }

    public int getMbrank() {
        return this.mbrank;
    }

    public void setMbrank(int mbrank) {
        this.mbrank = mbrank;
    }

    public boolean getFollow_me() {
        return this.follow_me;
    }

    public void setFollow_me(boolean follow_me) {
        this.follow_me = follow_me;
    }

    public boolean getFollowing() {
        return this.following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public int getFollowers_count() {
        return this.followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public int getFollow_count() {
        return this.follow_count;
    }

    public void setFollow_count(int follow_count) {
        this.follow_count = follow_count;
    }

    public String getCover_image_phone() {
        return this.cover_image_phone;
    }

    public void setCover_image_phone(String cover_image_phone) {
        this.cover_image_phone = cover_image_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", screen_name='" + screen_name + '\'' +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", profile_url='" + profile_url + '\'' +
                ", statuses_count=" + statuses_count +
                ", verified=" + verified +
                ", verified_type=" + verified_type +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                ", mbtype=" + mbtype +
                ", urank=" + urank +
                ", mbrank=" + mbrank +
                ", follow_me=" + follow_me +
                ", following=" + following +
                ", followers_count=" + followers_count +
                ", follow_count=" + follow_count +
                ", cover_image_phone='" + cover_image_phone + '\'' +
                '}';
    }
}
