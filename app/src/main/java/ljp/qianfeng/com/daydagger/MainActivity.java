package ljp.qianfeng.com.daydagger;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ljp.qianfeng.com.daydagger.adapter.MainListAdapter;
import ljp.qianfeng.com.daydagger.bean.SelectedBean;
import ljp.qianfeng.com.daydagger.dagger.AppConpontent;
import ljp.qianfeng.com.daydagger.dagger.DaggerAppConpontent;
import ljp.qianfeng.com.daydagger.log.LogUtils;
import ljp.qianfeng.com.daydagger.presenter.Ipersenter;
import ljp.qianfeng.com.daydagger.presenter.impl.GudiePersenter;
import ljp.qianfeng.com.daydagger.view.IselectView;

public class MainActivity extends AppCompatActivity implements IselectView{
    @Inject
     Ipersenter mypersenter;
    @BindView(R.id.mlist_view)
    ListView listView;
    private MainListAdapter mainListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerAppConpontent.create().inject(this);
        mypersenter.setIselectView(this);
        mypersenter.querylist(1);
        mainListAdapter = new MainListAdapter(this);
        listView.setAdapter(mainListAdapter);
    }

    @Override
    public void refreshData(SelectedBean selectedBean) {
        LogUtils.log(MainActivity.class,selectedBean.getCode()+"");
        if(selectedBean!=null){
            List<SelectedBean.DataBean.ItemsBean> list=selectedBean.getData().getItems();
            mainListAdapter.setList(list);
            mainListAdapter.notifyDataSetChanged();
        }
    }
}
