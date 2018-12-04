package 反射;

interface IFruit {
    void eat();
}

class Apple implements IFruit{
    @Override
    public void eat() {
        System.out.println("eat an apple");
    }
}

class Orange implements IFruit{

    @Override
    public void eat() {
        System.out.println("eat an Orange");
    }
}

class Factory {
    public static IFruit getInstance(String fruitName){
        if (fruitName.equals("apple")){
            return new Apple();
        }else if (fruitName.equals("orange")){
            return new Orange();
        }
        return null;
    }
}

class Factory2 {
    public static IFruit getInstance(String fruitName){
        IFruit fruit = null;
        try {
            Class<?> cls = Class.forName(fruitName);
            try {
                fruit = (IFruit) cls.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return fruit;

    }
}

public class no003反射应用在改造工厂模式 {
    public static void main(String[] args) {
        IFruit fruit = Factory.getInstance("Orange");
        fruit.eat();
    }
}
