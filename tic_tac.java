            import java.util.*;
			import java.lang.*;
            
			
			
			
			
			
			
			
			class definition 
{
            Scanner input = new Scanner(System.in); 
			int position, index, remsize=9,roboinput,counter=0, finished=0;
			static int [] rempos ={ 1, 2, 3, 4, 5, 6, 7, 8, 9};
		     static char[] tic={'.', '.', '.', '.', '.', '.', '.', '.', '.'};
			 static int [] completed={10, 10, 10, 10, 10, 10, 10, 10, 10};
            Random random= new Random();
			
			public void display()
	{		
	                System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
                    System.out.println();;
					System.out.println();;
					//System.out.println("            _______________________________________________");
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;

					for(int i=0; i<tic.length; i++)
	            {   System.out.print("                 "+tic[i]);
					if(i==2 || i==5)
					{
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println("            _______________________________________________");
					System.out.println();
					System.out.println();;
					System.out.println();;
					System.out.println();;
				   }
			    }
				    System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
					System.out.println();;
					
	}			
     
	        
			
			
			void cpuinput()
	{
            roboinput=1+random.nextInt(9);
            checkrobo(roboinput);
    }		
			
			
			
			
			
			
			
			void checkuser(int position)
	{
	         int flag=0;
	         for(int i=0; i<remsize; i++)
            if(	rempos[i]==position)
             {
                  flag=1;
                  break;
              }	
			if (flag==0)
			{
			 System.out.println("position already used..");
			 againuserinput();
			 }
	}




            
			
			
			void hardcheckuser(int position)
	{
	         int flag=1;
	         for(int i=0; i<=finished; i++)
            if(	completed[i]==position)
             {
                  flag=0;
				  System.out.println("position already used..");
				  			 
			     againharduserinput();

                  break;
              }	
		
	}


            
			
			
			void againuserinput()
	{
            System.out.println("Enter the position to input");                             
			position=input.nextInt();
			checkuser(position);
	}		
		
		
		
		
           

            
			void againharduserinput()
	{
            System.out.println("Enter the position to input");                             
			position=input.nextInt();
			hardcheckuser(position);
	}		

		 
			
			
			
			void checkrobo(int roboinput)
{
            int flag=0;
            for(int i=0;i<remsize;i++)
                if(rempos[i]==roboinput)
			{   
                flag=1;	
                break;
		    }
			
            if(flag==0)
            cpuinput();	
}		
	 
	        
			
			
			void shift()
    {       
	        
	        if(position < 8 || roboinput < 8)
            for(int i=0; i<remsize-1;i++)
		{
            if(rempos[i]==position||rempos[i]==roboinput)	
		 {
            for(int j=i;j<remsize-1;j++)
            rempos[j]=rempos[j+1];	
		 }	
		 
		} 
         remsize--;
         		
	}  
			
			
			
			
			
			
			
			
			void checkwin()
	{
             if((tic[0]=='X' && tic[1]=='X' && tic[2]=='X') || (tic[3]=='X' && tic[4]=='X' && tic[5]=='X') || (tic[6]=='X' && tic[7]=='X' && tic[8]=='X') 
			 || (tic[2]=='X' && tic[4]=='X' && tic[6]=='X') || (tic[0]=='X' && tic[4]=='X' && tic[8]=='X') || (tic[0]=='X' && tic[3]=='X' && tic[6]=='X') ||
			 (tic[4]=='X' && tic[1]=='X' && tic[7]=='X') ||(tic[8]=='X' && tic[5]=='X' && tic[2]=='X'))
        {
		            System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
                    System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("------------------------------ **CONGRATULATIONS** -----------------------------");
            System.out.println("You Win.....    \nBecause I'm playing gently.");
            System.exit(0);
         }		
			
			else if((tic[0]=='O' && tic[1]=='O' && tic[2]=='O') || (tic[3]=='O' && tic[4]=='O' && tic[5]=='O') || (tic[6]=='O' && tic[7]=='O' && tic[8]=='O') 
			 || (tic[2]=='O' && tic[4]=='O' && tic[6]=='O') || (tic[0]=='O' && tic[4]=='O' && tic[8]=='O') || (tic[0]=='O' && tic[3]=='O' && tic[6]=='O') ||
			 (tic[4]=='O' && tic[1]=='O' && tic[7]=='O') ||(tic[8]=='O' && tic[5]=='O' && tic[2]=='O'))
		 {
                    System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
                    
                    System.out.println("You lost...");
                    System.out.println("Don't think I don't have brain...."); 
					System.exit(0);
         }
    }		
			 
			
			
			
			public static void game()
	{
					 Scanner choice = new Scanner(System.in);
					 int choose=0;
                     System.out.println();
					System.out.println();
					System.out.println();
                    System.out.println("                              TIC TAC TOE...");
					  System.out.println();
					System.out.println();
				    System.out.println("Developed by.........");
                    System.out.println("                          ABHINAV KUMAR (AB_ DON)");
					System.out.println();  
					  System.out.println("---------------------------#######----########-------------------------------");
					
					
							  
						     System.out.println(); 
							 System.out.println();
                    
					int status=1;
					while(status==1)
				{	
				    System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("Choose the level.......");
					System.out.println("    1. Easy");
			        System.out.println("    2. Hard");
					choose=choice.nextInt();
					if(choose==1 || choose==2)
					break;
					System.out.println("Wrong choice");
				}
                 
				 definition play= new definition();

					if(choose == 1)
				{	
					play.display();
				    play.userinput();
				}
                 
                    else 	
				{
                    play.display();
					play.harduserinput();
				}
                
			
	}
			
			
		
		
			
			
			
			
			
			void userinput( )
	{		
	        for(int i=0; i<5;i++)
        {           
            System.out.println();
			System.out.println();
			System.out.println("Enter the position to input");                             
			position=input.nextInt();
			if(position<1 || position>9)
		 {
            System.out.println("Incorrect position");
            againuserinput();
          }	
            if(i!=0)
			 checkuser(position);	
			tic[position-1]='X';
				
			if(i>1)
			  checkwin();
			shift();
			
			// computer input
			if(i<4)
		{
         	roboinput=1+random.nextInt(9);
			checkrobo(roboinput);
			tic[roboinput-1]='O' ;
  			display();
			if(i>1)
			  checkwin();
			shift();
		}
	    }		
	}	
	





			
			
			
			void harduserinput( )
	{		
	        for(int i=0; i<5;i++)
        {           
            System.out.println();
			System.out.println();
			System.out.println("Enter the position to input");                             
			position=input.nextInt();
			if(position<1 || position>9)
		  {
            System.out.println("Incorrect position");
            againuserinput();
          }	
			
            if(i!=0)
			 hardcheckuser(position-1);	
			tic[position-1]='X';
	        completed[finished]=position-1;
			finished+=2;
			//display();
			if(i>1)
			  checkwin();
			//shift();
			
			// computer input
			if(i<4)
		 {
		    hardcpuinput();
   			display();
			if(i>1)
			  checkwin();
			//shift();
		 }
	    }					

    }
	
	
	
	        
			
			
			void hardcpuinput()
{    
	      
		switch(completed[0])
     {
        
        case 0:              tic[4]='O';
		                     completed[1]=4; 
		                      if(counter>0)
							       {              switch(completed[2])                
													{
                                                        case 1:        tic[2]='O';
														               completed[3]=2;
																	   if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 5:        tic[6]='O';
																																					completed[5]=6;
																																					break;
																																	case 3:        tic[6]='O';
																																					completed[5]=6;
																																					break;
																																	case 7:        tic[6]='O';
																																					completed[5]=6;
																																					break;
																																	case 6:        tic[3]='O';
																																					 completed[5]=3;
																																			         if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 5:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[5]='O';
																																																	completed[7]=5;
																																																	break;
																																													case 6:        tic[5]='O';
																																																	completed[7]=5;
																																																	break;		
																																											}
																																								}     
																																					 break;
																																	case 8:        tic[6]='O';
																																					 completed[5]=6;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																																																									  
														               break;
                                                        case 2:        tic[1]='O';
														                completed[3]=1;
																      if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 3:        tic[7]='O';
																																					completed[5]=7;
																																					break;
																																	case 5:        tic[7]='O';
																																					completed[5]=7;
																																					break;
																																	case 6:        tic[7]='O';
																																					completed[5]=7;
																																					break;
																																	case 7:        tic[3]='O';
																																					 completed[5]=3;
																																					           if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 5:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[5]='O';
																																																	completed[7]=5;
																																																	break;
																																													case 6:        tic[5]='O';
																																																	completed[7]=5;
																																																	break;		
																																											}
																																								}     
																																	        		 break;
																																	case 8:        tic[7]='O';
																																					 completed[5]=7;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																													
														                break;
                                                        case 3:        tic[6]='O';
														                completed[3]=6;
																       if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 1:        tic[2]='O';
																																					completed[5]=2;
																																					break;
																																	case 2:        tic[1]='O';
																																					completed[5]=1;
																																					                       if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 7:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[7]='O';
																																																	completed[7]=7;
																																																	break;
																																													case 5:        tic[7]='O';
																																																	completed[7]=7;
																																																	break;			
																																											}
																																								}     
																																					break;
																																	case 6:        tic[2]='O';
																																					completed[5]=2;
																																					break;
																																	case 7:        tic[2]='O';
																																					 completed[5]=2;
																																					 break;
																																	case 8:        tic[2]='O';
																																					 completed[5]=2;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																													
														                break;
                                                        case 5:        tic[2]='O';
														                completed[3]=2;
																		if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 1:        tic[6]='O';
																																					completed[5]=6;
																																					break;
																																	case 3:        tic[6]='O';
																																					completed[5]=6;
																																					break;
																																	case 6:        tic[3]='O';
																																					completed[5]=3;
																																					            if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 7:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[7]='O';
																																																	completed[7]=7;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);	
																																													case 1:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);				
																																											}
																																								}     
																																					break;
																																	case 7:        tic[6]='O';
																																					 completed[5]=6;
																																					 break;
																																	case 8:        tic[6]='O';
																																					 completed[5]=6;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																													
														                break;
                                                        case 6:        tic[3]='O';
														                 completed[3]=3;
																		 if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 1:        tic[5]='O';
																																					completed[5]=5;
																																					break;
																																	case 2:        tic[5]='O';
																																					completed[5]=5;
																																					break;
																																	case 5:        tic[1]='O';
																																					completed[5]=1;
																																							 if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 7:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[7]='O';
																																																	completed[7]=7;
																																																	break;			
																																													case 2:        tic[7]='O';
																																																	completed[7]=7;
																																																	break;
																																											}
																																								}     
																																					break;
																																	case 7:        tic[5]='O';
																																					 completed[5]=5;
																																					 break;
																																	case 8:        tic[5]='O';
																																					 completed[5]=5;
																																					break;
																															}
						 
						                                                                                         }
								
																													
														                 break;
                                                        case 7:        tic[6]='O';
														                 completed[3]=6;
																		 if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 1:        tic[2]='O';
																																					completed[5]=2;
																																					break;
																																	case 2:        tic[1]='O';
																																					completed[5]=1;
																																					          if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 5:        tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 8:        tic[5]='O';
																																																	completed[7]=5;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);	
																																													case 3:         tic[8]='O';
																																																	completed[7]=8;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);				
																																											}
																																								}     
																																					break;
																																	case 3:        tic[1]='O';
																																					completed[5]=1;
																																					break;
																																	case 5:        tic[1]='O';
																																					 completed[5]=1;
																																					 break;
																																	case 8:        tic[1]='O';
																																					 completed[5]=1;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																													
														                break;
                                                        case 8:        tic[7]='O';
														                 completed[3]=7;
																		 if(counter>1)
																	                                            {              switch(completed[4])                
													                                                                       {
																																	case 1:        tic[2]='O';
																																					completed[5]=2;
																																					          if(counter>2)
																																								{              switch(completed[6])                
																																										   {
																																													case 3:        tic[6]='O';
																																																	completed[7]=6;
																																																	display(); System.out.println(); System.out.println("Its Draw.......");
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);
																																													case 5:        tic[6]='O';
																																																	completed[7]=6;
                                                                                                                                                                                                     break;
																																													case 6:        tic[3]='O';
																																																	completed[7]=3;
																																																	display(); System.out.println(); 
																																																	System.out.println("Its Draw.......");
																																																	System.exit(0);				
																																											}
																																								}     
																																					break;
																																	case 2:        tic[1]='O';
																																					completed[5]=1;
																																					break;
																																	case 3:        tic[1]='O';
																																					completed[5]=1;
																																					break;
																																	case 5:        tic[1]='O';
																																					 completed[5]=1;
																																					 break;
																																	case 6:        tic[1]='O';
																																					 completed[5]=1;
																																					break;
																															}
						 
						                                                                                         }
																																																												
																													
														                break;
                                                    }
									}			
                              counter++;	 
							  break;                   
        case 1:              tic[4]='O';
		                      completed[1]=4; 
							    if(counter>0)
							       {             switch(completed[2])
													{
                                                        case 0:        tic[2]='O';
														               completed[3]=2;
																	    if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 5:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 7:        tic[5]='O';
																																										   completed[7]=5;
																																										   break;
																																							case 8:        tic[5]='O';
																																											completed[7]=5;
																																											break;
																																							case 5:        tic[8]='O';
																																											completed[7]=8;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);				
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}
														               break;
                                                        case 2:        tic[0]='O';
														                completed[3]=0;
																		if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 7:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;
																																							case 3:        tic[7]='O';
																																								     		completed[7]=7;
         																																									display(); System.out.println(); System.out.println("Its Draw.......");
																																											
																																											System.exit(0);			
																																							case 6:        tic[3]='O';
																																											completed[7]=3;
																																											break;
				
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
																		break;
                                                        case 3:        tic[0]='O';
														                completed[3]=0;
																       if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[2]='O';
																													completed[5]=2;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										   break;
																																							case 6:        tic[7]='O';
																																								     		completed[7]=7;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);			
																																							case 5:        tic[6]='O';
																																											completed[7]=6;
																																											break;
				
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                break;
                                                        case 5:        tic[2]='O';
														                completed[3]=2;
						                                                 if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 3:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;
																																							case 8:        tic[7]='O';
																																								     		completed[7]=7;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);			
																																							case 7:        tic[8]='O';
																																											completed[7]=8;
																																											break;
				
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				} 
														                break;
                                                        case 6:        tic[0]='O';
														                 completed[3]=0;
											                               if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[5]='O';
																																										   completed[7]=5;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);			
																																							case 5:        tic[2]='O';
																																								     		completed[7]=2;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);			
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);	
				
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 3:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                 break;
                                                        case 7:        tic[5]='O';
														                 completed[3]=5;
													                       if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[3]='O';
																												   completed[5]=3;
																												   break;
																									case 0:        tic[3]='O';
																													completed[5]=3;
																													break;
																									case 3:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 8:        tic[6]='O';
																																										   completed[7]=6;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.out.println("Its Draw.......");
																																											System.exit(0);		
																																							case 2:        tic[8]='O';
																																								     		completed[7]=8;
																																											break;			
																																							case 6:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[3]='O';
																													 completed[5]=3;
																													break;
																									case 8:        tic[3]='O';
																													 completed[5]=3;
																													break;
																								}
																				} 
														                break;
                                                        case 8:        tic[2]='O';
														                 completed[3]=2;
																            if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 0:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 0:        tic[3]='O';
																																										   completed[7]=3;
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);		
																																							case 3:        tic[0]='O';
																																								     		completed[7]=0;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 5:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 5:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				} 
														                break;
													}
                                    }
							   counter++;                   
							   break;
        case 2:              tic[4]='O';
		                      completed[1]=4;
							    if(counter>0)
							       {                    switch(completed[2])
													{
                                                        case 0:        tic[1]='O';
														               completed[3]=1;
																	    if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[7]='O';
																												   completed[5]=7;
																												   break;
																									case 5:        tic[7]='O';
																													completed[5]=7;
																													break;
																									case 7:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;	
																																							case 3:        tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 8:        tic[3]='O';
																																										   completed[7]=3;
																																										   
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[7]='O';
																													 completed[5]=7;
																													break;
																									case 8:        tic[7]='O';
																													 completed[5]=7;
																													break;
																								}
																				} 
														                break;
									
                                   
														              
                                                        case 1:        tic[0]='O';
														                completed[3]=0;
															           if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 6:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;	
																																							case 3:        tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 7:        tic[3]='O';
																																										   completed[7]=3;
																																										   
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                break;
                                                        case 3:        tic[0]='O';
														                completed[3]=0;
																       if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[2]='O';
																													completed[5]=2;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 5:        tic[6]='O';
																																										   completed[7]=6;
																																										   break;	
																																							case 6:        tic[7]='O';
																																								     		completed[7]=7;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										   
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                break;
                                                        case 5:        tic[8]='O';
														                completed[3]=8;
																        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 3:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;	
																																							case 8:        tic[7]='O';
																																								     		completed[7]=7;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				} 
														                break;
                                                        case 6:        tic[1]='O';
														                 completed[3]=1;
																        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 5:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 2:        tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																										 System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                 break;
                                                        case 7:        tic[8]='O';
														                 completed[3]=8;
														                break;
                                                        case 8:        tic[5]='O';
														                 completed[3]=5;
																		  if(counter>1)
																			{             switch(completed[4])
																								{
																									case 0:        tic[3]='O';
																												   completed[5]=3;
																												   break;
																									case 1:        tic[3]='O';
																													completed[5]=3;
																													break;
																									case 6:        tic[3]='O';
																													completed[5]=3;
																													break;
																									case 7:        tic[3]='O';
																													completed[5]=3;
				                                                                                                    break;
																													
														                                            case 3:        tic[1]='O';
																													completed[5]=1;
																													if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 0:        tic[7]='O';
																																										   completed[7]=7;
																																										   break;
																																							case 6:        tic[7]='O';
																																								     		completed[7]=7;
																																											break;
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										 System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													
				                                                                                                    break;
																		                 	}
						                                                    }
																		
																		
																		break; 
										            }
                                     }
							     counter++;
							     break;
        case 3:              tic[4]='O';
							 completed[1]=4; 
							 
							       if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 0:        tic[6]='O';
														               completed[3]=6;
																	                                        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[7]='O';
																												   completed[5]=7;
																												   break;
																									case 5:        tic[7]='O';
																													completed[5]=7;
																													break;
																									case 7:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;	
																																							case 3:        tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[7]='O';
																													 completed[5]=7;
																													break;
																									case 8:        tic[7]='O';
																													 completed[5]=7;
																													break;
																								}
																				} 
														               break;
                                                        case 1:        tic[0]='O';
														                completed[3]=0;
															            if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;	
																																							case 3:          tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																											break;			
																																							case 7:        tic[3]='O';
																																										   completed[7]=3;
																																										   
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                break;
                                                        case 2:        tic[0]='O';
														                completed[3]=0;
												                        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 6:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 1:          tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				}     
														                break;
                                                        case 5:        tic[2]='O';
														                completed[3]=2;
																	    if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 0:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 8:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 1:          tic[8]='O';
																																								     		completed[7]=8;
																																											break;
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;																																						
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				} 
														                break;
                                                        case 6:        tic[0]='O';
														                 completed[3]=0;
																		                                           if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;
																																							case 1:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;																																						
																																						}
																																		}				
					
																													break;
																									
																									case 2:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				} 
														                 break;
                                                        case 7:        tic[6]='O';
														                 completed[3]=6;
																         if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 5:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;	
																																							case 8:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;																																							
																																						}
																																		}				
					
																													break;
																									
																									case 0:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 8:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				} 
														                break;
                                                        case 8:        tic[6]='O';
														                 completed[3]=6;
																		  if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 5:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 0:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}				
					
																													break;
																									
																									case 0:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 7:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}   
														                break;
												     }						
                                    }
							    counter++;
								break;
        case 4:              tic[0]='O';
		                      completed[1]=0; 
							    if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 1:        tic[7]='O';
														               completed[3]=7;
								                                      if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[5]='O';
																												   completed[5]=5;
																									                if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);
																																							case 8:          tic[2]='O';
																																								     		completed[7]=2;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}				
																												   break;
																									case 5:        tic[3]='O';
																													completed[5]=3;
																									                 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[6]='O';
																																										   completed[7]=6;
																																										   break;
																																							case 8:          tic[2]='O';
																																								     		completed[7]=2;
																																											break;	
																																							case 6:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}	
																													break;
																									case 2:        tic[6]='O';
																													completed[5]=6;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 5:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;	
																																							case 8:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[2]='O';
																													 completed[5]=2;
																										              if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);
																																							case 8:          tic[2]='O';
																																								     		completed[7]=2;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}	
																													break;
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																			                                        if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;
																																							case 3:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;																																							
																																						}
																																		}	
																													break;
																								}
																				} 
														               break;
                                                        case 2:        tic[6]='O';
														                completed[3]=6;
						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[3]='O';
																												   completed[5]=3;
																												   break;
																									case 5:        tic[3]='O';
																													completed[5]=3;
																													break;
																									case 3:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[3]='O';
																													 completed[5]=3;
																													break;
																									case 7:        tic[3]='O';
																													 completed[5]=3;
																													break;
																								}
																				}   
														                break;
                                                        case 3:        tic[5]='O';
														                completed[3]=5;
																		                                          if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[7]='O';
																												   completed[5]=7;
																											        if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[2]='O';
																																								     		completed[7]=2;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					 
																												   break;
																									case 2:        tic[6]='O';
																													completed[5]=6;
																												    if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
																																								           System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);
																																							case 8:          tic[7]='O';
																																								     		completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);																																							
																																						}
																																		}				
					
																													break;
																									case 6:        tic[2]='O';
																													completed[5]=2;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[8]='O';
																																										   completed[7]=8;
																																										  break;
																																							case 8:          tic[1]='O';
																																								     		completed[7]=1;
																																											break;
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[2]='O';
																													 completed[5]=2;
																													  if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
                                                                                                                                                                            System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:          tic[1]='O';
																																								     		completed[7]=1;
																																											break;
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;
																																							
																																						}
																																		}	
																													break;
																									case 7:        tic[1]='O';
																													 completed[5]=1;
																			                                         if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[6]='O';
																																										   completed[7]=6;
                                                                                                                                                                            System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:          tic[2]='O';
																																								     		completed[7]=2;
																																											break;
																																							case 7:        tic[2]='O';
																																										   completed[7]=2;
																																										   break;
																																							
																																						}
																																		}	
																													break;
																								}
																				}   
														                break;
                                                        case 5:        tic[3]='O';
														                completed[3]=3;
								                                        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 2:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[2]='O';
																													completed[5]=2;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[1]='O';
																																								     		completed[7]=1;
																																										    break;
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																							               break;
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													                                                               
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   
														                break;
                                                        case 6:        tic[2]='O';
														                 completed[3]=2;
														                 if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[1]='O';
																												   completed[5]=1;
																												   break;
																									case 5:        tic[1]='O';
																													completed[5]=1;
																													break;
																									case 1:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[5]='O';
																																								     		completed[7]=5;
																																												break;
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																							                break;
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[1]='O';
																													 completed[5]=1;
																													break;
																									case 7:        tic[1]='O';
																													 completed[5]=1;
																													break;
																								}
																				}   
														                 break;
                                                        case 7:        tic[1]='O';
														                 completed[3]=1;
									                                     if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 5:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[6]='O';
																													completed[5]=6;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[3]='O';
																																								     		completed[7]=3;
																																												break;
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																							                break;
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 6:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}       
														                break;
                                                        case 8:        tic[2]='O';
														                 completed[3]=2;
																		                                                                      if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 3:        tic[1]='O';
																												   completed[5]=1;
																												   break;
																									case 5:        tic[1]='O';
																													completed[5]=1;
																													break;
																									case 1:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:          tic[5]='O';
																																								     		completed[7]=5;
																																												System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																							                System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[1]='O';
																													 completed[5]=1;
																													break;
																									case 7:        tic[1]='O';
																													 completed[5]=1;
																													break;
																								}
																				}   
														                break;
													}					
                                    }
								counter++;
								 break;
        case 5:              tic[4]='O';
		                      completed[1]=4;
							   if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 0:        tic[2]='O';
														               completed[3]=2;
                            						                    if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 3:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[7]='O';
																																								     		completed[7]=7;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														               break;
                                                        case 1:        tic[2]='O';
														                completed[3]=2;
																		                                 						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 3:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[8]='O';
																																										   completed[7]=8;
																																										  break;
																																							case 8:          tic[7]='O';
																																								     		completed[7]=7;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														                break;
                                                        case 2:        tic[8]='O';
														                completed[3]=8;
																		                                                           						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 3:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[1]='O';
																													completed[5]=1;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[7]='O';
																																										   completed[7]=7;
																																										   break;
																																							case 6:          tic[7]='O';
																																								     		completed[7]=7;
																																											break;	
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 7:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                break;
                                                        case 3:        tic[2]='O';
														                completed[3]=2;
																		                                                       						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 1:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;	
																																							case 8:          tic[1]='O';
																																								     		completed[7]=1;
                                                                                                                                                                              break;	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														                break;
                                                        case 6:        tic[8]='O';
														                 completed[3]=8;
																		                                                  						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 5:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 2:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 2:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 7:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                 break;
                                                        case 7:        tic[8]='O';
														                 completed[3]=8;
		                       						                      if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 2:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[2]='O';
																													completed[5]=2;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[6]='O';
																																										   completed[7]=6;
																																										   break;	
																																							case 3:          tic[6]='O';
																																								     		completed[7]=6;
																																											break;	
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 7:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                break;
                                                        case 8:        tic[2]='O';
														                 completed[3]=2;
		                          						               if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 0:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:          tic[1]='O';
																																								     		completed[7]=1;
																																											break;	
																																							case 0:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														                break;
                                                    }
									}	
                                counter++;			
							 break;
							 
        case 6:              tic[4]='O';
		                       completed[1]=4; 
                                          if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 0:        tic[3]='O';
														               completed[3]=3;
																	                                                       						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[5]='O';
																												   completed[5]=5;
																												   break;
																									case 2:        tic[5]='O';
																													completed[5]=5;
																													break;
																									case 5:        tic[1]='O';
																													completed[5]=1;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[7]='O';
																																										   completed[7]=7;
																																										   break;
																																							case 8:          tic[7]='O';
																																								     		completed[7]=7;
																																											break;
																																							case 7:        tic[8]='O';
																																										   completed[7]=8;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[5]='O';
																													 completed[5]=5;
																													break;
																									case 7:        tic[5]='O';
																													 completed[5]=5;
																													break;
																								}
																				}   

														               break;
                                                        case 1:        tic[0]='O';
														                completed[3]=0;
																		                                                 						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:          tic[2]='O';
																																								     		completed[7]=2;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				}   

														                break;
                                                        case 2:        tic[3]='O';
														                completed[3]=3;
                                                                         if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[5]='O';
																												   completed[5]=5;
																												   break;
																									case 0:        tic[5]='O';
																													completed[5]=5;
																													break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 2:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[5]='O';
																													 completed[5]=5;
																													break;
																									case 7:        tic[5]='O';
																													 completed[5]=5;
																													break;
																								}
																				}   

														                break;
                                                        case 3:        tic[0]='O';
														                completed[3]=0;
                                  				                         if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[7]='O';
																																										   completed[7]=7;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 2:          tic[1]='O';
																																								     		completed[7]=1;
																																											break;	
																																							case 5:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 2:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 7:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				}   

														                break;
                                                        case 5:        tic[8]='O';
														                 completed[3]=8;
																		                                               						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 2:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 2:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 7:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                 break;
                                                        case 7:        tic[8]='O';
														                 completed[3]=8;
																		                                       						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 5:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[5]='O';
																																										   completed[7]=5;
																																										  break;
																																							case 2:          tic[5]='O';
																																								     		completed[7]=5;
																																											break;
																																							case 5:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 2:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 3:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                break;
                                                        case 8:        tic[7]='O';
														                 completed[3]=7;
																		                                                  						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[1]='O';
																												   completed[5]=1;
																												   break;
																									case 3:        tic[1]='O';
																													completed[5]=1;
																													break;
																									case 1:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 0:        tic[3]='O';
																																										   completed[7]=3;
																																										   break;
	
																																							case 2:          tic[3]='O';
																																								     		completed[7]=3;
																																											break;	
																																							case 3:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 5:        tic[1]='O';
																													 completed[5]=1;
																													break;
																									case 2:        tic[1]='O';
																													 completed[5]=1;
																													break;
																								}
																				}   

														                break;
                                                    } 
									}
                                counter++;				
								break;
        case 7:              tic[4]='O';
		                       completed[1]=4;
							                             if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 0:        tic[6]='O';
														               completed[3]=6;
																	                          						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 5:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[1]='O';
																													completed[5]=1;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[8]='O';
																																										   completed[7]=8;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 8:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[3]='O';
																																										   completed[7]=3;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 3:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}   

														               break;
                                                        case 1:        tic[0]='O';
														                completed[3]=0;
																		                                                    						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[8]='O';
																												   completed[5]=8;
																												   break;
																									case 5:        tic[8]='O';
																													completed[5]=8;
																													break;
																									case 8:        tic[6]='O';
																													completed[5]=6;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:          tic[2]='O';
																																								     		completed[7]=2;
																																											break;
																																							case 5:        tic[2]='O';
																																										   completed[7]=2;
																																										   break;
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[8]='O';
																													 completed[5]=8;
																													break;
																									case 6:        tic[8]='O';
																													 completed[5]=8;
																													break;
																								}
																				}   

														                break;
                                                        case 2:        tic[8]='O';
														                completed[3]=8;
												                        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 5:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[1]='O';
																													completed[5]=1;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 3:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:          tic[6]='O';
																																								     		completed[7]=6;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 6:        tic[3]='O';
																																										   completed[7]=3;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 6:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                break;
                                                        case 3:        tic[6]='O';
														                completed[3]=6;
			         	                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 1:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[0]='O';
																													completed[5]=0;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[8]='O';
																																										   completed[7]=8;
																																										   break;	
																																							case 5:          tic[8]='O';
																																								     		completed[7]=8;
																																											break;
																																							case 8:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 8:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 5:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}   

														                break;
                                                        case 5:        tic[8]='O';
														                 completed[3]=8;
						                                                 if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[0]='O';
																												   completed[5]=0;
																												   break;
																									case 2:        tic[0]='O';
																													completed[5]=0;
																													break;
																									case 0:        tic[6]='O';
																													completed[5]=6;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[2]='O';
																																										   completed[7]=2;
																																										   break;
																																							case 2:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:        tic[2]='O';
																																										   completed[7]=2;
																																										   break;
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[0]='O';
																													 completed[5]=0;
																													break;
																									case 6:        tic[0]='O';
																													 completed[5]=0;
																													break;
																								}
																				}   

														                 break;
                                                        case 6:        tic[8]='O';
														                 completed[3]=8;
														                break;
                                                        case 8:        tic[6]='O';
														                 completed[3]=6;
														                break;
													}					
                                    }
							 counter++;
							  break;
        case 8:		         tic[4]='O';
		                      completed[1]=4; 
							                              if(counter>0)
							       {                      switch(completed[2])
													{
                                                        case 0:        tic[1]='O';
														               completed[3]=1;
    					                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 2:        tic[7]='O';
																												   completed[5]=7;
																												   break;
																									case 5:        tic[7]='O';
																													completed[5]=7;
																													break;
																									case 7:        tic[6]='O';
																													completed[5]=6;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:          tic[2]='O';
																																								     		completed[7]=2;
																																											break;
																																							case 5:        tic[2]='O';
																																										   completed[7]=2;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[7]='O';
																													 completed[5]=7;
																													break;
																									case 6:        tic[7]='O';
																													 completed[5]=7;
																													break;
																								}
																				}   

														               break;
                                                        case 1:        tic[2]='O';
														                completed[3]=2;
							                                            if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 5:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 0:        tic[3]='O';
																																										   completed[7]=3;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 3:          tic[0]='O';
																																								     		completed[7]=0;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														                break;
                                                        case 2:        tic[5]='O';
														                completed[3]=5;
	    				                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[3]='O';
																												   completed[5]=3;
																												   break;
																									case 0:        tic[3]='O';
																													completed[5]=3;
																													break;
																									case 3:        tic[1]='O';
																													completed[5]=1;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 0:        tic[7]='O';
																																										   completed[7]=7;
																																										  break;
																																							case 6:          tic[7]='O';
																																								     		completed[7]=7;
																																											break;
																																							case 7:        tic[6]='O';
																																										   completed[7]=6;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 6:        tic[3]='O';
																													 completed[5]=3;
																													break;
																									case 7:        tic[3]='O';
																													 completed[5]=3;
																													break;
																								}
																				}   

														                break;
                                                        case 3:        tic[6]='O';
														                completed[3]=6;
						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 0:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 0:          tic[1]='O';
																																								     		completed[7]=1;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 7:        tic[1]='O';
																																										   completed[7]=1;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 5:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 7:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}   

														                break;
                                                        case 5:        tic[2]='O';
														                 completed[3]=2;
							                                             if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 1:        tic[6]='O';
																												   completed[5]=6;
																												   break;
																									case 0:        tic[6]='O';
																													completed[5]=6;
																													break;
																									case 6:        tic[7]='O';
																													completed[5]=7;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 0:          tic[1]='O';
																																								     		completed[7]=1;
																																											break;	
																																							case 3:        tic[1]='O';
																																										   completed[7]=1;
																																										   break;
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 3:        tic[6]='O';
																													 completed[5]=6;
																													break;
																									case 7:        tic[6]='O';
																													 completed[5]=6;
																													break;
																								}
																				}   

														                 break;
                                                        case 6:        tic[7]='O';
														                 completed[3]=7;
						                                                if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[1]='O';
																												   completed[5]=1;
																												   break;
																									case 5:        tic[1]='O';
																													completed[5]=1;
																													break;
																									case 1:        tic[3]='O';
																													completed[5]=3;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 2:        tic[5]='O';
																																										   completed[7]=5;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 0:          tic[5]='O';
																																								     		completed[7]=5;
																																											System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							case 5:        tic[2]='O';
																																										   completed[7]=2;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 2:        tic[1]='O';
																													 completed[5]=1;
																													break;
																									case 3:        tic[1]='O';
																													 completed[5]=1;
																													break;
																								}
																				}   

														                break;
                                                        case 7:        tic[6]='O';
														                 completed[3]=6;
																        if(counter>1)
																			 {             switch(completed[4])
																								{
																									case 0:        tic[2]='O';
																												   completed[5]=2;
																												   break;
																									case 5:        tic[2]='O';
																													completed[5]=2;
																													break;
																									case 2:        tic[5]='O';
																													completed[5]=5;
																													 if(counter>2)
																																	 {             switch(completed[6])
																																						{
																																							case 1:        tic[3]='O';
																							        																	   completed[7]=3;
																																										   break;
																																							case 0:          tic[3]='O';
																																								     		completed[7]=3;
																																											break;
																																							case 3:        tic[0]='O';
																																										   completed[7]=0;
																																										   System.out.println();
																																											display(); System.out.println(); System.out.println("Its Draw.......");
																																											System.exit(0);	
																																							
																																						}
																																		}				
					
																													break;
																									
																									case 1:        tic[2]='O';
																													 completed[5]=2;
																													break;
																									case 3:        tic[2]='O';
																													 completed[5]=2;
																													break;
																								}
																				}   

														                break;
													}					
                                    }
							  counter++;
							  break;
	}
}	
	
	
		  
		  
		  
		  
}            
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 class tic_tac extends definition
{
                    public static void main(String[] abhinav)
   {
                     game();
					
					
				
   } 
}

                 		