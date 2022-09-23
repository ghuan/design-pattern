package com.example.factory.simple_factory.enums;

public enum CarTypeEnum {

    BMW("BMW","宝马"),
    AUDI("AUDI","奥迪");
    CarTypeEnum(String typeCode,String typeName){
        this.typeCode = typeCode;
        this.typeName = typeName;
    }
    private String typeCode;
    private String typeName;
    public String getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return typeName;
    }
    public static CarTypeEnum getByCode(String typeCode) {
        for (CarTypeEnum carTypeEnum : values()) {
            if (carTypeEnum.getTypeCode().equals(typeCode)) {
                return carTypeEnum;
            }
        }
        return null;
    }
}
