package developersancho.dagger2drycode;

import android.app.Application;

import developersancho.dagger2drycode.dagger.AppComponent;
import developersancho.dagger2drycode.dagger.AppModule;
import developersancho.dagger2drycode.dagger.DaggerAppComponent;


public class DaggerApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
