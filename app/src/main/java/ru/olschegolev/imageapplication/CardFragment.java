package ru.olschegolev.imageapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CardFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView image = view.findViewById(R.id.imageCard);
        TextView name = view.findViewById(R.id.nameCard);
        TextView email = view.findViewById(R.id.emailCard);
        TextView phone = view.findViewById(R.id.phoneCard);
        image.setImageResource(R.drawable.image);
        name.setText("User");
        phone.setText("45556655");
        email.setText("nhjj@ggg.com");

    }
}