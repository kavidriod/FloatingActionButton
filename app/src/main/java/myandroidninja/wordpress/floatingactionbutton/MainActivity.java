package myandroidninja.wordpress.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Fab");

       final FrameLayout rootLayout = findViewById(R.id.rootLayout);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getApplicationContext(),"FloatingActionButton Clicked",Toast.LENGTH_LONG).show();
                Snackbar.make(rootLayout,"FloatingActionButton Clicked",Snackbar.LENGTH_INDEFINITE).show();
            }
        });


    }
}
