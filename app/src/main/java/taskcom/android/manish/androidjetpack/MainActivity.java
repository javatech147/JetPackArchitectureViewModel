package taskcom.android.manish.androidjetpack;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Manish Kumar on 11/5/2018
 */
public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNumber = findViewById(R.id.tvDisplayNumber);
        //MainActivityViewModel dataGenerator = new MainActivityViewModel();    // Data is not preserved when screen is rotated.
        MainActivityViewModel viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class); // Data is preserved when screen is rotated.
        String randomNumber = viewModel.getNumber();
        tvNumber.setText(randomNumber);

    }
}

