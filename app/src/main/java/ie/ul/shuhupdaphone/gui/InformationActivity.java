package ie.ul.shuhupdaphone.gui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

import ie.ul.shuhupdaphone.R;


public class InformationActivity extends Activity {

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_information);
        textView = (TextView) findViewById(R.id.textView);
        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        String name = myPrefs.getString(AppPreferences.KEY_USERNAME,"");
        if(name==""){
            textView.setText("No name available in SharedPreferences");
        }else {
                textView.setText(name);
        }
    }

}