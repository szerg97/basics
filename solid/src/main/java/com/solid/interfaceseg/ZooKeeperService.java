package com.solid.interfaceseg;

import java.util.Arrays;

public class ZooKeeperService {

    public void allocate(BearFeeder... feeders){
        Arrays.stream(feeders).forEach(f -> {
            System.out.printf("%s was allocated for feeding %n", f.feederIdentifier());
        });
    }

    public void allocate(BearWasher... washers){
        Arrays.stream(washers).forEach(f -> {
            System.out.printf("%s was allocated for washing %n", f.washerIdentifier());
        });
    }
}
