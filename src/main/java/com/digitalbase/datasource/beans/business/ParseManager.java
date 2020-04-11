package com.digitalbase.datasource.beans.business;

public class ParseManager {
    private ParseManager() {

    }

    private static class InstanceHolder {

        private final static ParseManager instance = new ParseManager();
    }

    public static ParseManager getInstance() {
        return InstanceHolder.instance;
    }
}
