package com.xiaoxiaofengsi.fengfeng_backstage.myThread;

public class Test {

    public static void main(String[] args)
    {
        Object lock = new Object();
        final Producer producer = new Producer(lock);
        final Customer customer = new Customer(lock);
        Runnable producerRunnable = new Runnable()
        {
            public void run()
            {
                while (true)
                {
                    producer.setValue();
                }
            }
        };
        Runnable customerRunnable = new Runnable()
        {
            public void run()
            {
                while (true)
                {
                    customer.getValue();
                }
            }
        };
        Thread producerThread = new Thread(producerRunnable);
        Thread CustomerThread = new Thread(customerRunnable);
        producerThread.start();
        CustomerThread.start();
    }
}
