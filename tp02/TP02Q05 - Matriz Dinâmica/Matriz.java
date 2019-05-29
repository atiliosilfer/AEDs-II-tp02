class Celula {
   public int elemento;
   public Celula s, n, w, e;
 
   public Celula(){
      this(0, null, null, null, null);
   }
 
   public Celula(int elemento){
      this(elemento, null, null, null, null);
   }
 
   public Celula(int elemento, Celula s, Celula n, Celula w, Celula e){
      this.elemento = elemento;
      this.s = s;
      this.n = n;
      this.w = w;
      this.e = e;
   }
}

   /**
    * Classe da Matriz
    * */
   class Matriz {
   
   private Celula inicio;
   private int linha, coluna;

   /**
    * Matriz vazia
    * */
   public Matriz (){
      this(3, 3);
   }

   /**
    * Construtor da Matriz
    * @param linha int numero de linhas da matriz
    * @param coluna int numero de colunas da matriz
    * */
   public Matriz (int linha, int coluna){
      this.linha = linha;
      this.coluna = coluna;
      inicio = new Celula ( );
      Celula i = inicio;
      for (int a = 1; a < linha; a = a+1){
         i.e = new Celula ( );
         i.e.w = i;
         i = i.e;
      }//fim for
      Celula norte = inicio;
      Celula j = inicio;
      for (int b = 1; b < coluna; b = b+1){
         j.s = new Celula ( );
         j.s.n = j;
         norte = j;
         j = j.s;
         Celula k = j;
         for (int c = 1; c < linha; c = c+1){
            k.e = new Celula ();
            k.e.w = k;
            k = k.e;
            k.n = norte.e;
            norte.e.s = k;
            norte = norte.e;
         }
      }//fim for
   }//fim construtor Matriz

   /**
    * Inserir dados na matriz
    * */
      public void inserir ( ){
       int elemento;
       for(Celula i = inicio; i != null; i = i.s){
          for (Celula j = i; j != null; j = j.e){
             elemento = MyIO.readInt ();
             j.elemento = elemento;
          }
       }
      }//fim inserir


   public Matriz soma (Matriz m) {
      Matriz resp = null;

      if(this.linha == m.linha && this.coluna == m.coluna){
         resp = new Matriz (linha, coluna);
            Celula j = m.inicio;
            Celula k = resp.inicio;
            Celula y = null;
            Celula w = null;
            for (Celula i = inicio; i != null ; i = i.e){
               k.elemento = i.elemento + j.elemento;
               y = j.s;
               w = k.s;
               for (Celula x = i.s; x != null; x = x.s){
                  w.elemento = x.elemento + y.elemento;
                  y = y.s;
                  w = w.s;
               }//fim for
               j = j.e;
               k = k.e;
            }//fim for
      }//fim if
      return resp;
   }//fim soma

   public Matriz multiplicacao (Matriz m) {
      //definir dados
      Matriz resp = null;
      if (this.coluna == m.linha)
      {
       //definir dados
        resp = new Matriz (this.linha, m.coluna);
        Celula i;
        Celula i1 = this.inicio;
        Celula j;
        Celula j1 = m.inicio;
        int mult = 0;

        for ( Celula k = resp.inicio; k != null; k = k.s) {
         i = i1;
            for (Celula k2 = k; k2 != null; k2 = k2.e){
                  j = j1;
               for (/**/ ; i != null; i = i.e){
                  mult = mult + ((i.elemento)*(j.elemento));
                  j = j.s;

               }//fim for
                  k2.elemento = mult;
                  mult = 0;
                  i = i1;
                  j1 = j1.e;
            }//fim for
            i1 = i1.s;
            j1 = m.inicio;
        }//fim for

      }else if (m.coluna == this.linha){
         resp = new Matriz (m.linha, this.coluna);
      
      }
      return resp;
   }//fim multiplicacao

   /**
    * Verifica se a matriz e' quadrada
    * @return boolean true se for quadrado (linhas=colunas)
    * */
   public boolean isQuadrada(){
      boolean r = false;
      if (linha == coluna)
         r = true;
      return r;
   }//fim isQuadrada

   /**
    * Mostra a diagonal principal da matriz
    */
   public void mostrarDiagonalPrincipal (){
      if(isQuadrada() == true){
         for(Celula i = inicio; i != null; i = i.s){
           MyIO.print (i.elemento + " ");
           if (i.s != null)
              i = i.e;
         }//fim for
         MyIO.println("");
      }//fim if
   }//fim mostrarDiagonalPrincipal

   /**
    * Mostra a diagonal secundaria da matriz
    */
   public void mostrarDiagonalSecundaria (){
      if(isQuadrada() == true){
         Celula i = inicio;
         while (i.e != null){
            i = i.e;
         }//fim while
         for (Celula j = i; j != null; j = j.s){
          MyIO.print (j.elemento + " ");
          if (j.s != null)
             j = j.w;
         }
         MyIO.println ("");
      }//fim if
   }//fim mostrarDiagonalSecundaria

   public void mostrar(){
      for(Celula i = inicio; i != null; i = i.s){
         for (Celula j = i; j != null; j = j.e){
            MyIO.print (j.elemento + " ");
         }
         MyIO.println ("");
      }
   }//fim mostrar

   /**
    * Main 
    */
   public static void main (String [] args){
      //definir dados
         int n,x,y;
         int x1, y1;
         n = MyIO.readInt ( );
         //iniciar for
         for (int j = 0; j < n; j++){
            x = MyIO.readInt ( );
            y = MyIO.readInt ( );
            Matriz m1 = new Matriz (x,y);
            m1.inserir ();
            x1 = MyIO.readInt ( );
            y1 = MyIO.readInt ( );
            Matriz m2 = new Matriz (x1,y1);
            m2.inserir ();
            m1.mostrarDiagonalPrincipal ();
            m1.mostrarDiagonalSecundaria ();
            Matriz soma = m1.soma (m2);
            soma.mostrar ();
            Matriz multiplicacao = m1.multiplicacao (m2);
            multiplicacao.mostrar ();
         }//fim for

   }//fim main

}//fim class Matriz
