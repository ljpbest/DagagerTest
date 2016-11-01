package ljp.qianfeng.com.daydagger.dagger;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;
import ljp.qianfeng.com.daydagger.common.module.IGuideModel;
import ljp.qianfeng.com.daydagger.common.module.impl.GuideModel;
import ljp.qianfeng.com.daydagger.presenter.Ipersenter;
import ljp.qianfeng.com.daydagger.presenter.impl.GudiePersenter;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Module
public class AppModule {
    @Provides
    public Gson getgson(){
        return new Gson();
    }
    @Provides
    public IGuideModel getmodule(Gson gson){
        return new GuideModel(gson);
    }
    @Provides
    public Ipersenter getpersenter(IGuideModel model){
        return new GudiePersenter(model);
    }

}
