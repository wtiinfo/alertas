package com.wtiinfo.alertas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pergunta")
                .setMessage("Você entendeu como funciona os dialogs?")
                .setPositiveButton(R.string.btn_yes, this)
                .setNegativeButton(R.string.btn_no, this);

        return builder.create();

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        String msg = null;
        if(which == DialogInterface.BUTTON_POSITIVE) {
            msg = "Você escolheu SIM";
        } else if (which == DialogInterface.BUTTON_NEGATIVE) {
            msg = "Você escolheu NÃO";
        }
        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }
}
