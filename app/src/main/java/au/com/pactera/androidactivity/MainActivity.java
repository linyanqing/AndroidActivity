package au.com.pactera.androidactivity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate");

        findViewById(R.id.btnStartActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AnotherActivity.class);
                i.putExtra("data", "Hello Pactera");
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onStop(){
        super.onStart();
        System.out.println("onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("onRestart");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
