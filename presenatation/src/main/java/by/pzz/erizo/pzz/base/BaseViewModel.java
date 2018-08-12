package by.pzz.erizo.pzz.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel extends ViewModel {
    //нужно создавать здесь что бы не засорять UserViewModel
    //забрасываем в него
    //все подписки и можно отписать сразу отовсех
    //compositeDisposable.add(забрасываем диспособлы)
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public abstract void createInject();

    public BaseViewModel() {
        createInject();
    }


    public void onResume() {

    }

    public void onPause() {

    }

    public void onStart() {

    }

    public void onStop() {

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }
}