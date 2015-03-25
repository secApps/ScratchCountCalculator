package com.example.mahdi.scratchcountcalculator;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView totall;
  int counter=0;
    int width_1;
    Button bsubmit,b7;
    int[] numbers=new int[500];
    int pressed,price_pressed,total=0,total_number=0,numbers_index=0;
    boolean clear_flag=false;
    String pressed_number="",pressed_price,Total;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b0:
                pressed=0;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                //hello
                break;
            //OR
            case R.id.b1:
                pressed=1;
                counter++;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                break;
            case R.id.b2:
                pressed=2;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b3:
                pressed=3;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b4:
                pressed=4;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b5:
                pressed=5;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b6:
                pressed=6;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b7:
                pressed=7;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b8:
                pressed=8;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b9:
                pressed=9;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.d5:
               price_pressed=5;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                  totall.setText(Integer.toString(total));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";
                break;
            case R.id.clear:
               // pressed=9;
               // pressed_number=pressed_number.concat(Integer.toString(pressed));
                if(numbers_index!=0){
                updateTable(v,pressed_number,Integer.toString(price_pressed),false);
                counter=0;}
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totall=(TextView)findViewById(R.id.textView2);
       // Button btn =(Button)findViewById(R.id.button);
        //btn.setOnClickListener(this);
        Button b0 =(Button)findViewById(R.id.b0);
        b0.setOnClickListener(this);
        Button b1 =(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        Button b2 =(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button b3 =(Button)findViewById(R.id.b3);
        b3.setOnClickListener(this);
        Button b4 =(Button)findViewById(R.id.b4);
        b4.setOnClickListener(this);
        Button b5 =(Button)findViewById(R.id.b5);
        b5.setOnClickListener(this);
        Button b6 =(Button)findViewById(R.id.b6);
        b6.setOnClickListener(this);
         b7 =(Button)findViewById(R.id.b7);
        b7.setOnClickListener(this);
        Button b8 =(Button)findViewById(R.id.b8);
        b8.setOnClickListener(this);
        Button b9 =(Button)findViewById(R.id.b9);
        b9.setOnClickListener(this);
        Button bd5 =(Button)findViewById(R.id.d5);
        bd5.setOnClickListener(this);
        Button bclear =(Button)findViewById(R.id.clear);
        bd5.setOnClickListener(this);
        Button breset =(Button)findViewById(R.id.reset);
        breset.setOnClickListener(this);
         bsubmit =(Button)findViewById(R.id.submit);

        bsubmit.setOnClickListener(this);

        // Gets linearlayout

        final ViewTreeObserver observer= b7.getViewTreeObserver();

        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                width_1=b7.getHeight();
                Toast.makeText(getApplicationContext(), Integer.toString(b7.getWidth()),Toast.LENGTH_LONG).show();
                LinearLayout layout = (LinearLayout)findViewById(R.id.liner);
                ViewGroup.LayoutParams params = layout.getLayoutParams();

// Gets the layout params that will allow you to resize the layout
                // ViewGroup.LayoutParams params = layout.getLayoutParams();
// Changes the height and width to the specified *pixels*
                params.width = b7.getWidth()*2+20;
               // observer.removeGlobalOnLayoutListener(this);
                ViewTreeObserver obs = b7.getViewTreeObserver();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    obs.removeOnGlobalLayoutListener(this);
                } else {
                    obs.removeGlobalOnLayoutListener(this);
                }

            }
        });






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        // TODO Auto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        bsubmit.setWidth(b7.getWidth()*2);

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
    public void updateTable(View v, String number_prssd, String price_prssd, boolean remove_add){

        // get a reference for the TableLayout
        TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);

        // create a new TableRow
        TableRow row = new TableRow(getApplicationContext());

        // count the counter up by one
        //counter++;

        // create a new TextView
        TextView t = new TextView(getApplicationContext());
        // set the text to "text xx"
        t.setText(number_prssd +" @ $" + price_prssd);
        t.setTextColor(ColorStateList.valueOf(Color.rgb(237, 120, 31)));
        t.setTextSize(20);



        // add the TextView and the CheckBox to the new TableRow
        if(remove_add){
        row.addView(t);



        // add the TableRow to the TableLayout
        table.addView(row,new TableLayout.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT));
            numbers[numbers_index]=Integer.parseInt(number_prssd)*Integer.parseInt(price_prssd);
            numbers_index++;

        }
        else{

            int childCount = table.getChildCount();
            if(childCount>0){

            String text= t.getText().toString();

            /*int number_to_be_deleted=Integer.parseInt(text.substring(0,text.lastIndexOf("@")-1))* Integer.parseInt(text.substring(text.lastIndexOf("$") + 1));
            System.out.print(number_to_be_deleted);
            Toast.makeText(getApplicationContext(),text.substring(0,text.lastIndexOf("@")-1) + "  "+ text.substring(text.lastIndexOf("$") + 1) ,Toast.LENGTH_SHORT).show();*/
            totall.setText(Integer.toString(Integer.parseInt(totall.getText().toString())-numbers[numbers_index-1]));
            table.removeViewAt(childCount - 1);
            numbers_index--;}



        }
        // Enqueue the scrolling to happen after the new row has been layout
        ((ScrollView) findViewById(R.id.ScrollView01)).post(new Runnable() {
            public void run() {
                ((ScrollView) findViewById(R.id.ScrollView01)).fullScroll(View.FOCUS_DOWN);
            }

        });

    }
}
