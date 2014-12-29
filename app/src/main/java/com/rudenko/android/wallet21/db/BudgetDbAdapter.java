package com.rudenko.android.wallet21.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class BudgetDbAdapter extends SQLiteOpenHelper implements BaseColumns{


    /**
     * Constants for tables'es name  
     */
	public static final String DB_BUDGET = "budgets.db";
    public static final String TABLE_OPERATING = "operation";
    public static final String TABLE_TYPE_OPERATING = "type_operation";
    public static final String TABLE_DAY_BUDGET = "day_budget";
    public static final String TABLE_WEEK_BUDGET = "week_budget";
    public static final String TABLE_MONTH_BUDGET = "month_budget";
    public static final String TABLE_YEAR_BUDGET = "year_budget";
    
    /**
     * Constants for id  
     */
    public static final String KEY_ID = "_id";
    
    /**
     * Constants for name
     */
    public static final String NAME = "name";
    
    /**
     * Constants for budget
     */
    public static final String BALANS = "balans";
    public static final String SUM_EXPENSE = "sumExpense";
    public static final String SUM_INCOME = "sumIncome";
    

    /**
     * Constants for table OPERATING  
     */
    public static final String DATE = "date";
    public static final int DATE_OF_OPERATING_COLUMN = 1;
    public static final String CURRENCY = "currency";
    public static final int CURRENCY_COLUMN = 2;
    public static final String SUM_OF_OPERATING = "sum";
    public static final int SUM_OF_OPERATING_COLUMN = 3;
    
    /**
     * Constants for table TYPE_OF_OPERATING  
     */
    public static final String TYPE_OF_OPERATING = "type";
    public static final int TYPE_OF_OPERATING_COLUMN = 1;
    
    
    


    public BudgetDbAdapter(Context context) {

        super(context, DB_BUDGET, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " 
        
        		+ TABLE_OPERATING
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DATE + " TEXT, " 
                + CURRENCY + " TEXT, " 
                + SUM_OF_OPERATING + " TEXT)"
                
                + TABLE_TYPE_OPERATING
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TYPE_OF_OPERATING + " TEXT)"
                
                + TABLE_DAY_BUDGET
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME + " TEXT,"
                + SUM_EXPENSE + " TEXT,"
                + SUM_INCOME + " TEXT,"
                + BALANS + " TEXT)"

                + TABLE_WEEK_BUDGET
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME + " TEXT,"
                + SUM_EXPENSE + " TEXT,"
                + SUM_INCOME + " TEXT,"
                + BALANS + " TEXT)"
                
                + TABLE_MONTH_BUDGET
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME + " TEXT,"
                + SUM_EXPENSE + " TEXT,"
                + SUM_INCOME + " TEXT,"
                + BALANS + " TEXT)"
                
                + TABLE_YEAR_BUDGET
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME + " TEXT,"
                + SUM_EXPENSE + " TEXT,"
                + SUM_INCOME + " TEXT,"
                + BALANS + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS" + TABLE_OPERATING);
        onCreate(db);

    }
}
