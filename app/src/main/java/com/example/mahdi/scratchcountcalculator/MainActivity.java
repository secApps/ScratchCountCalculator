package com.example.mahdi.scratchcountcalculator;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
    TextView totall,tv;
    TableLayout table;
  int counter=0;
    int width_1;
    Button bsubmit,b7;
    int[] numbers=new int[500];
    int[] numbers_pressed=new int[500];
    int pressed,price_pressed,total=0,total_number=0,numbers_index=0,numbers_pressed_index=0;
    boolean dollar_flag=false;
    String pressed_number="",pressed_price,Total;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b0:
                pressed=0;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                //hello
                break;
            //OR
            case R.id.b1:
                pressed=1;
                dollar_flag=true;
                counter++;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                break;
            case R.id.b2:
                pressed=2;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b3:
                pressed=3;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b4:
                pressed=4;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b5:
                pressed=5;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b6:
                pressed=6;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b7:
                pressed=7;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b8:
                pressed=8;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.b9:
                pressed=9;
                dollar_flag=true;
                pressed_number=pressed_number.concat(Integer.toString(pressed));
                counter++;
                break;
            case R.id.d1:
                if(dollar_flag){
               price_pressed=1;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                  totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d2:
                if(dollar_flag){
                price_pressed=2;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d3:
                if(dollar_flag){
                price_pressed=3;
                dollar_flag=false;
                    total_number=total_number+Integer.parseInt(pressed_number);
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d5:
                if(dollar_flag){
                price_pressed=5;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d10:
                if(dollar_flag){
                price_pressed=10;
                dollar_flag=false;
                    total_number=total_number+Integer.parseInt(pressed_number);
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d20:
                if(dollar_flag){
                price_pressed=20;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d30:
                if(dollar_flag){
                price_pressed=30;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.d50:
                if(dollar_flag){
                price_pressed=50;
                    total_number=total_number+Integer.parseInt(pressed_number);
                dollar_flag=false;
                total=total+Integer.parseInt(pressed_number)*price_pressed;
                totall.setText(Integer.toString(total));
                    tv.setText(Integer.toString(total_number));
                counter=0;
                updateTable(v,pressed_number,Integer.toString(price_pressed),true);
                pressed_number="";}
                break;
            case R.id.clear:
               // pressed=9;
               // pressed_number=pressed_number.concat(Integer.toString(pressed));
                if(numbers_index!=0){
                updateTable(v,pressed_number,Integer.toString(price_pressed),false);
                counter=0;}
                break;
            case R.id.reset:
                // pressed=9;
                // pressed_number=pressed_number.concat(Integer.toString(pressed));

                    resetTable();
                    counter=0;
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
        tv=(TextView)findViewById(R.id.total_num);
        Button b0 =(Button)findViewById(R.id.b0);
        b0.setOnClickListener(this);
        Button b1 =(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);

        //b1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
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
        Button bd1=(Button)findViewById(R.id.d1);
        bd1.setOnClickListener(this);
        Button bd2=(Button)findViewById(R.id.d2);
        bd2.setOnClickListener(this);
        Button bd3=(Button)findViewById(R.id.d3);
        bd3.setOnClickListener(this);
        Button bd5=(Button)findViewById(R.id.d5);
        bd5.setOnClickListener(this);
        Button bd10=(Button)findViewById(R.id.d10);
        bd10.setOnClickListener(this);
        Button bd20=(Button)findViewById(R.id.d20);
        bd20.setOnClickListener(this);
        Button bd30=(Button)findViewById(R.id.d30);
        bd30.setOnClickListener(this);
        Button bd50 =(Button)findViewById(R.id.d50);
        bd50.setOnClickListener(this);
        Button bclear =(Button)findViewById(R.id.clear);
        bclear.setOnClickListener(this);
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
         table= (TableLayout) findViewById(R.id.TableLayout01);

        // create a new TableRow
        TableRow row = new TableRow(getApplicationContext());

        // count the counter up by one
        //counter++;

        // create a new TextView
        TextView t = new TextView(getApplicationContext());
        // set the text to "text xx"
        //t.setText(number_prssd +" @ $" + price_prssd);
        t.setText(spanIt(number_prssd + " @ $" + price_prssd, "@ $"));
        t.setTextColor(ColorStateList.valueOf(Color.rgb(237, 120, 31)));
        t.setTextSize(25);
        t.setTypeface(null, Typeface.BOLD);
        t.setGravity(View.TEXT_ALIGNMENT_TEXT_END);




        // add the TextView and the CheckBox to the new TableRow
        if(remove_add){
        row.addView(t);



        // add the TableRow to the TableLayout
        table.addView(row,new TableLayout.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT));
            numbers[numbers_index]=Integer.parseInt(number_prssd)*Integer.parseInt(price_prssd);
            numbers_pressed[numbers_index]=Integer.parseInt(number_prssd);

           // tv.setText(Integer.toString(numbers_pressed[numbers_index]));

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
                tv.setText(Integer.toString(Integer.parseInt(tv.getText().toString())-numbers_pressed[numbers_index-1]));
            numbers_index--;
                }



        }
        // Enqueue the scrolling to happen after the new row has been layout
        ((ScrollView) findViewById(R.id.ScrollView01)).post(new Runnable() {
            public void run() {
                ((ScrollView) findViewById(R.id.ScrollView01)).fullScroll(View.FOCUS_DOWN);
            }

        });

    }
    private SpannableString spanIt(String text, String queryText) {
        // search for query on text
        int startIndex = text.indexOf(queryText);
        int endIndex = startIndex + queryText.length();
        // spannable to show the search query
        SpannableString spanText = new SpannableString(text);
        if (startIndex > -1) {
            spanText.setSpan(new ForegroundColorSpan(Color.BLACK), startIndex,
                    endIndex, 0);
        }
        return spanText;
    }
    public void resetTable(){

        table.removeAllViews();
        total=0;
        total_number=0;
        numbers_index=0;
        dollar_flag=false;
        totall.setText("0");
        tv.setText("0");


    }
}
