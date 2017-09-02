package cn.panda.entity;

public class Page_info {
    private Page_pic page_pic;

    private String page_url;

    private String page_title;

    private String content1;

    private String content2;

    private String type;

    private Media_info media_info;

    public void setPage_pic(Page_pic page_pic){
        this.page_pic = page_pic;
    }
    public Page_pic getPage_pic(){
        return this.page_pic;
    }
    public void setPage_url(String page_url){
        this.page_url = page_url;
    }
    public String getPage_url(){
        return this.page_url;
    }
    public void setPage_title(String page_title){
        this.page_title = page_title;
    }
    public String getPage_title(){
        return this.page_title;
    }
    public void setContent1(String content1){
        this.content1 = content1;
    }
    public String getContent1(){
        return this.content1;
    }
    public void setContent2(String content2){
        this.content2 = content2;
    }
    public String getContent2(){
        return this.content2;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setMedia_info(Media_info media_info){
        this.media_info = media_info;
    }
    public Media_info getMedia_info(){
        return this.media_info;
    }

    @Override
    public String toString() {
        return "Page_info{" +
                "page_pic=" + page_pic +
                ", page_url='" + page_url + '\'' +
                ", page_title='" + page_title + '\'' +
                ", content1='" + content1 + '\'' +
                ", content2='" + content2 + '\'' +
                ", type='" + type + '\'' +
                ", media_info=" + media_info +
                '}';
    }
}
