import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mundo extends World
{
    private int espera = 0;
    private int altura;

    public Mundo()
    {    
        super(600, 400, 1, false);
        addObject( new Passarinho(), 100, 200 ); 

        prepare();
    }

    public void act() {
        //Tempo aleatorio para inserir parPipes
        if((Greenfoot.getRandomNumber(150) == Greenfoot.getRandomNumber(100)) && (espera > 200+Greenfoot.getRandomNumber(50)) ){
            //altura aleatoria entre os pipes
            altura = Greenfoot.getRandomNumber(9)*11;
            if((altura % 2) != 0 ) altura = -altura;
            parPipes(altura);
            //reinicia a espera
            espera = 0;
        }
        espera++;

    }

    private void parPipes(int h) {
        addObject( new PipeTeto(), getWidth(), -20 + h );
        addObject( new PipePiso(), getWidth(), 10+getHeight() + h );
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Piso piso = new Piso();
        addObject(piso, 308, 382);
    }
}
