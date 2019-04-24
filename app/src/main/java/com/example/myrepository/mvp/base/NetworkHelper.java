package com.example.myrepository.mvp.base;

import com.example.myrepository.mvp.model.entity.Articles;
import com.example.myrepository.mvp.model.entity.BannerData;
import com.example.myrepository.mvp.model.entity.BaseResponse;

import java.util.List;

import io.reactivex.Observable;

public interface NetworkHelper {

    /**
     * home
     */
    Observable<BaseResponse<List<BannerData>>> getBannerData();         //获取轮播图的数据

    Observable<BaseResponse<Articles>> getArticles(int pageNum);        //获取首页文章

}
