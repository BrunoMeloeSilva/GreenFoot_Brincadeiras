import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipes extends Actor
{
    private double andar;
    
    public void andar(){
        setLocation( (int)(getX()+andar),  getY());
        andar = andar - 0.001 ;
        if( getX() == 0 ) andar = -1;
    }
}
