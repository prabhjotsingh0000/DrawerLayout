package com.example.prabhjot.drawerlayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyFragment extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_layout, container, false);

        String title = this.getArguments().getString("message");

        textView= (TextView) view.findViewById(R.id.title);
        textView.setText(title);
        return view;

    }

    public void updateTextView(Bundle bundle)
    {
        String title = bundle.getString("message");
        textView.setText(title);
        return;
    }

}
