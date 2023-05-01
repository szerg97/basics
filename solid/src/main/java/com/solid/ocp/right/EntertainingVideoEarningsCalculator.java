package com.solid.ocp.right;

import com.solid.ocp.Video;

public class EntertainingVideoEarningsCalculator implements VideoEarningsCalculator {
    @Override
    public int calculate(Video video) {
        return 12 * video.getViews() + 12 * video.getLikes();
    }
}
