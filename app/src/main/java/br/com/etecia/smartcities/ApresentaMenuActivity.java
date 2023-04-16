package br.com.etecia.smartcities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class ApresentaMenuActivity extends AppCompatActivity {

    TextView mTituloMenu, mDescricao;

    ImageView mImagemMenu;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_menu_layout);

        mTituloMenu= findViewById(R.id.mTituloMenu);
        mDescricao = findViewById(R.id.mDescricao);
        mImagemMenu = findViewById(R.id.mImagemMenu);
        idToolbar = findViewById(R.id.idToolBar);

        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        Intent intent = getIntent();

        String titulo, descricao;
        int imagemMenu;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        imagemMenu = intent.getExtras().getInt("ImagemMenu");

        mTituloMenu.setText(titulo);
        mDescricao.setText(descricao);
        mImagemMenu.setImageResource(imagemMenu);
    }
}