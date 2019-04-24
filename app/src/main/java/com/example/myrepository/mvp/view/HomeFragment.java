package com.example.myrepository.mvp.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myrepository.R;
import com.example.myrepository.mvp.base.BaseMvpFragment;
import com.example.myrepository.mvp.base.HomeFragmentContract;
import com.example.myrepository.mvp.model.entity.Article;
import com.example.myrepository.mvp.model.entity.BannerData;
import com.example.myrepository.mvp.presenter.HomeFragmentPresenter;
import com.example.myrepository.utils.LogUtil;

import java.util.List;

public class HomeFragment extends BaseMvpFragment<HomeFragmentPresenter> implements HomeFragmentContract.View {

    private HomeFragmentPresenter mPresenter;

    @Override
    protected void inject() {

    }

    @Override
    protected void loadData() {
        mPresenter.loadArticles(0);
        mPresenter.loadBannerData();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected HomeFragmentPresenter getPresenter() {
        mPresenter = new HomeFragmentPresenter();
        return mPresenter;
    }

    @Override
    public void showBannerData(List<BannerData> bannerDataList) {
        LogUtil.d("");
    }

    @Override
    public void showArticles(List<Article> articlesList) {
        LogUtil.d("");
    }

    @Override
    public void showMoreArticles(List<Article> articleList) {

    }

    @Override
    public void showCollectSuccess() {

    }

    @Override
    public void showUnCollectSuccess() {

    }

    @Override
    public void autoRefresh() {

    }

    @Override
    public void collect() {

    }
}
