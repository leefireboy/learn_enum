/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * <P>
 * Description:枚举类练习
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午7:25:22
 */
public class EnumTest {

    public enum State {
        ON, OFF
    }

    public enum Gender {
        // 通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
        // 赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
        MAN("man"), WOMEN("women");

        private final String value;

        // 构造器默认也只能是private, 从而保证构造函数只能在内部使用
        private Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        // 遍历枚举
        for (State state : State.values()) {
            System.out.println(state.name());
        }

        System.out.println("===========");

        // switch 与 enum 的结合使用
        State switchState = State.OFF;
        switch (switchState) {
            case OFF:
                System.out.println(switchState);
                break;
            case ON:
                System.out.println("ON");
                break;
        }

        System.out.println("===========");

        // EnumSet 的使用
        EnumSet<State> stateSet = EnumSet.allOf(State.class);
        for (State state : stateSet) {
            System.out.println(state);
        }

        System.out.println("===========");

        // EnumMap 的使用
        EnumMap<State, String> stateMap = new EnumMap<State, String>(State.class);
        stateMap.put(State.ON, "is on");
        stateMap.put(State.OFF, "is off");
        for (State state : State.values()) {
            System.out.println(state.name() + ":" + stateMap.get(state));
        }

        System.out.println("===========");

        for(Gender gender : Gender.values()){
            System.out.println(gender.value);
        }
    }

}

