package com.solid.openclosed.right;

import com.solid.openclosed.Video;

public class EntertainingVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 12 * video.getViews() + 12 * video.getLikes();
    }
}
