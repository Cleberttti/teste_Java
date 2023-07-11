package novo;

public class terceiro {
	
	    public static void main(String[] args) {
	    	final int Constante=32;//constante
	    	System.out.println(Constante);
	        String p="dalhe gremio";
	        String p2= p.substring(5);//recorta a string
	        String p3=p.replace('e', 'i');//troca os caracteres
	        String[] p4=p.split("-");
	        System.out.println(p2);// funçoens para string
	        System.out.println(p3);
	        System.out.println(p4[0]);
	        double raiz=Math.sqrt(25.0);//raiz quadrada
	        System.out.println(raiz);
	        produto p1=new produto("iphone",8.500,1200);//instanciando
	        System.out.println(p1);
	        encapisulando e=new encapisulando("ze",30,1.80);
	        System.out.println(e.getAge());
	        int x=10;
	        Object obj=x;//boxing
	        int y=(int)obj;
	        System.out.println(y);//unboxing
	        //wrappers
	        // Byte b=null;
	        // Short s=null;
	        // Integer i=null;
	        // Long l=null;
	        // Float f=null;
	        // Double d=null;
	        // Boolean bo=null;
	        // Character c=null;
	        
	        

	    }
	    
	}


