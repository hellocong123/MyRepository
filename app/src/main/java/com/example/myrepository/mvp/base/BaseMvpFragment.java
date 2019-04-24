package com.example.myrepository.mvp.base;

public abstract class BaseMvpFragment<T extends IPresenter> extends BaseFragment {

    protected abstract T getPresenter();

    protected T mPresenter;

    @Override
    protected void initView() {
        mPresenter = getPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroy();
    }

}
