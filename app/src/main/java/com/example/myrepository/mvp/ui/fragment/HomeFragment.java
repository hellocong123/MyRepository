package com.example.myrepository.mvp.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myrepository.R;
import com.example.myrepository.adapter.HomeFragmentAdapter2;
import com.example.myrepository.mvp.base.BaseMvpFragment;
import com.example.myrepository.mvp.base.HomeFragmentContract;
import com.example.myrepository.mvp.model.entity.MovieSubjects;
import com.example.myrepository.mvp.presenter.HomeFragmentPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseMvpFragment<HomeFragmentPresenter> implements HomeFragmentContract.View {

    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;
    @BindView(R.id.normalView)
    SmartRefreshLayout mNormalView;

    private HomeFragmentPresenter mPresenter;
    private HomeFragmentAdapter2 mAdapter;
    private List<MovieSubjects> mList;

    @Override
    protected void inject() {
        mAdapter = new HomeFragmentAdapter2(getActivity());
        mRecycleView.setAdapter(mAdapter);
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));




    }

    @Override
    protected void loadData() {
        mPresenter.loadTheaters();
        mPresenter.loadComingSoon();
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
    public void showTheaters(List<MovieSubjects> subjects) {
        initRecycleView(subjects);
    }


    @Override
    public void showComingSoon(List<MovieSubjects> subjects) {
        initRecycleView(subjects);
    }


    @Override
    public void showAllData(ArrayList<Object> list) {

        mAdapter.setData(list);
    }


    private void initRecycleView(List<MovieSubjects> subjects) {


    }
}
