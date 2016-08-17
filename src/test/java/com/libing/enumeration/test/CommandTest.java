/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.enumeration.test;

import com.libing.enumeration.Command;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午11:35:42
 */
public class CommandTest {

    public static void main(String[] args) {
        Command command = Command.fromString("add");
        switch (command) {
            case ADD:
                System.out.println("this is add");
            case LOGICDEL:
                System.out.println("this is logicDel");
            default:
                break;
        }
    }

}

