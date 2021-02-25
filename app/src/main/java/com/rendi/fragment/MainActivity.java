package com.rendi.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.btn_fragment1)
    Button btnFragment1;
    @BindView(R.id.btn_fragment2)
    Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frame_container, new FirstFragment());
        fragmentTransaction.add(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment1)
    public void onBtnFragment1Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new FirstFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment2)
    public void onBtnFragment2Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }

    /**
     * A simple {@link Fragment} subclass.
     */
    public static class SecondFragment extends Fragment {


        public SecondFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_second, container, false);
        }

    }

    /**
     * A simple {@link Fragment} subclass.
     */
    public static class FirstFragment extends Fragment {


        public FirstFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_first, container, false);
        }

    }
}
