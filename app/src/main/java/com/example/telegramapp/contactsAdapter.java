package com.example.telegramapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contactsAdapter extends RecyclerView.Adapter<contactsViewHolder>{
    private ArrayList<contacts> contacts;

    public contactsAdapter(ArrayList<com.example.telegramapp.contacts> contacts, telegramFragment telegramFragment) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public contactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);
        return new contactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull contactsViewHolder holder, int position) {
        holder.bind(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
