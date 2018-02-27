package com.mygdx.game;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

import myapplication.Dint4;
import myapplication.LoginFragmentListener;
import myapplication.RegistroFragmentListener;

public class AndroidLauncher extends AndroidApplication {

	// hace que empiece con @MyGdxGame
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		initialize((ApplicationListener) new FireBaseAdmin(), config);
		initialize(new MyGdxGame(), config);
	}


        fb.setListener(M);
        Re.setListener(M);

}

	@Override
	public void onBackPressed() {
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dint4, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId();

		if (id == R.id.nav_camera) {
			// Handle the camera action
		} else if (id == R.id.nav_gallery) {

		} else if (id == R.id.nav_slideshow) {

		} else if (id == R.id.nav_manage) {

		} else if (id == R.id.nav_share) {

		} else if (id == R.id.nav_send) {

		}

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

	//sirve para usar imagenes
	/**  pubic void pintarimg(){

	 Picasso.with(context).load(img1.geturl()).into(imageView);

	 } */
}

//maneja events
class MainEvents implements LoginFragmentListener,RegistroFragmentListener{

	public MainEvents(Dint4 dint4) {
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