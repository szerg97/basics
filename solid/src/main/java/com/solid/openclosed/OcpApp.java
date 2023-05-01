package com.solid.openclosed;

import com.solid.openclosed.right.EntertainingVideoEarningsCalculator;
import com.solid.openclosed.right.GamingVideoEarningsCalculator;
import com.solid.openclosed.right.VideoEarningsCalculator;
import com.solid.openclosed.wrong.VideoProfitCalculator;

public class OcpApp {
    public static void main(String[] args) {
        Video video = new Video("How to make a sandwich", 30, 2500, Video.VideoCategory.ENTERTAINING);
        wrongWay(video);
        rightWay(video);
    }

    private static void wrongWay(Video video){
        VideoProfitCalculator calculator = new VideoProfitCalculator();
        int result = calculator.calculate(video);
        System.out.println("Wrong way result: " + result);
    }

    private static void rightWay(Video video){
        VideoEarningsCalculator calculator = new EntertainingVideoEarningsCalculator();
        int result = calculator.calculate(video);
        System.out.println("Right way result: " + result);
    }
}
