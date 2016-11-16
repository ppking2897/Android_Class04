package tw.org.iii.ppking_android_class04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button test1 ,test2 , test3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("ppking","onCreate");

        test1 = (Button)findViewById(R.id.test1);
        test2 = (Button)findViewById(R.id.test2);
        test3 = (Button)findViewById(R.id.test3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("ppking","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ppking","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ppking","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ppking","onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ppking","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ppking","onRestart");
    }

    public void test1(View view){
        if(view==test1) {
            //intent 切換activity  Intent(從這切換,為類別的目的地)
            //類別原因為是不知道是否再記憶體裡面  由作業系統去尋找
            Intent it = new Intent(this, Page2Activity.class);
            startActivity(it);
            Log.v("ppking", "test1 return");
        }else if (view == test2){
            finish();
        }
    }
    public void test3 (View view){
        Intent it = new Intent(this, page3.class);
        it.putExtra("name", "ppking");
        it.putExtra("level", 4);
        it.putExtra("sound" , false);
        startActivity(it);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String key1 = data.getStringExtra("key1");
        Log.v("ppking", "onActivityResult:"+ requestCode + ":" + resultCode + ":" + key1);
    }

    public void test4 (View view){
        Intent it = new Intent(this, page3.class);
        it.putExtra("name", "ppking");
        it.putExtra("level", 4);
        it.putExtra("sound" , false);
        startActivityForResult(it,123);  //requsetcode => 123 辨別是哪個page發送
    }

}
