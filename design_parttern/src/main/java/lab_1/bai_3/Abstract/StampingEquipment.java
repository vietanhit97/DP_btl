package lab_1.bai_3.Abstract;

import lab_1.bai_3.Type.ModelType;

public interface StampingEquipment<T> {
    T stampPart(ModelType type);
}
