package org.zord.tugasinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText uang_i, nama_i, no_i;
    Button cetak_i;
    TextView uang_c, nama_c, no_c;
    Integer uang, telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uang_i = findViewById(R.id.uang_p);
        nama_i = findViewById(R.id.nama_p);
        no_i = findViewById(R.id.no_p);
        cetak_i = findViewById(R.id.cetak);

        uang_c = findViewById(R.id.cetak_uang);
        nama_c = findViewById(R.id.cetak_nama);
        no_c = findViewById(R.id.cetak_telp);

        cetak_i.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        uang = Integer.parseInt(uang_i.getText().toString());
        String nama = nama_i.getText().toString();
        telp = Integer.parseInt(no_i.getText().toString());

        uang_c.setText(String.valueOf("Jumlah Uang : Rp. "+uang));
        nama_c.setText(String.valueOf("Nama Peminjam : "+nama));
        no_c.setText(String.valueOf("No. Telepon : "+telp));
    }
}
