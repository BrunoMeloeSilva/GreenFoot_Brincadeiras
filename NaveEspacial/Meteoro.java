import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Meteoro extends Actor
{
    public void act() 
    {
        // Add your action code here.
        move(4);
        turn(Greenfoot.getRandomNumber(5));
        //Esse código significa que vai virar um valor aleatório a cada frame,
        //entre 0 e 90 graus (exclusive).
        if(getX() <= 5 || getX() >= getWorld().getWidth()  - 5) turn(180);
        if(getY() <= 5 || getY() >= getWorld().getHeight() - 5) turn(180);
        //getX()/getY() retorna a posicao do meteoro no mundo linha/coluna
    }    
}
