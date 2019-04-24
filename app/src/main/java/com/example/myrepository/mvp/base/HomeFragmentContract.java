package com.example.myrepository.mvp.base;

import com.example.myrepository.mvp.model.entity.Article;
import com.example.myrepository.mvp.model.entity.BannerData;

import java.util.List;

public interface HomeFragmentContract {
    interface View extends BaseView {
        void showBannerData(List<BannerData> bannerDataList);       // 展示轮播图
        void showArticles(List<Article> articlesList);              // 展示首页文章
        void showMoreArticles(List<Article> articleList);           // 加载更多文章
        void showCollectSuccess();                                  // 收藏成功
        void showUnCollectSuccess();                                // 取消收藏成功
        void autoRefresh();                                         // 强制刷新
        void collect();                                             // 收藏操作

    }


    interface Presenter extends IPresenter<HomeFragmentContract.View> {
        void loadBannerData();                                      // 加载首页banner数据
        void loadArticles(int pageNum);                             // 加载首页文章数据
        void loadMoreArticles(int pageNum);                         // 加载更多首页文章数据
        void collectArticles(int id);                               // 收藏首页文章
        void unCollectArticles(int id);                             // 取消收藏
    }

}
