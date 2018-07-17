public class Receiver_1 extends Thread{

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sleep(500);
                if (Util.isEmpty()) {
                    sleep(3000);
                    System.out.println("Receiver_1 goes to sleep for 3 sec");
                    } else {
                    String s = Util.get();
                    Util.print(s);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
