package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.listAdapters.ListAdapterP;
import com.example.niketraining.ListData;
import com.example.niketraining.R;

public class Plans extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterP adapter;
    private View view;

    ListData[] listData = new ListData[] {
            new ListData("START UP \n Kick it off with four weeks of guided, well-balanced workouts to get you fit", R.drawable.plan_1),
            new ListData("LEAN FIT \n Get lean and fit over six weeks with a balanced plan that builds endurance", R.drawable.history),
            new ListData("BODYWEIGHT ONLY \n Push your strength and improve muscle tone over four weeks-all without weights", R.drawable.history),
            new ListData("GYM STRONG \n Build full-body strength with a focus on weight training over 8 weeks", R.drawable.history),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_plans, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewP);
        adapter = new ListAdapterP(listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}