
package homework_2_q11;
import java.text.DecimalFormat;
import java.util.Scanner;

public class homework_2_q11 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		DecimalFormat fomatter = new DecimalFormat("#,##0.##%");
		
		String exerciseName[]	=new String[3]		;				/**設定名稱*/
			
		int scoreReceived[]		= new int[3]		;				/**設定分數*/
		int scoreTotal[]		= new int[3]		;
		int i,totalReceived=0,totalPossible=0;
															/**將數據掃描進入陣列*/					
			for(i=0;i<3;i++){		
				
				System.out.printf("Please input name of exercise %d\n",i+1);
				exerciseName[i] = input.nextLine();

				System.out.printf("Please input score you've received for exercise %d\n",i+1);
				scoreReceived[i] = input.nextInt();
			
				System.out.printf("Please input total points possible foe exercise %d\n",i+1);
				scoreTotal[i] = input.nextInt();
			
				
				input.nextLine();								/**避免\n被吸進去*/
			}		
			
		System.out.printf("\n%-20s %-10s %-8s\n","Exercise","Score","Total Possible");
		
			for(i=0;i<3;i++){
			
				totalReceived+=scoreReceived[i];
				totalPossible+=scoreTotal[i];
				System.out.printf("%-20s %-10d %-10d\n",exerciseName[i],scoreReceived[i],scoreTotal[i]);	
			}	
		
		System.out.printf("%-20s %-10d %-10d\n","Total",totalReceived,totalPossible);		
		System.out.println("\nYour total is "+totalReceived+" out of "+totalPossible+", or "+fomatter.format(((float)totalReceived/totalPossible)));
		
		input.close();
	}
}