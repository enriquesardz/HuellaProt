package com.example.ensardz.pantallasenrique;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView mNavigationView = null;
    Toolbar mToolbar = null;
    TextView prefectoTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new MainFragment())
                    .commit();
        }

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_notificaciones) {
            Toast.makeText(this, "Notificacion", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_reporte) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new NuevoReporteFragment())
                    .commit();

        } else if (id == R.id.nav_recorrido) {

        } else if (id == R.id.nav_configuracion) {
            //TODO: EL fragment EscanerFragment no tiene opcion de navegacion, por lo que lo puse aqui...
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new EscanerFragment())
                    .commit();

        } else if (id == R.id.nav_acerca_de) {

        } else if (id == R.id.nav_ayuda) {

        } else if (id == R.id.nav_cerrar_sesion){

        } else if (id == R.id.nav_inicio){

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new MainFragment())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void cancelarOnClick(View view){
        Toast.makeText(this, "Has Cancelado", Toast.LENGTH_SHORT).show();
    }

    public void aceptarOnClick(View view){
        Toast.makeText(this, "Has Aceptado", Toast.LENGTH_SHORT).show();
    }

    public void escanerBarraOnClick(View view){
        Toast.makeText(this, "Escaner barra", Toast.LENGTH_SHORT).show();
    }

    public void escanerQROnClick(View view){
        Toast.makeText(this, "Escaner QR", Toast.LENGTH_SHORT).show();
    }

    public void recorridoOnClick(View view){
        NuevoReporteFragment reporteFragment = new NuevoReporteFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, reporteFragment);
        fragmentTransaction.commit();
    }


}
