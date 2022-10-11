package com.example.create.factory.simple_factory.enums;

import com.example.create.factory.simple_factory.AUDICar;
import com.example.create.factory.simple_factory.BMWCar;

public enum CarTypeEnum {

    BMW("BMW", BMWCar.class),
    AUDI("AUDI", AUDICar.class);
    CarTypeEnum(String typeCode,Class typeClass){
        this.typeCode = typeCode;
        this.typeClass = typeClass;
    }
    private String typeCode;
    private Class typeClass;
    public String getTypeCode() {
        return typeCode;
    }

    public Class getTypeClass() {
        return typeClass;
    }
}
