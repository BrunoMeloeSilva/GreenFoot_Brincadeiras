import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Passarinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Passarinho extends Actor
{
    private double dy = 0;
    private double g = 0.5;
    private double up = -5;
    
    public void act()  
    {
        setLocation( getX(), (int) (getY() + dy) );
        //simulacao do voo
        if ( Greenfoot.isKeyDown("up") ) {
            try{
                setImage("/Users/brunosilva/Documents/_Bruno_Silva/Projetos/GreenFoot/FlappyBird/images/flappybird3.png");
            }catch(IllegalArgumentException e){}
            setRotation(-30);
            dy = up;//faz o passarinho subir
        }else if (dy > 0) {
            try{
                setImage("/Users/brunosilva/Documents/_Bruno_Silva/Projetos/GreenFoot/FlappyBird/images/flappybird1.png");
            }catch(IllegalArgumentException e){}
            setRotation(1);
        }  
        dy = dy + g;//faz o passarinho cair gradativamente
        
        //se ficar abaixo do mundo game over
        if(getOneIntersectingObject(Piso.class) != null){
            gameOver();
        }else if(getOneIntersectingObject(Pipes.class) != null){
            gameOver();
        }
    }
    
    private void gameOver(){
        getWorld().addObject( new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2 );
        Greenfoot.stop();
    }
}
