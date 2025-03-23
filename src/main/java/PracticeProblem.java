public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] name, int[] ages){
		int smallest=0;
		for (int i=0; i<name.length-1;i++){
			for (int j=0; j<name.length;i++){
				if(name[j].toLowerCase().compareTo(name[j+1].toLowerCase())>0){
					String temp=name[smallest];
					name[smallest]=name[j];
					name[j]=temp;
					int tempr=ages[smallest];
					ages[smallest]=ages[j];
					ages[j]=tempr;

				}
			}
		}

	}
	public static void selectionSortAge(String[] name, int[] ages){
		int smallest=0;
		for (int i=0; i<name.length-1;i++){
			for (int j=0; j<name.length;i++){
				if(ages[smallest]>ages[j]){
					String temp=name[smallest];
					name[smallest]=name[j];
					name[j]=temp;
					int tempr=ages[smallest];
					ages[smallest]=ages[j];
					ages[j]=tempr;

				}
			}
		}

	}

}
