package lab_1.bai_3.Factory;


import lab_1.bai_3.Abstract.StampingEquipment;

import lab_1.bai_3.Interface.Wheel;
import lab_1.bai_3.Type.ModelType;
import lab_1.bai_3.WheelModel1;
import lab_1.bai_3.WheelModel2;

public class WheelFactory implements StampingEquipment<Wheel> {

    @Override
    public Wheel stampPart(ModelType type) {
        switch (type){
            case MODEL1:
                return new WheelModel1();
            case MODEL2:
                return new WheelModel2();
            default:
                return null;
        }
    }
}
