package com.example.create.factory.abstract_factory.enums;

import com.example.create.factory.abstract_factory.HumanFactory;
import com.example.create.factory.abstract_factory.OrcFactory;

public enum FactoryEnum {
    HUMAN("HUMAN", HumanFactory.class),
    ORC("ORC", OrcFactory.class);
    FactoryEnum(String typeCode, Class typeName){
        this.typeCode = typeCode;
        this.typeClass = typeName;
    }
    private String typeCode;

    public Class getTypeClass() {
        return typeClass;
    }

    private Class typeClass;
    public String getTypeCode() {
        return typeCode;
    }
}
