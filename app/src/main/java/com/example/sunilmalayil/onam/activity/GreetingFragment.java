package com.example.sunilmalayil.onam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sunilmalayil.onam.R;


public class GreetingFragment extends Fragment {
//public EditText ed1;
    //public Button send;

    public GreetingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ///
        /*// ed1=(EditText)findViewById(R.id.emailmsg);
        // send=(Button)findViewById(R.id.btnsend);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to="kochinsoft@gmail.com";
                String sub="Onamapps";
                String messege=ed1.getText().toString();
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,sub);
                email.putExtra(Intent.EXTRA_TEXT,messege);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client:"));

            }
        });*/


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_greeting, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
