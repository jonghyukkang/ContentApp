package kang.navigationview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;

/**
 * Created by kangjonghyuk on 2016. 7. 4..
 */
public class DialogFragment_Add extends DialogFragment{
    private EditText editName, editNaesun, editNumber;
    private OnAddListener callback;

    public interface OnAddListener {
        void onAddSubmit(String name, String naesun, String number);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            callback = (OnAddListener) getTargetFragment();
        } catch (ClassCastException e) {
            throw new ClassCastException("Calling Fragment must implement OnAddFriendListener");
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment, container);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        return view;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_fragment, null);

        editName = (EditText) view.findViewById(R.id.editName);
        editNaesun = (EditText) view.findViewById(R.id.editNaesun);
        editNumber = (EditText) view.findViewById(R.id.editNumber);

        builder.setView(view).setPositiveButton("등록", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final String mName = editName.getText().toString();
                final String mNaesun = editNaesun.getText().toString();
                final String mNumber = editNumber.getText().toString();

                callback.onAddSubmit(mName, mNaesun, mNumber);
            }
        }).setNegativeButton("취소",null);

        return builder.create();
    }
}
