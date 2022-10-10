package com.example.behavior.state.bean;

/**
 * 黄灯
 *
 * @author tianma
 * @date 2022/ 10/10 10:08:27
 */
public class YellowLight implements Light{

    @Override
    public void toRedLight(TrafficLight trafficLight) {
        System.out.println("切换红灯，30秒...");
        trafficLight.setLight(new RedLight());
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void toYellowLight(TrafficLight trafficLight) {
        System.out.println("已是黄灯，不允许切换");
    }

    @Override
    public void toGreenLight(TrafficLight trafficLight) {
        System.out.println("切换绿灯，15秒...");
        trafficLight.setLight(new GreenLight());
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
