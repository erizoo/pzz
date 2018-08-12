package by.pzz.erizo.domain.executor;

import io.reactivex.Scheduler;

// этот интерфейс нужно реализовать в presentation
public interface PostExecutionThread {
    
    Scheduler getScheduler();

}
