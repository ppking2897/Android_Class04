package tw.org.iii.ppking_android_class04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    private TextView mesg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Intent it = getIntent();
        int level = it.getIntExtra("level", 0 );
        String name = it.getStringExtra("name");
        boolean sound = it.getBooleanExtra("sound", false);

        mesg = (TextView)findViewById(R.id.page3_mesg);
        mesg.setText("Name:" + name + "\n"+
                     "Level:"+ level+ "\n"+
                     "Sound:"+ (sound?"On":"Off") + "\n");
    }

    @Override
    //在死之前傳輸該page的資料，辨別該page所執行的結果  自己定義
    public void finish() {
        setResult(321);
        //自己結束  純粹要丟資料  不需要跳到別的地方inetent();
        Intent it = new Intent();
        it.putExtra("key1","value1");
        setResult(321,it);
        super.finish();
    }
}
