package eagerSingleton;

import lazyLoading.Singleton;

public class DCLSingleton {
    private volatile static DCLSingleton singleton;
    private DCLSingleton(){}
    public static DCLSingleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new DCLSingleton();
                }
            }
        }
        return singleton;
    }
    public void showMessage(){
        System.out.println("hello,world");
    }
    public static void main(String[] args){
        DCLSingleton dclSingleton=DCLSingleton.getSingleton();
        dclSingleton.showMessage();
    }
}
