package puzzles;

import java.util.Scanner;

public class TwoCircles {
	//Touching,Disjoint-Inside,Disjoint-Outside,Concentric and Intersecting
	static String[] circles(String[] info) {
		int leftC1,rightC1,leftC2,rightC2;
		String result[] =new String[info.length];
		for(int i=0;i<info.length;i++) {

			String circlesInfo[]= info[i].split(" ");
			if(circlesInfo[0].equals("0") && circlesInfo[3].equals("0")) {
				leftC1 = Integer.parseInt(circlesInfo[1])-Integer.parseInt(circlesInfo[2]);
				rightC1 = Integer.parseInt(circlesInfo[1])+Integer.parseInt(circlesInfo[2]);
				leftC2 = Integer.parseInt(circlesInfo[4])-Integer.parseInt(circlesInfo[5]);
				rightC2 = Integer.parseInt(circlesInfo[4])+Integer.parseInt(circlesInfo[5]);
				

			}
			else {
				leftC1 = Integer.parseInt(circlesInfo[0])-Integer.parseInt(circlesInfo[2]);
				rightC1 = Integer.parseInt(circlesInfo[0])+Integer.parseInt(circlesInfo[2]);
				leftC2 = Integer.parseInt(circlesInfo[3])-Integer.parseInt(circlesInfo[5]);
				rightC2 = Integer.parseInt(circlesInfo[3])+Integer.parseInt(circlesInfo[5]);
			}
			System.out.println("circle one end points are "+leftC1+" ::::::: "+rightC1);
			System.out.println("circle two end points are "+leftC2+" ::::::: "+rightC2);
			if(circlesInfo[1].equals(circlesInfo[4]) && circlesInfo[0].equals(circlesInfo[3])) {
				result[i]="Concentric";
			}
			else if(leftC1==leftC2 || leftC1==rightC2 || rightC1==leftC2 || rightC1==rightC2){
				result[i]="Touching";
			}
			else if( ( leftC1 < leftC2 && rightC1 < rightC2  && rightC1 > leftC2) || ( leftC2 < leftC1 && rightC2 < rightC1 && rightC2 > leftC1) ){
				result[i]="Intersecting";
			}
			else if( (leftC1 < leftC2 && leftC1 < rightC2 && rightC1 < leftC2 && rightC1 < rightC2) || 
					(leftC2 < leftC1 && leftC2 < rightC1 && rightC2 < leftC1 && rightC2 < rightC1) ) {
				result[i]="Disjoint-Outside";
			}
			else if( ( leftC1 < leftC2 && rightC1 > rightC2 ) || ( leftC2 < leftC1 && rightC2 > rightC1 ) ) {
				result[i]="Disjoint-Inside";
			}
			
		}
		return result;
	}
	public static void main(String arg[]) {
		int index=0;
		Scanner sc =new Scanner(System.in);
		int totalTestCases = sc.nextInt();
		String []info = new String[totalTestCases];
		while(index<totalTestCases) {
			info[index]=sc.nextLine();
		}
		circles(info);
	}
}
