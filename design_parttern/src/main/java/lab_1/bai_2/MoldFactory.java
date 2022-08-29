package lab_1.bai_2;

public class MoldFactory{
    public InjectionMold getMold(MoldType type) {
        switch (type){
            case DUCK : return new ToyDuckMold();
            case CAR: return  new ToyCarMold();
            default: return null;
        }
    }
}
