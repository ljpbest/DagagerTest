package ljp.qianfeng.com.daydagger.module.impl;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import ljp.qianfeng.com.daydagger.bean.SelectedBean;
import ljp.qianfeng.com.daydagger.common.URLConstant;
import ljp.qianfeng.com.daydagger.log.LogUtils;
import ljp.qianfeng.com.daydagger.module.IGuideModel;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class GuideModel implements IGuideModel{
    @Override
    public void querylist(int pageno) {
        RequestParams requestParams=new RequestParams(URLConstant.GUIDE_SELECTED_URL);
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtils.log(GuideModel.class,result);
                Gson gson=new Gson();
                SelectedBean selectedBean = gson.fromJson(result, SelectedBean.class);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
