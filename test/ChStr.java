package 工厂模式;

public class ChStr {
    public static String toChinese(String strvalue) {
        try {
            if (strvalue == null) {										//当变量strvalue为null时
                strvalue="";											//将变量strvalue赋值为空
            } else {
                strvalue = new String(strvalue.getBytes("ISO8859_1"), "GBK");	//将字符串转换为GBK编码
                strvalue = strvalue.trim();								//去除字符串的首尾空格
            }
        } catch (Exception e) {
            strvalue="";												//将变量strvalue赋值为空
        }
        return strvalue;												//返回转换后的输入变量strvalue
    }

    // 处理字符串中的空值
    public static final String nullToString(String v, String toV) {
        if (v == null || "".equals(v)) {			//当输入变量v为空时
            v = toV;						//将输入变量v赋值为输入变量toV
        }
        return v;							//返回转换后的输入变量v
    }
    //过滤危险字符
    public static final String filterStr(String str){
        if(str == null) {
            return null;
        }
        str=str.replaceAll(";","");      // 1
        str=str.replaceAll("&","&amp;");// 2
        str=str.replaceAll("<","&lt;"); // 3
        str=str.replaceAll(">","&gt;"); // 4
        str=str.replaceAll("'","");     // 5
        str=str.replaceAll("--"," ");   // 6
        str=str.replaceAll("/","");     // 7
        str=str.replaceAll("%","");     // 8
        return str;
    }
}
