package ljp.qianfeng.com.daydagger.dagger;

import dagger.Component;
import ljp.qianfeng.com.daydagger.MainActivity;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Component(modules = {AppModule.class})
public interface AppConpontent {
    void inject(MainActivity mainActivity);
}
