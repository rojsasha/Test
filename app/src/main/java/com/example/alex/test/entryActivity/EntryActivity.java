package com.example.alex.test.entryActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.alex.test.R;

public class EntryActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        showAuth();

    }

    private void showAuth() {
        switchFragment(new AuthFragment());
    }

    private void switchFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.entry_container, fragment)
                .commit();
    }

    private void showMain() {
        switchFragment(new MainFragment());
    }

    public static class AuthFragment extends Fragment {

        public final void onAuthSuccess() {
            EntryActivity activity = (EntryActivity) getActivity();
            activity.switchFragment(new MainFragment());
        }
    }

    public static class MainFragment extends Fragment {
    }
}
