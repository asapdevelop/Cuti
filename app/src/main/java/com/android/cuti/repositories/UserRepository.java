package com.android.cuti.repositories;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.android.cuti.model.User;
import com.android.cuti.rest.ApiInterface;

import java.util.List;

public class UserRepository {
    private static final String TAG = "UserRepository";
    private static UserRepository userRepository;
    private ApiInterface apiInterface;
    private MutableLiveData<List<User>> users = new MutableLiveData<>();

    public static UserRepository getInstance() {
        Log.d(TAG, "getInstance: ");
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }
}
