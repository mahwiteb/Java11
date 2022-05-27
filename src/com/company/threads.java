ublic class Threads implements Runnable {
    Thread thread;

    Threads(String name) {
        thread = new Thread(this, name);
    }

    public static Threads createAndStart(String name) {
        Threads th = new Threads(name);
        th.thread.start();
        return th;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(thread.getName() + " Processing begins.");
        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(100);
                System.out.println(thread.getName() + " is executed as " +
                        i + "times.");
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(thread.getName() + " has been interrupted");
        }
        System.out.println(thread.getName() + " is being process.");
    }

    public void join() {

    }
}