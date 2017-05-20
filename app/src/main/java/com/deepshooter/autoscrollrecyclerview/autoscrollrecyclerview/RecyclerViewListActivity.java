package com.deepshooter.autoscrollrecyclerview.autoscrollrecyclerview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import com.deepshooter.autoscrollrecyclerview.R;
import com.deepshooter.autoscrollrecyclerview.bean.Data;

import java.util.ArrayList;

public class RecyclerViewListActivity extends AppCompatActivity {

    RecyclerView mListRecyclerView;
    ArrayList<Data> dataArrayList;
    RecyclerViewListAdapter recyclerViewListAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list);

        initializeView();

    }


    private void initializeView()
    {

        mListRecyclerView = (RecyclerView) findViewById(R.id.vR_recyclerViewList);

        setValues();
    }


    private void setValues()
    {
        prepareData();

        recyclerViewListAdapter = new RecyclerViewListAdapter(RecyclerViewListActivity.this,dataArrayList);
        //mListRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewListActivity.this));
        mListRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mListRecyclerView.setHasFixedSize(false);

        mListRecyclerView.setAdapter(recyclerViewListAdapter);
        recyclerViewListAdapter.notifyDataSetChanged();



        // Try One
      /*  mListRecyclerView.post(new Runnable() {
            @Override
            public void run() {
                // Call smooth scroll
                mListRecyclerView.smoothScrollToPosition(recyclerViewListAdapter.getItemCount());
            }
        });*/




       //Try Two
       /* final int speedScroll = 150;
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            @Override
            public void run() {
                if(count < dataArrayList.size()){
                    mListRecyclerView.scrollToPosition(++count);
                    handler.postDelayed(this,speedScroll);
                }


            }
        };

        handler.postDelayed(runnable,speedScroll); */




        //Try Three
        final int speedScroll = 2000;
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            boolean flag = true;
            @Override
            public void run() {
                if(count < recyclerViewListAdapter.getItemCount()){
                    if(count==recyclerViewListAdapter.getItemCount()-1){
                        flag = false;
                    }else if(count == 0){
                        flag = true;
                    }
                    if(flag) count++;
                    else count--;

                    mListRecyclerView.smoothScrollToPosition(count);
                    handler.postDelayed(this,speedScroll);
                }
            }
        };

        handler.postDelayed(runnable,speedScroll);


        mListRecyclerView.setLayoutManager(new CustomLinearLayoutManager(RecyclerViewListActivity.this, LinearLayoutManager.VERTICAL, false));



    }


    private void prepareData()
    {
        dataArrayList = new ArrayList<>();

        Data data1 = new Data();
        data1.setmNumber("1");
        data1.setmText("One");
        dataArrayList.add(data1);

        Data data2 = new Data();
        data2.setmNumber("2");
        data2.setmText("Two");
        dataArrayList.add(data2);


        Data data3 = new Data();
        data3.setmNumber("3");
        data3.setmText("Three");
        dataArrayList.add(data3);

        Data data4 = new Data();
        data4.setmNumber("4");
        data4.setmText("Four");
        dataArrayList.add(data4);

        Data data5 = new Data();
        data5.setmNumber("5");
        data5.setmText("Five");
        dataArrayList.add(data5);


        Data data6 = new Data();
        data6.setmNumber("6");
        data6.setmText("Six");
        dataArrayList.add(data6);

        Data data7 = new Data();
        data7.setmNumber("7");
        data7.setmText("Seven");
        dataArrayList.add(data7);

        Data data8 = new Data();
        data8.setmNumber("8");
        data8.setmText("Eight");
        dataArrayList.add(data8);

        Data data9 = new Data();
        data9.setmNumber("9");
        data9.setmText("Nine");
        dataArrayList.add(data9);

        Data data10 = new Data();
        data10.setmNumber("10");
        data10.setmText("Ten");
        dataArrayList.add(data10);

        Data data11 = new Data();
        data11.setmNumber("11");
        data11.setmText("Eleven");
        dataArrayList.add(data11);

        Data data12 = new Data();
        data12.setmNumber("12");
        data12.setmText("Twelve");
        dataArrayList.add(data12);


        Data data13 = new Data();
        data13.setmNumber("13");
        data13.setmText("Thirteen");
        dataArrayList.add(data13);

        Data data14 = new Data();
        data14.setmNumber("14");
        data14.setmText("Fourteen");
        dataArrayList.add(data14);


        Data data15 = new Data();
        data15.setmNumber("15");
        data15.setmText("Fifteen");
        dataArrayList.add(data15);

        Data data16 = new Data();
        data16.setmNumber("16");
        data16.setmText("Sixteen");
        dataArrayList.add(data16);

        Data data17 = new Data();
        data17.setmNumber("17");
        data17.setmText("Seventeen");
        dataArrayList.add(data17);


        Data data18 = new Data();
        data18.setmNumber("18");
        data18.setmText("Eighteen");
        dataArrayList.add(data18);

        Data data19 = new Data();
        data19.setmNumber("19");
        data19.setmText("Nineteen");
        dataArrayList.add(data19);

        Data data20 = new Data();
        data20.setmNumber("20");
        data20.setmText("Twenty");
        dataArrayList.add(data20);

        Data data21 = new Data();
        data21.setmNumber("21");
        data21.setmText("Twenty One");
        dataArrayList.add(data21);

        Data data22 = new Data();
        data22.setmNumber("22");
        data22.setmText("Twenty Two");
        dataArrayList.add(data22);

        Data data23 = new Data();
        data23.setmNumber("23");
        data23.setmText("Twenty Three");
        dataArrayList.add(data23);

        Data data24 = new Data();
        data24.setmNumber("24");
        data24.setmText("Twenty Four");
        dataArrayList.add(data24);


    }


}
