package eagerSingleton;

import lazyLoading.Singleton;

public class EagerSingleton {
    private static EagerSingleton instance=new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }
}
