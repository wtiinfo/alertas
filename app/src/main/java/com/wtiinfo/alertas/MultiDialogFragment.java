package com.wtiinfo.alertas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MultiDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener{

    boolean[] checked = {true, false, true, false};//marcando as bandas

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
            .setTitle("Escolha uma banda")
            .setMultiChoiceItems(R.array.bandas, checked,this)
            .create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which, boolean b) {
        String[] bandas = getResources().getStringArray(R.array.bandas);
        String banda = bandas[which];

        if(b) {
            Toast.makeText(getActivity(), "Banda escolhida: " + banda, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getActivity(), "Banda deselecionada: " + banda, Toast.LENGTH_LONG).show();
        }
    }
}
