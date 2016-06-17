package com.vnpt.blurview_sample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eightbitlab.blurview_sample.R;

public class KidFragment extends BaseFragment {
    View rootView;
    @Override
    int getLayoutId() {
        return R.layout.fragment_kidroom;
    }

    @Override
    public void onStart() {
        super.onStart();

        rootView = getRootView();

        ImageView imageView = (ImageView)rootView.findViewById(R.id.img_bg);
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.i("KidFragment", "onResume");
    }
}
