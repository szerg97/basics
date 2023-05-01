package com.solid.openclosed.wrong;

import com.solid.openclosed.Video;

public class VideoProfitCalculator {

    /*
    It's wrong because every time a new video category appears, you have to modify the switch
    and add a new method for calculation
     */
    public int calculate(Video video){
        switch (video.getCategory()){
            case DIY -> {
                return calculateDiy(video);
            }
            case GAMING -> {
                return calculateGaming(video);
            }
            case ENTERTAINING -> {
                return calculateEntertaining(video);
            }
            case default -> {
                return 0;
            }
        }
    }

    private int calculateEntertaining(Video video) {
        return 12 * video.getViews() + 12 * video.getLikes();
    }

    private int calculateGaming(Video video) {
        return 11 * video.getViews() + 11 * video.getLikes();
    }

    private int calculateDiy(Video video) {
        return 10 * video.getViews() + 10 * video.getLikes();
    }
}
