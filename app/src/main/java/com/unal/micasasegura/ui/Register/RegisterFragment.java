package com.unal.micasasegura.ui.Register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.unal.micasasegura.databinding.FragmentRegisterBinding;

public class RegisterFragment extends Fragment implements View.OnClickListener {
    private FragmentRegisterBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RegisterViewModel registerViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        binding = FragmentRegisterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        EditText Textcorreo = binding.InputCorreo;
        EditText Textpassword = binding.Inputpassword;
        EditText Textnombre = binding.InputNombre;
        Button button = binding.registerbttn;

        CheckBox checkBox = binding.DoctorCheck;

            if (checkBox.isChecked()) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("users");
                        myRef.child("doctor").child(Textcorreo.getText().toString()).child("nombre").setValue(Textnombre.getText().toString());
                        myRef.child("doctor").child(Textcorreo.getText().toString()).child("password").setValue(Textpassword.getText().toString());
                    }
                });
            }

        return root;
    }

    @Override
    public void onClick(View v) {

    }
}