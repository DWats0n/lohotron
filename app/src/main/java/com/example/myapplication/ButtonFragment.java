package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ButtonFragment extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.button_fragment, container, false);

        // теперь можем получить наши элементы, расположенные во фрагменте
        Button button1 = (Button) view.findViewById(R.id.button);
        Button button2 = (Button) view.findViewById(R.id.button2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        Toast.makeText(getActivity(), "1 Message from fragment", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button2:
                        Toast.makeText(getActivity(), "2 Message from fragment", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        return view;
    }
}
