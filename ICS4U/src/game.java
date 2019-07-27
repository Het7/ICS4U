//Name: Het Parikh
//Date: July 22, 2019
//Description: This is a text-based game where the user can play from either the enemy perspective or the "good-guy"
//				perspective. THe enemy perspective is taking on the roll of landing on planet earth and bringing
//				back as many humans as possible to Arcadia, a city that has lost hope. The "good guy" perspective is
//				defending from an enemy that is trying to kill humans.
import java.util.*;
import java.text.*;

public class game
{
	public static void main (String args[]) {
		new game ();
	}

	// The first string of text the user will see as this is the name of the game 
	public game () {
		date1 ();
		printSlow ("\t\t\t************ Air of Elysium: The Wars of Arcadia ************\n");
		game1 ();
	}

	// Formatting purposes - makes the opening screen look aesthetically pleasing. Prints dots to seperate the 
	// title of the game and then instructions.



	//These print statements ask the user for their name and ultimately create suspense for the game. At the end, it 
	// asks the user which type of character they want to play with, which will decide from which perspective they 
	// will be playing the game from. 

	public void game1 ()
	{
		String name = IBIO.inputString ("What is your name? ");
		System.out.println ("\nHello " + name + ",\n\nLong ago, in the city of Arcadia hope was lost.\nYou must change that. This Journey will change your life.");
		char character = IBIO.inputChar ("To play you must be one of the following characters,\na beast, a survivor. Type \"b\" for beast and type \"s\" for survivor: ");
		while (!isValid3 (character))
		{
			System.out.println ("\nError. Try Again.\n");
			character = IBIO.inputChar ("To play you must be one of the following characters,\nan beast, a survivor. Type \"b\" for beast and type \"s\" for survivor: ");
		}


		// User has inputted 'b' meaning they want to play from the beast's perspective
		if (character == 'b')
		{
			beastpick (name);
		}


		//	User has inputted 's' meaning they want to play from the beast's perspective
		if (character == 's')
		{
			picksurvivor ();

		}
	}

	// Instructions explaining the user their mission as the beast character. 
	public void beastpick (String name)
	{
		printSlow ("\n\t\tB E A S T");
		System.out.println ("\n\tGreetings, fellow beast. You have just spotted earth.");
		System.out.println ("You will be addressed as Command Sargeant Major Squill, and you are now landing on Earth.\nYour mission is to return safely to your home planet. There are many humans that can be found here." + "\nTheir skin serve as an excellent source of fuel, and your task is to collect them.");
		int alchoice = IBIO.inputInt ("Do you accept this mission? If not we will use your skin for our fuel.\n\nType \"1\" to accept and type \"2\" for sacrifice yourself. ");

		// The while loop determines the situations the user will need to go through. Any time there is an invalid input
		// the user will be asked to make an input again. 
		while (!isValid (alchoice))
		{
			System.out.println ("\nError. Try Again.\n");
			alchoice = IBIO.inputInt ("Do you accept this mission? If not we will use your skin for our fuel.\nType \"1\" to accept and type \"2\" for sacrifice yourself. ");
		}
		// Situations user will encounter if input is '1' - picking the beast character. 
		// This is accomplished through an if statement, ensuring the correct input is made
		// by the user.
		if (alchoice == 1)
		{
			System.out.println ("\n\tGood Choice, Major! Now go and find some humans. You walk around the fields you have crashed in. \nYou see a house nearby on a farm. \nThe owner of farm comes out with a rifle.");
			int alchoice1 = IBIO.inputInt ("If you want to kill the farmer, press \"1\", if not type \"2\": ");
			while (!isValid (alchoice1))
			{
				System.out.println ("\nError. Try Again.\n");
				alchoice1 = IBIO.inputInt ("If you want to kill the farmer, press \"1\", if not type \"2\": ");
			}

			// Situations user will encounter if input is 'w' - picking the beast character. 
			// This is accomplished through an if statement, ensuring the correct input is made
			// by the user. 

			if (alchoice1 == 2)
			{
				System.out.println ("You have been shot by the farmer 3 times, in the head.");
				death ();
			}
			else
			{
				System.out.println ("\nYou use your claws to kill the farmer. You open the door and see the family eating together.\n" + "\nYou immediately attack them as they scream in agony.");
				System.out.println ("Your team member calls out “I found a boy jumping out the window!”\n" + ",\n You find the boy unconscious.\n" + " You push him to kill his half-dead sister and mother.\n");
				System.out.println ("The boy faints. You must decide whether to use his body as fuel to return to your planet, or put him in jail.\n");
				int alchoice2 = IBIO.inputInt ("Type '1' to send him to jail or type '2' to use him as fuel. ");
				while (!isValid (alchoice2))
				{
					System.out.println ("\nError. Try Again.\n");
					alchoice2 = IBIO.inputInt ("Type '1' to send him to jail or type '2' to use him as fuel. ");
				}

				// If user inputs '1' the boy is sent to jail. Accomplished through an if 
				// statement, thus, ensuring there is no invalid input. 
				if (alchoice2 == 1)
				{
					System.out.println ("You send him to this jail.\n");
					System.out.println ("You are the captain of the ship, and are trying to get the ship to lift off.\nYou have to fix the operating system, but you are not an engineer.\nThis part of the game depends on luck. There are 5 different options that can happen.\nIf fixing the machine is not one of them, you will not win.");
					String enter = IBIO.inputString ("\nPress Enter to see what your luck holds for you. ");
					//At this stage in the game, the user hits 'enter' and any one of the cases can 
					// be outputted based on luck. This is accomplished by assigning a value to each 
					// case and using the Math.random method. 
					int engine = (int) (Math.random () * 5);
					String enginerepair;
					switch (engine)
					{
					case 1:
						enginerepair = "\nThe engine broke.";
						break;
					case 2:
						enginerepair = "\nThe engine broke.";
						break;
					case 3:
						enginerepair = "\nYou never fixed it.";
						break;
					case 4:
						enginerepair = "\nThe boy, broke out from jail and killed you.";
						break;
					default:
						enginerepair = "\nYou fixed it!!";
						break;
					}
					System.out.println (enginerepair);
					if ((enginerepair == "\nThe engine broke.") || (enginerepair == "\nYou never fixed it."))
					{
						System.out.println ("\nYou are stuck on Earth, and you must interrogate the boy.");
						System.out.println ("You ask the boy if he knows where you can get an engine.\nThe frightened boy says, \"I have two cars, but you let me go free if I give it to you.\"\nAs a solider you promise him that you will let him go. You grab the engines and apply it to the ship.\nAt this point you can break the promise or keep it, either way, you win.\n\t");
						int alchoicewin = IBIO.inputInt ("Type '1' to keep promise and type anything else to break it. ");

						//CHANGE FROM LETTING BOY GO FREE AND WINNING TO LETTING HIM GO AND DYING.
						if (alchoicewin == 1)
						{
							System.out.println ("\n\tYou let the boy go free.\nThat boy immediately called the FBI.");
							System.out.println ("In less than 20 minutes, you had 12 tanks and more than 6000 soliders surrounding your ship.");
							System.out.println ("\nAt this point you can't do much.");
							int deathchoice = IBIO.inputInt ("You can go outside and try to fight back (Press 1) or continue to do what you were doing. (Press 2). ");
							while (!isValid (deathchoice))
							{
								System.out.println ("\nError. Try Again.\n");
								deathchoice = IBIO.inputInt ("You can go outside and try to fight back (Press 1) or continue to do what you were doing. (Press 2). ");
							}
							if (deathchoice == 1)
							{
								System.out.println ("You are shot by a tank, and 10 soliders surround your dead body.");
								death ();
							}
							if (deathchoice != 1)
							{
								System.out.println ("You fixed them, and took off to your home");
								System.out.println ("A tank has shot your ship's wing. Your ship is strong, so it continues to fly.");
								beastob ();
							}
						}
						// Else the boy is killed for extra fuel. 
						else
						{
							System.out.println ("\nYou kill the boy for extra fuel, and you arrive at your home planet.");
							win ();
						}

					}
					// Engine has been fixed 
					if ((enginerepair == "\nYou fixed it!!"))
					{
						System.out.println ("\n" + name + ", you are one lucky person.");
						win ();
					}
					if (enginerepair == "\nThe boy, broke out from jail and killed you.")
					{
						death ();
					}
				}

				// User chooses the easy way to win the game by not sending him to jail.
				else if (alchoice2 == 2)

				{
					System.out.println ("\nYou took the easy way of winning. If you sent the boy to jail you would have had more fun.\nAnyways now you take off while burning the boy.");
					beastmath ();
				}
			}
		}
		// If user inputs '2', the user is killed by their own army and friend. 
		else if (alchoice == 2)
		{
			System.out.println ("Your own army and friend kill you for their survival.");
			death ();
		}
	}

	// Following is the method executed if the user chooses to play the game 
	// from the survivor perspective. Accomplished through if statements. If user 
	// picks this, instructions for the survivor character will be printed. 
	public void picksurvivor ()
	{
		printSlow ("\n\t\tS U R V I V O R");
		System.out.println ("\nBeasts have just landed on earth, while you have been sleeping.\nThey abducted your friends and family, and you are the only survivor.\nYou must get them back.");
		System.out.println ("You are right now in your bedroom hiding under the covers and the\nbeasts are walking around your house looking for more humans.\nThe windows is open. but it is on the other side of the room.");
		//First Interactive Story Part made here
		int a = IBIO.inputInt ("If you would like to proceed to the windows type \"1\" if you want to stay type \"2\": ");
		while (!isValid (a))
		{
			System.out.println ("\nError. Try Again.");
			a = IBIO.inputInt ("\nIf you would like to proceed to the windows type \"1\" if you want to stay type \"2\": ");
		}


		//GameOver! #1
		if (a == 2)
		{
			stayinroom ();
		}


		//Continue Survivor
		else if (a == 1)
		{
			System.out.println ("\n\nYou quickly jump out of the window. ");
			System.out.println ("You also fall and become unconcious for 1 hour. \nYou have forgotten that the beasts are here. \nThe beast comes toward you takes you to your parents.");
			System.out.println ("Since you have no memory of who and what your parents look like, the beasts force you into killing them.\nYou kill them.");
			System.out.println ("\nYou see your dead family's body being used as fuel to operate the ship.");
			int surchoice1 = IBIO.inputInt ("\n\tYou can do three things at this point.\nYou can kill yourself from shock (Press 1).\nYou can stay in jail (Press 2).\nYou see the jail door is weak so you break it with a stick your found in the jail (Press 3). ");
			while (!isValid3 (surchoice1))
			{
				System.out.println ("\nError. Try Again.\n");
				surchoice1 = IBIO.inputInt ("\n\tYou can do three things at this point.\nYou can kill yourself from shock (Press 1).\nYou can stay in jail (Press 2).\nYou see the jail door is weak so you break it with a stick your found in the jail (Press 3). ");
			}
			System.out.println ("");
			//Continue Survivor from Jail
			//Game Over 2
			if (surchoice1 == 1)
			{
				System.out.println ("You are dead.");
				beast ();
			}
			//Game Over 3
			if (surchoice1 == 2)
			{
				System.out.println ("You eventually starve to death. :(");
				beast ();
			}
			if (surchoice1 == 3)
				System.out.println ("You sneak out of jail. You see your dad being burned in front of you because the ship needed fuel to lift off.\nHuman skin and brain supply a lot of energy for the engines. \nYou continue walking to an exit across the room. The control room for the ship is on the right side of the room, while you are going to left side. \nYou open the door and you see 2 different paths.");
			if (surchoice1 != 1 && surchoice1 != 2)
			{
				sneakjail ();
			}
		}
	}


	public void stayinroom ()
	{
		System.out.println ("The beasts have found you! You have died.");
		beast ();
	}


	public void sneakjail ()
	{
		/*TWO PATHS
		       Firstpathwillleadtoanotherending
		       Secondpathwillbeanotherending.*/
		//Path 1 first ending.


		//Path 2 second ending.

		int surchoice2 = IBIO.inputInt ("\t\nTo take path #1 press 1. To take path #2 press 2. ");
		while (!isValid (surchoice2))
		{
			System.out.println ("\nError. Try Again.");
			surchoice2 = IBIO.inputInt ("\t\nTo take path #1 press 1. To take path #2 press any number. ");
		}


		if (surchoice2 == 1)
		{
			System.out.println ("\n\tYou continue to walk");
			System.out.println ("While you are walking you see a red beaming light ahead. \nYou have started to run. \n As you enter the big red room, you see nothing but red fog and big pillars. \nYour see a huge red monster above you. You hide behind the pillars. The monster looked like this:");
			monster ();
			System.out.print ("\nYou have");
			printSlow2 ("   N O     C H O I C E   ");
			System.out.println ("but to fight this Beast. All you have is you pocketknife. You must remember the weakness the beasts had.");
			System.out.println ("\nYour health: 60%");
			System.out.println ("Monster's Health: 120%");
			fight ();
		}


		else if (surchoice2 == 2)
		{
			System.out.println ("\n\tYou continue to walk. After 10 minutes of walking you see light at the end of the tunnel. Remember you are still on the ship.\n ");
			System.out.println ("\nYou quickly make a run as the jail door was open.\nYou run through the door, and enter a big red room. It is very foggy.\nYou see a monster.");
			monster ();
			System.out.print ("\nYou have");
			printSlow2 ("   N O     C H O I C E   ");
			System.out.println ("but to fight this Beast. All you have is you pocketknife. You must remember the weakness the beasts had.");
			System.out.println ("\nYour health: 60%");
			System.out.println ("Monster's Health: 120%");
			fight ();
		}
	}


	//Alien has killed you, thus printing this image made out of characters to indicate
	// the game has ended. 
	public void beast ()
	{



		System.out.println ("       \n                        :#####@@#, ");
		System.out.println ("                            ##+++''+++'+'+#;.");
		System.out.println ("                         .@+++'''''''''''''''+#,");
		System.out.println ("                       ,@+++'''''''''';;;;;''''+#` ");
		System.out.println ("                     '@##+''''''';'';;;;:;;;;''+++#   ");
		System.out.println ("                   @####++'''';;;;;;;;;::::::;;'+++#     ");
		System.out.println ("                 #######+++''';;;;;:::;::::::::''+++#       ");
		System.out.println ("               ,####+++++++'''';:::::::;:::::::;;'''+#         ");
		System.out.println ("              #####++++++++'''';;;:::::;:::::::;;;;''+;           ");
		System.out.println ("             #####+++''''++''';;;;;:::;;::::::;;;;;;''+            ");
		System.out.println ("            .#####+++''''''''';;;;;::::::::,::';;;;;'''#           ");
		System.out.println ("            @####++++'''''';;';;;;;:::::::,,::;;;;';;'''.          ");
		System.out.println ("            @####++'''''';;;;;;;;;;;:::::,,,:;;;;''';'''#          ");
		System.out.println ("           +@#@##++++''''';;;;;;:;;;::::::,::;;;;;;;;;;'+,         ");
		System.out.println ("           +@@@@@#++'''''';;;;;::::;::::::,:;::::;;;;;;'+#         ");
		System.out.println ("           .@@@@@#+++'''';;;;;;:::::::::::::::::::;;;;'''+         ");
		System.out.println ("            @@@@@##++'''';;;:;:;:::::::::::;:::::;;;;''''+;        ");
		System.out.println ("           ,####@@###++'';;;;:::::::,::::::;:::;:;;'''''++@        ");
		System.out.println ("            @###@@@###++'';;;:::::::,:::::::::;;:;;;'''+++#        ");
		System.out.println ("            @####@@@#######+';;:::::::::::::::::::;;''+++++        ");
		System.out.println ("            ,@@##@#@@###@##++#++;;:::::::,::::::::;;;''''++`       ");
		System.out.println ("             @##@###@######@##'+##;;;:::,::::::::::;;;''+++        ");
		System.out.println ("             @##@@##@###@####@#+'#+''';::::::::::::::;'+'++        ");
		System.out.println ("             :@@@@@@@#'#''+#####@#++''';;;;;;;;;;;;;;;''++#        ");
		System.out.println ("              @#@###@#':';@@#+'+#+++'''''''''++###+++++'+#         ");
		System.out.println ("              ##@@@####'''#@+##+#@++#;';++++#+;'+++++'+++;         ");
		System.out.println ("               @@@@@@#++'++#+@ :##@#@:;''##+#@@@#####+##;          ");
		System.out.println ("               `##@@@@#+''++@ #++##@#;,:++#@###@@@#####@           ");
		System.out.println ("                +#@@@@#+'''#;+#####+;;';+@@@###@@@+;'#@            ");
		System.out.println ("                 '##@@##+;;'+++++'''++';:@@@' '#@@#'+#             ");
		System.out.println ("                  ##@@##+';;'++++#####++#;+@###@#+''+;             ");
		System.out.println ("                   #@@@#+';;;;'+'++##+''###''+++''+++              ");
		System.out.println ("                    `@@#+';::::;';'+#';'#########+';#              ");
		System.out.println ("                      #@+';::::;;'+''::::##+++#++;:':              ");
		System.out.println ("                        #+;::,::;;+';:::#;#;;;;;;;'#               ");
		System.out.println ("                        @+';'';;;';;:;;::'+;:::;''';               ");
		System.out.println ("                         #++'';;;;:::::::;';;::;''#                ");
		System.out.println ("                         @#++'';;::'::::;:;;'''''+                 ");
		System.out.println ("                         #@+++'';;;;:;::;;;;'++++,                 ");
		System.out.println ("                         ,@@+++';;'';:::'';''+++:                  ");
		System.out.println ("                         @@@+#+;'+';;:;'+;''+#                     ");
		System.out.println ("                          @@###+'+';:::;++''#                      ");
		System.out.println ("                          #@###+;;@#'::;'++#                       ");
		System.out.println ("                           @##++''';:'+@@'+'                       ");
		System.out.println ("                           @###++''#+::'#'#                        ");
		System.out.println ("                           ;##@#+'';::;+#++                        ");
		System.out.println ("                           `@##+#+;:::;;+`                         ");
		System.out.println ("                            @##+#@+:::;#                           ");
		System.out.println ("                            @@#++#+@#'+                            ");
		System.out.println ("                            @##++##                                ");
		System.out.println ("                            ###'##@                                ");
		System.out.println ("                           ,#+#;'##                                ");
		System.out.println ("                           ##++:;++                                ");
		System.out.println ("                           @+#+::'''                               ");
		System.out.println ("                          ,#'+'::;:#                               ");
		System.out.println ("                          ##'+;:;:'##                              ");
		System.out.println ("                         @#+;+;:;;+++'                             ");
		System.out.println ("                        @+#+'+;:;;+;++'                            ");
		System.out.println ("                       @##+#+''::;+;;++.                           ");
		System.out.println ("                      #####+'++:;;;'''+#                           ");
		System.out.println ("                 ,;#@@#####++;#:';'''+#+#@@',`                     ");
		System.out.println ("            `#@#########++#++'+''++##+'++######@@:                 ");
		System.out.println ("          +@#############+++#+#+'###++#++##########@               ");
		System.out.println ("        #@#########+###++#++#++'+++++''+##++++++++###@.            ");
		System.out.println ("   .'@@@####++++++'++++##++++#+++''';'++'++''''''''++###@'.  \n      ");
		System.out.println ("Game Over! :(\n");
		playagain ();

	}

	// Printed when the game has ended. Image of a skull indicating the game has ended. 
	public void death ()
	{
		System.out.println ("\n                 uuuuuuu");
		System.out.println ("               uu$$$$$$$$$$$uu");
		System.out.println ("            uu$$$$$$$$$$$$$$$$$uu");
		System.out.println ("           u$$$$$$$$$$$$$$$$$$$$$u");
		System.out.println ("          u$$$$$$$$$$$$$$$$$$$$$$$u");
		System.out.println ("         u$$$$$$$$$$$$$$$$$$$$$$$$$u");
		System.out.println ("         u$$$$$$$$$$$$$$$$$$$$$$$$$u");
		System.out.println ("         u$$$$$$\"   \"$$$\"   \"$$$$$$u");
		System.out.println ("        \"$$$$\"      u$u       $$$$\"");
		System.out.println ("          $$$u       u$u       u$$$");
		System.out.println ("          $$$u      u$$$u      u$$$");
		System.out.println ("           \"$$$$uu$$$   $$$uu$$$$\"");
		System.out.println ("            \"$$$$$$$\"   \"$$$$$$$\"");
		System.out.println ("              u$$$$$$$u$$$$$$$u");
		System.out.println ("               u$\"$\"$\"$\"$\"$\"$u");
		System.out.println ("    uuu        $$u$ $ $ $ $u$$       uuu");
		System.out.println ("   u$$$$        $$$$$u$u$u$$$       u$$$$");
		System.out.println ("    $$$$$uu      \"$$$$$$$$$\"     uu$$$$$$");
		System.out.println ("  u$$$$$$$$$$$uu    \"\"\"\"\"    uuuu$$$$$$$$$$");
		System.out.println ("  $$$$\"\"\"$$$$$$$$$$uuu   uu$$$$$$$$$\"\"\"$$$\"");
		System.out.println ("   \"\"\"      \"\"$$$$$$$$$$$uu \"\"$\"\"\"");
		System.out.println ("             uuuu \"\"$$$$$$$$$$uuu");
		System.out.println ("    u$$$uuu$$$$$$$$$uu \"\"$$$$$$$$$$$uuu$$$");
		System.out.println ("    $$$$$$$$$$\"\"\"\"           \"\"$$$$$$$$$$$\"");
		System.out.println ("    \"$$$$$\"                      \"\"$$$$\"\"");
		System.out.println ("      $$$\"                         $$$$\"\n");
		System.out.println ("\nYou Died");
		playagain ();
	}


	public boolean isValid (int a)
	{

		if (a == 1 || a == 2)
			return true;
		else
			return false;

	}


	public boolean isValid3 (char a)
	{

		if (a == 'b' || a == 's')
			return true;
		else
			return false;
	}


	public boolean isValid3 (int a)
	{

		if ((a == 1 || a == 2) || (a == 3))
			return true;
		else
			return false;
	}


	// This method would be called if the user wins, thus printing this image. 
	public String win ()
	{
		System.out.println ("\ndP    dP                      dP   dP   dP  oo    ");
		System.out.println ("Y8.  .8P                      88   88   88        ");
		System.out.println (" Y8aa8P  .d8888b. dP    dP    88  .8P  .8P  dP 88d888b. ");
		System.out.println ("   88    88'  `88 88    88    88  d8'  d8'  88 88'  `88 ");
		System.out.println ("   88    88.  .88 88.  .88    88.d8P8.d8P   88 88    88 ");
		System.out.println ("   dP    `88888P' `88888P'    8888' Y88'    dP dP    dP ");
		System.out.println ("\n \n ");
		playagain ();

		return "";
	}


	public void playagain ()
	{
		int a = IBIO.inputInt ("Do you want to play again? (1 = yes) (2 = no) : ");
		while (!isValid (a))
		{
			System.out.println ("\nError. Try Again.\n");
			a = IBIO.inputInt ("Do you want to play again? (1 = yes) (2 = no) : ");
		}

		if (a == 1)
		{
			System.out.println ("");
			game1 ();
		}


		else
		{

			System.out.println ("\nBye!");
		}
	}

	//first fight monster
	public void monster ()
	{
		System.out.println ("\n######################~~..'|.##############.|`..~~#######################");
		System.out.println ("##############~./`.~~./' ./ ################ \\. `\\. ~~.`\\.~##############");
		System.out.println ("############~.' `.`-'   /   ~#############~ .  \\   `-'.'  `.~############");
		System.out.println ("##########~.'    |     |  .'\\ ~##########~ /`.  |     |     `.~##########");
		System.out.println ("########~.'      |     |  |`.`._ ~####~ _.'.'|  |     |       `.~########");
		System.out.println ("######~.'        `.    |  `..`._|\\.--./|_.'..'  |    .'         `.~######");
		System.out.println ("####~.'            \\   | #.`.`._`.'--`.'_.'.'.# |   /             `.~####");
		System.out.println ("##~.'       ......  \\  | ###.`~'(o\\||/o)`~'.### |  /  ......        `.~##");
		System.out.println ("~.`.......'~      `. \\  \\~####  |\\_  _/|  ####~/  / .'      ~`........'.~");
		System.out.println (";.'                 \\ .----.__.'`(n||n)'`.__.----. /                  `; ");
		System.out.println ("`.                  .'    .'   `. \\`'/ .'   `.    `.                  .' ");
		System.out.println ("#:               ..':      :    '. ~~ .`    :      :`..               :# ");
		System.out.println ("#:             .'   :     .'     .'  `.     `.     :   `.             :# ");
		System.out.println ("#:           .'    .`   .'       . || .       `.   '.    `.           :# ");
		System.out.println ("#:         .'    .' :       ....'      `....       : `.    `.         :# ");
		System.out.println ("#:       .'    .' ) )        (      )     (      (    )`.    `.       :# ");
		System.out.println ("#:     ..'    .  ( ((   )  ) )) (  ((  (  ))  )  ))  ((  `.   `..     :# ");
		System.out.println ("#:  ..'      .'# ) ) ) (( ( ( (  ) ) ) ))( ( (( ( (  ) ) #`.     `..  :# ");
		System.out.println ("#;.'        .'##|((  ( ) ) ) ) )( (  (( ( ) )) ) ) )( (||##`.       `.:# ");
		System.out.println ("#`.        .'###|\\__  )( (( ( ( )  )  )) )  (  (( ( )_)/|###`.       .'# ");
		System.out.println ("##.`       '#####\\__~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~__/#####`      '.## ");
		System.out.println ("###        #######  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  #######       ### \n");
		System.out.println ("Random Joke of the Day: The Monster likes to eat " + Math.PI + "\n");
	}

	// This method would be called if the user wins their fight.
	public void winfight ()
	{
		System.out.println ("\n\tCongratulations! You have won the fight. You approach the beast, and pick up your knives. ");
		System.out.println ("You continue walking and all of a sudden, you faint, and dream of yourself in math class.\nWhen you were 8, you played a math game.\nYou will now play this game again.");
		mathgame ();
	}

	// If user picks the correct number the game moves on. It determines the user 
	// has picked the correct number by using the Math.random method, picking a number 
	// between 1 and 200. 
	public void mathgame ()
	{
		int num = (int) (Math.random () * 200) + 1;
		guess (num);
	}


	public void guess (int num)
	{
		System.out.println ("\nPick a number from 1-200");
		int i = 1;
		int guessnum = IBIO.inputInt ("\nGuess #" + i + " (Type (-1) to exit): ");

		while (guessnum != num)
		{
			if (guessnum > num)
				System.out.println ("\tThat is too high.");
			else
				System.out.println ("\tThat is too low.");

			i++;
			guessnum = IBIO.inputInt ("Guess #" + i + ": ");
		}


		System.out.println ("\nYou got it!\nIt only took " + i + " guesses. Good job.");
		aftermath ();
	}


	//math quiz (easy medium and hard)
	public void aftermath ()
	{
		System.out.println ("\n\tYou look around, and everything seems blurry. You begin to walk forward.\nYou just fall back down. You have another dream of math problems. This time you can choose,\nbetween easy, medium or hard. Hard has one question. Easy has alot of questions and Medium has a fair amount.");
		int mathexam = IBIO.inputInt ("\nChoose Easy (1), Medium (2), Hard (3): ");
		while (!isValid3 (mathexam))
		{
			System.out.println ("Error. Try Again.");
			aftermath ();
		}


		if (mathexam == 1)
		{
			matheasy ();
		}



		if (mathexam == 2)
		{
			mathmedium ();
		}


		if (mathexam == 3)
		{
			mathhard ();
		}
	}


	public void matheasy ()
	{
		System.out.println ("\nEasy. Here are 20 Questions.\n");
		for (int i = 1 ; i <= 20 ; i++)
		{
			int num = (int) (Math.random () * 1) + 1;
			int num1 = (int) (Math.random () * 100) + 1;
			int ans = num1 + num;
			int answer = IBIO.inputInt (i + ". " + num + " + " + num1 + " = ");
			if (answer != ans)
			{
				System.out.println ("\nWrong. Do all the math again.\n");
				matheasy ();
			}
			else if (answer == ans)

				System.out.println ("\nGood!\n");

		}


		aftermath1 ();
	}


	public void mathhard ()
	{
		{
			System.out.println ("\nHard. is 1 Question. Round up.\n");

			int num = (int) (Math.random () * 30) + 1;
			int num1 = (int) (Math.random () * 5) + 1;
			double ans1 = Math.pow (num, num1);
			double ans = (round (ans1, 0));
			double answer = IBIO.inputInt ("1. " + num + "^" + num1 + " = ");
			if (answer != ans)
			{
				System.out.println ("\nWrong. The answer is " + ans + ". Do all the math again.\n");
				mathhard ();
			}
			else if (answer == ans)

				System.out.println ("\nGood!\n");
		}


		aftermath1 ();

	}


	public void rounding ()
	{
		double x = 5;
		double y = 9;
		double percent = x / y * 100;
		double answer = (round (percent, 0));
		System.out.println (answer);
	}


	public double round (double num, int digit)
	{
		double num2 = num * Math.pow (10, digit);
		double num3 = (num2 - ((int) num2)) * 10;
		num2 = ((int) num2);
		if (num3 >= 5)
			num2++;
		return num2 /= Math.pow (10, digit);
	}


	public void mathmedium ()
	{
		System.out.println ("\nMedium. Here are 10 Questions. If the answer is decimals, round down.\n");
		for (int i = 1 ; i <= 10 ; i++)
		{
			int num = (int) (Math.random () * 2) + 1;
			int num1 = (int) (Math.random () * 1000) + 1;
			int ans = num1 / num;
			int answer = IBIO.inputInt (i + ". " + num1 + "/" + num + " = ");
			if (answer != ans)
			{
				System.out.println ("\nWrong. Do all the math again.\n");
				mathmedium ();
			}
			else if (answer == ans)
				System.out.println ("\nGood!\n");

		}


		aftermath1 ();

	}




	public void printSlow (String s)
	{
		for (int i = 0 ; i < s.length () ; i++)
		{
			System.out.print ("" + s.charAt (i));
			//sleep for a bit after printing a letter
			try
			{
				Thread.sleep (80);
			}
			catch (InterruptedException m)
			{
				;
			}
		}


		System.out.println ();
	}


	public void printSlow2 (String s)
	{
		for (int i = 0 ; i < s.length () ; i++)
		{
			System.out.print ("" + s.charAt (i));
			//sleep for a bit after printing a letter
			try
			{
				Thread.sleep (300);
			}
			catch (InterruptedException m)
			{
				;
			}
		}
	}


	//First Fight. Certain statements are printed if certain inputs are made by the user. 
	// The statements that are printed are determined based on if statements, thus 
	// if the user makes certain inputs, certain print statements will be made.  
	public void fight ()
	{
		int healthm = 120;
		int healths = 60;
		while (healthm > 0 && healths > 0)
		{
			int a = IBIO.inputInt ("\n1. You can throw your knife at the beast.\n2. You can hide yourself from monster's attack.\nPick a number. ");
			System.out.println ("");
			while (!isValid (a))
			{
				System.out.println ("Error. Try Again.");
				a = IBIO.inputInt ("\n1. You can throw your knife at the beast.\n2. You can hide yourself from monster's attack.\nPick a number. ");
			}
			if (a == 1)
			{
				healthm -= 15;
				System.out.println ("\n\tThe monster's health is now: " + healthm);
				System.out.println ("Since you weren't hiding the monster found you and did some damage to you as well.");
				healths -= 20;
				System.out.println ("Your health is now " + healths);
			}
			else if (a == 2)
			{
				healthm += 0;
				int num = (int) (Math.random () * 5) + 1;
				if (num == 1)
				{
					System.out.println ("\n\tThe monster finds you and cuts your health in half. ");
					healths = healths / 2;
					System.out.println ("You health percentage is: " + healths);
				}
				else if (num == 2)

				{
					System.out.println ("\n\tYou are safe, the monster didn't find you.");
					System.out.println ("Your Health: " + healths + "\nMonster's Health: " + healthm);
				}
				else if (num == 3)

				{
					System.out.println ("\n\tThe monster uses his claws and breaks down the pillars, in order to find you.");
					healths -= 10;
					System.out.println ("You are hit by a pillar and your health is now: " + healths);
				}
				else if (num == 4)

				{
					System.out.println ("\n\tWhile hiding, you tripped on a broken pillar and scraped your knee, and tripped because of sprained ankle.\nLuckily you find a medical kit on the ground, you pick it up and use it to heal some health.");
					healths -= 5;
					healths += 500;
					System.out.println ("Your health is now " + healths + "\nThe monster's health is: " + healthm);
				}
				else
				{
					System.out.println ("\n\tThe monster finds you and drains you energy, and absorbs it.");
					healthm = (healths / 2) + healthm;
					healths = healths / 2;
					System.out.println ("Your health is now " + healths + "\nThe monster's health is: " + healthm);
				}

			}
		}


		if (healths <= 0)
			death ();
		if (healths > healthm)
		{
			System.out.println ("YOU WIN THE FIGHT!");
			winfight ();
		}


		else
			System.out.println ("");
	}


	public void beastob ()
	{
		System.out.println ("\nYou try to manage your ship, but it is going crazy. You see a meteor coming your way.\nOn your computer it says it is coming in 30 minutes. The of the speed of the meteor is 800 km/hour. Your speed is 0 km/hour. How far is the meteor?");
		beastmath ();
	}


	public void beastmath ()
	{
		int ans = (int) (Math.random () * 200) * 2;
		System.out.println ("\nYou see a meteor coming your way.\nOn your computer it says it is coming in 30 minutes. The of the speed of the meteor is " + ans + " km/hour.\nYour speed is 0 km/hour. How far is the meteor?");
		int ans1 = ans / 2;
		int answer = IBIO.inputInt ("Enter Answer (no decimals): ");
		if (answer == ans1)
		{
			System.out.println ("Great job!");
			beastob2 ();
		}


		else
		{
			System.out.println ("You did not calculate correctly, therefore you didnt know when to turn.");
			death ();
		}
	}


	// ALIEN WIN
	public void planet ()
	{
		System.out.println ("               .        ___---___                    .");
		System.out.println ("       .              .--\\        --.     .     .         .");
		System.out.println ("  -O-               ./.;_.\\     __/~ \\.");
		System.out.println ("                   /;  / `-'  __\\    . \\");
		System.out.println (" .        .       / ,--'     / .   .;   \\        |");
		System.out.println ("                 | .|       /       __   |      -O-       .");
		System.out.println ("          -O-   |__/    __ |  . ;   \\| . |      |");
		System.out.println ("                |      /  \\_    . ;| \\___|");
		System.out.println ("   .    o       |      \\  .~\\___,--'     |           .");
		System.out.println ("                 |     | . ; ~~~~\\_    __|");
		System.out.println ("    |             \\    \\   .  .  ; \\  /_/   .");
		System.out.println ("   -O-        .    \\   /         . |  ~/                  .");
		System.out.println ("    |    .          ~\\ \\   .      /  /~          o");
		System.out.println ("  .             -O-   ~--___ ; ___--~");
		System.out.println ("                 .          ---         .    \n");
		credits1 ();
	}



	//MATH FOR ALIEN meteor INTRODUCED
	public void beastob2 ()
	{
		int num2 = (int) (Math.random () * 123890) + 1;
		int num3 = num2 % 2;
		String enter = IBIO.inputString ("\n\tThere is meteor shower heading your way. There is a 50% chance of death and 50% of survival.\nPress enter to see what will happen. ");
		if (num3 == 0)
		{
			System.out.println ("You win the game! You made passed the meteor shower and safely arrived home.\n");
			planet ();
		}


		else
		{
			System.out.println ("You head is blown off!");
			death ();
		}
	}


	//IGNORE; DATE
	public void date1 ()
	{


		Date dNow = new Date ();
		SimpleDateFormat ft =
				new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println ("Current Date: " + ft.format (dNow));
		System.out.println ("");

	}


	public void credits1 ()

	{
		printSlow ("\n\n\t\t\tCongratulations, You BEAT THE GAME!");
		printSlow ("\tIdea by: Het Parikh");
		printSlow ("\tDesigned by: Het Parikh");
		printSlow ("\tCoded by: Het Parikh\n");
		playagain ();
	}


	public void aftermath1 ()
	{
		System.out.println ("\n\tYou wake up and look around, your head hurts from the mental math.\nYou exit the red foggy room. The next room you walk into is the weapon room.\nYou can only hold one weapon. You trade your pocketknife for a sharper dagger made from things that are not on the\nperiodic table. You leave the room. You back through the red foggy room, and go back into the jail room.\n\n\tYou turn right and walk into the control room. This is where you must fight the BOSS!.\nL E T...   T H E...   F I G H T...   B E G I N!!");
		bossfight ();
	}


	//This is one of the major fights the user would have to go through if they
	// choose to play using the survivor character. It is called the BOSS FIGHT.
	public void bossfight ()
	{
		printSlow ("\n==========================BOSS FIGHT==========================");
		printSlow ("______________________________________________________________");
		int healths = 600;
		int healthb = 1000;
		while (healthb > 0 && healths > 0)
		{
			System.out.println ("\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
			int a = IBIO.inputInt ("\n1. Rage! And run and stab the boss!\n2. Hide.\n3. Look for objects around the room to use.\nEnter Option: ");
			while (!isValid3 (a))
			{
				System.out.println ("\nError. Try Again.");
				a = IBIO.inputInt ("\n1. Rage! And run and stab the boss!\n2. Hide.\n3. Look for objects around the room to use.\nEnter Option: ");
			}
			if (a == 1)
			{
				healths -= 50;
				healthb -= 30;
				System.out.println ("\nYou RAGE, and try to sttack the boss. You do some damage, but you lose some because you were vunerable.");
				System.out.println ("\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
			}
			else if (a == 2)
			{
				int num = (int) (Math.random () * 3) + 1;
				if (num == 1)
				{
					System.out.println ("\nYou are safe.");
				}
				else if (num == 2)
				{
					healths -= 10;
					System.out.println ("\nThe Boss finds you does some damage.\nYour health is now " + healths + "%. ");
				}
				else
				{
					healths += 50;
					healthb -= 100;
					System.out.println ("\nYou find a medical potion and a splashing poison potion. You throw the poison on the boss and you drink the medical poltion.\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
				}
			}
			else if (a == 3)
			{
				int num = (int) (Math.random () * 4) + 1;
				if (num == 1)
				{
					healths += 1000000;
					System.out.println ("\nYou find the god potion. This potion was operating the entire ship. You drink it. You have a health of " + healths + "%.");
				}
				else if (num == 2)
				{
					healths = healths / 2;
					healthb = healths + healthb;
					System.out.println ("\nThe boss absorbs half you life energy.\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
				}
				else if (num == 3)
				{
					healths -= healths;
					System.out.println ("\nYou have a heart attack from the fight, since there is way too much pressure. You died.\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
				}
				else
				{
					healthb -= healths;
					System.out.println ("\nHe who angers you conquers you. You remember your parents, and throw the knife at the boss. The boss looses the amount of health you have.\nYour health is " + healths + "%.\nThe Boss's health is " + healthb + "%.");
				}
			}
		}


		if (healths <= 0)
		{
			death ();
		}
		else
		{
			System.out.println ("\nYOU WIN THE FIGHT!");
			System.out.println ("\nYou have finally seeked revenge and have brought peace back into your life.");
			credits1 ();
		}
	}
} 


/*MAKE ENDING AS IF YOU DIED IN JAIL. AND THE PATHS WERE A FLASHBACK FROM DEATH.
CHANGED IDEA TO ADD FIGHT IN RED ROOM LIKE AMNESIA :)*/


// This class is used for all the user inputs, the snanner is called IBIO. 
class IBIO
{
	static void output (String info)
	{
		System.out.println (info);
	}


	static void output (char info)
	{
		System.out.println (info);
	}


	static void output (byte info)
	{
		System.out.println (info);
	}


	static void output (int info)
	{
		System.out.println (info);
	}


	static void output (long info)
	{
		System.out.println (info);
	}


	static void output (double info)
	{
		System.out.println (info);
	}


	static void output (boolean info)
	{
		System.out.println (info);
	}


	static String input (String prompt)
	{
		String inputLine = "";
		System.out.print (prompt);
		try
		{
			inputLine = (new java.io.BufferedReader (new java.io.InputStreamReader (System.in))).readLine ();
		}
		catch (Exception e)
		{
			String err = e.toString ();
			System.out.println (err);
			inputLine = "";
		}
		return inputLine;
	}


	static String inputString (String prompt)
	{
		return input (prompt);
	}


	static String input ()
	{
		return input ("");
	}


	static int inputInt ()
	{
		return inputInt ("");
	}


	static double inputDouble ()
	{
		return inputDouble ("");
	}


	static char inputChar (String prompt)
	{
		char result = (char) 0;
		try
		{
			result = input (prompt).charAt (0);
		}
		catch (Exception e)
		{
			result = (char) 0;
		}
		return result;
	}


	static byte inputByte (String prompt)
	{
		byte result = 0;
		try
		{
			result = Byte.valueOf (input (prompt).trim ()).byteValue ();
		}
		catch (Exception e)
		{
			result = 0;
		}
		return result;
	}


	static int inputInt (String prompt)
	{
		int result = 0;
		try
		{
			result = Integer.valueOf (input (prompt).trim ()).intValue ();
		}
		catch (Exception e)
		{
			result = 0;
		}
		return result;
	}


	static long inputLong (String prompt)
	{
		long result = 0;
		try
		{
			result = Long.valueOf (input (prompt).trim ()).longValue ();
		}
		catch (Exception e)
		{
			result = 0;
		}
		return result;
	}


	static double inputDouble (String prompt)
	{
		double result = 0;
		try
		{
			result = Double.valueOf (input (prompt).trim ()).doubleValue ();
		}
		catch (Exception e)
		{
			result = 0;
		}
		return result;
	}


	static boolean inputBoolean (String prompt)
	{
		boolean result = false;
		try
		{
			result = Boolean.valueOf (input (prompt).trim ()).booleanValue ();
		}
		catch (Exception e)
		{
			result = false;
		}
		return result;
	}
}
