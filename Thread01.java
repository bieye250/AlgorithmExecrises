public class Thread01 {
    static int t = 1;
    static int cnt = 0;
    static Object lock = new Object();
    static volatile int count = 0;
    static volatile int index = 0;
    public static void main(String[] args) {
        Thread threadA = new Thread(()->{
            synchronized(lock){
                try{
                    while(cnt < 10){
                        if(t!=1) lock.wait();
                        else{
                            cnt++;
                            System.out.println(Thread.currentThread().getName());
                            t++;
                            lock.notifyAll();
                        }
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        },"ThreadA");

        Thread threadB = new Thread(()->{
            synchronized(lock){
                try{
                    while(cnt < 10){
                        if(t!=2) lock.wait();
                        else{
                            cnt++;
                            System.out.println(Thread.currentThread().getName());
                            t++;
                            lock.notifyAll();
                        }
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        },"ThreadB");

        Thread threadC = new Thread(()->{
            synchronized(lock){
                try{
                    while(cnt < 10){
                        if(t!=3) lock.wait();
                        else{
                            cnt++;
                            System.out.println(Thread.currentThread().getName());
                            t=1;
                            lock.notifyAll();
                        }
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        },"ThreadC");
        // threadA.start();
        // threadB.start();
        // threadC.start();

        Thread threadD = new Thread(()->{
            while(count < 5){
                if(index == 0){
                    System.out.println(Thread.currentThread().getName()+" "+index);
                    count ++;
                    index = 1;
                }
            }
        },"threadD");
        Thread threadE = new Thread(()->{
            while(count < 5){
                if(index == 1){
                    System.out.println(Thread.currentThread().getName()+" "+index);
                    count ++;
                    index = 0;
                }
            }
        },"threadE");
        threadD.start();
        threadE.start();
    }
}
