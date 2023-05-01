package com.solid.openclosed.right;

import com.solid.openclosed.Video;

public class DiyVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 10 * video.getViews() + 10 * video.getLikes();
    }
}
