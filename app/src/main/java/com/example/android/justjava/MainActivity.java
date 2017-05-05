package com.example.android.justjava;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int n=2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        display(++n);
    }
    public void decrement(View view) {
        if(n>0)
        display(--n);
    }
    public void submitOrder(View view) {
        displayAmt(n*50);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayAmt(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.amount);
        quantityTextView.setText(java.text.NumberFormat.getCurrencyInstance().format(number));
        CheckBox wc=(CheckBox)findViewById(R.id.Whipped);
        boolean f=wc.isChecked();
        quantityTextView.setText("Whipped Cream?? "+f+"\n"+java.text.NumberFormat.getCurrencyInstance().format(number));



    }
}