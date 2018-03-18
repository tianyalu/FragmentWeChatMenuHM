package com.sty.fragment.menu.fragment;

//import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sty.fragment.menu.R;

/**
 * Created by Shi Tianyi on 2018/3/18/0018.
 */

public class FragmentContacts extends Fragment {
    private static final String TAG = FragmentWeChat.class.getSimpleName();

    @Override
    public void onAttach(Context context) {
        Log.i(TAG, "fragment onAttach");
        super.onAttach(context);
    }

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
        View view = inflater.inflate(R.layout.fragment_contacts, null);
        Log.i(TAG, "fragment onCreateView");
        return view;
    }

    /**
     * 在onCreateView方法中初始化的View被完全初始化后调用
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "fragment onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i(TAG, "fragment onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(TAG, "fragment onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "fragment onPause");
        super.onPause();
    }

    /**
     * 当界面不可见时调用
     */
    @Override
    public void onStop() {
        Log.i(TAG, "fragment onStop");
        super.onStop();
    }

    /**
     * 在onCreateView方法中初始化的View销毁后调用
     */
    @Override
    public void onDestroyView() {
        Log.i(TAG, "fragment onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "fragment onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, "fragment onDetach");
        super.onDetach();
    }
}
