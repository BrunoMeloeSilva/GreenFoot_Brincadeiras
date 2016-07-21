import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    private int tempoProxTiro = 0;
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))  turn(-3);
        if(Greenfoot.isKeyDown("right")) turn(3);
        if(Greenfoot.isKeyDown("up"))    move(3);
        if(Greenfoot.isKeyDown("down"))  move(-3);
        if (tempoProxTiro > 0) tempoProxTiro--;
        else if(Greenfoot.isKeyDown("space"))
        {
            Tiro tiro = new Tiro();
            getWorld().addObject(tiro, getX(), getY());
            tiro.setRotation(this.getRotation());
            tempoProxTiro = 15;//tempo ate prox tiro(15 frames/loopings)
            
        }
        //código para verificar se a nave está tocando a bola vermelha(turbo)
        //Os dois primeiros parametros são o X e Y de nossa posição atual. 
        //Queremos saber sobre o que está diretamente debaixo de nós, 
        //então nós vamos passar de zero para ambos. 
        //O terceiro parâmetro permite indicar qual a classe que estamos
        //interessados, que é a classe Turbo
        Actor tocaTurbo = getOneObjectAtOffset(0, 0, Turbo.class);
        //se nao tocar na bola vermelha fica com null
        /** Verifica se foi tocado e se foi deleta o objeto bola*/
        if(tocaTurbo != null)
        {
            World mundo = getWorld();
            mundo.removeObject(tocaTurbo);
            Greenfoot.playSound("turbo.wav");
        }
    }    
}
