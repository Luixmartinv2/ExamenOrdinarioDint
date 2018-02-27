package com.mygdx.game;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.mygdx.game.MyGdxGame;



public abstract class AndroidLauncher extends AndroidApplication {

	firebase fb;
	Registro Re;

	// hace que empiece con @MyGdxGame
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		initialize((ApplicationListener) new firebase(), config);
		initialize(new MyGdxGame(), config);
	}

/**fragments
	fb =(firebase)getSupportFragmentManager().findFragmentById(R.id.fragmentFb);
	Re =(Registro)getSupportFragmentManager().

	abstract findFragmentById(R.id.fragmentRe);
	MainEvents M = new MainEvents(this);

        fb.setListener(M);
        Re.setListener(M);*/



	@Override
	public void onBackPressed() {

	}






}

//maneja events
class MainEvents implements LoginFragmentListener,RegistroFragmentListener{

	public MainEvents(AndroidLauncher androidLauncher) {
	}

	@Override
	public void FbBtnlogin(String user, String Pass) {

	}

	@Override
	public void FbBtnRegistro() {


	}

	@Override
	public void ReBtnAceptar(String aUser, String Pass) {

	}

	@Override
	public void ReBtnCancelar() {

	}
}