package com.unal.micasasegura.ui.Login;

import android.content.Context;
import android.content.SharedPreferences;
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

import com.google.firebase.database.FirebaseDatabase;
import com.unal.micasasegura.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment implements View.OnClickListener {

    private FragmentLoginBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        com.unal.micasasegura.ui.Login.LoginViewModel loginViewModel = new ViewModelProvider(this).get(com.unal.micasasegura.ui.Login.LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        EditText Textcorreo = binding.InputCorreo;
        EditText Textpassword = binding.InputPassword;
        Button button = binding.loginbttn;

        CheckBox checkBox = binding.checkerBox;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        button.setOnClickListener(this);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {

    }
}
