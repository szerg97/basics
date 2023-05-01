package com.solid.isp;

public interface BearWasher extends ZooKeeper{
    void washBear();
    default String washerIdentifier(){
        return getName() + "-washer-123";
    }
}
