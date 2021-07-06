package com.android.cuti.model;

import com.google.gson.annotations.SerializedName;

public class JenisCuti {
    @SerializedName("idJenisCuti")
    private String idJenisCuti;
    @SerializedName("jenisCuti")
    private String jenisCuti;

    public JenisCuti() {
    }

    public String getIdJenisCuti() {
        return idJenisCuti;
    }

    public void setIdJenisCuti(String idJenisCuti) {
        this.idJenisCuti = idJenisCuti;
    }

    public String getJenisCuti() {
        return jenisCuti;
    }

    public void setJenisCuti(String jenisCuti) {
        this.jenisCuti = jenisCuti;
    }
}
