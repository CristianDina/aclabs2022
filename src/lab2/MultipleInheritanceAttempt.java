package lab2;

interface Worker1{
    default void work(){
        System.out.println("Do work 1.");
    }
}

interface Worker2{
    default void work(){
        System.out.println("Do work 2.");
    }
    void doJob();
}

class WorkerImpl implements Worker1, Worker2{
    @Override
    public void work() {
        Worker1.super.work();
        Worker2.super.work();
    }

    @Override
    public void doJob() {
        System.out.println("Do your job.");
    }
}

public class MultipleInheritanceAttempt {
    public static void main(String[] args) {
        System.out.println("------- Worker 1 ---------");
        Worker1 worker1 = new WorkerImpl();
        worker1.work();

        System.out.println("------- Worker 2 ---------");
        Worker2 worker2 = new WorkerImpl();
        worker2.work();
        worker2.doJob();
    }
}
