package com.example.myrepository.mvp.presenter;


import com.example.myrepository.mvp.base.BasePresenter;
import com.example.myrepository.mvp.base.HomeFragmentContract;
import com.example.myrepository.mvp.model.DataModel;
import com.example.myrepository.mvp.model.entity.Article;
import com.example.myrepository.mvp.model.entity.Articles;
import com.example.myrepository.mvp.model.entity.BannerData;
import com.example.myrepository.mvp.model.entity.BaseResponse;
import com.example.myrepository.utils.LogUtil;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomeFragmentPresenter extends BasePresenter<HomeFragmentContract.View> implements HomeFragmentContract.Presenter {


    public HomeFragmentPresenter() {
    }

    @Override
    public void loadBannerData() {

        mModel.getBannerData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<List<BannerData>>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        LogUtil.d("___isDisposed___：" + d.isDisposed());
                    }

                    @Override
                    public void onNext(BaseResponse<List<BannerData>> data) {
                        List<BannerData> bannerData = data.getData();
                        mView.showBannerData(bannerData);
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.d("___Throwable___：" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    @Override
    public void loadArticles(int pageNum) {

        mModel.getArticles(pageNum)
                .subscribeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<Articles>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse<Articles> value) {

                        Articles articles = value.getData();
                        List<Article> articleList = articles.getDatas();

                        mView.showArticles(articleList);
                    }


                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    @Override
    public void loadMoreArticles(int pageNum) {

        mModel.getArticles(pageNum)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<Articles>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse<Articles> value) {
                        Articles data = value.getData();
                        mView.showArticles(data.getDatas());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void collectArticles(int id) {

    }

    @Override
    public void unCollectArticles(int id) {

    }
}
