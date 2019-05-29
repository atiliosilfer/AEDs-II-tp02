/* TP01P2Q08 - Ordenacao por Selecao
 * @author Atilio Silva Ferreira
 * @version 2 28/02/2018
 * */

// ------------------------------------------- dependencias

import java.io.*;

// ------------------------------------------- definicao da classe

class Instituicao 
{
 //Definir dados
 private int codigo;
 private String nome;
 private String sigla;
 private int codigoMantenedora;
 private String mantenedora;
 private int categoria;
 private int organizacao;
 private int codigoMunicipio;
 private String municipio;
 private String uf;
 private String regiao;
 private int tecnico;
 private int periodico;
 private int livro;
 private double receita;
 private double transferencia;
 private double outraReceita;
 private double despesaDocente;
 private double despesaTecnico;
 private double despesaEncargo;
 private double despesaCusteio;
 private double despesaInvestimento;
 private double despesaPesquisa;
 private double despesaOutras;

//-------------------------------- CONSTRUTORES ----------------------------


 /*
  * Construtor vazio.
  * */
 public Instituicao ()
 {
  this.codigo = 0;
  this.nome = "";
  this.sigla = "";
  this.codigoMantenedora = 0;
  this.mantenedora = "";
  this.categoria = 0;
  this.organizacao = 0;
  this.codigoMunicipio = 0;
  this.municipio = "";
  this.uf = "";
  this.regiao = "";
  this.tecnico = 0;
  this.periodico = 0;
  this.livro = 0;
  this.receita = 0;
  this.transferencia = 0;
  this.outraReceita = 0;
  this.despesaDocente = 0;
  this.despesaTecnico = 0;
  this.despesaEncargo = 0;
  this.despesaCusteio = 0;
  this.despesaInvestimento = 0;
  this.despesaPesquisa = 0;
  this.despesaOutras = 0;
 }//fim Instituicao

 /* 
  * Construtor que recebe todos os parametros.
  * 
  * @param codigo - Codigo unico de identificacao da IES.
  * @param nome - Nome da IES.
  * @param sigla - Sigla da IES.
  * @param codigoMantenedora - Codigo unico de identificacao da mantenedora.
  * @param mantenedora - Nome da mantenedora.
  * @param categoria - Codigo da categoria administraviva.
  * @param organizacao - Codigo da Organizacao Academica.
  * @param codigoMunicipio - Codigo do Municipio da IES.
  * @param municipio - Nome do municipio.
  * @param uf - Sigla da UF da IES.
  * @param regiao - Nome da regiao geografica da IES.
  * @param tecnico - Numero de funcionarios tecnico-administrativos.
  * @param periodico - Quantidade de titulos de periodicos elec adq peal Biblio.
  * @param livro - Quantida de titulos de livros disponiveis.
  * @param receita - Informa o valor das receitas proprias.
  * @param transferencia - Informa o valor de transferencias auferidas.
  * @param outraReceita - Informa o valor de outras receitas.
  * @param despesaDocente - Informa as despesas com remuneracao pessoal.
  * @param despesaTecnico - Informa as despesas com remuneracao.
  * @param despesaEncargo - Informa as despesas com beneficios e encargos.
  * @param despesaCusteio - Informa as despesas para a manutencao e custeio da IES
  * @param despesaInvestimento - Informa as despesas de investimento.
  * @param despesaPesquisa - Informa as despesas com Pesquisa e Desenvolvimento.
  * @param despesaOutras - Informa o valor de despendios nao especificadas.
  * */
 public Instituicao (int codigo, String nome, String sigla, int codigoMantenedora, String mantenedora, int categoria, int organizacao, int codigoMunicipio, String municipio, String uf, String regiao, int tecnico, int periodico, int livro, double receita, double transferencia, double outraReceita, double despesaDocente, double despesaTecnico, double despesaEncargo, double despesaCusteio, double despesaInvestimento, double despesaPesquisa, double despesaOutras)
 {
  this.codigo = codigo;
  this.nome = nome; 
  this.sigla = sigla; 
  this.codigoMantenedora = codigoMantenedora;
  this.mantenedora = mantenedora; 
  this.categoria = categoria;
  this.organizacao = organizacao;
  this.codigoMunicipio = codigoMunicipio;
  this.municipio = municipio;
  this.uf = uf;
  this.regiao = regiao;
  this.tecnico = tecnico;
  this.periodico = periodico;
  this.livro = livro;
  this.receita = receita;
  this.transferencia = transferencia;
  this.outraReceita = outraReceita;
  this.despesaDocente = despesaDocente;
  this.despesaTecnico = despesaTecnico;
  this.despesaEncargo = despesaEncargo;
  this.despesaCusteio = despesaCusteio;
  this.despesaInvestimento = despesaInvestimento;
  this.despesaPesquisa = despesaPesquisa;
  this.despesaOutras = despesaOutras;
 }//fim Instituicao

/*
 * Construtor que recebe somente o codigo.
 *
 * @param codigo - codigo de identificacao da IES.
 * */
  public Instituicao (int codigo)
  {
   this.codigo = codigo;
  }//fim Instituicao

//----------------------------SET'S/GET'S-----------------------------------

/*
 * Funcao que identifica o codigo da instituicao.
 *
 * @return int - codigo.
 * */
  public int getCodigo ()
  {
   return this.codigo;
  }//fim getCodigo ()

/*
 * Metodo para colocar ou mudar o codigo da instituicao
 *
 * @param codigo - Codigo de identificacao da IES.
 * */  
  public void setCodigo (int codigo)
  {
   this.codigo = codigo;
  }//fim setCodigo

/*
 * Funcao que identifica o nome da instituicao
 *
 * @return String nome da instituicao
 * */
  public String getNome ()
  {
   return this.nome;
  }//fim getNome ()

/*
 * Metodo para colocar ou mudar o nome da instituicao
 *
 * @param nome - Nome da instituicao
 * */
  public void setNome (String nome)
  {
   this.nome = nome;
  }//fim setNome

/*
 * Funcao para indicar a sigla da isntituicao
 *
 * @return String 
 * */
  public String getSigla ()
  {
   return this.sigla;
  }//fim getSigla ()

/*
 * Metodo para colocar ou mudar a sigla da instituicao
 *
 * @param sigla - Sigla da instituicao.
 * */
  public void setSigla (String sigla)
  {
   this.sigla = sigla;
  }//fim setSigla

/*
 * Funcao para indicar o Codigo da Mantenedora
 *
 * @return int - codigo da mantenedora
 * */
  public int getCodigoMantenedora ()
  {
   return this.codigoMantenedora;
  }//fim getCodigoMantenedora ()

/*
 * Metodo para colocar ou mudar o codigo da mantenedora
 *
 * @param codigoMantenedora - codigo de identificacao da Mantenedora
 * */
  public void setCodigoMantenedora (int codigoMantenedora)
  {
   this.codigoMantenedora = codigoMantenedora;
  }//fim setCodigoMantenedora


/*
 * Funcao para identificar o nome da mantenedora
 *
 * @return String - nome da mantenedora
 * */
  public String getMantenedora ()
  {
   return this.mantenedora;
  }//fim getMantenedora ()

/*
 * Metodo para colocar ou mudar o nome da mantenedora
 *
 * @param mantenedora - nome da mantenedora
 * */
  public void setMantenedora (String mantenedora)
  {
   this.mantenedora = mantenedora;
  }//fim setMantenedora

/*
 * Funcao para indicar o codigo da categoria administrativa
 *
 * @return int - numero referente a categoria
 **/
  public int getCategoria ()
  {
   return this.categoria;
  }//fim getCategoria ()

/*
 * Metodo para colocar ou mudar numero referente a categoria
 *
 * @param categoria - codigo da categoria administrativa
 * */
  public void setCategoria (int categoria)
  {
   this.categoria = categoria;
  }//fim setCategoria

/*
 * Funcao para indicar o codigo da Organizacao academica
 *
 * @return int - numero da Organizacao Academica
 **/
  public int getOrganizacao ()
  {
   return this.organizacao;
  }//fim getOrganizacao ()

  public void setOrganizacao (int organizacao)
  {
   this.organizacao = organizacao;
  }//fim setOrganizacao

/*
 * Funcao para indicar o codigo do Municipio
 *
 * @return int - codigo do municipio da IES
 **/
  public int getCodigoMunicipio ()
  {
   return this.codigoMunicipio;
  }//fim getCodigoMunicipio ()

  public void setCodigoMunicipio (int codigoMunicipio)
  {
   this.codigoMunicipio = codigoMunicipio;
  }//fim setCodigoMunicipio

/*
 * Funcao para indicar o nome do municipio
 *
 * @return String - nome do municipio
 **/
  public String getMunicipio ()
  {
   return this.municipio;
  }//fim getMunicipio ()

  public void setMunicipio (String municipio)
  {
   this.municipio = municipio;
  }//fim setMunicipio

/*
 * Funcao para indicar o codigo da UF 
 *
 * @return String - UF 
 **/
  public String getUf ()
  {
   return this.uf;
  }//fim getUf ()

  public void setUf (String uf)
  {
   this.uf = uf;
  }//fim setUf
  
/*
 * Funcao para indicar o nome da regiao da IES
 *
 * @return String - regiao da IES
 **/
  public String getRegiao ()
  {
   return this.regiao;
  }//fim getRegiao ()

  public void setRegiao (String regiao)
  {
   this.regiao = regiao;
  }//fim setRegiao

//set get tecnico
  public int getTecnico ()
  {
   return this.tecnico;
  }//fim getTecnico ()

  public void setTecnico (int tecnico)
  {
   this.tecnico = tecnico;
  }//fim setTecnico

//set get periodico
  public int getPeriodico ()
  {
   return this.periodico;
  }//fim getPeriodico ()

  public void setPeriodico (int periodico)
  {
   this.periodico = periodico;
  }//fim setPeriodico
  
//set get livro
  public int getLivro ()
  {
   return this.livro;
  }//fim getLivro ()

  public void setLivro (int livro)
  {
   this.livro = livro;
  }//fim setLivro

//set get receita
  public double getReceita ()
  {
   return this.receita;
  }//fim getReceita ()

  public void setReceita (double receita)
  {
   this.receita = receita;
  }//fim setReceita
  
//set get transferencia
  public double getTransferencia ()
  {
   return this.transferencia;
  }//fim getTransferencia ()

  public void setTransferencia (double transferencia)
  {
   this.transferencia = transferencia;
  }//fim setTransferencia

//set get outraReceita
  public double getOutraReceita ()
  {
   return this.outraReceita;
  }//fim getOutraReceita ()

  public void setOutraReceita (double outraReceita)
  {
   this.outraReceita = outraReceita;
  }//fim setOutraReceita

//set get despesaDocente
  public double getDespesaDocente ()
  {
   return this.despesaDocente;
  }//fim getDespesaDocente ()

  public void setDespesaDocente (double despesaDocente)
  {
   this.despesaDocente = despesaDocente;
  }//fim setDespesaDocente

//set get despesaTecnico
  public double getDespesaTecnico ()
  {
   return this.despesaTecnico;
  }//fim getDespesaTecnico ()

  public void setDespesaTecnico (double despesaTecnico)
  {
   this.despesaTecnico = despesaTecnico;
  }//fim setDespesaTecnico

//set get despesaEncargo
  public double getDespesaEncargo ()
  {
   return this.despesaEncargo;
  }//fim getDespesaEncargo ()

  public void setDespesaEncargo (double despesaEncargo)
  {
   this.despesaEncargo = despesaEncargo;
  }//fim setDespesaEncargo
  
//set get despesaCusteio
  public double getDespesaCusteio ()
  {
   return this.despesaCusteio;
  }//fim getDespesaCusteio ()

  public void setDespesaCusteio (double despesaCusteio)
  {
   this.despesaCusteio = despesaCusteio;
  }//fim setDespesaCusteio

//set get despesaInvestimento
  public double getDespesaInvestimento ()
  {  
   return this.despesaInvestimento;
  }//fim getDespesaInvestimento ()

  public void setDespesaInvestimento (double despesaInvestimento)
  {
   this.despesaInvestimento = despesaInvestimento;
  }//fim setDespesaInvestimento

//set get despesaPesquisa
  public double getDespesaPesquisa ()
  {
   return this.despesaPesquisa;
  }//fim getDespesaPesquisa ()

  public void setDespesaPesquisa (double despesaPesquisa)
  {
   this.despesaPesquisa = despesaPesquisa;
  }//fim setDespesaPesquisa

//set get despesaOutras
  public double getDespesaOutras ()
  {
   return this.despesaOutras;
  }//fim getDespesaOutras ()

  public void setDespesaOutras (double despesaOutras)
  {
   this.despesaOutras = despesaOutras;
  }//fim setDespesaOutras

//--------------------------OUTROS METODOS--------------------------------

 /*
  * Funcao para criar um clone da instituicao
  */ 
  public Instituicao clone ()
  {
   return new Instituicao (this.codigo, this.nome, this.sigla, this.codigoMantenedora, this.mantenedora, this.categoria, this.organizacao, this.codigoMunicipio, this.municipio, this.uf, this.regiao, this.tecnico, this.periodico, this.livro, this.receita, this.transferencia, this.outraReceita, this.despesaDocente, this.despesaTecnico, this.despesaEncargo, this.despesaCusteio, this.despesaInvestimento, this.despesaPesquisa, this.despesaOutras);
  }//fim clone

  /*
   * Metodo para mostrar todos os dados de uma instituicao
   * */
  public void imprimir ()
  {
   //mostrar dados
   MyIO.println (this.codigo+" "+this.nome+" "+this.sigla+" "+this.codigoMantenedora+" "+this.mantenedora+" "+this.categoria+" "+this.organizacao+" "+this.codigoMunicipio+" "+this.municipio+" "+this.uf+" "+this.regiao+" "+this.tecnico+" "+this.periodico+" "+this.livro+" "+this.receita+" "+this.transferencia+" "+this.outraReceita+" "+this.despesaDocente+" "+this.despesaTecnico+" "+this.despesaEncargo+" "+this.despesaCusteio+" "+this.despesaInvestimento+" "+this.despesaPesquisa+" "+this.despesaOutras);
  }//fim imprimir

  /*
   * Metodo para preencher o array com dados do arquivo
   * */
   public String [] lerArquivo ( )
  {
   //definir dados
      String line;
      int x = 0;
      String [ ] arqArray = new String [3000];
      RandomAccessFile arquivo;
      try {
         arquivo = new RandomAccessFile ("/tmp/censo.dat", "r");
         line = arquivo.readLine ( );
         //ler arquivo ate o fim e guardar linhas no array
            while (line != null && x < arqArray.length)
         {
            arqArray [x] = line;
            x++;
            line = arquivo.readLine ( );
         }//fim while
        //fechar aqrquivo
         arquivo.close ();
        }catch (IOException Arq) {MyIO.println ("ERRO na leitura do arquivo");}
      return arqArray;
  }//fim lerArquivo

  /*
   * Metodo que pega posicao do array e implementa uma instituicao
   * */
  public void ler (String information)
  {
    if (information ==  null || information.equals (" "))
     {
       MyIO.println ("ERRO: posicao no Array invalida/vazia.");
     }//fim if
    else
     {
      //definir dados 
       String dados [] = new String [24];
       dados = information.split ("\t");
      //setar informacoes
       codigo = Integer.parseInt(dados [0]);
       nome = dados [1];
       sigla = dados [2];
       codigoMantenedora = Integer.parseInt (dados [3]);
       mantenedora = dados [4];
       categoria = Integer.parseInt (dados [5]);
       organizacao = Integer.parseInt (dados [6]);
       codigoMunicipio = Integer.parseInt (dados [7]);
       municipio = dados[8];
       uf = dados[9];
       regiao = dados [10];
       tecnico = Integer.parseInt (dados [11]);
       periodico = Integer.parseInt (dados [12]);
       livro = Integer.parseInt (dados [13]);
       receita = Double.parseDouble (dados [14]);
       transferencia = Double.parseDouble (dados [15]);
       outraReceita = Double.parseDouble (dados [16]);
       despesaDocente = Double.parseDouble (dados [17]);
       despesaTecnico = Double.parseDouble (dados [18]);
       despesaEncargo = Double.parseDouble (dados [19]);
       despesaCusteio = Double.parseDouble (dados [20]);
       despesaInvestimento = Double.parseDouble (dados [21]);
       despesaPesquisa = Double.parseDouble (dados [22]);
       despesaOutras = Double.parseDouble (dados [23]);
    }//fim else
   }//fim ler
}//fim Instituicao

/* 
 * @author Atilio Silva Ferreira
 * @version 2 01/2018
 * */
public class SelecaoParcial
{
 //definir dados
  private Instituicao [] array;
  private int n;
  int comparacoes;
  int movimentacoes;
 
 /*
  * Construtor da lista para a pesquisa sequencial
  * @param tamanho da lista
  * */
  public SelecaoParcial (int tamanho)
  {
    array = new Instituicao [tamanho];
    n = 0;
    comparacoes = 0;
    movimentacoes = 0;
  }//fim Lista

 /*
  * Funcao para indicar o numero de comparacoes 
  * durante toda a ordenacao por selecao
  *
  * @return int - numero de comparacoes
  **/
   public int getComparacoes ()
   {
    return this.comparacoes;
   }//fim getComparacoes ()

 /*
  * Funcao para indicar o numero de movimentacoes
  * durante o processo de ordenacao
  *
  *  @ return int - numero de movimentacoes
  * */
   public int getMovimentacoes ()
   {
    return this.movimentacoes;
   }


/*
 * Metodo para inserir uma Instituicao no inicio de uma lista
 * e move os demais elementos para o fim da lista
 * @param x - Object Instituicao
 * @throws Exception Se a lista estiver cheia.
 * */  
 public void inserirInicio (Instituicao x) throws Exception
 {
   if (n >= array.length)
    {throw new Exception ("Erro: posicao invalida II");}
    //levar elementos para o fim do array
    for (int i = n; i > 0; i--)
    {
       array [i] = array[i-1];
    }//fim for
    array [0] = x;
    n++;
     }//fim inserirInicio

/*
 * Metodo para inserir uma Instituicao no final de uma lista
 * @param x - Object Instituicao
 * @throws Exception Se a lista estiver cheia.
 * */ 
 public void inserirFim (Instituicao x) throws Exception
 {
   if (n >= array.length)
    {throw new Exception ("Erro: posicao invalida IF");}
    array [n] = x;
    n++;
 }//fim inserirFim

/*
 * Metodo para inserir uma Instituicao em qualquer posicao de
 * uma lista e move os demais elementos para o fim da lista
 * @param x - Object Instituicao
 * @param pos - posicao a ser inserido a Instituicao
 * @throws Exception Se a lista estiver cheia.
 * */ 
 public void inserir (int pos, Instituicao x) throws Exception
 {
   if (n >= array.length || pos < 0 || pos > n)
   {throw new Exception ("Erro: posicao invalida I*");}
   //levar elementos para fim do array
    for (int i = n; i > pos; i--)
    {
     array [i] = array[i-1];
    }//fim for
   array [pos] = x;
   n++;
 }//fim inserir

/*
 * Metodo para remover uma Instituicao no inicio de uma lista
 * @return Instituicao - dado removido da lista
 * @throws Exception Se a lista estiver cheia.
 * */
 public Instituicao removerInicio () throws Exception
 { 
   if (n == 0)
    {throw new Exception ("Erro: Nao ha arquivos na lista RI");}
    Instituicao resp = array [0];
    n--;
    //levar elementos para o fim do array
    for (int i = 0; i < n; i++)
    {
       array [i] = array [(i+1)];
    }//fim for
  return resp;
 }//fim removerInicio

/*
 * Metodo para remover uma Instituicao no fim de uma lista
 * @return Instituicao - dado removido da lista
 * @throws Exception Se a lista estiver cheia.
 * */
 public Instituicao removerFim () throws Exception
 {
  if (n==0)
   {throw new Exception ("Erro nao ha arquivos na lista RF");}
  return array [--n];
 }//fim removerFim

/*
 * Metodo para remover uma Instituicao no inicio de uma lista
 *
 * @param pos - posicao da Instituicao a ser removida da lista
 * @return Instituicao - dado removido da lista
 * @throws Exception Se a lista estiver vazia/posicao invalida
 * */
 public Instituicao remover (int pos) throws Exception
 {
  if (n == 0 || pos < 0 || pos >=n)
   {throw new Exception ("Erro: posicao invalida R*");}
    Instituicao resp = array [pos];
    n--;
    for (int i = pos; i < n; i++)
    {
     array [i] = array [i+1];
    }//fim for
   return resp;
 }//fim remover

/*
 * Metodo para mostrar conteuto de uma lista
 * */
 public void mostrar ()
 {
  for (int i = 0; i < 10; i++)
  {
   (array[i]).imprimir ();
  }//fim for
 }//fim mostrar

/*
 * Procura um elemento e retorna se ele existe
 * @param String Sigla - Sigla do elemento a ser procurado
 * @return true se a sigla for identificada em algum dos elementos
 * */
   public  boolean pesquisarSigla (String sigla)
   {
    boolean resp = false;
     for (int i = 0; i < n && resp == false; i++)
      {
         resp = ((array[i].getSigla()).equals (sigla));
         comparacoes ++;
      }//fim for
     return resp;
   }//fim pesquisarSigla

/*
 * Troca os dados de duas posicoes do array
 * 
 * @param i int primeira posicao
 * @param j int segunda posicao
 * */
   public void swap (int i, int j)
   {
      Instituicao temp = array [i];
      array [i] = array [j];
      array [j] = temp;
      movimentacoes = movimentacoes+3;
   }//fim swap
   
/*
 * Algoritmo de ordenacao por selecao
 * */
   public void ordemSelecao (int k)
   {
      for (int i = 0; i < (k); i++)
      {
         int menor = i;
         for (int j = (i+1); j < n; j ++)
         {
            comparacoes++;
          if ((array[menor]).getCodigo () >
               (array[j]).getCodigo ())
             menor = j;
         }//fim for
         swap (menor, i);
      }//fim for
   }//fim ordemSelecao

   
 //main
  public static void main (String [] args)
  {
   //definir dados
    Instituicao instituicao = new Instituicao();
    String [] arqArray = instituicao.lerArquivo ();
    int nlines = MyIO.readInt ();
   try {
    SelecaoParcial lista = new SelecaoParcial (200);
   //abrir arquivo
    FileWriter arquivo = new FileWriter ("628510_selecao.txt");
    BufferedWriter s = new BufferedWriter (arquivo);
    s.write("628510\t");
   //iniciar repeticao
    while (nlines > 0)
     {
       instituicao.ler (arqArray [nlines]);
      try { lista.inserirFim (instituicao.clone ());
       }catch (Exception x) {MyIO.println ("ERRO!");}
      nlines = MyIO.readInt ();
     }//fim while
    long inicio = System.currentTimeMillis ();
   //ordenar lista
    lista.ordemSelecao(10);
    long fim = System.currentTimeMillis ();
    s.write (""+lista.getComparacoes ()+"\t");
    s.write (""+lista.getMovimentacoes ()+"\t");
    s.write (""+(fim - inicio));
    //fechar arquivos
    s.close ();
    arquivo.close ();
    lista.mostrar ();
   }catch (IOException arq) {MyIO.println ("ERRO!");}
  }//fim main
}//fim class TP01P2Q08
