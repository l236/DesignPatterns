package lazyLoading;

public class lazyLoadingSingletonPatternDemo {
    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        singleton.showMessage();
    }
}
