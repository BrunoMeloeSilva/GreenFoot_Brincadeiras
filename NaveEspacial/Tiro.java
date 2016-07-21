import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tiro extends Actor
{
    public void act() 
    { 
        //Add your action code here.
        move(8);
        //Se o objeto entre parenteses fazer interseçao com o objeto desta classe, entao o retorna o objeto entre parenteses.
        //Actor meteorox = getOneIntersectingObject(Meteoro.class);
        
        //código para verificar se a nave está tocando a bola vermelha(turbo)
        //Os dois primeiros parametros são o X e Y de nossa posição atual. 
        //Queremos saber sobre o que está diretamente debaixo de nós, 
        //então nós vamos passar de zero para ambos. 
        //O terceiro parâmetro permite indicar qual a classe que estamos
        //interessados, que é a classe Turbo
        Actor meteorox = getOneObjectAtOffset(0, 0, Meteoro.class);
        if(meteorox != null)
        {
           turn(180);//inicialmente tive problemas, pois estava mandando girar o objeto depois que ja tinha sido removido
           meteorosDestruidos();
        }
        
        //remove o tiro se tocar nos limites do mapa
        if(getX()+1 >= getWorld().getWidth())       getWorld().removeObject(this);
        else if(getY()+1 >= getWorld().getHeight()) getWorld().removeObject(this);
        else if(getX() <= 0)                        getWorld().removeObject(this);
        else if(getY() <= 0)                        getWorld().removeObject(this);        
    }   
    
    private void meteorosDestruidos()
    {
        //os atores chamam classes que estao no mundo, nao em outro atores
            Mundo mundox = (Mundo) getWorld();
            Contador contx = mundox.getCont();
            contx.qtdMeteoroDestruido(1);
    }
}
