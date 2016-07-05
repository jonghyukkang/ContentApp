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

//    // Activity로 데이터를 전달할 커스텀 리스너
//    public RegisterDialogListener callback;
//
//    // Activity로 데이터를 전달할 커스텀 리스너의 인터페이스
//    public interface RegisterDialogListener {
//        void onRegisterDialogListener(String name, String naesun, String number);
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        callback = (RegisterDialogListener) context;
//    }

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
//                // Activity로 데이터를 전달할 커스텀 리스너를 연결
////               callback = (RegisterDialogListener)getActivity();
////                callback = new RegisterDialogListener() {
////                    @Override
////                    public void onRegisterDialogListener(String name, String naesun, String number) {
//                        callback.onRegisterDialogListener(
//                                editName.getText().toString(),
//                                editNaesun.getText().toString(),
//                                editNumber.getText().toString());
//
////                    }
////                };
            }
        }).setNegativeButton("취소",null);

        return builder.create();
    }
}
