package com.mygdx.game;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


@SuppressLint("NewApi")
public class firebase extends Fragment {

    public EditText etUserName ;
    public EditText etPasword ;
    public Button btnLogin;
    public Button btnregistro;
    public LoginFragmentEvent events;
    //listener generico
    public LoginFragmentListener listener;

    public firebase(){

    }

    public void setListener(LoginFragmentListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fb, container, false);

        etUserName= v.findViewById(R.id.etUserName);
        etPasword= v.findViewById(R.id.etPasword);
        btnLogin=(Button) v.findViewById(R.id.btnLogin);
        btnregistro= v.findViewById(R.id.btnregistro);
        events= new  LoginFragmentEvent(this);
        btnLogin.setOnClickListener(events);
        btnregistro.setOnClickListener(events);

    return v;
    }


}


class LoginFragmentEvent implements View.OnClickListener{

    private firebase fb;

    public LoginFragmentEvent(firebase fb ){

        this.fb = fb;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == this.fb.btnLogin.getId()) {
            this.fb.listener.FbBtnlogin(this.fb.etUserName.getText().toString(),
            this.fb.etPasword.getText().toString());
        }else if (v.getId() == this.fb.btnregistro.getId()) {
            this.fb.listener.FbBtnlogin(this.fb.etPasword.getText().toString(),
            this.fb.etPasword.getText().toString());
    }
}
}