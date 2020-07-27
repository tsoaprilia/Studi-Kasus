package id.sch.smktelkom.mlg.www.perkenalanku;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_name, edt_birtday, edt_address, edt_phone, edt_hobby, edt_dream;
    private Button btn_got;
    private TextView tv_na, tv_ttl, tv_al, tv_ph, tv_ho, tv_dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_name = findViewById(R.id.edt_name);
        edt_birtday = findViewById(R.id.edt_birthday);
        edt_address = findViewById(R.id.edt_address);
        edt_phone = findViewById(R.id.edt_phone);
        edt_hobby = findViewById(R.id.edt_hobby);
        edt_dream = findViewById(R.id.edt_dream);
        btn_got = findViewById(R.id.btn_got);
        tv_na = findViewById(R.id.tv_na);
        tv_ttl = findViewById(R.id.tv_ttl);
        tv_al = findViewById(R.id.tv_al);
        tv_ph = findViewById(R.id.tv_ph);
        tv_ho = findViewById(R.id.tv_ho);
        tv_dr = findViewById(R.id.tv_dr);


        btn_got.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String nama = edt_name.getText().toString();
        tv_na.setText(nama);
        String ttl = edt_birtday.getText().toString();
        tv_ttl.setText(ttl);
        String alamat = edt_address.getText().toString();
        tv_al.setText(alamat);
        String phone = edt_phone.getText().toString();
        tv_ph.setText(phone);
        String hobby = edt_hobby.getText().toString();
        tv_ho.setText(hobby);
        String keinginan = edt_dream.getText().toString();
        tv_dr.setText(keinginan);
    }
}
