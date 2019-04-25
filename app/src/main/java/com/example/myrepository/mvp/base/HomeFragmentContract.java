package com.example.myrepository.mvp.base;

import com.example.myrepository.mvp.model.entity.MovieSubjects;

import java.util.ArrayList;
import java.util.List;

public interface HomeFragmentContract {
    interface View extends BaseView {
        void showTheaters(List<MovieSubjects> subjects );
        void showComingSoon(List<MovieSubjects> subjects );

        void showAllData(ArrayList<Object> list);
    }


    interface Presenter extends IPresenter<HomeFragmentContract.View> {
        void loadTheaters();
        void loadComingSoon();
    }

}
