package com.vansuzy.baigiang31_truyenvanhandulieugiuacacactivity_hocbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vansuzy.model.SanPham;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        addControls();
    }

    private void addControls() {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("BUNDLE_CUA_TUI");
        SanPham sp = (SanPham) bundle.getSerializable("SANPHAM");
        txtKetQua.setText("X = " + bundle.getInt("X") + "\n" +
                            "D = " + bundle.getDouble("D") + "\n" +
                            "SP = " + sp + "\n");
    }
}
