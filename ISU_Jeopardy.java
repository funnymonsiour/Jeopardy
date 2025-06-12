package bbbbb;

import java.util.*;
public class ISU_Jeopardy {
		
	public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
				
			ArrayList<String> categories = new ArrayList<>(Arrays.asList("cat1", "cat2", "cat3", "cat4"));
				
			ArrayList<Integer> cat1Points = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
			ArrayList<String> cat1Questions = new ArrayList<>(Arrays.asList("one1", "two1", "three1", "four1"));
			ArrayList<String> cat1Answers = new ArrayList<>(Arrays.asList("one1", "two1", "three1", "four1"));
				
				
				ArrayList<Integer> cat2Points = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
				ArrayList<String> cat2Questions = new ArrayList<>(Arrays.asList("one2", "two2", "three2", "four2"));
				ArrayList<String> cat2Answers = new ArrayList<>(Arrays.asList("one2", "two2", "three2", "fou2"));
				
				ArrayList<Integer> cat3Points = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
				ArrayList<String> cat3Questions = new ArrayList<>(Arrays.asList("one3", "two3", "three3", "four3"));
				ArrayList<String> cat3Answers = new ArrayList<>(Arrays.asList("one3", "two3", "three3", "four3"));
				
				ArrayList<Integer> cat4Points = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
				ArrayList<String> cat4Questions = new ArrayList<>(Arrays.asList("one4", "two4", "three4", "four4"));
				ArrayList<String> cat4Answers = new ArrayList<>(Arrays.asList("one4", "two4", "three4", "four4"));
				
				int choice = 0;
				String choiceAnswers = "";
				
				int players = 0;
				String playerName = "";
				String[] nameList = new String[4];
				
				int score1 = 0;
				int score2 = 0;
				int score3 = 0;
				int score4 = 0;
				
				
				System.out.println("Welcome to Jeopardy!\nSelect one of the following options:\n\n1: Play Game\n2: Add Question\n3: Quit");
			
				
				int count = 0;
				
				while (choice != 3){
				
					choice = sc.nextInt();
				
					switch (choice){
				
					case 1: //play game
						
						//Determining the Daily Double
						int ddCat = (int)(Math.random() * ((4 - 1) + 1)); //determines which category the daily double is in
						
						int ddPoint = 1 + (int)(Math.random() * ((cat1Points.size() - 1) + 1)); //determines which point value is doubled
						
						switch (ddCat){
						
						case 1: //in the case that category 1 has the daily double
							
							for (int i = 0; i < cat1Points.size(); i++){ //goes through the category with daily double
								
								if ((ddPoint * 100) == cat1Points.get(i)){ //if the point value with the daily double is the current value being cycled through
									
									cat1Points.set(i, cat1Points.get(i) * 2);//sets the value as double
									
								}
								
							}
						
							break;
							
						case 2: //in the case that category 2 has the daily double
							
							for (int i = 0; i < cat2Points.size(); i++){ //goes through the category with daily double
								
								if ((ddPoint * 100) == cat2Points.get(i)){ //if the point value with the daily double is the current value being cycled through
									
									cat2Points.set(i, cat2Points.get(i) * 2);//sets the value as double
									
								}
								
							}
						
							break;
							
						case 3: //in the case that category 1 has the daily double
							
							for (int i = 0; i < cat3Points.size(); i++){ //goes through the category with daily double
								
								if ((ddPoint * 100) == cat3Points.get(i)){ //if the point value with the daily double is the current value being cycled through
									
									cat3Points.set(i, cat3Points.get(i) * 2);//sets the value as double
									
								}
								
							}
						
							break;
							
						case 4: //in the case that category 1 has the daily double
							
							for (int i = 0; i < cat4Points.size(); i++){ //goes through the category with daily double
								
								if ((ddPoint * 100) == cat4Points.get(i)){ //if the point value with the daily double is the current value being cycled through
									
									cat4Points.set(i, cat4Points.get(i) * 2);//sets the value as double
									
								}
								
							}
						
							break;
						}
						
						
						System.out.println("You have selected 'Play Game.'\nPlease enter number of players, maximum is 4.");//begins playing the game
						players = sc.nextInt();
						
						while (players != 1 && players != 2 && players != 3 && players != 4){
							System.out.println("Wrong, try again");
							players = sc.nextInt();
							
						}		
						
						sc.nextLine();
						for (int i = 0; i < players; i++){
							System.out.println("Please enter player "+(i+1)+"'s name");
							
							playerName = sc.nextLine();
							
							nameList[i] = playerName;
							
							
						}
						
						
						System.out.println("\nThe Daily Double is in category "+ddCat+" and is question "+ddPoint);//tells the player(s) which category & which question contains the Daily Double
						
						while (count < cat1Points.size() + cat2Points.size() + cat3Points.size() + cat4Points.size() - 1) {//Determines the maximum amount of turns, that being however many questions there are.
							
							for (int i = 0; i < players; i++){ //Begins the game proper & counts players' turns
								
								System.out.println("Current scores are:\n"+nameList[0]+": "+score1+"\n"+nameList[1]+": "+score2+"\n"+nameList[2]+": "+score3+"\n"+nameList[3]+": "+score4);
								
								System.out.println("______________________________________________________");
								System.out.println(categories);
								System.out.println("______________________________________________________");
								System.out.println("______________________________________________________");
								System.out.println("______________________________________________________");
								
								System.out.println(nameList[i]+"'s Turn");
								
								System.out.println("Please choose a category to select");
								System.out.println(categories);
								choice = sc.nextInt();
								sc.nextLine();
								
								
									
								while (choice != 1 && choice != 2 && choice != 3 && choice != 4){
									System.out.println("Wrong, try again");
									choice = sc.nextInt();
								}
									
								
								
								
								switch (choice){ //categories
						
								case 1: //cat1
									System.out.println("Please enter which point value you'd like to answer");
									System.out.println(cat1Points);
									choice = sc.nextInt();
									sc.nextLine();
									
					
									while (choice < 1 || choice > cat1Points.size()){//checks if input is right or wrong, if so it looks for a redo & keeps going until it gets a correct answer
										System.out.println("Wrong, try again");
										choice = sc.nextInt();
									}
									
									
									System.out.println("Please answer the question");
									System.out.println(cat1Questions.get(choice - 1));
									choiceAnswers = sc.nextLine();
									sc.nextLine();
									
									if (choiceAnswers.equals(cat1Answers.get(choice - 1))){//checks if answer is correct
										System.out.println("Correct!");//correct answer
										if (i == 0)
											score1 += cat1Points.get(choice - 1);
										if (i == 1)
											score2 += cat1Points.get(choice - 1);
										if (i == 2)
											score2 += cat1Points.get(choice - 1);
										if (i == 3)
											score2 += cat1Points.get(choice - 1);
									}else{
										System.out.println("Wrong!");//wrong answer
										if (i == 0)
											score1 -= cat1Points.get(choice - 1);
										if (i == 1)
											score2 -= cat1Points.get(choice - 1);
										if (i == 2)
											score2 -= cat1Points.get(choice - 1);
										if (i == 3)
											score2 -= cat1Points.get(choice - 1);
									}		
						
									count++;
										
									
									break;
											
									
								case 2: //cat2
									
									System.out.println("Please enter which point value you'd like to answer");
									System.out.println(cat2Points);
									choice = sc.nextInt();
									sc.nextLine();
									
									
									while (choice < 1 || choice > cat1Points.size()){//checks if input is right or wrong, if so it looks for a redo & keeps going until it gets a correct answer
										System.out.println("Wrong, try again");
										choice = sc.nextInt();
									}
									
									
									System.out.println("Please answer the question");
									System.out.println(cat2Questions.get(choice - 1));
									choiceAnswers = sc.nextLine();
									sc.nextLine();
									
									if (choiceAnswers.equals(cat2Answers.get(choice - 1))){
										System.out.println("Correct!");
										if (i == 0)
											score1 += cat2Points.get(choice - 1);
										if (i == 1)
											score2 += cat2Points.get(choice - 1);
										if (i == 2)
											score2 += cat2Points.get(choice - 1);
										if (i == 3)
											score2 += cat2Points.get(choice - 1);
									}else{
										System.out.println("Wrong!");
										if (i == 0)
											score1 -= cat2Points.get(choice - 1);
										if (i == 1)
											score2 -= cat2Points.get(choice - 1);
										if (i == 2)
											score2 -= cat2Points.get(choice - 1);
										if (i == 3)
											score2 -= cat2Points.get(choice - 1);
									}
										
											
										
									count++;
									
									
									break;
									
									
									
								case 3: //cat3
									
									System.out.println("Please enter which point value you'd like to answer");
									System.out.println(cat3Points);
									choice = sc.nextInt();
									sc.nextLine();
									
									
									while (choice < 1 || choice > cat1Points.size()){//checks if input is right or wrong, if so it looks for a redo & keeps going until it gets a correct answer
										System.out.println("Wrong, try again");
										choice = sc.nextInt();
									}
									
									
									System.out.println("Please answer the question");
									System.out.println(cat3Questions.get(choice - 1));
									choiceAnswers = sc.nextLine();
									sc.nextLine();
									
									if (choiceAnswers.equals(cat3Answers.get(choice - 1))){
										System.out.println("Correct!");
										if (i == 0)
											score1 += cat3Points.get(choice - 1);
										if (i == 1)
											score2 += cat3Points.get(choice - 1);
										if (i == 2)
											score2 += cat3Points.get(choice - 1);
										if (i == 3)
											score2 += cat3Points.get(choice - 1);
									}else{
										System.out.println("Wrong!");
										if (i == 0)
											score1 -= cat3Points.get(choice - 1);
										if (i == 1)
											score2 -= cat3Points.get(choice - 1);
										if (i == 2)
											score2 -= cat3Points.get(choice - 1);
										if (i == 3)
											score2 -= cat3Points.get(choice - 1);
									}		
											
												
										
									count++;
									
									
									
									break;
										
									
									
								case 4: //cat4
									
									System.out.println("Please enter which point value you'd like to answer");
									System.out.println(cat3Points);
									choice = sc.nextInt();
									sc.nextLine();
									
									
									while (choice < 1 || choice > cat1Points.size()){//checks if input is right or wrong, if so it looks for a redo & keeps going until it gets a correct answer
										System.out.println("Wrong, try again");
										choice = sc.nextInt();
									}
									
									
									System.out.println("Please answer the question");
									System.out.println(cat4Questions.get(choice - 1));
									choiceAnswers = sc.nextLine();
									sc.nextLine();
									
									if (choiceAnswers.equals(cat4Answers.get(choice - 1))){
										System.out.println("Correct!");
										if (i == 0)
											score1 += cat4Points.get(choice - 1);
										if (i == 1)
											score2 += cat4Points.get(choice - 1);
										if (i == 2)
											score2 += cat4Points.get(choice - 1);
										if (i == 3)
											score2 += cat4Points.get(choice - 1);
									}else{
										System.out.println("Wrong!");
										if (i == 0)
											score1 -= cat4Points.get(choice - 1);
										if (i == 1)
											score2 -= cat4Points.get(choice - 1);
										if (i == 2)
											score2 -= cat4Points.get(choice - 1);
										if (i == 3)
											score2 -= cat4Points.get(choice - 1);
									}	
												
										
									count++;
										
									
									break;
								
								
									}
								
								
								
														
							
								
							}
						
						
						
						
						}	
					
						
					case 2:
						System.out.println("You have selected 'Add Question'");
						break;
						
					case 3:
						System.out.println("Thanks for playing!");
						break;
					
					default:
						System.out.println("Wrong answer, try again");
						break;
				
					}
				
				}
				
				sc.close();
				
			}
		}

