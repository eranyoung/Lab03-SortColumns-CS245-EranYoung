import java.util.*;

public class SortColumns{


	public SortColumns(){};

	public List <Integer> minDeletionSize(String [] a){//returns list of column indices where the column is not alphabetically sorted
		
		List<Integer> indices=new ArrayList<Integer>();

		int stringSize=a[0].length();
		for(int c=0;c<a.length;c++){//input validation, checks if all the string sizes are the same
			if(a[c].length()!=stringSize){
				indices.add(-1);
				return indices;		
			}
		}

		for(int i =0;i<a[0].length()-1;i++){//loop over each column
			for(int c=0;c<a.length-1;c++){//loop over each character in that column
				if(a[i].charAt(c)>a[i+1].charAt(c)){//character comparison, each character should have a lower ascii value than the next 
					indices.add(i);
					break;//skip checking rest of the column to avoid adding the same index again
				}
			}
		}
		return indices;
	}

	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many string do you want to compare?: ");
		int size=scanner.nextInt();//user input for size of array to be compared
		String [] strings=new String[size];
		for(int i=0;i<size;i++){//user input, string by string, until we have "size" amount of strings in the array
			strings[i]=scanner.next().toLowerCase();//ensures that string is lower case for comparison
		}

		SortColumns s = new SortColumns();
		List<Integer> list=s.minDeletionSize(strings);
		System.out.println(list);
	}
}
