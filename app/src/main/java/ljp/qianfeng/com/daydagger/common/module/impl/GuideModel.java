package ljp.qianfeng.com.daydagger.common.module.impl;

import android.util.Log;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import ljp.qianfeng.com.daydagger.bean.SelectedBean;
import ljp.qianfeng.com.daydagger.common.URLConstant;
import ljp.qianfeng.com.daydagger.log.LogUtils;
import ljp.qianfeng.com.daydagger.common.module.IGuideModel;
import ljp.qianfeng.com.daydagger.presenter.Ipersenter;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class GuideModel implements IGuideModel{
    private Gson gson;

    public GuideModel(Gson gson) {
        this.gson = gson;
    }

    @Override
    public void querylist(int pageno, final Ipersenter.CallBack callBack) {
        RequestParams requestParams=new RequestParams(URLConstant.GUIDE_SELECTED_URL);
        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtils.log(GuideModel.class,result);
                SelectedBean selectedBean = gson.fromJson(result, SelectedBean.class);
                callBack.sucess(200,selectedBean);
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
