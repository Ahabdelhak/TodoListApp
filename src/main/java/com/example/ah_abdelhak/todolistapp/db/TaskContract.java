package com.example.ah_abdelhak.todolistapp.db;

import android.provider.BaseColumns;

/**
 * Created by ah_abdelhak on 2/1/2017.
 */
public class TaskContract {
    public static final String DB_NAME = "com.example.ah_abdelhak.todolistapp.db";
    public static final int DB_VERSION = 101 ;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}