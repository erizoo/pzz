package by.pzz.erizo.pzz.presentation.main;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;

import by.pzz.erizo.pzz.app.App;
import by.pzz.erizo.pzz.base.BaseViewModel;

public class MainViewModel extends BaseViewModel {

    @SuppressLint("StaticFieldLeak")
    private AppCompatActivity activity;

    public MainViewModel(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    public MainViewModel() {

    }

}
