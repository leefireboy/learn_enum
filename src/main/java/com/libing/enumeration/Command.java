/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * <P>
 * Description:enum 测试
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日下午11:23:21
 */
public enum Command {

    ADD("add"),
    LOGICDEL("logicDel"),
    PHYSICDEL("physicDel"),
    UPDATE("update");

    private final String value;

    private Command(String value) {
        this.value = value;
    }

    private static final Map<String, Command> STRING_TO_COMMAND = new HashMap<String, Command>();

    static {
        for (Command command : Command.values()) {
            STRING_TO_COMMAND.put(command.toString(), command);
        }
    }

    public static Command fromString(String commandStr) {
        return STRING_TO_COMMAND.get(commandStr);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
