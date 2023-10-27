package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class tab extends Fragment {

    Context context;
    RecyclerView recyclerView;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_tab, container, false);
        recyclerView= view.findViewById(R.id.RecycleViewtab);
        List<String> tabs = new ArrayList<>(Arrays.asList("火影忍者", "Angel  beats", "灼眼的夏娜", "fate", "未闻花名", "轻音少女", "潘多拉之心", "言叶之庭", "秒速5厘米", "斩！赤红之瞳", "境界的彼方", "春之cl", "夏之air", "秋之one", "冬之Kanon", "悠久之翼", "X战记", "K", "罪恶王冠", "刀剑神域", "天降之物", "弹丸论破", "可塑性记忆", "黑子的篮球", "灌篮高手", "暗杀教室", "化物语", "伪物语", "猫物语", "倾物语", "鬼物语", "囮物语", "恋物语", "花物语", "凭物语", "终物语", "历物语", "伤物语", "刀语", "冰菓"));
        MyAdapter myadapter = new MyAdapter(getContext(),tabs);
        recyclerView.setAdapter(myadapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
