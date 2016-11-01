package ljp.qianfeng.com.daydagger.presenter.impl;

import android.util.Log;

import ljp.qianfeng.com.daydagger.bean.SelectedBean;
import ljp.qianfeng.com.daydagger.common.module.IGuideModel;
import ljp.qianfeng.com.daydagger.presenter.Ipersenter;
import ljp.qianfeng.com.daydagger.view.IselectView;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class GudiePersenter implements Ipersenter,Ipersenter.CallBack {
    private IGuideModel model;
    private IselectView iselectView;


    public GudiePersenter(IGuideModel model) {
        this.model = model;
    }


    @Override
    public void setIselectView(IselectView iselectView) {
        this.iselectView=iselectView;
    }

    @Override
    public void querylist(int pageno) {
        model.querylist(pageno,this);

    }

    @Override
    public void sucess(int requestcode, SelectedBean selectedBean) {
        iselectView.refreshData(selectedBean);
    }
}
