package com.santiagoosorio.addressbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class PerfilActivity extends AppCompatActivity {
    TextView tusuario,temail,tcontraseña;
    String usuario,contrasena,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tusuario = (EditText)findViewById(R.id.eUsuario);
        tcontraseña = (EditText)findViewById(R.id.eContraseña);
        temail = (EditText)findViewById(R.id.eemail);


        Bundle extras = getIntent().getExtras();
        tusuario.setText("Usuario: "+(String.valueOf(extras.getString("usuario"))));
        tcontraseña.setText("Contraseña: "+(String.valueOf(extras.getString("contrasena"))));
        temail.setText("Email: "+(String.valueOf(extras.getString("email"))));
        tusuario.setTextSize(25);
        tcontraseña.setTextSize(25);
        temail.setTextSize(25);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_perfil2){
            Intent i = new Intent(PerfilActivity.this,MainActivity.class);
            i.putExtra("usuario",usuario);
            i.putExtra("contrasena",contrasena);
            i.putExtra("email",email);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
