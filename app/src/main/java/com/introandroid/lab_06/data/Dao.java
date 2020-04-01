package com.introandroid.lab_06.data;

import androidx.room.Insert;
import androidx.room.Query;

import com.introandroid.lab_06.entities.Person;

import java.util.List;

@androidx.room.Dao

public interface Dao {
    @Insert
    void insertPerson (Person person);

    @Query("SELECT  * FROM Person")
    List<Person> getAllPersons();
}
