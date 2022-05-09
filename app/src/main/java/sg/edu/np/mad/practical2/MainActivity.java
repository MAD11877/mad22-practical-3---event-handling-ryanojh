package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        String t = i.getStringExtra("Title");
        TextView title = findViewById(R.id.textView);
        title.setText(t);
        TextView txt = findViewById(R.id.follow);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean followed;
                String status = txt.getText().toString();
                if (status == "Follow"){
                    followed = false;
                }
                else{
                    followed = true;
                }
                if (!followed){
                    txt.setText("Unfollow");
                    Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_LONG).show();
                }
                else{
                    txt.setText("Follow");
                    Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_LONG).show();
                }

            }
        });
        Button m = findViewById(R.id.message);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(i2);
            }
        });
    }
}