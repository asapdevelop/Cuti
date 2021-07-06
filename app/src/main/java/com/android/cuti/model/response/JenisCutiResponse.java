package com.android.cuti.model.response;

import com.android.cuti.model.Cuti;
import com.android.cuti.model.JenisCuti;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JenisCutiResponse {
    @SerializedName("error")
    private String error;
    @SerializedName("message")
    private String message;
    @SerializedName("jenisCutis")
    private List<JenisCuti> jenisCutis;

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

    public List<JenisCuti> getJenisCutis() {
        return jenisCutis;
    }

    public void setJenisCutis(List<JenisCuti> jenisCutis) {
        this.jenisCutis = jenisCutis;
    }
}
