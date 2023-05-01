package com.solid.ocp.right;

import com.solid.ocp.Video;

public class DiyVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 10 * video.getViews() + 10 * video.getLikes();
    }
}
