package com.bijayregmi.singleton;

/**
 * Created by bijayregmi on 6/14/17.
 */
public final class SingletonLazyThreadSafe {

    private static volatile SingletonLazyThreadSafe INSTANCE = null;

    public long licesenceNumber ;

    private SingletonLazyThreadSafe(){}

    public static SingletonLazyThreadSafe getINSTANCE(){


        if(INSTANCE == null){
            synchronized (SingletonLazyThreadSafe.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonLazyThreadSafe();
                }
            }
        }

        return INSTANCE;
    }

}
