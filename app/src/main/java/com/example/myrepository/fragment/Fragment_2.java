package com.example.myrepository.fragment;


import android.os.Bundle;

import com.example.myrepository.BaseFragment;
import com.example.myrepository.R;

/**

 */
public class Fragment_2 extends BaseFragment {

    static Fragment_2 mFragment_2;

    public Fragment_2() {
        // Required empty public constructor
    }

    public static Fragment_2 newInstance() {
        Bundle args = new Bundle();
        mFragment_2 = new Fragment_2();
        mFragment_2.setArguments(args);
        return mFragment_2;
    }


    @Override
    protected void init() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_2;
    }

}
