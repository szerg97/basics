package com.solid.isp;

public class IspApp {
    public static void main(String[] args) {
        ZooKeeperService service = new ZooKeeperService();
        BearCarer alex = new BearCarer("Alex");
        BearCarer bianca = new BearCarer("Bianca");
        BearCarer charlie = new BearCarer("Charlie");

        service.allocate((BearFeeder) alex, bianca, charlie);
        service.allocate((BearWasher) alex, bianca, charlie);
    }
}
