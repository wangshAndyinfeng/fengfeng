package com.xiaoxiaofengsi.fengfeng_backstage.zookeeperDemo;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SingleQuen {

    //定义一个队列
    private static List<Queue> queueCache = new LinkedList<Queue>();

    private Integer offerMaxQueue = 2000;


    public void addQueue(){
        synchronized (queueCache) {
            while(true){
                Integer size = queueCache.size();
                if(size>=offerMaxQueue){
                    try {
                        queueCache.wait();
                        continue;//继续执行等待中的检入任务。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }//IF

                if(size<=offerMaxQueue&&size>0){
//                    queueCache.add("1234");
                    queueCache.notifyAll();
                }
                break;//检入完毕
            }
        }
    }

    public void consume() {
        new Thread(){
            public void run() {
                while (true) {
                    String ip = null;
                    try {
                        synchronized (queueCache) {
                            Integer size = queueCache.size();
                            if (size == 0) {
                            //队列缓存池没有消息，等待。。。。
                                 queueCache.wait();
                            }
                            Queue queue = queueCache.remove(0);

                            size = queueCache.size();
                            if (size < offerMaxQueue && size >= 0) {
                                queueCache.notifyAll();//在队列缓存池不超过最大值的前提下，假若检入正在等待中，那么那么让他们排队检入。
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
         }.start();
    }



}
