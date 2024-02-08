package es.studium.davinciapp.ui.pintor;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.studium.davinciapp.R;
import es.studium.davinciapp.ui.cientifico.CientificoViewModel;

public class PintorFragment extends Fragment {

    private PintorViewModel mViewModel;

    public static es.studium.davinciapp.ui.escultor.EscultorFragment newInstance() {
        return new es.studium.davinciapp.ui.escultor.EscultorFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pintor, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PintorViewModel.class);
        // TODO: Use the ViewModel
    }

}