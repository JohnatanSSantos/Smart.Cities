package br.com.etecia.smartcities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Menu> ListaMenu;

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaMenu);

        ListaMenu = new ArrayList<>();

        ListaMenu.add(
                new Menu(
                        "sff",
                        "fsafs",
                        R.drawable.capitalhumano));

        ListaMenu.add(
                new Menu("sff",
                        "fsafs",
                        R.drawable.capitalhumano));

        ListaMenu.add(
                new Menu("sff",
                        "fsafs",
                        R.drawable.capitalhumano));

        ListaMenu.add(
                new Menu("sff",
                        "fsafs",
                        R.drawable.capitalhumano));

        ListaMenu.add(
                new Menu("sff",
                        "fsafs",
                        R.drawable.capitalhumano));



        MyAdapter adapter = new MyAdapter(getApplicationContext(), ListaMenu);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }
}