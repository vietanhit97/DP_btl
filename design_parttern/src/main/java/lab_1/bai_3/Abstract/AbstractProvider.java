package lab_1.bai_3.Abstract;

import lab_1.bai_3.Factory.DoorFactory;
import lab_1.bai_3.Factory.HoodFactory;
import lab_1.bai_3.Factory.WheelFactory;
import lab_1.bai_3.Type.PartType;

public class AbstractProvider {
    public StampingEquipment getPart(PartType type){
        switch (type){
            case WHEEL:
                return new WheelFactory();
            case HOOD:
                return new HoodFactory();
            case DOOR:
                return new DoorFactory();
            default:
                return null;
        }
    }


}
