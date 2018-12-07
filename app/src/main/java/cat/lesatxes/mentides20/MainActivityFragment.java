package cat.lesatxes.mentides20;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;





public class MainActivityFragment extends Fragment {


    private ImageButton monster01;
    private ImageButton monster02;
    private ImageButton monster03;
    private ImageButton monster04;
    private ImageButton monster05;
    private ImageButton monster06;
    private ImageButton monster07;
    private ImageButton monster08;
    private ImageButton monster09;
    private ImageButton monster10;
    private ImageButton monster11;
    private ImageButton monster12;


    private ImageButton imgCastro;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View vista = inflater.inflate(R.layout.fragment_main, container, false);

        monster01 = vista.findViewById(R.id.monster01);
        monster02 = vista.findViewById(R.id.monster02);
        monster03 = vista.findViewById(R.id.monster03);
        monster04 = vista.findViewById(R.id.monster04);
        monster05 = vista.findViewById(R.id.monster05);
        monster06 = vista.findViewById(R.id.monster06);
        monster07 = vista.findViewById(R.id.monster07);
        monster08 = vista.findViewById(R.id.monster08);
        monster09 = vista.findViewById(R.id.monster09);
        monster10 = vista.findViewById(R.id.monster10);
        monster11 = vista.findViewById(R.id.monster11);
        monster12 = vista.findViewById(R.id.monster12);


        final MediaPlayer mp01 = MediaPlayer.create(getContext(), R.raw.castro);
        monster01.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp01.start();
            }
        });


        final MediaPlayer mp02 = MediaPlayer.create(getContext(), R.raw.casado_155);
        monster02.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp02.start();
            }
        });

        final MediaPlayer mp03 = MediaPlayer.create(getContext(), R.raw.bananero);
        monster03.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp03.start();
            }
        });


        final MediaPlayer mp04 = MediaPlayer.create(getContext(), R.raw.democracia);
        monster04.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp04.start();
            }
        });


        final MediaPlayer mp05 = MediaPlayer.create(getContext(), R.raw.desinfectar);
        monster05.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp05.start();
            }
        });

        final MediaPlayer mp06 = MediaPlayer.create(getContext(), R.raw.fiuuu);
        monster06.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp06.start();
            }
        });

        final MediaPlayer mp07 = MediaPlayer.create(getContext(), R.raw.fusilar_1);
        monster07.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp07.start();
            }
        });

        final MediaPlayer mp08 = MediaPlayer.create(getContext(), R.raw.liar1);
        monster08.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp08.start();
            }
        });

        final MediaPlayer mp09 = MediaPlayer.create(getContext(), R.raw.liar2);
        monster09.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp09.start();
            }
        });


        final MediaPlayer mp10 = MediaPlayer.create(getContext(), R.raw.desinfectar);
        monster10.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp10.start();
            }
        });

        final MediaPlayer mp11 = MediaPlayer.create(getContext(), R.raw.casado_155);
        monster11.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp11.start();
            }
        });

        final MediaPlayer mp12 = MediaPlayer.create(getContext(), R.raw.fusilar_1);
        monster12.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp12.start();
            }
        });


        mp01.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        mp02.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        mp03.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });


        return vista;
    }
}
