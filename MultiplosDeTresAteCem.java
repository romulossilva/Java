package iniciando;

public class MultiplosDeTresAteCem {
	public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {  
                System.out.println(i);
            }
        }
    }

}

/*
para descobrir o resto da divisão de um número por 3 
(o operador % se chama de módulo). Se o resto for zero, 
ele é divisível por 3 
*/