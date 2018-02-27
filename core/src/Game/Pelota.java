package Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Button;

import javax.swing.text.View;

import static com.badlogic.gdx.controllers.ControlType.button;

public class Pelota {
    Texture img; // variable que representa la img de la pelota que es de tipo textura
    int x, y, z;

    public Pelota() {
        img = new Texture("pelota.png");
        x = 50;
        y = 50;
        z = 50;
    }

    public void draw(SpriteBatch spriteBatch) {
        /*
        Hacemos uso del acelerómetro, dependiendo de la posición que nos marque este, iremos modificando la x e y
         */



       if(Gdx.input.getAccelerometerY()<0){
           x +=(Gdx.input.getAccelerometerY());
       }else if(Gdx.input.getAccelerometerY()>0){
           x +=Gdx.input.getAccelerometerY();
       }

       if(Gdx.input.getAccelerometerX()<0){

           y-=Gdx.input.getAccelerometerX();

       }else if(Gdx.input.getAccelerometerX()>0){
           y-= (Gdx.input.getAccelerometerX());
       }


        spriteBatch.draw(img, x, y, 100, 100);



            @Override
            public void onClick(View v) {
                pbarProgreso.sleep(1000);;
                pbarProgreso.setProgress(0);




            }
        });

}



    public Texture getImg() {
        return img;
    }

    public void setImg(Texture img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class pbarProgreso implements OnClickListener {

}


