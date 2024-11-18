package ma.ofppt.mvvmarchitecturepattern.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.BindingAdapter;

import ma.ofppt.mvvmarchitecturepattern.R;
import ma.ofppt.mvvmarchitecturepattern.viewmodels.LoginViewModel;

public class MainActivity<> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity dataBindingUtil = new Activity();
        ActivityMainBinding acticityMainBinding=dataBindingUtil.setContentView(this,R.layout.activity_main);
        acticityMainBinding.setViewModel(new LoginViewModel());
        acticityMainBinding.executePendingBinding();
    }
    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message){
        if (message != null)
            Toast.makeText(view.getContext(),message,Toast.LENGTH_SHORT).show();
    }
}