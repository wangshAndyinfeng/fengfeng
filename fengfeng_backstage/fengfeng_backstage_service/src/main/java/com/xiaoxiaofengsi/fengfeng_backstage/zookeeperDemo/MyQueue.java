package com.xiaoxiaofengsi.fengfeng_backstage.zookeeperDemo;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author zxh
 *1.队列的含义：队列就是一种特殊的线性表，采用FIFO方式，而栈是LIFO方式。
 *2.常用的队列：LinkedList实现了Queue的接口
 *3.队列的操作：
 *赋值：queue.offer(); queue.add();
 *取值：queue.poll(); queue.remove();
 *其中 add，remove 如果失败会抛出异常，而前者会有返回值。
 *查看队列前端数据：queue.element(), queue.peek();
 *4.实例操作：
 *A。初始化一个队列，内部元素为0-50数字
 *B。启动100个线程同时去取这个队列的数字，看取数是否冲突。类似100个客户去秒杀50个商品
 */
public class MyQueue extends Thread {
    /*
    * 初始化一个队列
    */
    private static final int limit = 50;

    private Queue<String> queue = new LinkedList<String>();

    private int count = 1;

    public  void inintQueue(){

        Thread addThread = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(queue.size() < limit){

                    queue.offer(String.valueOf(count));
                    System.out.println("--------这是生产的第多少个"+count);
                    count++;
                    if(queue.size() == limit){

                            System.out.println("先沉睡1s。。。。。");
                            synchronized (queue){
                                System.out.println("进入等待锁。。。。。");
                                    try {
                                        queue.wait();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("通知其他线程。。。。。");
                                      queue.notify();
                            }
                    }
                }

            }
        });
        addThread.start();

    }


    public  void consumeQueue(){

        Thread consumeThread = new Thread(new Runnable(){
            @Override
            public void run() {
                while(queue.size() < limit){
                    if(queue.size() == 0){

                        synchronized (queue){
                            try {
                                queue.wait();
                                queue.notify();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    String qu = queue.poll();
                    System.out.println("**********这是消费的第多少个"+qu);
                }

            }
        });
        consumeThread.start();

    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.inintQueue();
        System.out.println("------------------"+q.queue);
        q.consumeQueue();

    }
}
