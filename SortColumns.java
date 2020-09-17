import java.util.*;

public class SortColumns{


	public SortColumns(){};

	public List <Integer> minDeletionSize(String [] a){
		
		List<Integer> indices=new ArrayList<Integer>();

		int stringSize=a[0].length();
		for(int c=0;c<a.length;c++){
			if(a[c].length()!=stringSize){
				indices.add(-1);
				return indices;		
			}
		}

		for(int i =0;i<a[0].length()-1;i++){
			for(int c=0;c<a.length-1;c++){
				if(a[i].charAt(c)>a[i+1].charAt(c)){
					indices.add(i);
					break;
				}
			}
		}
		return indices;
	}

	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many string do you want to compare?: ");
		int size=scanner.nextInt();
		String [] strings=new String[size];
		for(int i=0;i<size;i++){
			strings[i]=scanner.next();
		}

		SortColumns s = new SortColumns();
		List<Integer> list=s.minDeletionSize(strings);
		System.out.println(list);
	}
}
