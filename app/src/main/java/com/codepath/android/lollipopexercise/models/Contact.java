package com.codepath.android.lollipopexercise.models;

import com.codepath.android.lollipopexercise.R;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

import org.parceler.Parcel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Container class to hold Contact information.
@Parcel
public class Contact implements Serializable {
    private String mName;
    private int mThumbnailDrawable;
    private String mNumber;

    // Empty Constructor for Parcleer
    public Contact(){

    }

    public Contact(String name, int thumbnailDrawable, String number) {
        mName = name;
        mThumbnailDrawable = thumbnailDrawable;
        mNumber = number;
    }

    public String getName() {
        return mName;
    }

    public int getThumbnailDrawable() {
        return mThumbnailDrawable;
    }

    public String getNumber() {
        return mNumber;
    }

    // Returns a list of contacts
    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Juan", R.drawable.contact_fourteen, "4153525528"));
        contacts.add(new Contact("Caston", R.drawable.contact_thirteen, "4153139936"));
        contacts.add(new Contact("Eric", R.drawable.contact_eight, "4153508889"));
        contacts.add(new Contact("Rey", R.drawable.contact_one, "4153508890"));
        contacts.add(new Contact("Aldo", R.drawable.contact_twelve, "4153508885"));
        contacts.add(new Contact("Anthony", R.drawable.contact_seven, "4153508883"));
        contacts.add(new Contact("Nafis", R.drawable.contact_four, "4153508882"));
        contacts.add(new Contact("Josephine", R.drawable.contact_five, "4153508884"));
        contacts.add(new Contact("Tejen", R.drawable.contact_three, "4153508881"));
        contacts.add(new Contact("Mark", R.drawable.contact_six, "4153508226"));
        contacts.add(new Contact("Ellen", R.drawable.contact_two, "4153528880"));
        contacts.add(new Contact("Lance", R.drawable.contact_eleven, "4153508887"));
        contacts.add(new Contact("Daniel", R.drawable.contact_nine, "4153508888"));
        contacts.add(new Contact("Matthew", R.drawable.contact_ten, "4153508886"));
        return contacts;
    }

    // Returns a random contact
    public static Contact getRandomContact(Context context) {

        Resources resources = context.getResources();

        TypedArray contactNames = resources.obtainTypedArray(R.array.contact_names);
        int name = (int) (Math.random() * contactNames.length());

        TypedArray contactThumbnails = resources.obtainTypedArray(R.array.contact_thumbnails);
        int thumbnail = (int) (Math.random() * contactThumbnails.length());

        TypedArray contactNumbers = resources.obtainTypedArray(R.array.contact_numbers);
        int number = (int) (Math.random() * contactNumbers.length());

        return new Contact(contactNames.getString(name), contactThumbnails.getResourceId(thumbnail, R.drawable.contact_one), contactNumbers.getString(number));
    }
}
