package com.Chapter_13_MULTITHREADING;

/*
    Thread methods:

    1. Basic methods:
        - run()                 used to start a new thread
        - start()               used to start the execution of a thread
        - currentThread()       returns thread reference (static method)
        - isAlive()             to check whether the thread is alive/in the execution state/dead or not (returns boolean valur)

    2. Naming methods:
        - getName()             used to return the name of a thread
        - setName(String name)  used to change the name of a thread

    3. Daemon methods:
        - inDaemon()            used to check that current is daemon or not
        - setDaemon(boolean value)used to mark/set a particular thread as either a daemon thread or a user thread

    4. Priority based methods:
        - getPriority()         used to extract the priority of the thread
        - setPriority(int value)used to change the thread's priority.
                                Thread priority is represented by the integer between 1 and 10.

    5. Preventing thread execution methods:
        - sleep(time)           used to pause the execution of the current thread for a specified amount of time.
        - yield()               it temporarily pause the execution to give the chance for remaining threads of same priority.
        - join()                used to join the start of a thread’s execution to the end of another thread’s execution such that a thread does not start running until another thread ends.

        - suspend() -|
        - resume()   |-\ DEPRECATED METHODS
        - stop()     |-/ (They are no longer used by Java)
        - destroy() -|

    6. Interrupting the thread method:
        - interrupt             used to interrupt a thread that is currently executing.
        - isInterrupted         used to check whether a thread has been interrupted or not.
        - interrupted           used to check if the current thread has been interrupted

    7. Inter-thread communication methods:
       (These methods belongs to object class and not thread class)
        - wait()
        - notify()
        - notifyAll()
 */

class ChildClass9 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ChildClass10 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t2");
        }
    }
}

public class Ch_13_6_Thread_Methods {
    public static void main(String[] args) {

        ChildClass9 c1 = new ChildClass9();
        ChildClass10 c2 = new ChildClass10();

        c1.start();
//        try{
//            c1.join();
//        } catch (Exception e){
//            System.out.println(e);
//        }
        c2.start();
    }
}
