package codpath.sneha.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedActivity extends AppCompatActivity {

    private TextView tvUser;
    private ImageView ivPic;
    private TextView tvCaption;
    public static final String TAG = "FeedActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        tvUser = findViewById(R.id.tvUser);
        ivPic = findViewById(R.id.ivPic);
        tvCaption = findViewById(R.id.tvCaption);

        Intent i = getIntent();

        String User = i.getStringExtra("User");
        String Caption = i.getStringExtra("Caption");
        Bitmap takenImage = BitmapFactory.decodeFile(i.getStringExtra("Pic"));

        Log.i(TAG,User);
        tvUser.setText(User);
        ivPic.setImageBitmap(takenImage);
        tvCaption.setText(Caption);
    }
}