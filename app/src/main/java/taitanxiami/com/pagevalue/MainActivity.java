package taitanxiami.com.pagevalue;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "taitanxiami.com.pagevalue.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

    // Do something in response to button
        EditText editText = (EditText)findViewById(R.id.text_id);
        String message = editText.getText().toString();
        if (message == null || message.length() == 0) {

            Log.i("tag","不能传空值");

//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setMessage(R.string.dialog_message)
//                    .setTitle(R.string.dialog_title);
//
//// 3. Get the AlertDialog from create()
//            AlertDialog dialog = builder.create();
            return;
        }
        Intent intent = new Intent(this,DisplayMessageActivity.class);

        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
