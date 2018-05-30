package com.xiaoxiaofengsi.fengfeng_backstage.zookeeperDemo;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadTest extends Thread{

    Queue<String> queue = new LinkedList<String>();
    String threadFalg = "";
    public ThreadTest(String threadFalg,Queue<String> queue){
        this.queue = queue;
        this.threadFalg = threadFalg;
    }


    public void run(){
        String qu = queue.poll();
        System.out.println(">>>thread is:"+threadFalg+" queue is:"+qu);
    }
}
