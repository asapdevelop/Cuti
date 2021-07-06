package com.android.cuti.rest;

import com.android.cuti.model.response.BaseResponse;
import com.android.cuti.model.response.CutiResponse;
import com.android.cuti.model.response.JenisCutiResponse;
import com.android.cuti.model.response.UserResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    //User
    @POST("User.php?mode=createUser")
    @FormUrlEncoded
    Call<BaseResponse> createUser(@Field("iduser") String iduser,
                                  @Field("nama") String nama,
                                  @Field("no_hp") String no_hp,
                                  @Field("pass") String pass,
                                  @Field("bagian") String bagian);

    @GET("User.php?mode=getUsers")
    Call<UserResponse> getUsers();

    @GET("User.php?mode=getUsersbyNama")
    Call<UserResponse> getUsersbyNama();

    @POST("User.php?mode=cekLogin")
    @FormUrlEncoded
    Call<BaseResponse> cekLogin(@Field("no_hp") String no_hp,
                                @Field("pass") String pass);

    @POST("User.php?mode=getUsersbyUserType")
    @FormUrlEncoded
    Call<UserResponse> getUsersbyUserType(@Field("usertype") String usertype);

    //Jenis Cuti
    @GET("JenisCuti.php?mode=getJenisCuti")
    Call<JenisCutiResponse> getJenisCuti();

    //Cuti
    @POST("Cuti.php?mode=createUser")
    @FormUrlEncoded
    Call<BaseResponse> createCuti(@Field("id_cuti") String id_cuti,
                                  @Field("id_user") String id_user,
                                  @Field("id_jenis_cuti") String id_jenis_cuti,
                                  @Field("tanggal_mulai") String tanggal_mulai,
                                  @Field("tanggal_berakhir") String tanggal_berakhir);

    @GET("Cuti.php?mode=getCutis")
    Call<CutiResponse> getCutis();

    @POST("Cuti.php?mode=ubahStatus")
    @FormUrlEncoded
    Call<BaseResponse> ubahStatus(@Field("id_cuti") String id_cuti,
                                @Field("status") String status);

    @POST("Cuti.php?mode=getCutisByUser")
    @FormUrlEncoded
    Call<CutiResponse> getCutisByUser(@Field("id_user") String id_user);
}
