package ljp.qianfeng.com.daydagger;


import dagger.Component;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
