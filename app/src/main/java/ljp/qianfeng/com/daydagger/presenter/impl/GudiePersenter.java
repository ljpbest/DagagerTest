package ljp.qianfeng.com.daydagger.presenter.impl;

import ljp.qianfeng.com.daydagger.module.IGuideModel;
import ljp.qianfeng.com.daydagger.presenter.Ipersenter;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class GudiePersenter implements Ipersenter {
    private IGuideModel model;
    @Override
    public void querylist(int pageno) {
        model.querylist(pageno);
    }
}
