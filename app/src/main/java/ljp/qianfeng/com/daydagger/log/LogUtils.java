package ljp.qianfeng.com.daydagger.log;

import android.util.Log;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class LogUtils {
    private static final boolean ISLOG=false;
    private static final String TAG="DayDagger_mvp_xutils";
    public static void log(Class mclass,String message){
        if(ISLOG){
            Log.i(TAG,mclass.getName()+"=="+message);
        }
    }
}
