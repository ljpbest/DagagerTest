package ljp.qianfeng.com.daydagger.presenter;

import ljp.qianfeng.com.daydagger.bean.SelectedBean;
import ljp.qianfeng.com.daydagger.view.IselectView;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public interface Ipersenter {
    void setIselectView(IselectView iselectView);
    void querylist(int pageno);
    interface CallBack{
        void sucess(int requestcode, SelectedBean selectedBean);
    }
}
