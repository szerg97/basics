package com.solid.openclosed.right;

import com.solid.openclosed.Video;

public class GamingVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 11 * video.getViews() + 11 * video.getLikes();
    }
}
