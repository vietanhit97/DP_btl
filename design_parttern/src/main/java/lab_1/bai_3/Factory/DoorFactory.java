package lab_1.bai_3.Factory;


import lab_1.bai_3.Abstract.StampingEquipment;
import lab_1.bai_3.DoorModel1;
import lab_1.bai_3.DoorModel2;
import lab_1.bai_3.Interface.Door;
import lab_1.bai_3.Type.ModelType;


public class DoorFactory implements StampingEquipment<Door> {


    @Override
    public Door stampPart(ModelType type) {
        switch (type){
            case MODEL1:
                return new DoorModel1();
            case MODEL2:
                return new DoorModel2();
            default:
                return null;
        }
    }
}
