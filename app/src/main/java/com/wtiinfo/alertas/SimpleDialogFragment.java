package com.wtiinfo.alertas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class SimpleDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle("Escolha uma banda")
                .setItems(R.array.bandas, this)
                .create();
    }


    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        String[] bandas = getResources().getStringArray(R.array.bandas);
        String banda = bandas[which];
        Toast.makeText(getActivity(), "Banda selecionada: " + banda, Toast.LENGTH_LONG).show();
    }
}
