package lab_1.bai_2;

public class FactoryPattern {
    public static void main(String[] args) {
        MoldFactory moldFactory = new MoldFactory();
        InjectionMold mold1 = moldFactory.getMold(MoldType.CAR);
        mold1.inject();
        InjectionMold mold2 = moldFactory.getMold(MoldType.DUCK);
        mold2.inject();
    }
}
