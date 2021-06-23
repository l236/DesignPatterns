package lazyLoading;

public class nonLazyLoadingSingleton {
    private static nonLazyLoadingSingleton instance=new nonLazyLoadingSingleton();
    private nonLazyLoadingSingleton(){}
    public static nonLazyLoadingSingleton getInstance(){
        return instance;
    }
}
