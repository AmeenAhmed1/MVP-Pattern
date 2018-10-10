/*
 * Created by [Ameen Essa] on 10/7/18 11:36 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 8/11/18 8:20 AM
 */

package com.essa.ameen.mvp_pattern.Model;

import com.essa.ameen.mvp_pattern.Presenter.VideoPresenter;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoModel implements IVideoModel {

    VideoPresenter mVideoPresenter;

    @Override
    public void gettingVideo(YouTubePlayerView youTubePlayerView) {

        youTubePlayerView.initialize("AIzaSyDaLgECfuI3Qnh38TQyC0_q82DCUO2Ebgg"
                , new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.cueVideo("9iyZ2s7cBI0");
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
    }
}
