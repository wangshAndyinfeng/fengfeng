package com.xiaoxiaofengsi.fengfeng_backstage.myThread;

public class Customer
{
    private Object lock;

    public Customer(Object lock)
    {
        this.lock = lock;
    }

    public void getValue()
    {
        try
        {
            synchronized (lock)
            {
                if (ValueObject.value.equals(""))
                    lock.wait();
                System.out.println("Get的值是：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
