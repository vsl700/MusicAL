package com.vasciie.musical;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.vasciie.musical.fragments.MenuFragment;
import com.vasciie.musical.fragments.YoutubeFragment;

public class MainActivity extends YouTubeBaseActivity {

    private final String api_key = "AIzaSyAv_zsB_3pithPU1L8nP98QSLDaranF7Mo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.youtube_fragment, YoutubeFragment.newInstance("", ""), null)
                    .commit();

            getFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, MenuFragment.newInstance("", ""), null)
                    .commit();
        }

        /*// Get reference to the view of Video player
        YouTubePlayerView ytPlayer = (YouTubePlayerView)findViewById(R.id.ytPlayer);

        ytPlayer.initialize(
                api_key,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(
                            YouTubePlayer.Provider provider,
                            YouTubePlayer youTubePlayer, boolean b)
                    {
                        youTubePlayer.loadVideo("24mwWJ_Tysg");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult
                                                                youTubeInitializationResult)
                    {
                        Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                    }
                });*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }
}