package top.naccl;

// 文件名: AboutForm.java (模拟前端表单数据对象)
public class AboutForm {
    private String title;
    private String musicId;

    // 构造函数
    public AboutForm(String title, String musicId) {
        this.title = title;
        this.musicId = musicId;
    }

    public String getTitle() { return title; }
    public String getMusicId() { return musicId; }
}
