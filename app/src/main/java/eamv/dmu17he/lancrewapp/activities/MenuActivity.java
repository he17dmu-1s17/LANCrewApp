package eamv.dmu17he.lancrewapp.activities;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import eamv.dmu17he.lancrewapp.R;
import eamv.dmu17he.lancrewapp.helper.AzureServiceAdapter;
import eamv.dmu17he.lancrewapp.helper.ToDialogError;

public class MenuActivity extends AppCompatActivity {

    Button button;
    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button vækningBtn = findViewById(R.id.wakeup);
        vækningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, WakeUpActivity.class);
                startActivity(intent);
            }
        });
    }

    public void goToScheduleActivity(View view){
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

    public void goToContactsActivity(View view){
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }

    public void goToProfileActivity(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


}
