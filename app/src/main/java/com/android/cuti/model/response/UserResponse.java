package com.android.cuti.model.response;

import com.android.cuti.model.Cuti;
import com.android.cuti.model.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse {
    @SerializedName("error")
    private String error;
    @SerializedName("message")
    private String message;
    @SerializedName("users")
    private List<User> users;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
