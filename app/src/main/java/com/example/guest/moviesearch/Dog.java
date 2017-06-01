package com.example.guest.moviesearch;

import org.parceler.Parcel;

import java.io.Serializable;

/**
 * Created by Guest on 6/1/17.
 */
@Parcel
public class Dog {
    public String mName;
    public int mAge;

    // empty constructor needed by the Parceler library
    public Dog() {
    }

    public Dog( String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }
}
