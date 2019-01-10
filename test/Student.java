package 工厂模式;

public class Student {
    private String name;


    public Student() {
        name = null;
    }
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public int add(int a, int b){
        return a + b;
    }


    public static final String filterStr(String str){
        str=str.replaceAll(";","");
        str=str.replaceAll("&","&amp;");
        str=str.replaceAll("<","&lt;");
        str=str.replaceAll(">","&gt;");
        str=str.replaceAll("'","");
        str=str.replaceAll("--"," ");
        str=str.replaceAll("/","");
        str=str.replaceAll("%","");
        return str;
    }
}

