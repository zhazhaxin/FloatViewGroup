package cn.lemon.view;

import android.content.Context;

/**
 * Created by linlongxin on 2016/11/6.
 */

public class Util {

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
