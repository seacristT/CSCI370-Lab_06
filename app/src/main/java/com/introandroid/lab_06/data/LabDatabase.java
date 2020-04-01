package com.introandroid.lab_06.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.introandroid.lab_06.data.Dao;
import com.introandroid.lab_06.entities.Person;

@Database(entities = {Person.class}, version = 1)

public abstract class LabDatabase extends RoomDatabase {
    public abstract Dao personDao();

}

