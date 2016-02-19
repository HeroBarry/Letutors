package com.dmd.letutors.ui.activity.base;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.dmd.letutors.R;
import com.dmd.letutors.TutorApplication;
import com.dmd.letutors.view.base.BaseView;
import com.dmd.tutor.base.BaseAppCompatActivity;

import butterknife.ButterKnife;

/**
 *
 */
public abstract class BaseActivity extends BaseAppCompatActivity implements BaseView {

    protected Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        if (isApplyKitKatTranslucency()) {
            setSystemBarTintDrawable(getResources().getDrawable(R.drawable.sr_primary));
        }*/
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mToolbar = ButterKnife.findById(this, R.id.common_toolbar);
        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    protected TutorApplication getBaseApplication() {
        return (TutorApplication) getApplication();
    }

    @Override
    public void showError(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showException(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showNetError() {
        toggleNetworkError(true, null);
    }

    @Override
    public void showLoading(String msg) {
        toggleShowLoading(true, null);
    }

    @Override
    public void hideLoading() {
        toggleShowLoading(false, null);
    }

  //  protected abstract boolean isApplyKitKatTranslucency();
}
