/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.enumeration;

/**
 * <P>
 * Description:枚举方法
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午8:52:27
 */
public enum EnumMathodTest {
    // 为每个enum实例添加不同的实现方法
    SAMPLE1 {
        @Override
        public String getInfo() {
            return "sample1";
        }
    },
    SAMPLE2 {
        @Override
        public String getInfo() {
            return "sample2";
        }
    };
    public abstract String getInfo();

    // 测试
    public static void main(String args[]) {
        for (EnumMathodTest method : EnumMathodTest.values()) {
            System.out.println(method.getInfo());
        }
    }
}
