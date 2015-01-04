package com.rudenko.android.wallet21.activities;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.rudenko.android.wallet21.R;
import com.rudenko.android.wallet21.time.Date;

public class AddExpActivity extends ActionBarActivity {

    public static final String TAG = "db_budget";
    int DIALOG_DATE = 1;

    Spinner curSpinner;
    String[] dataForCurSpinner = {"EU", "USD", "myCur"};

    TextView tvDate;
    Date curDate = new Date();
    private int year = curDate.getYear();
    private int month = curDate.getMonth();
    private int day = curDate.getDay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_exp_operation);

        /***************************************onCreate::: Set current date ***********************************************************/
        tvDate = (TextView) findViewById(R.id.textViewCurDate);

        //set current date to the textView
        tvDate.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(day).append(".").append(month + 1).append(".")
                .append(year));


        /************************************onCreate::: Set current currency ***********************************************************/
        ArrayAdapter<String> adapterForSpinner = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dataForCurSpinner);
        adapterForSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        curSpinner = (Spinner) findViewById(R.id.curSpinner);
        curSpinner.setAdapter(adapterForSpinner);
        curSpinner.setPrompt("set currency...");
        curSpinner.setSelection(1);
        curSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected (AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getBaseContext(), curSpinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

    }

    /********************************************* Selecting another date ***********************************************************/
    public void onDateClick(View view) {
        showDialog(DIALOG_DATE);
    }
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_DATE) {
            DatePickerDialog tpd = new DatePickerDialog(this, myCallBack, curDate.getYear(), curDate.getMonth(), curDate.getDay());
            return tpd;
        }
        return super.onCreateDialog(id);
    }
    DatePickerDialog.OnDateSetListener myCallBack = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int curYear, int monthOfYear,
                              int dayOfMonth) {
            year = curYear;
            month = monthOfYear;
            day = dayOfMonth;
            tvDate.setText(new StringBuilder()
                    // Month is 0 based, just add 1
                    .append(day).append(".").append(month + 1).append(".")
                    .append(curYear));
        }
    };


    /********************************************* Menu ***********************************************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_exp, menu);
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
