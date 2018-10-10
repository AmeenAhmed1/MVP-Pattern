/*
 * Created by [Ameen Essa] on 10/7/18 11:36 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 8/11/18 8:23 AM
 */

package com.essa.ameen.mvp_pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.essa.ameen.mvp_pattern.Presenter.VideoPresenter;
import com.essa.ameen.mvp_pattern.View.IYoutubeView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends YouTubeBaseActivity implements IYoutubeView{

    @BindView(R.id.youtubePlayer)
    YouTubePlayerView youtubePlayer;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private VideoPresenter mVideoPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mVideoPresenter = new VideoPresenter(this);
        initializeYoutube(youtubePlayer);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void initializeYoutube(YouTubePlayerView youTubePlayerView) {
        mVideoPresenter.loadingVideo(youTubePlayerView);
    }
}
