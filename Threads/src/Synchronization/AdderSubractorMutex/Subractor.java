package Synchronization.AdderSubractorMutex;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable{
    Count count;
    //    Lock lock;
    public Subractor(Count count){
        this.count=count;
//        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i =1;i<=1000000;i++){
//            lock.lock();
            synchronized (count){
                count.value-=i;
            }
//            lock.unlock();
        }

    }
}