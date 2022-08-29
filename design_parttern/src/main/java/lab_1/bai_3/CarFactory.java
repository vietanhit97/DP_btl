package lab_1.bai_3;


import lab_1.bai_3.Abstract.AbstractProvider;
import lab_1.bai_3.Abstract.StampingEquipment;
import lab_1.bai_3.Interface.Door;
import lab_1.bai_3.Type.ModelType;
import lab_1.bai_3.Type.PartType;

public class CarFactory {
    public static void main(String[] args) {
        AbstractProvider abs = new AbstractProvider();
        StampingEquipment<Door> door = abs.getPart(PartType.DOOR);
        Door d1 = door.stampPart(ModelType.MODEL1);
        d1.stampDoor();

    }
}
