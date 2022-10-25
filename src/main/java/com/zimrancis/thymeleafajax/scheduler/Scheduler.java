package com.zimrancis.thymeleafajax.scheduler;

import java.util.Timer;
import java.util.TimerTask;

public class Scheduler extends TimerTask {

    @Override
    public void run() {
        System.out.println("Hello Zobair");
    }


    public static void main(String[] args) {
        new Timer().schedule(new Scheduler(),0,3000);
    }
}
