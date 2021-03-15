package com.example.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //esconder statusbar e barra de navegação
        View decorview = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;

        decorview.setSystemUiVisibility( uiOpcoes);

        //esconder actionbar
        getSupportActionBar().hide();

        //executar o video
        videoView.setMediaController(new MediaController(this));//controladores do video, botoes play, avançar e voltar
        //android.resource onde ficam os recursos no android
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); // getpackage nome recupera o nome do pacote que sera usado
        videoView.start();


    }
}