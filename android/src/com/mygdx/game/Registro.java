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
public class Registro extends Fragment {

    public EditText etReUserName ;
    public EditText etRePasword ;
    public Button btnAceptar;
    public Button btnCancelar;
    public RegistroFragmentEvents events;
    //listener generico
    public RegistroFragmentListener listener;


    public Registro() {
        // Required empty public constructor
    }

    public void setListener(RegistroFragmentListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.Re, container, false);

        etReUserName= v.findViewById(R.id.ReUserName);
        etRePasword= v.findViewById(R.id.RePasword);
        btnAceptar=(Button) v.findViewById(R.id.btnAceptar);
        btnCancelar= v.findViewById(R.id.btnCancelar);

        events= new RegistroFragmentEvents(this);
        btnAceptar.setOnClickListener(events);
        btnCancelar.setOnClickListener(events);

        return v;
    }


}

class RegistroFragmentEvents implements View.OnClickListener{

    Registro Re;

    public RegistroFragmentEvents (Registro Re){

        this.Re=Re;
        }

    @Override
    public void onClick(View v) {
        if (v.getId() == this.Re.btnAceptar.getId()) {
            this.Re.listener.ReBtnAceptar(this.Re.etReUserName.getText().toString(),
                    this.Re.etRePasword.getText().toString());
        }else if (v.getId()==this.Re.btnCancelar.getId()){
            this.Re.listener.ReBtnCancelar();
        }
    }
}