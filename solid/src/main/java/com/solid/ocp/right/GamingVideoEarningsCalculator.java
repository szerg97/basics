package com.solid.ocp.right;

import com.solid.ocp.Video;

public class GamingVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 11 * video.getViews() + 11 * video.getLikes();
    }
}
