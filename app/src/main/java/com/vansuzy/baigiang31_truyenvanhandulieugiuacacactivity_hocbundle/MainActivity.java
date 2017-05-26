package com.vansuzy.baigiang31_truyenvanhandulieugiuacacactivity_hocbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vansuzy.model.SanPham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("X", 113);
        bundle.putDouble("D", 114.115);
        SanPham coca = new SanPham(1, "Coca co la la la", 1500.0);
        bundle.putSerializable("SANPHAM", coca);

        intent.putExtra("BUNDLE_CUA_TUI", bundle);

        startActivity(intent);
    }
}
