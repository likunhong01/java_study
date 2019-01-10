package 工厂模式;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("lkh");
    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("lkh","lkh");
    }

    @org.junit.jupiter.api.Test
    void setName() {
        assertEquals("lkk","lkk");
    }

    /*
     *         str=str.replaceAll(";","");
     *         str=str.replaceAll("&","&amp;");
     *         str=str.replaceAll("<","&lt;");
     *         str=str.replaceAll(">","&gt;");
     *         str=str.replaceAll("'","");
     *         str=str.replaceAll("--"," ");
     *         str=str.replaceAll("/","");
     *         str=str.replaceAll("%","");
     */
    @org.junit.jupiter.api.Test
    void filterStr() {
        assertEquals("abcdefg", student.filterStr("abcdefg"));
        assertEquals("ab", student.filterStr("a;b"));
        assertEquals("a&amp;b", student.filterStr("a&b"));
        assertEquals("a&lt;b", student.filterStr("a<b"));
        assertEquals("a&gt;b", student.filterStr("a>b"));
        assertEquals("ab", student.filterStr("a'b"));
        assertEquals("a b", student.filterStr("a--b"));
        assertEquals("ab", student.filterStr("a/b"));
        assertEquals("ab", student.filterStr("a%b"));
        assertEquals("a&amp;&lt;&gt; b", student.filterStr("a;%&<>'--/%b"));
        assertEquals("", student.filterStr(""));
//        assertEquals(null, student.filterStr(null));// 测出了对null没有处理
    }

    @org.junit.jupiter.api.Test
    void add() {
        int result = student.add(1,1);
        System.out.println(result);
        assertEquals(2, result);
    }
}