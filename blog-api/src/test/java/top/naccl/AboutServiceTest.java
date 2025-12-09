package top.naccl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AboutServiceTest { // JUnit 5 类不需要 public

    private AboutService aboutService = new AboutService();

    @Test
    void testSubmit_TitleMissing() { // JUnit 5 方法不需要 public
        AboutForm form = new AboutForm("", "123");
        String result = aboutService.submit(form);
        assertEquals("请填写必要的表单", result);
    }

    @Test
    void testSubmit_MusicIdInvalid() {
        AboutForm form = new AboutForm("测试标题", "abc");
        String result = aboutService.submit(form);
        assertEquals("歌曲ID有误", result);
    }

    @Test
    void testSubmit_Success() {
        AboutForm form = new AboutForm("测试标题", "10086");
        String result = aboutService.submit(form);
        assertEquals("保存成功", result);
    }
}