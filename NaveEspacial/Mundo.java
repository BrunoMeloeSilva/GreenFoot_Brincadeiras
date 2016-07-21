import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (Bruno Silva) 
 * @version (31/07/2012)
 */
public class Mundo extends World
{
    private Contador cont;
    
    public Mundo() 
    {    
        //Cria um mundo com 1024 de largura por 600 de altura e celulas de 1x1 pixels. O tamanho das celulas de pixels "esticam o mundo, pois aumenta os pixels" 
        //e determina o quadro("velocidade") da movimentcao do objeto no mundo de certa forma.
        super(1024, 600, 1); 

        prepararMundo();//Criei este metodo para que o mundo se inicie com os objetos desejados
    }
    
    //Prepara o mundo para o início do programa. Isto é: criar e iniciar Os objetos e adicioná-os ao mundo.
    private void prepararMundo()
    {
        Nave nave = new Nave();
        addObject(nave, 44, 188);//adiciona o objeto na posicao indicada no "mundo".

        Turbo turbo = new Turbo();
        addObject(turbo, 527, 359);

        Turbo turbo2 = new Turbo();
        addObject(turbo2, 527, 204);
        
        Meteoro meteoro = new Meteoro();
        addObject(meteoro, 574, 22);
        
        cont = new Contador();//instaciada para ser chamada em outra classe tipo ator
        addObject(cont, 25, 15);//31x371//Adciona objeto ao mundo (objeto, coordenada x no mundo onde o objeto sera inserido, coordenada y..)
    }
    
    public Contador getCont()//para poder retornar o valor de cont para outra classe tipo ator
    {
        return cont;
    }
}