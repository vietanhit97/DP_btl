package lab_1.bai_1;

public class Government {
    private static final Government instance = new Government();

    private Government() {
    }

    public static Government getInstance(){
        return instance;
    }

    public void election(){
        System.out.println("Tổng thống Hoa Kỳ");
    }


}
