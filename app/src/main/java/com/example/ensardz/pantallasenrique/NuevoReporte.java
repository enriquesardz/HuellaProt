package com.example.ensardz.pantallasenrique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NuevoReporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_reporte);
    }

    public void aceptarOnClick(View view){
        Toast.makeText(this, "Has presionado aceptar", Toast.LENGTH_SHORT).show();
    }

    public void cancelarOnClick(View view){
        Toast.makeText(this, "Has presionado cancelar", Toast.LENGTH_SHORT).show();
    }
}
