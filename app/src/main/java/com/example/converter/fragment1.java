package com.example.converter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fragment1 extends Fragment {
    Button Binaryconvert, reset;
    EditText Binarynum;
    TextView Binarytotal;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Binarynum = view.findViewById(R.id.Binarynum);
        Binaryconvert = view.findViewById(R.id.Binaryconvert);
        Binarytotal = view.findViewById(R.id.Binarytotal);


        Binaryconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = Binarynum.getText().toString();

                int i = Integer.parseInt(string);

                String binary = Integer.toBinaryString(i);

                Binarytotal.setText("Total: " + binary);
            }
        });
        reset = view.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Binarynum.setText("");
                Binarytotal.setText("Total is:");
            }
        });
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment1,container,false);
    }


}

