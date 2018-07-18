public class Creator_1 extends Thread {
    private int count = 0;
    private String name;
    private int threadSleep;

    Creator_1(String name, int threadSleep) {
        this.name = name;
        this.threadSleep = threadSleep;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sleep(threadSleep);
                count++;
                int add = Util.add(
                        name + " & element number is " + count);
                if (add == -1){
                    sleep(5000);
                    count--;
                    System.out.println("Creator_1 goes to sleep");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
