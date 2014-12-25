package cn.edu.gdmec.s07131031.demo_imageview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	  private int[] pics = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
      		R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h};
	  
	  private ImageView imageView;
	  private Button button;
	  
	  private int index;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView) findViewById(R.id.imageView1);
        button=(Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				imageView.setImageResource(pics[++index % pics.length]);
				
			}
        	
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
