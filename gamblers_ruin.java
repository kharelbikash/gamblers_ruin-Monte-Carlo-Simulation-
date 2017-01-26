
//stake = beginning possession 5 , goal = final possessions 25,T= total times 1000
public class gamblers_ruin {

	public static void main(String[] args){
		
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int T= Integer.parseInt(args[2]);
		int turn = T;
		for (int x=0; x<T; x++){
			if(stake == goal){	

				System.out.println((turn-T)+"wins of"+ turn);
				break;
			}
		 else if (stake<= 0){
				
				System.out.println("Out of stake");
				break;
			}
			
			else{
			int fip = (int)Math.round(Math.random());
						//System.out.println(fip + " "+ T +" "+ stake);
							if(fip == 1){
								stake++;
								T=T-1;
								}
							else{
									stake=stake-1;
									T=T-1;
									
								}
								
								
							}
		}		
		if(T<= 0) System.out.println("better luck next time!");
	}
	
}
//Probability of winning = stake � goal.
//Fact: Expected number of bets = stake * desired gain.
//Ex. 20% chance of turning $500 into $2500,
//but expect to make one million $1 bets.

//###e.g:124 wins of 1000 ; number of turns to win or score goal randomly
