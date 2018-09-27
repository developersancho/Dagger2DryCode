package developersancho.dagger2drycode.dagger;

import javax.inject.Singleton;

import dagger.Component;
import developersancho.dagger2drycode.BaseActivity;
import developersancho.dagger2drycode.DaggerApplication;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(DaggerApplication daggerApplication);

    void inject(BaseActivity baseActivity);
}
