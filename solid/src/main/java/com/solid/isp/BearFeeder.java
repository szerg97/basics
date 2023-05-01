package com.solid.isp;

public interface BearFeeder extends ZooKeeper{
    void feedBear();
    default String feederIdentifier(){
        return getName() + "-feeder-123";
    }
}
