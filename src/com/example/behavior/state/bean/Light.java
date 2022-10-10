package com.example.behavior.state.bean;

/**
 * @description 灯接口
 * @author tianma
 * @date 2022/10/10 10:07
 **/
public interface Light {
    void toRedLight(TrafficLight trafficLight);
    void toYellowLight(TrafficLight trafficLight);
    void toGreenLight(TrafficLight trafficLight);
}
