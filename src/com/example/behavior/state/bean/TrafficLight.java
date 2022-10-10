package com.example.behavior.state.bean;

/**
 * 交通灯
 *
 * @author tianma
 * @date 2022/ 10/10 10:11:46
 */
public class TrafficLight {
    //初始化红灯
    private Light light = new RedLight();

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void toRedLight() {
        this.light.toRedLight(this);
    }

    public void toYellowLight() {
        this.light.toYellowLight(this);
    }

    public void toGreenLight() {
        this.light.toGreenLight(this);
    }
}
