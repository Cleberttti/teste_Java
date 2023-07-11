package novo;
import java.util.ArrayList;
import java.util.List;

public class vetores {
	public static void main(String[] args) {
		int[]nums= new int [3]; //vetor
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		int[] nums2= {4,5,6};//outro jeito para vetor
		for (int i : nums2) { // for each
			System.out.println(i);
			}
		List<Character>lista=new ArrayList<>();//list
		lista.add('a');//adiciona
		lista.add('b');
		lista.add('c');
		lista.remove(2);//remove por index
		System.out.println(lista);
		int[][] matriz=new int[4][4];//matrizes
		System.out.println(matriz);
		
		
		
	}

}
