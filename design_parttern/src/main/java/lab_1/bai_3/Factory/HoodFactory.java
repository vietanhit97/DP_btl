package lab_1.bai_3.Factory;

import lab_1.bai_3.Abstract.StampingEquipment;
import lab_1.bai_3.HoodModel1;
import lab_1.bai_3.HoodModel2;
import lab_1.bai_3.Interface.Hood;
import lab_1.bai_3.Type.ModelType;

public class HoodFactory implements StampingEquipment<Hood> {

    @Override
    public Hood stampPart(ModelType type) {

        switch (type){
            case MODEL1:
                return new HoodModel1();
            case MODEL2:
                return new HoodModel2();
            default:
                return null;
        }
    }
}
