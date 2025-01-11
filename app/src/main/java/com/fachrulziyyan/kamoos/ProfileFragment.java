package com.fachrulziyyan.kamoos;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView; // Import untuk TextView

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Ambil nama lengkap dari SharedPreferences
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        String fullName = sharedPreferences.getString("fullName", "Nama Lengkap");

        // Tampilkan nama pada TextView profil
        TextView profileName = view.findViewById(R.id.profileName); // Pastikan ID sesuai
        profileName.setText(fullName);

        // Navigasi ke AboutActivity
        LinearLayout bAbout = view.findViewById(R.id.bAbout);
        bAbout.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AboutActivity.class);
            startActivity(intent);
        });

        // Popup konfirmasi keluar
        LinearLayout bKeluar = view.findViewById(R.id.bKeluar);
        bKeluar.setOnClickListener(v -> {
            new AlertDialog.Builder(requireContext())
                    .setTitle("Konfirmasi Keluar")
                    .setMessage("Apakah yakin ingin keluar?")
                    .setPositiveButton("YA", (dialog, which) -> {
                        Intent intent = new Intent(getActivity(), LoginActivity.class);
                        startActivity(intent);
                        requireActivity().finish();
                    })
                    .setNegativeButton("TIDAK", (dialog, which) -> dialog.dismiss())
                    .show();
        });

        // Intent implicit untuk bPerson
        LinearLayout bPerson = view.findViewById(R.id.bPerson);
        bPerson.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0123192838123"));
            startActivity(intent);
        });

        return view;
    }
}
