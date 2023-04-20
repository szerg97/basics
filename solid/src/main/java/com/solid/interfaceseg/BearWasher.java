package com.solid.interfaceseg;

public interface BearWasher extends ZooKeeper{
    void washBear();
    default String washerIdentifier(){
        return getName() + "-washer-123";
    }
}
