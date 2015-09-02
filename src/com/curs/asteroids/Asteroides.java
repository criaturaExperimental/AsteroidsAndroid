package com.curs.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity
{
    
    private Button bAcercaDe;
     private Button salirActivity;
     private Button preferencias;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //boton creditos
         bAcercaDe =(Button) findViewById(R.id.Button03);

        bAcercaDe.setOnClickListener(new OnClickListener() {

                   public void onClick(View view) {

                        lanzarAcercaDe(null);

                  }

            });
        //boton para actividad.
        salirActivity=(Button)findViewById(R.id.Button04);
        salirActivity.setOnClickListener(new OnClickListener() {

                   public void onClick(View view) {

                        finish();

                  }

            });
          //boton para preferencias.
        preferencias=(Button)findViewById(R.id.Button02);
        preferencias.setOnClickListener(new OnClickListener() {

                   public void onClick(View view) {

                        preferenciasConfig(null);

                  }

            });
      
    }//fin onCreate
    public void lanzarAcercaDe(View view){

      Intent i = new Intent(this, AcercaDe.class);

            startActivity(i);
    }//fin creditos
    //lanza preferencias
     public void preferenciasConfig(View view){

      Intent p = new Intent(this, Preferencias.class);

            startActivity(p);
     }//fin preferencias
    //el menu
     @Override public boolean onCreateOptionsMenu(Menu menu) {

       super.onCreateOptionsMenu(menu);

       MenuInflater inflater = getMenuInflater();

       inflater.inflate(R.menu.menu, menu);

       return true; /** true -> el menú ya está visible */

    }
       @Override public boolean onOptionsItemSelected(MenuItem item) {

             switch (item.getItemId()) {

             case R.id.acercaDe:

                    lanzarAcercaDe(null);

                    break;
                  case R.id.config:

                    preferenciasConfig(null);

                    break;

             }

             return true; /** true -> consumimos el item, no se propaga*/

    }
}
