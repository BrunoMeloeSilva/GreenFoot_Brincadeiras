import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Contador extends Actor
{//Existem diversas classes do proprio compilador que vc pode usar se necessario, exemplo é a act() que nao será usada aki.

    private int qtdTotal = 0;
    
    public Contador()
    {
        setImage(new GreenfootImage("0", 20, Color.WHITE, Color.BLACK));//usa a biblioteca java.awt.Color;
    }

    public void qtdMeteoroDestruido(int qtd)
    {
        qtdTotal += qtd;
        setImage(new GreenfootImage("" + qtdTotal, 20, Color.WHITE, Color.BLACK));
    }
}
