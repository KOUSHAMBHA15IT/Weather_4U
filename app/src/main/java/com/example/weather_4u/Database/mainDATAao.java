package com.example.weather_4u.Database;

import static java.nio.charset.CodingErrorAction.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy.REPLACE;

import com.example.weather_4u.MODELS.NOTES;

@Dao
public interface mainDATAao {
    @Insert(onConflict = REPLACE)
    default void insert() {
        insert(;
    }

    @Insert(onConflict = REPLACE)
    default void insert(NOTES notes) {

    }


}
