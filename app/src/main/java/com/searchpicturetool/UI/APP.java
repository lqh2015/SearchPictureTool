package com.searchpicturetool.UI;

import android.app.Application;

/**
 * Created by liqinghai on 2016/12/6.
 */
public class APP extends Application {
    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        if(instance==null){
            instance=this;
        }
    }

    public static Application getInstance(){
        return instance;
    }
}
