package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.TimerTask;

import Game.Pelota;
import Game.timerPelota;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {

		int contador=0;
		final int FPS = 40;
		TimerTask tas = new timergame();
		//tas.scheduleAtFixedRate(timerPelota, 0, 1000/FPS);
		while (contador<10000){
			try {
				//aqui se camvia el fondo.

					tas.wait(60000);
				Gdx.gl.glClearColor(1, 0, 0, 1);

				tas.wait(60000);
				Gdx.gl.glClearColor(0, 1, 0, 1);

				tas.wait(60000);
				Gdx.gl.glClearColor(0, 0, 1, 1);

				tas.wait(60000);
				Gdx.gl.glClearColor(0, 1, 1, 1);

				tas.wait(60000);
				Gdx.gl.glClearColor(1, 1, 0, 1);



			} catch (InterruptedException e) {
				e.printStackTrace();
			}}


		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}



}
class timergame extends TimerTask {

	MyGdxGame myGdxGame;

	public void run() {
		//calculate the new position of myBall

	}
}
