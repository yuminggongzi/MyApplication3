package com.example.dazhongdianping.UI.util;

import android.content.Context;

/**
 *
 * Created by tarenar on 2017/6/15.
 */

public class SPUtl {

    public SPUtl(Context context,String name) {
        context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    public SPUtl() {
    }

    public static boolean isFirst(){

        return true;
    }
}
