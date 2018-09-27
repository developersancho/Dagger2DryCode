package developersancho.dagger2drycode;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView) findViewById(R.id.textview1);
        prefs.edit().putInt("Number", 6).apply();
        textview1.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));

        Log.d("DEBUG_TAG", "onCreate: The value of Number is: " + prefs.getInt("Number", 0));
    }
}
