package com.example.create.factory.factory_method;

import com.example.create.factory.factory_method.bean.Animal;
import com.example.create.factory.factory_method.bean.Mouse;

/**
 * 老鼠创建工厂
 *
 * @author tianma
 * @date 2022/ 09/28 15:20:15
 */
public class MouseFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Mouse(null);
    }
}
