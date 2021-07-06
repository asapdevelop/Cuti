package com.android.cuti.model.response;

import com.android.cuti.model.Cuti;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CutiResponse {
    @SerializedName("error")
    private String error;
    @SerializedName("message")
    private String message;
    @SerializedName("cutis")
    private List<Cuti> cutis;

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

    public List<Cuti> getCutis() {
        return cutis;
    }

    public void setCutis(List<Cuti> cutis) {
        this.cutis = cutis;
    }
}
