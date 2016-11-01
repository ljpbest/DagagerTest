package ljp.qianfeng.com.daydagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Module
public class AppModule {

    @Provides
    public User provider(){
        return new User();
    }
}
