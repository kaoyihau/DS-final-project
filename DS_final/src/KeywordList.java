import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
    }
	
	public void add(Keyword keyword){
		lst.add(keyword);
//		System.out.println("Done");
    }
	
	//quick sort
	public void sort(){
		if(lst.size() == 0)
		{
			System.out.println("InvalidOperation");
		}
		else 
		{
			quickSort(0, lst.size()-1);
//			System.out.println("Done");
		}

	}
	
	
	private void quickSort(int leftbound, int rightbound){
		//1. implement quickSort algorithm
		if(leftbound>=rightbound) return;
		Keyword x=lst.get(rightbound);
		int j=leftbound,k=rightbound-1;
		while(j<k) {
			for(;j<k;j++) {
				if(lst.get(j).count>x.count) {
					for(;k>j;k--) {
						if(lst.get(k).count<=x.count) {
							Keyword t=lst.get(j);
							lst.set(j, lst.get(k));
							lst.set(k, t);
							break;
						}
					}
				}
			}
			lst.add(j, lst.get(rightbound));
			lst.remove(rightbound+1);
		}
		quickSort(leftbound,j-1);
		quickSort(j+1,rightbound);
	}

	
	
	private void swap(int aIndex, int bIndex){
		Keyword temp = lst.get(aIndex);
		lst.set(aIndex, lst.get(bIndex));
		lst.set(bIndex, temp);
	}
	
	public void output(){
		//TODO: write output and remove all element logic here...
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<lst.size();i++){
			Keyword k = lst.get(i);
			if(i>0)sb.append(" ");
			sb.append(k.toString());
		}
		
		System.out.println(sb.toString());	
	}
}
