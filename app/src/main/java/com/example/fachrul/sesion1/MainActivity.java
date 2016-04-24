package com.example.fachrul.sesion1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ganti = (Button) findViewById(R.id.btn_ganti);
        final EditText et_ganti_nama = (EditText) findViewById(R.id.et_text_ganti);
        final ImageView iv_gambar = (ImageView) findViewById(R.id.iv_gambar);
        final Drawable img = (Drawable) getResources().getDrawable(R.drawable.photo);

        btn_ganti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_ganti_nama.getText().toString().trim().toLowerCase().equals("jogja droid")){
                    Toast.makeText(MainActivity.this, "Anda benar", Toast.LENGTH_SHORT).show();
                    iv_gambar.setImageDrawable(img);
                    et_ganti_nama.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Coba lagi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
