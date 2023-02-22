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

public class fragment3 extends Fragment {
    Button Hexconvert, reset;
    EditText Hexnum;
    TextView Hextotal;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Hexnum = view.findViewById(R.id.Hexnum);
        Hexconvert = view.findViewById(R.id.Hexconvert);
        Hextotal = view.findViewById(R.id.Hextotal);


        Hexconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = Hexnum.getText().toString();

                int i = Integer.parseInt(string);

                String hexadecimal = Integer.toHexString(i);

                Hextotal.setText("Total is: " + hexadecimal);
            }
        });
        reset = view.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hexnum.setText("");
                Hextotal.setText("Total is:");
            }
        });
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment3,container,false);
    }
}

