public class Main {

    public static void main(String[] args) {
        Creator_1  creator_1= new Creator_1("Creator_ONE", 1000);
        Creator_1 creator_2 = new Creator_1("Creator_TWO",2000);
        Creator_1 creator_3 = new Creator_1("Creator_THREE",3000);
        creator_1.start();
        creator_2.start();
        creator_3.start();

        Receiver_1 receiver_1 = new Receiver_1("Receiver_ONE");
        Receiver_1 receiver_2 = new Receiver_1("Receiver_TWO");
        receiver_1.start();
        receiver_2.start();
    }


}


