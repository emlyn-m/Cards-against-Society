package ashrlm.cardsagainstsociety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        setTitle("Cards against Society - Credits");
        TextView t2 = findViewById(R.id.credits_text);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}