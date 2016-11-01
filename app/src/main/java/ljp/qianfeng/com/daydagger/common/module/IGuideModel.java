package ljp.qianfeng.com.daydagger.common.module;

import ljp.qianfeng.com.daydagger.presenter.Ipersenter;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public interface IGuideModel {
    void querylist(int pageno,Ipersenter.CallBack callBack);
}
