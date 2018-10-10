/*
 * Created by [Ameen Essa] on 10/7/18 11:36 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 8/11/18 8:11 AM
 */

package com.essa.ameen.mvp_pattern.Presenter;

import com.essa.ameen.mvp_pattern.Model.IVideoModel;
import com.essa.ameen.mvp_pattern.Model.VideoModel;
import com.essa.ameen.mvp_pattern.View.IYoutubeView;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoPresenter implements IVideoPresenter {

    private IYoutubeView iYoutubeView;
    private VideoModel videoModel;

    public VideoPresenter(IYoutubeView iYoutubeView) {
        this.iYoutubeView = iYoutubeView;
        videoModel = new VideoModel();
    }

    @Override
    public void loadingVideo(YouTubePlayerView youTubePlayerView) {

        //Getting the video from API using the model
        videoModel.gettingVideo(youTubePlayerView);
    }
}
