package clw.com.myqrcodedemo;

import android.app.Application;
import android.util.DisplayMetrics;

import com.uuzuche.lib_zxing.DisplayUtil;

/**
 * Created by admin on 2016/9/6.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initDisplayOpinion();
    }

    private void initDisplayOpinion() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(getApplicationContext(), dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(getApplicationContext(), dm.heightPixels);
    }
}
