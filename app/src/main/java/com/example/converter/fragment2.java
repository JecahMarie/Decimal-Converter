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

public class fragment2 extends Fragment {
    Button Octalconvert, reset;
    EditText Octalnum;
    TextView Octaltotal;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Octalnum = view.findViewById(R.id.Octalnum);
        Octalconvert = view.findViewById(R.id.Octalconvert);
        Octaltotal = view.findViewById(R.id.Octaltotal);


        Octalconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = Octalnum.getText().toString();

                int i = Integer.parseInt(string);

                String octal = Integer.toOctalString(i);

                Octaltotal.setText("Total is: " + octal);
            }
        });
        reset = view.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Octalnum.setText("");
                Octaltotal.setText("Total is:");
            }
        });
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment2,container,false);
    }
}

