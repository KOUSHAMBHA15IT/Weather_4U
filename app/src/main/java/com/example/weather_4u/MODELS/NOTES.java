package com.example.weather_4u.MODELS;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName="notes")
public class NOTES implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int ID=0;

    @ColumnInfo(name="title")
    String title="";

    @ColumnInfo(name="date")
    String date="";

    @ColumnInfo(name="pinned")
    boolean pin = false;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPin() {
        return pin;
    }

    public void setPin(boolean pin) {
        this.pin = pin;
    }
}
