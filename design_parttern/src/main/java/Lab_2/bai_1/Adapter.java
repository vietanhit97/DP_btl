package Lab_2.bai_1;

public class Adapter {
    private Socket socket;
    private Ratchet ratchet;
    private String female;
    private String male;

    public Adapter() {
        socket = new Socket();
        ratchet = new Ratchet();
    }
    private void sizeRatchet(String male){
        ratchet.setMale(male);
        System.out.println("Kích thước bánh cóc: "+male+" inch");
    }
    private void sizeSocket(String female){
        socket.setFemale(female);
        System.out.println("Kích thước ổ cắm : "+female+" inch");
    }

    public void getAdapter(String male,String female){
        sizeRatchet(male);
        sizeSocket(female);
        this.female = male;
        this.male = female;
        System.out.println("Kích thước bánh cóc của bộ chuyển đổi: "+male+" inch");
        System.out.println("Kích thước ổ cắm của bộ chuyển đổi: "+female+" inch");

    }



}
