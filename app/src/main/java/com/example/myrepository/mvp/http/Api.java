package com.example.myrepository.mvp.http;

import com.example.myrepository.mvp.model.entity.Articles;
import com.example.myrepository.mvp.model.entity.BannerData;
import com.example.myrepository.mvp.model.entity.BaseResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {


    /**
     * 首页banner，即轮播图
     * http://www.wanandroid.com/banner/json
     */
    @GET("banner/json")
    Observable<BaseResponse<List<BannerData>>> getBannerData();


    /**
     * 首页文章列表
     * http://www.wanandroid.com/article/list/1/json
     */
    @GET("article/list/{pageNum}/json")
    Observable<BaseResponse<Articles>> getArticles(@Path("pageNum") int pageNum);
}
