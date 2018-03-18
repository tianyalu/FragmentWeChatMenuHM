package com.sty.fragment.menu.fragment;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sty.fragment.menu.R;

/**
 * Created by Shi Tianyi on 2018/3/18/0018.
 */

public class FragmentWeChat extends Fragment {

    /**
     * Fragment 加载一个布局 显示Fragment的内容
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wechat, null);
        return view;
    }
}
