package com.bijayregmi.singleton;

/**
 * Created by bijayregmi on 6/14/17.
 */
public final  class SingletonLazy {

    private static volatile SingletonLazy INSTANCE = null;
    public long licenceNumber;

       private SingletonLazy(){

    }

    public static SingletonLazy getINSTANCE(){

           if(INSTANCE == null){
               INSTANCE = new SingletonLazy();
           }
                return INSTANCE;
       }



}
