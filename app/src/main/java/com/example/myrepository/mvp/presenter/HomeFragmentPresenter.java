package com.example.myrepository.mvp.presenter;


import com.example.myrepository.mvp.base.BasePresenter;
import com.example.myrepository.mvp.base.HomeFragmentContract;
import com.example.myrepository.mvp.model.entity.MovieResponse;
import com.example.myrepository.mvp.model.entity.MovieSubjects;
import com.example.myrepository.utils.LogUtil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;

public class HomeFragmentPresenter extends BasePresenter<HomeFragmentContract.View> implements HomeFragmentContract.Presenter {


    private ArrayList<Object> mList;

    public HomeFragmentPresenter() {
    }

    @Override
    public void loadTheaters() {

        mList = new ArrayList<>();


        mModel.getTheaters()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieResponse<MovieSubjects>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MovieResponse<MovieSubjects> value) {
                        List<MovieSubjects> subjects = value.getSubjects();
                        mView.showTheaters(subjects);
                        mList.add("正在热映");
                        mList.add(subjects);

                        loadComingSoon2();

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void loadComingSoon2() {
        mModel.getComingSoon()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieResponse<MovieSubjects>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MovieResponse<MovieSubjects> value) {
                        List<MovieSubjects> subjects = value.getSubjects();
                        mView.showComingSoon(subjects);
                        mList.add("即将上映");
                        mList.add(subjects);

                        mView.showAllData(mList);
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
    public void loadComingSoon() {


    }
}
