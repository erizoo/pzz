package by.pzz.erizo.pzz.presentation.main;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import by.pzz.erizo.pzz.R;
import by.pzz.erizo.pzz.base.BaseMvvmActivity;
import by.pzz.erizo.pzz.databinding.ActivityMainBinding;


public class MainActivity extends BaseMvvmActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(MainViewModel.class);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.PzzTheme);
        super.onCreate(savedInstanceState);
    }
}
