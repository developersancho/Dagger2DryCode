package developersancho.dagger2drycode.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import developersancho.dagger2drycode.DaggerApplication;

@Module
public class AppModule {
    private final DaggerApplication application;

    public AppModule(DaggerApplication app) {
        this.application = app;
    }

    @Singleton
    @Provides
    Context providesApplicationContext() {
        return application;
    }

    @Singleton
    @Provides
    SharedPreferences providesSharedPreferences(Context context) {
        return context.getSharedPreferences("My_Prefs_Title", Context.MODE_PRIVATE);
    }

}
