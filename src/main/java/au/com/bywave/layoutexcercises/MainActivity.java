package au.com.bywave.layoutexcercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    txtview.setCompoundDrawablesWithIntrinsicBounds(
    R.drawable.image, 0, 0, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
