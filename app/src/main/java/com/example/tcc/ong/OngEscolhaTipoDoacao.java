package com.example.tcc.ong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tcc.R;

public class OngEscolhaTipoDoacao extends AppCompatActivity {

    Button btnCamapnha, btnUnica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ong_activity_escolha_tipo_doacao);

        btnCamapnha = findViewById(R.id.btnCampanhaArecadacaoOng);
        btnUnica = findViewById(R.id.btnDoacaoEspecificaOng);

        btnCamapnha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OngEscolhaTipoDoacao.this, "CAMPANHA", Toast.LENGTH_SHORT).show();
            }
        });

        btnUnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OngEscolhaTipoDoacao.this, "ÚNICA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}