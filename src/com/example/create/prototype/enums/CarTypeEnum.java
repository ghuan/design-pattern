package com.example.create.prototype.enums;


import com.example.create.prototype.bean.AUDICar;
import com.example.create.prototype.bean.BMWCar;

public enum CarTypeEnum {

    BMW("BMW", BMWCar.class),
    AUDI("AUDI", AUDICar.class);
    CarTypeEnum(String typeCode, Class typeClass){
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
