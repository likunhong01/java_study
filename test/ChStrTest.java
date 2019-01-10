package 工厂模式;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChStrTest {
    ChStr chStr = new ChStr();
    @Test
    // 语句覆盖
    void filterStr() {
        assertEquals("abcdefg", chStr.filterStr("abcdefg"));
        assertEquals("ab", chStr.filterStr("a;b"));
        assertEquals("a&amp;b", chStr.filterStr("a&b"));
        assertEquals("a&lt;b", chStr.filterStr("a<b"));
        assertEquals("a&gt;b", chStr.filterStr("a>b"));
        assertEquals("ab", chStr.filterStr("a'b"));
        assertEquals("a b", chStr.filterStr("a--b"));
        assertEquals("ab", chStr.filterStr("a/b"));
        assertEquals("ab", chStr.filterStr("a%b"));
        assertEquals("a&amp;&lt;&gt; b", chStr.filterStr("a;%&<>'--/%b"));
        assertEquals("", chStr.filterStr(""));
        assertEquals("123",chStr.filterStr("123"));
        assertEquals("",chStr.filterStr(";"));

//        assertEquals(null, chStr.filterStr(null));// 测出了对null没有处理
    }


    @Test
    void toChineseTest(){
        String s = chStr.toChinese(null);
        System.out.println(s);
        assertEquals("",s);
        assertEquals("asdf",chStr.toChinese(" asdf "));
    }
}