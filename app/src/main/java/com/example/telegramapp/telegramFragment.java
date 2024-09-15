package com.example.telegramapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.telegramapp.databinding.FragmentTelegramBinding;

import java.util.ArrayList;


public class telegramFragment extends Fragment {
    private FragmentTelegramBinding binding;
    private ArrayList<contacts> contacts = new ArrayList<>();
    private contactsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTelegramBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new contactsAdapter(contacts, this);
        binding.rvTelegram.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        contacts.add(new contacts("John", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Mark", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Bob", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Jessy", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Mom", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Dad", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Jake", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("George", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Mia", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new contacts("Olivia", "https://www.pinterest.com/pin/634022453822187655/"));
    }
}