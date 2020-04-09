/*
Andrew Tong
Mr. Ritter
March 8, 2019
MP3

This program is a choose your own adventure game where the user will input their choice of a binary option.
In certain fight scenes, a random number generator is used to determine if the user lives or dies.
This program used nested ifs, and the goal is to survive by the end of the game.
There are 15 possible endings, 2 of which definitely result in a win (not dying)
and 2 may result in a win depending on survival in fights from the Random Number Generator.
Possible solutions at end.
 */

package mp3;

import java.util.Scanner;
import java.util.Random;

public class Mp3 {

    public static void main(String[] args) {
     
    System.out.println("Welcome to the Tong Wars, where you join a gang.");
    System.out.println("In this game, YOUR actions will decide YOUR outcome.");
    System.out.println("Follow the onscreen instructions carefully. Please type your answer from the given options \n in parentheses with no punctuation/capitalization.");
    System.out.println("Be aware that there is a likelihood that you will die. Your goal is to live.");
    
    System.out.println("Alright, let's jump in! What is your name?");
    Scanner in=new Scanner(System.in);
    String name=in.nextLine();
        
    System.out.println("Hi, "+name+ "! The year is 1880. Your ship just docked in San Francisco from China.");//as per instructions , setting scene for user
    System.out.println("You come to America with zero dollars to your name, but a dream: a dream to join the Chee Kee Tong.");
    System.out.println("By the way, the tongs were Chinese-American gangs in the United States during that time.");
    System.out.println("Ming, who you had been writing to in China, finds you at the dock and welcomes you to the tong.");
    System.out.println("With the rest of the tong, you go to the Silver Palace Restaurant.");
    System.out.println("At the end of the dinner, Ming makes a toast and publicly asks you what will be your weapon of choice.");
    System.out.println("He asks you to choose between a dog-otherwise known as rifle or a puppy- known as a pistol.");
    System.out.println("Which do you choose? (dog or puppy) Please no punctuation/capitalization/spaces.");
    
    String gun=in.nextLine();
    if (gun.equals("dog"))//question 1
    {
        System.out.println("A solid choice, "+name+"! Ming tells you that your initiation event is to rob the prime Victorian jewel on Fifth Street.");
        System.out.println("When you break into the Fifth street vault, you notice that there is only one guard.");
        System.out.println("Do you shoot him to eliminate the one obstacle in the way, or remain quiet as planned?");
        System.out.println("Which do you choose? (shoot or quiet) Please no punctuation/capitalization/spaces.");
        String gunAction=in.nextLine();
        if (gunAction.equals("shoot"))//question 2
        {
            System.out.println(name+", your shooting causes a loud ruckus and causes sirens to sound.");
            System.out.println("You contemplate your choices as you know taking the jewel takes a long time.");
            System.out.println("You know that you can also run.");
            System.out.println("Which do you choose? (take or run) Please no punctuation/capitalization/spaces.");
            String jewelAction=in.nextLine();
            if (jewelAction.equals("take"))//question 3
            {
                System.out.println("As you figured, the police catch up to you as you take the jewel.");
                System.out.println("Surrounded by the police, you can either fight or surrender. There is a 1/3 chance of you living through random number.");
                System.out.println(name+", which do you choose? (fight or surrender) Please no punctuation/capitalization/spaces.");
                String police = in.nextLine();
                if (police.equals("fight"))//question 4
                {
                    Random random=new Random();//Random Number Generator for fights to make it more realistic
                    
                    int fightOdd = random.nextInt(3)+1; //Options are out of three for 1/3 probability to survive
                    if (fightOdd==1) {System.out.println("Congrats "+name+", you fought the police and survived. You escape and live in eternal glory!");}
                    //possible successful solution (not likely)
                    else {System.out.println("You fought valiantly, "+name+", but ultimately, there were just too many police. You die a cruel death. Game over.");}
                    //other two options death
                }
                
                else if (police.equals("surrender"))//question 4
                {
                    System.out.println(name+", the police catch and arrest you. Say goodbye to your career in the tongs!");
                    System.out.println("You are locked up for life. Game over.");
                }
            }
            
            else if (jewelAction.equals("run"))//question 3
            {
                System.out.println(name+", the tong finds out and they get mad at you.");
                System.out.println("They send you out on a second, more dangerous mission: to murder the mayor of San Francisco.");
                System.out.println("He has turned his back on the tong recently.");
                System.out.println("You recognize that this is an absurd mission but if you do not follow through you may be elimanted.");
                System.out.println("Do you agree to undergoe this mission (yes or no) No capitalization/puncation/spaces.");
                String mayorAction=in.nextLine();
                
                if (mayorAction.equals("yes"))//question 4
                {
                    System.out.println(name+", you embark on the mission to kill the mayor.");
                    System.out.println("Unfortunately, the mission is a facade for the tong to stab you in the back (literally). Game over.");
                    
                }
                
                else if (mayorAction.equals("no"))//question 4
                {
                    System.out.println("You reject a second chance from the tong.");
                    System.out.println("Ming personally pulls his puppy and kills you. Game over, "+name+".");
                }
                
                else
                {
                    System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
                }
                
                //this is an error message if user does not put either of the two strings. Continues throughout.
               
            }
            
            else
            {
                System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
            }
        }
        
        else if (gunAction.equals("quiet"))//question 2
        {
           System.out.println(name+", the guard decides to go on a lunch break. ");
           System.out.println("You sneak into the vault and take the jewel.");
           System.out.println("Do you split the jewel with your tong?");
           System.out.println("What is your choice? (yes or no) No capitalization/punctuation/spaces.");
           
           String jewelAction2= in.nextLine();
           if (jewelAction2.equals("yes"))//question 3
           {
               System.out.println(name+", the tong rewards you for your hardwork.");
               System.out.println("They want to put you on a second mission!");
               System.out.println("Do you accept? (yes or no) No capitalizations/punctuation/spaces.");
               
               String secondMission=in.nextLine();
               if (secondMission.equals("yes"))//question 4
               {
                   System.out.println(name+", you got greedy! You die on the next mission from crossfire. Game over.");
               }
               
               else if (secondMission.equals("no"))//question 4
               {
                   System.out.println("The tong doesn't punish you. You live the rest of your life rich. Congrats "+name+", you made it!");
                   //successful solution
               }
               
               else
               {
                   System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
               }
           }
           
           else if (jewelAction2.equals("no"))//question 3
           {
               System.out.println(name+", you manage to slip away with the entire jewel and live the rest of your life in the Bahamas. Congrats!");
               //successful solution
           }
           
           else
           {
               System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
           }
        }
        
        else
        {
            System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
        }
    }
    
    
    //end of first half (note to myself)
    else if (gun.equals("puppy"))//question 1
    {
        System.out.println("A great choice, "+name+"! Ming tells you that your initiation event is to protect \n the tong's gambling parlor from a police check.");
        System.out.println("You agree, obviously, but you don't think the police will come.");
        System.out.println("Well, they do. What will be your decision (run or protect)? No capitalization/punctuation/spaces.");
        
        String gamble=in.nextLine();
        if (gamble.equals("run"))//question 2
        {
            System.out.println(name+", the tong gets mad that you abandoned your post at your initiation.");
            System.out.println("However, they do give you a second chance, to protect their fishing dock from some unknown threat.");
            System.out.println("Something seems fishy to you. Do you proceed (yes or no)? No punctuation/capitalization/spaces.");
            
            String fish=in.nextLine();
            if (fish.equals("yes"))//question 3
            {
                System.out.println(name+", your suspicions were right. The tong wasn't going to give you a second chance.");
                System.out.println("They come by and shoot you. Game over.");
            }
            
            else if (fish.equals("no"))//question 3
            {
                System.out.println("Ming goes into a fury of 1000 winds.");
                System.out.println("He uses his puppy on you. You die. Game over "+name+".");
            }
            
            else
            {
                System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
            }
            
        }
        
        else if (gamble.equals("protect"))//question 2
        {
            System.out.println(name+", you are now entering a fight scene with the police. There is a 1/2 chance you escape or get arrested. ");
            Random random=new Random();//Random Number Generator for fights to make it more realistic
                    
            int fightOdd = random.nextInt(2)+1;//in order to have random option of 2
            if (fightOdd==1) //question 3
            {
                System.out.println("Congrats on surviving the fight! However, the SF police is now after you and the tong.");
                System.out.println("Do you turn yourself in or remain loyal to Chee Kee?");
                System.out.println("What do you choose (turn or loyal)? No punctuation/capitalization/spaces.");
                
                String loyalty=in.nextLine();
                
                if (loyalty.equals("turn"))//question 4
                {
                    System.out.println(name+", you submit yourself to the police. You do get a reduced sentence of 2 years but you put many of your tong members in jail.");
                    System.out.println("The tong takes revenge and they kill you once you leave prison. Start over.");
                }
                
                else if (loyalty.equals("loyal"))//question 4
                {
                    System.out.println(name+", you decide to stay with Ming and the Chee Kee Tong.");
                    System.out.println("Because of police surveillance, the tong has to move to a new city: Oakland.");
                    System.out.println("There, you and your tong meet the Hip Sing Tong.");
                    System.out.println("They are in the same territory? Do you want to fight them or share their territory through talks?");
                    System.out.println("What is your choice (fight or talk)? No capitalziation/punctuation/spaces.");
                    
                    String rival=in.nextLine();
                    
                    if (rival.equals("fight"))//question 5
                    {
                        System.out.println(name+", the Hip Sing Tong overwhelms the Chee Kee Tong and you and your entire tong get massacred. Game over.");
                        
                    }
                    
                    else if (rival.equals("talk"))//question 5
                    {
                        System.out.println("The talks work. You, your tong, and the Hip Sing Tong prosper together for the decades to come.");
                        System.out.println("Congratulations on the win, "+name+"!");//possible solution
                    }
                    
                    else
                    {
                        System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
                    }
                   
                }
                
                else
                {
                    System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
                }
            }
            
            
            else //question 3
            
            {
                System.out.println(name+", you get arrested.");
                System.out.println("Disappointed in your initiation, do you try to flee or stay arrested?");
                System.out.println("What is your choice (flee or stay)?");
                
                String policeEscape=in.nextLine();
                
                if (policeEscape.equals("flee"))//question 4
                {
                    System.out.println("Nice try mister. The police anticipate this attempt and kill you with one shot. Game over.");
                    
                }
                
                else if (policeEscape.equals("stay"))//question 4
                {
                    System.out.println("Way to follow the rules. To reward your actions, you get 99 years in prison. (This is sarcasm. Game over.)");
                }
                
                else
                {
                    System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
                }
                
            }    
        }
        
        else
        {
            System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
        }
        
    }
    
    else
    {
        System.out.println("You did not enter your input in the correct format. Please restart and read the instructions this time.");
    }

     
    System.out.println(name+", thank you for playing Tong Wars! Please play again!");
    }

}
//Solution paths:
//1) dog->shoot->take>fight (1/3 chance)
//2) dog->quiet->yes->no
//3) dog->quiet->no
//4)puppy->protect->win fight (1/2 chance)->loyal->talk