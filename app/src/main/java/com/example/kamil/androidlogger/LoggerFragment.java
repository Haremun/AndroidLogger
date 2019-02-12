package com.example.kamil.androidlogger;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoggerFragment extends Fragment {

    TextView textView;

    public LoggerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_logger, container, false);

        textView = view.findViewById(R.id.textLogs);
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.addLog("test");
        Logger.addLog("test2");
        Logger.addLog("test1");
        Logger.addLog("test4");
        Logger.logsToTextView(textView);
        return view;
    }

}
