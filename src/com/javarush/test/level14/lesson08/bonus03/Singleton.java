package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Денис on 05.07.2016.
 */
public class Singleton
{
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

}
