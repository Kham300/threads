public class Main {

    public static void main(String[] args) throws InterruptedException {
        Creator_1  creator_1= new Creator_1();
        Creator_2 creator_2 = new Creator_2();
        creator_1.start();
        creator_2.start();

        Receiver_1 receiver_1 = new Receiver_1();
        Receiver_2 receiver_2 = new Receiver_2();
        receiver_1.start();
        receiver_2.start();
    }


}


