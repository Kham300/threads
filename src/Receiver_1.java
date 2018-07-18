public class Receiver_1 extends Thread{
    private String name;

    public Receiver_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sleep(500);
                if (Util.isEmpty()) {
                    sleep(3000);
                    System.out.println( name + " goes to sleep for 3 sec");
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
