package com.example.behavior.state;

import com.example.behavior.state.bean.TrafficLight;

/**
 * 状态模式：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.toGreenLight();
        trafficLight.toRedLight();
        trafficLight.toYellowLight();

        trafficLight.toGreenLight();
        trafficLight.toGreenLight();
        trafficLight.toYellowLight();
        trafficLight.toRedLight();
        trafficLight.toRedLight();
    }
}
