import greenfoot.*; 
import java.util.*;

public class BG extends World
{
    LetraA a;
    LetraB b;
    LetraC c;
    LetraD d;
    LetraE e;
    LetraF f;
    LetraG g;
    LetraH h;
    LetraI i;
    LetraJ j;
    LetraK k;
    LetraL l;
    LetraM m;
    LetraN n;
    LetraO o;
    LetraP p;
    LetraQ q;
    LetraR r;
    LetraS s;
    LetraT t;
    LetraU u;
    LetraV v;
    LetraW w;
    LetraY y;
    LetraX x;
    LetraZ z;
    Linha linha;
    
    public String palavraSorteada = "";
    public List<Posicao> posicoes = new ArrayList<Posicao>();
    
    
    BotaoInsiraPalavra botao, click;    //Cria objetos para acessar a classe BotaoInsiraPalavra()
    String []bancoPalavras = {"AGUA", "CAVALO", "ABELHA", "CASA", "JOGO", "PARALELEPIPEDO"};
    char []letrasAlfabeto = {'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
  
  
    public BG()
    {    
        //Redimenciona o BackGround
        super(1080, 480, 1); 
        
        botao = new BotaoInsiraPalavra();
        click = new BotaoInsiraPalavra();
       
        
        
        
        //Criando o Objeto os Objetos Letras
        a = new LetraA();
        b = new LetraB();
        c = new LetraC();
        d = new LetraD();
        e = new LetraE();
        f = new LetraF();
        g = new LetraG();
        h = new LetraH();
        i = new LetraI();
        j = new LetraJ();
        k = new LetraK();
        l = new LetraL();
        m = new LetraM();
        n = new LetraN();
        o = new LetraO();
        p = new LetraP();
        q = new LetraQ();
        r = new LetraR();
        s = new LetraS();
        t = new LetraT();
        u = new LetraU();
        v = new LetraV();
        w = new LetraW();
        y = new LetraY();
        x = new LetraX();
        z = new LetraZ();
        linha = new Linha();
        
        //Chama o Teclado
     char letra = '9';   
     teclado();
     sorteiaPalavra();
     adicionaPalavra();
   
        
    }
    
    //Funcões
    
     //Declarando variáveis das funções desta classe
    int indicePalavra;
    
      
    public void teclado(){
            
        //Adicionando as Letras do Teclado no Cenário
        addObject(a, 510, 407);
        addObject(b, 550, 407);
        addObject(c, 590, 407);
        addObject(d, 630, 407);
        addObject(e, 670, 407);
        addObject(f, 710, 407);
        addObject(g, 750, 407);
        addObject(h, 790, 407);
        addObject(i, 830, 407);
        addObject(j, 870, 407);
        addObject(k, 910, 407);
        addObject(l, 950, 407);
        addObject(m, 990, 407);
        addObject(n, 510, 450);
        addObject(o, 550, 450);
        addObject(p, 590, 450);
        addObject(q, 630, 450);
        addObject(r, 670, 450);
        addObject(s, 710, 450);
        addObject(t, 750, 450);
        addObject(u, 790, 450);
        addObject(v, 830, 450);
        addObject(x, 870, 450);
        addObject(w, 910, 450);
        addObject(y, 950, 450);
        addObject(z, 990, 450);
        
        //Adiciona botão de inserir palavras
        //addObject(botao, 350, 30);
 
        
        
    }
    
    //Sortea palavra do banco de palavras
    
    public void sorteiaPalavra()
    {
       
        //Sorteando o indice da palavra        
        indicePalavra = (int)(Math.random() * bancoPalavras.length);
        this.palavraSorteada = bancoPalavras[indicePalavra];//Armazenando a palavra sorteada
       
        // debugs on the table hehehehe
        System.out.println(palavraSorteada.length());
        System.out.println(palavraSorteada);
        
       //Este Bloco de comandos Adiciona as linhas de acordo com o tamanho da palavra sorteada
       int i, posX = 450, posY = 185;
       for(i=0; i < palavraSorteada.length(); i++)
        {
             addObject(new Linha(), posX, posY);
             this.posicoes.add(new Posicao(palavraSorteada.charAt(i), posX, posY));
           
             posX = posX + 50;
            
        }
       
    }
   
    public void letraDigitada()
    {
      
        
        
    }
    
    //BLOCO PARA DEBUG
    public void  adicionaPalavra()
    {
        if(palavraSorteada == "AGUA")
        {   
          System.out.println("Entro em add agua");
          addObject(new LetraA(), 450, 160);
          //this.linha.setLocation( 450, 175);
          addObject(new LetraG(), 500, 160);
          addObject(new LetraU(), 550, 160);
          addObject(new LetraA(), 600, 160);
        }
        if(palavraSorteada == "CAVALO")
        {   
          System.out.println("Entro em add Cavalo");
          addObject(new LetraC(), 450, 160);
          addObject(new LetraA(), 500, 160);
          addObject(new LetraV(), 550, 160);
          addObject(new LetraA(), 600, 160);
          addObject(new LetraL(), 650, 160);
          addObject(new LetraO(), 700, 160);
        }
    }
        
     
}
