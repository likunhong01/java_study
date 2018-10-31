public class Test {
    public static void main(String args[]){

    }
}

//class Singleton{
//    private Singleton SINGLETON = new Singleton();
//    private Singleton(){}
//    public Singleton getSINGLETON() {
//        return this.SINGLETON;
//    }
//}

class Singleton{
    private static final Singleton SINGLETON = new Singleton();
    private Singleton(){}
    public static Singleton getSINGLETON() {
        return SINGLETON;
    }
}

class Singleton2{
    private static Singleton2 SINGLETON;
    private Singleton2(){}
    public static Singleton2 getSINGLETON() {
        if (SINGLETON == null){
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }
}


//异常处理:ctrl+alt+t可以选
class Try {

    public Try() {
        try {
            //可能出现的异常
        }catch (Exception e) {
            //怎么处理
        }

    }
}

//多例模式
class Sex {
    private String title ;
    public static final int MALE_FLAG = 1 ;
    public static final int FEMALE_FLAG = 2 ;
    private static final Sex MALE = new Sex("男") ;
    private static final Sex FEMALE = new Sex("女") ;
    private Sex(String title) {
        this.title = title ;
    }
    public static Sex getInstance(int flag) {
        switch (flag) {
            case MALE_FLAG:
                return MALE ;
            case FEMALE_FLAG:
                return FEMALE ;
            default:
                return null ;
        }
    }
    @Override
    public String toString() {
        return this.title ;
    }
}

