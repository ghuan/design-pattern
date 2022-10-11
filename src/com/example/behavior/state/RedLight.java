package com.example.behavior.state;

/**
 * 红灯
 *
 * @author tianma
 * @date 2022/ 10/10 10:08:27
 */
public class RedLight implements Light{

    @Override
    public void toRedLight(TrafficLight trafficLight) {
        System.out.println("已是红灯，不允许切换");
    }

    @Override
    public void toYellowLight(TrafficLight trafficLight) {
        System.out.println("切换黄灯，5秒...");
        trafficLight.setLight(new YellowLight());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void toGreenLight(TrafficLight trafficLight) {
        System.out.println("禁止直接切换绿灯");
    }
}
