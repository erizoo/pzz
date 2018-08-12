package by.pzz.erizo.pzz.app;

import android.app.Application;

import by.pzz.erizo.pzz.injection.AppComponent;
import by.pzz.erizo.pzz.injection.AppModule;
import by.pzz.erizo.pzz.injection.DaggerAppComponent;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}