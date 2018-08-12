package by.pzz.erizo.pzz.presentation.main;

import android.arch.lifecycle.ViewModelProviders;
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

}
