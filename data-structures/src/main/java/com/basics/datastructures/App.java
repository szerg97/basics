package com.basics.datastructures;

public class App {

    private static final Service queueService = new QueueService();
    private static final Service stackService = new StackService();
    private static final Service setService = new SetService();
    private static final Service mapService = new MapService();

    public static void main(String[] args) {
        mapService.test();
    }
}
