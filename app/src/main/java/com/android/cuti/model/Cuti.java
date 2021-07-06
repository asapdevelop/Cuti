package com.android.cuti.model;

import com.google.gson.annotations.SerializedName;

public class Cuti {
    @SerializedName("idCuti")
    private String idCuti;
    @SerializedName("idUser")
    private String idUser;
    @SerializedName("idJenisCuti")
    private String idJenisCuti;
    @SerializedName("tanggalMulai")
    private String tanggalMulai;
    @SerializedName("tanggalBerakhir")
    private String tanggalBerakhir;
    @SerializedName("status")
    private String status;

    public Cuti() {
    }

    public String getIdCuti() {
        return idCuti;
    }

    public void setIdCuti(String idCuti) {
        this.idCuti = idCuti;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdJenisCuti() {
        return idJenisCuti;
    }

    public void setIdJenisCuti(String idJenisCuti) {
        this.idJenisCuti = idJenisCuti;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(String tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
