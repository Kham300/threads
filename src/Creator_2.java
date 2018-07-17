public class Creator_2 extends Thread {
    public int count = 0;

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sleep(1000);
                count++;
                int add = Util.add(
                        "creator_2 & element number is " + count);
                if (add == -1){
                    sleep(5000);
                    System.out.println("Creator_1 goes to sleep");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
