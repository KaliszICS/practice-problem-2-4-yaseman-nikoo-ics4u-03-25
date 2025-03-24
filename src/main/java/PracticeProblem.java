

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] name, int[] ages){
		for (int i=0; i<name.length-1;i++){
			int smallest=i;
			for (int j=i+1; j<name.length;j++){
				if(name[j].toLowerCase().compareTo(name[smallest].toLowerCase()) < 0){
					smallest=j;

				}
			}
				String temp=name[smallest];
					name[smallest]=name[i];
					name[i]=temp;
					int tempr=ages[smallest];
					ages[smallest]=ages[i];
					ages[i]=tempr;
			
		}

	}
	public static void selectionSortAge(String[] name, int[] ages){
		int smallest=0;
		for (int i=0; i<ages.length-1;i++){
			for (int j=i+1; j<ages.length;j++){
				if(ages[smallest]>ages[j]){
					smallest=j;
				}
			}
				String temp=name[smallest];
				name[smallest]=name[i];
				name[i]=temp;
				int tempr=ages[smallest];
				ages[smallest]=ages[i];
				ages[i]=tempr;

		}

	}

}
