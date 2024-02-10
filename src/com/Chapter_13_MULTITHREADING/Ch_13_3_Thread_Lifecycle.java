package com.Chapter_13_MULTITHREADING;

public class Ch_13_3_Thread_Lifecycle {
}


/*
    LIFE CYCLE OF A THREAD:

    A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the shown states at any instant:

    1. New
    2. Runnable
    3. Running
    4. Non-Runnable ( Blocked / Waiting )
    5. Timed Waiting
    6. Terminated


    New State:          When a thread is created but not yet started, it is in the new state.
                        The thread is not yet scheduled for execution.

    Runnable State:     In this state, a thread is ready to run at any instant of time.
                        "Thread scheduler" is responsible to give the thread, time to run.

    Running State:      When the thread gets the CPU, it moves from the runnable to the running state.
                        Generally, the most common change in the state of a thread is from runnable to running and again back to runnable.

    Non-Runnable State: When a thread is temporarily inactive, then it’s in one of the following states:
                        - Blocked
                        - Waiting

    Timed Waiting State:A thread can be waiting state for some other thread to perform a specific action within that specified time period.


    Terminated State:   This is the state of a dead thread.
                        It's in the terminated state when it has either finished execution or was terminated abnormally.
 */