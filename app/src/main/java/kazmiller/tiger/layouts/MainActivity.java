package kazmiller.tiger.layouts;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{


    Button btn_xianxingbuju;
    Button btn_xiangduibuju;
    Button btn_biaogebuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_xianxingbuju = (Button)findViewById(R.id.xianxingbuju);
        btn_xianxingbuju.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, xianxingbujuActivity.class);
                startActivity(intent);
            }
        });

        btn_xiangduibuju = (Button)findViewById(R.id.xiangduibuju);
        btn_xiangduibuju.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, xiangduibujuActivity.class);
                startActivity(intent);
            }
        });

        btn_biaogebuju = (Button)findViewById(R.id.biaogebuju);
        btn_biaogebuju.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, biaogebujuActivity.class);
                startActivity(intent);
            }
        });


    }


}
