package ru.olschegolev.imageapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class ShowFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList<User>users = setArrayUsers();

        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.detale);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new UserAdapter(view.getContext(), users));
    }

    private ArrayList<User> setArrayUsers() {
        ArrayList<User>users = new ArrayList<>();
        users.add(new User("name1", "phone1", "email1", R.drawable.image));
        users.add(new User("name2", "phone2", "email2", R.drawable.image));
        users.add(new User("name3", "phone3", "email3", R.drawable.image));
        users.add(new User("name4", "phone4", "email4", R.drawable.image));
        users.add(new User("name5", "phone5", "email5", R.drawable.image));
        users.add(new User("name6", "phone6", "email6", R.drawable.image));
        users.add(new User("name7", "phone7", "email7", R.drawable.image));
        users.add(new User("name8", "phone8", "email8", R.drawable.image));

        return users;
    }


}