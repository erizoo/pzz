package by.pzz.erizo.pzz.injection;

import javax.inject.Singleton;
import by.pzz.erizo.pzz.presentation.main.MainViewModel;
import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    void inject(MainViewModel mainViewModel);
}
