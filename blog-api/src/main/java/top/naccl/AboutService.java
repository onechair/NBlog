package top.naccl;

// ---------------------------------------------------------

// 文件名: AboutService.java (核心待测单元)
import java.util.regex.Pattern;

public class AboutService {

    /**
     * 对应 Vue 中的 submit() 方法
     * 逻辑：
     * 1. 校验必填项 (title)
     * 2. 校验正则 (musicId 必须为数字)
     * 3. 提交更新
     */
    public String submit(AboutForm form) {
        // 节点 1 & 2: 模拟 this.$refs.formRef.validate 校验必填项
        if (form.getTitle() == null || form.getTitle().trim().isEmpty()) {
            // 对应节点 6: 校验失败
            return "请填写必要的表单";
        }

        // 节点 3: 模拟 const reg = /^\d{1,}$/ 以及正则判断
        // 注意：前端逻辑是“如果有值且不匹配正则”则报错，或者“必须匹配正则”
        // 这里完全还原 Vue 代码逻辑：if (!reg.test(this.form.musicId))
        String pattern = "^\\d{1,}$";

        // 假设 musicId 必填且必须为数字 (根据代码逻辑推断)
        if (form.getMusicId() == null || !Pattern.matches(pattern, form.getMusicId())) {
            // 对应节点 4: 正则校验失败
            return "歌曲ID有误";
        }

        // 节点 5: 校验通过，模拟 updateAbout(this.form)
        return "保存成功";
    }
}