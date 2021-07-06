package com.android.cuti.view.CekSisaCuti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.android.cuti.R;

public class CekSisaCutiActivity extends AppCompatActivity {
    private ImageView btnBack;
    private RecyclerView rvSisaCuti;
    private CekSisaCutiViewHolder mViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_sisa_cuti);
        getActionBar().hide();
    }
}