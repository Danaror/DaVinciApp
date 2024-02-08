package es.studium.davinciapp.ui.cientifico;

import androidx.lifecycle.ViewModelProvider;

        import android.os.Bundle;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import es.studium.davinciapp.R;

public class CientificoFragment extends Fragment {

    private CientificoViewModel mViewModel;

    public static es.studium.davinciapp.ui.escultor.EscultorFragment newInstance() {
        return new es.studium.davinciapp.ui.escultor.EscultorFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cientifico, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CientificoViewModel.class);
        // TODO: Use the ViewModel
    }

}