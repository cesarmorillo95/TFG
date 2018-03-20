package com.example.cemo9.a2armario.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cemo9.a2armario.R;
import com.example.cemo9.a2armario.activities.AddClothesActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClothesFragment extends Fragment implements View.OnClickListener, DialogInterface.OnClickListener {

    private FloatingActionButton fab;
    private TextView textView;

    private AlertDialog.Builder builder;
    private EditText editTextName;
    private EditText editTextTemp;

    public ClothesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clothes, container, false);

        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        /*builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Añadir prenda");
        builder.setMessage("Introduzca las caracteristicas de su nueva prenda");


        // Set up the input
        editTextName = new EditText((getContext()));
        editTextName.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        builder.setView(editTextName);

        editTextTemp = new EditText((getContext()));
        editTextTemp.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        builder.setView(editTextTemp);

        // Set up the buttons
        builder.setPositiveButton("OK", this);
        builder.setNegativeButton("Cancel", this);
        builder.show();*/
        Intent intent = new Intent(getActivity(), AddClothesActivity.class);
        //intent.putExtra("id", boards.get(position).getId());
        startActivity(intent);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE) {

            String email = editTextName.getText().toString();
            if (!email.isEmpty()) {
                editTextName.setText(email);
            }

        } else if (which == DialogInterface.BUTTON_NEGATIVE) {
            dialog.cancel();
        }
    }

}
