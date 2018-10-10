/*
 * Created by [Ameen Essa] on 10/7/18 11:36 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 8/11/18 8:23 AM
 */

package com.essa.ameen.mvp_pattern.View;

import com.google.android.youtube.player.YouTubePlayerView;

public interface IYoutubeView {

    void showProgress();
    void hideProgress();
    void showMessage(String message);

    void initializeYoutube(YouTubePlayerView youTubePlayerView);
}
