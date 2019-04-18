package com.example.myrepository.fragment;


import android.os.Bundle;

import com.example.myrepository.BaseFragment;
import com.example.myrepository.R;

/**

 */
public class Fragment_1 extends BaseFragment {

    public static Fragment_1 mFragment_1;

    public Fragment_1() {
        // Required empty public constructor
    }

    public static Fragment_1 newInstance() {
        Bundle args = new Bundle();
        mFragment_1 = new Fragment_1();
        mFragment_1.setArguments(args);
        return mFragment_1;
    }


    @Override
    protected void init() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_1;
    }

}
