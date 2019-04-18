package com.example.myrepository.fragment;


import android.os.Bundle;

import com.example.myrepository.BaseFragment;
import com.example.myrepository.R;

/**

 */
public class Fragment_3 extends BaseFragment {

    static Fragment_3 mFragment_3;

    public Fragment_3() {
        // Required empty public constructor
    }

    public static Fragment_3 newInstance() {
        Bundle args = new Bundle();
        mFragment_3 = new Fragment_3();
        mFragment_3.setArguments(args);
        return mFragment_3;
    }


    @Override
    protected void init() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_3;
    }

}
