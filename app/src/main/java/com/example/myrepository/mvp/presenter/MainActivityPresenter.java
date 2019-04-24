package com.example.myrepository.mvp.presenter;


import com.example.myrepository.mvp.base.BasePresenter;
import com.example.myrepository.mvp.base.MainContract;
import com.example.myrepository.mvp.model.DataModel;

public class MainActivityPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    public MainActivityPresenter() {
    }

    @Override
    public void checkVersion(String currentVersion) {

    }

    @Override
    public void setNavCurrentItem(int position) {

    }

    @Override
    public int getNavCurrentItem() {
        return 0;
    }
}
