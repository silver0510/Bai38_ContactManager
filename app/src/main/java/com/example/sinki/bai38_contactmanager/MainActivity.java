package com.example.sinki.bai38_contactmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sinki.adater.ContactAdapter;
import com.example.sinki.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtTen,txtPhone;
    Button btnLuu;

    ListView lvDanhBa;
    ArrayList<Contact>danhBa;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyLuu();
            }
        });
    }

    private void xuLyLuu() {
        Contact contact = new Contact(txtTen.getText().toString(),txtPhone.getText().toString());
        danhBa.add(contact);
        contactAdapter.notifyDataSetChanged();
    }

    private void addControls() {
        txtPhone = (EditText) findViewById(R.id.txtPhone);
        txtTen = (EditText) findViewById(R.id.txtTen);
        btnLuu = (Button) findViewById(R.id.btnLuu);
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        danhBa = new ArrayList<>();
        contactAdapter = new ContactAdapter(MainActivity.this,R.layout.item,danhBa);
        lvDanhBa.setAdapter(contactAdapter);
    }
}
