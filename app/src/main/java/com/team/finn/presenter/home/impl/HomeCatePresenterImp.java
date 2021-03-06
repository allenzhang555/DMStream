package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeRecommendHotCate;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeCateContract;

import java.util.List;

/**
 * 作者：finn
 * 版本号：1.0
 * 备注消息：
 **/
public class HomeCatePresenterImp extends HomeCateContract.Presenter {
    /**
     * 导航栏+栏目列表
     *
     * @param identification
     */
    @Override
    public void getHomeCate(String identification) {
        addSubscribe(mModel.getHomeCate(mContext, identification).subscribe(new RxSubscriber<List<HomeRecommendHotCate>>() {
            @Override
            public void onSuccess(List<HomeRecommendHotCate> homeCates) {
                mView.getOtherList(homeCates);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    /**
     * 刷新
     * <p></p>
     * 导航栏+栏目列表
     *
     * @param identification
     */
    @Override
    public void getHomeCateRefresh(String identification) {
        addSubscribe(mModel.getHomeCate(mContext, identification).subscribe(new RxSubscriber<List<HomeRecommendHotCate>>() {
            @Override
            public void onSuccess(List<HomeRecommendHotCate> homeCates) {
                mView.getOtherListRefresh(homeCates);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
