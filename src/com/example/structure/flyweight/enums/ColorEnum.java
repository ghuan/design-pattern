package com.example.structure.flyweight.enums;

public enum ColorEnum {
    RED("RED", "红色"),
    BLUE("BLUE", "蓝色");
    ColorEnum(String typeCode, String typeName){
        this.typeCode = typeCode;
        this.typeName = typeName;
    }
    private String typeCode;

    public String getTypeName() {
        return typeName;
    }

    private String typeName;
    public String getTypeCode() {
        return typeCode;
    }

    public static ColorEnum getByTypeCode(String typeCode){
        for(ColorEnum colorEnum : values()){
            if(colorEnum.typeCode.equals(typeCode)){
                return colorEnum;
            }
        }
        return null;
    }
}
