package com.team.finn.view.live.fragment;

import android.os.Bundle;

import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
/**
 *  作者：finn
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveCommonColumnFragment extends BaseFragment {

    public static LiveCommonColumnFragment getInstance() {
        LiveCommonColumnFragment rf = new LiveCommonColumnFragment();
        return rf;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_commoncolumn;
    }

    @Override
    protected void onInitView(Bundle bundle) {

    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return null;
    }

    @Override
    protected void lazyFetchData() {

    }
}
