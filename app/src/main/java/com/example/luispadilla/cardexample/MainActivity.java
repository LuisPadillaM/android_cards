package com.example.luispadilla.cardexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luispadilla.cardexample.model.Contact;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // @BindView(R.id.cardViewExample) CardView cardView;
    @BindView(R.id.contact_name) TextView contactName;
    @BindView(R.id.contact_age) TextView contactAge;
    @BindView(R.id.contact_photo) ImageView contactPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        this.initializeData();
    }
    private void initializeData(){
        Contact contact = new Contact("Emma Wilson", "23 years old", R.drawable.avatar);
        contactName.setText(contact.getName());
        contactAge.setText(contact.getAge());
        // contactPhoto.setImageResource(contact.getPhotoId());
    }
}
