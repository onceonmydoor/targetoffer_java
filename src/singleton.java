public class singleton {
    /**
     * 单例模式，懒汉式，线程安全
     */
    private singleton(){}
    private static singleton Instance = new singleton();
    public static singleton getInstance(){
        return Instance;
    }
}

/**
 * 静态内部类，使用枚举方式，线程安全【推荐】
 */
enum Singleton6 {
    INSTANCE;
    public void whateverMethod() {

    }
}
/**
 * 单例模式，懒汉式，使用静态内部类，线程安全【推荐】
 */
class singleton5{
    private singleton5(){}
    private static singleton5 getInstance(){
        return Nexted.instance;
    }
    private final static class Nexted{
        private static singleton5 instance = new singleton5();

    }
    public static void main(String[] args) {
        System.out.println(singleton.getInstance() == singleton.getInstance());
        System.out.println(Singleton6.INSTANCE == Singleton6.INSTANCE);
        System.out.println(singleton5.getInstance() == singleton5.getInstance());
    }
        }
