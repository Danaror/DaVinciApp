package es.studium.davinciapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import es.studium.davinciapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        //fab corresponde al botón flotante, en este caso nos activa el Snackbar
        /*binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //Muy parecido al Toast
                Snackbar.make(view, "Disponible próximamente", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        //Esta instrucción hace referencia al tablero o menú lateral
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        //Aquí relacionamos las opciones de nuestras opciones del menú lateral con los fragmentos ya creados
        //Para este caso relaciona las opciones nav_home, nav_gallery y nav_slideshow con los fragmentos
        //
        //
        //
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_pintor, R.id.nav_cientifico, R.id.nav_inventor, R.id.nav_escultor)
                .setOpenableLayout(drawer)
                .build();
        //aquí le añadimos los eventos a nuestro menú lateral
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
    //Se crea el menú opciones para el CRUD
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //Le damos funcionalidad a los item del munú opciones (CRUD)
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.mAlta:
                Toast.makeText(this,"Has seleccionado Alta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBaja:
                Toast.makeText(this,"Has seleccionado Baja", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mModificacion:
                Toast.makeText(this,"Has seleccionado Modificación", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}