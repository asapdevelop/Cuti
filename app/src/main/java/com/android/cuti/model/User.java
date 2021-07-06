package com.android.cuti.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("idUser")
    private String idUser;
    @SerializedName("nama")
    private String nama;
    @SerializedName("nohp")
    private String nohp;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("jabatan")
    private String jabatan;

    public User() {
    }

    public String getIduser() {
        return idUser;
    }

    public void setIduser(String idUser) {
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
