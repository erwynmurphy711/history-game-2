package random;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import random.Game.TitleScreenHandler;

public class Game {

	
	// testing commit 2
	JFrame window;
	Container con;
	JPanel titleNamePanel;
	JPanel startButtonPanel, introductionButtonPanel, introductionTextPanel, weekButtonPanel, weekScreenPanel,
			lifeScreenStockPanel, lifeScreenContinuePanel, lifeScreenStockAddRemovePanel, lifeScreenWalletPanel,
			familyScreenBuyPanel, familyScreenPeoplePanel, familyScreenFoodAmountPanel, familyScreenContinuePanel,
			familyScreenMedicineAmountPanel, familyScreenFeedPanel, familyScreenReturnPanel, newsScreenPanel,
			newsScreenTextPanel, newsScreenLabelPanel, hungerPanel, emergencyScreenButtonPanel;
	JLabel weekScreenLabel, lifeScreenStockLabel, lifeScreenWalletLabel, familyScreenFoodLabel1, familyScreenFoodLabel2,
			familyScreenFoodLabel3, familyScreenMedicineLabel, familyScreenPlaceholderLabel1,
			familyScreenPlaceholderLabel2, newsScreenStockLabel, newsScreenSalaryLabel, newsScreenFamilyLeftLabel,
			hungerLabel;
	JPanel playerPanel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 70); // made a new font called titleFont
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	Font walletFont = new Font("Times New Roman", Font.PLAIN, 45);
	JButton startButton, introductionButton, weekScreenButton, lifeScreenContinueButton, lifeScreenStockAddButton,
			lifeScreenStockRemoveButton, familyScreenContinueButton, familyScreenFoodBuyButton,
			familyScreenMedicineBuyButton, familyScreenFeedButton, familyScreenReturnButton, newsScreenButton,
			emergencyScreenButton;
	JTextArea titleNameArea, introductionTextArea, newsScreenTextArea;
	int introductionDialogueSwitch, week, stocks, weekSetupCheck, lifeSetupCheck, wallet, stockPrice, familySetupCheck,
			foodPrice, medicinePrice, foodAmount, medicineAmount, food1Check, food2Check, food3Check, medicineCheck,
			salary, feedCheck, familyHungerCheck, newsSetupCheck, familyLeftCheck, yourselfHungerCheck, familySalary,
			emergencyScreenCheck, badJobCheck;
	double stockPercentage;
	String buttonAction, position;

	// Stock stuff
	ArrayList<StockPercent> stockPercentageList = new ArrayList<StockPercent>();
	StockPercent stock1 = new StockPercent(0.2, false);
	StockPercent stock2 = new StockPercent(0.1, false);
	StockPercent stock3 = new StockPercent(0.2, true);
	StockPercent stock4 = new StockPercent(0.3, false);
	StockPercent stock5 = new StockPercent(0.1, true);
	StockPercent stock6 = new StockPercent(0.2, false);
	StockPercent stock7 = new StockPercent(0.3, false);
	StockPercent stock8 = new StockPercent(0.2, true);
	StockPercent stock9 = new StockPercent(0.1, true);
	StockPercent stock10 = new StockPercent(0.1, false);
	StockPercent stock11 = new StockPercent(0.2, false);
	StockPercent stock12 = new StockPercent(0.3, true);
	StockPercent stock13 = new StockPercent(0.1, false);
	// Stock Stuff

	// News Stuff
	ArrayList<String> newsText = new ArrayList<String>();
	// News Stuff

	// Action Handler Stuff
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	IntroductionScreenHandler isHandler = new IntroductionScreenHandler();
	WeekScreenHandler wsHandler = new WeekScreenHandler();
	LifeScreenHandler lsHandler = new LifeScreenHandler();
	// Action Handler Stuff

	public static void main(String[] args) {

		new Game();

	}

	public Game() {

		introductionDialogueSwitch = 0;
		week = 1;
		stocks = 0;
		weekSetupCheck = 0;
		lifeSetupCheck = 0;
		familySetupCheck = 0;
		wallet = 100;
		stockPrice = 50;
		foodPrice = 10;
		medicinePrice = 25;
		foodAmount = 0;
		medicineAmount = 0;
		food1Check = 0;
		food2Check = 0;
		food3Check = 0;
		medicineCheck = 0;
		salary = 0;
		feedCheck = 0;
		position = "";
		familyHungerCheck = 0;
		newsSetupCheck = 0;
		familyLeftCheck = 0;
		yourselfHungerCheck = 0;
		familySalary = 10;
		emergencyScreenCheck = 0;
		badJobCheck = 2;
		
		// Stock Stuff
		stockPercentageList.addAll(Arrays.asList(stock1, stock2, stock3, stock4, stock5, stock6, stock7, stock8, stock9,
				stock10, stock11, stock12, stock13));
		// Stock Stuff

		// News Stuff
		newsText.addAll(Arrays.asList(

				"", 
				"Week 2", // the news starts after week 2
				"Week 3",
				"Week 4",
				"Week 5",
				"Week 6",
				"Week 7",
				"Week 8"

		));
		// News Stuff

		window = new JFrame();
		window.setSize(800, 600); // size of window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // need this for window to close properly
		window.getContentPane().setBackground(Color.white); // set color of window
		window.setLayout(null);
		con = window.getContentPane();
		window.setResizable(false); // RESIZABLE YES OR NO

		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 300); // sets size
		titleNamePanel.setBackground(Color.white); // sets color

		titleNameArea = new JTextArea("The Great\nDepression\nSimulator");
		titleNameArea.setEnabled(false); // Makes text Not selectable
		titleNameArea.setBounds(100, 100, 600, 250);
		titleNameArea.setBackground(Color.white);
		titleNameArea.setForeground(Color.black);
		titleNameArea.setFont(titleFont);
		titleNameArea.setLineWrap(true); // Warps your lines automatically

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.white);

		startButton = new JButton("START");
		startButton.setBackground(Color.white); // color of background
		startButton.setForeground(Color.black); // color of text for the button
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler); // calls tshandler when button clicks
		startButton.setFocusPainted(false); // removes ugly line border on button

		titleNamePanel.add(titleNameArea); // adds words to panel
		startButtonPanel.add(startButton);

		con.add(titleNamePanel); // adds panels to the window
		con.add(startButtonPanel);

		window.setVisible(true);

	}

	public void introductionSetup() {

		// window.setVisible(false);

		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);

		introductionButtonPanel = new JPanel();
		introductionButtonPanel.setBackground(Color.white);
		introductionButtonPanel.setBounds(300, 400, 200, 100);

		introductionButton = new JButton("Continue");
		introductionButton.setBackground(Color.white);
		introductionButton.setForeground(Color.black);
		introductionButton.setFont(normalFont);
		introductionButton.addActionListener(isHandler);
		introductionButton.setFocusPainted(false);

		introductionTextPanel = new JPanel();
		introductionTextPanel.setBounds(100, 100, 600, 300); // sets size
		introductionTextPanel.setBackground(Color.white); // sets color

		introductionTextArea = new JTextArea("This is a game that is a 'simulator' of\nThe Great Depression.");
		introductionTextArea.setEnabled(false); // Makes text Not selectable
		introductionTextArea.setBounds(100, 100, 600, 250);
		introductionTextArea.setBackground(Color.white);
		introductionTextArea.setForeground(Color.black);
		introductionTextArea.setFont(normalFont);
		introductionTextArea.setLineWrap(true); // Warps your lines automatically

		introductionTextPanel.add(introductionTextArea);
		introductionButtonPanel.add(introductionButton);

		con.add(introductionTextPanel);
		con.add(introductionButtonPanel);

		// window.setVisible(true);

	}

	public void introduction() {

		// window.setVisible(false);

		switch (introductionDialogueSwitch) {
		case 0:
			introductionTextArea.setText("");
			break;
		case 1:
			introductionTextArea.setText("In this game, you will discover just how unfair it was\ntowards the people"
					+ " who lived through it.");
			break;
		case 2:
			introductionTextArea.setText("The year is 1925 (and since this is a game and I don't want it to drag too long"
					+ "), every year will only be 10\nweeks, just to speed up the gameplay a bit.");
			break;
		case 3:
			introductionTextArea.setText("At the start of the week, you will get a salary from\nyour job. And you can choose "
					+ "to buy food (or not), in\norder to feed yourself and family. Although you can\nchoose not to feed them, "
					+ "I'm just not sure how well\nthat will go for you.");
			break;
		case 4:
			introductionTextArea.setText("During the week, you also have the choice to buy\nstocks, I'm not saying you 'need' "
					+ "to buy stocks, but\nyou might gain some money from it, who knows right,\nI'm sure nothing will happen :).");
			break;
		case 5:
			introductionTextArea.setText("Enjoy the game, if there is any bugs, please bare with me, this is my first game.");
			break;
		}

		// window.setVisible(true);
	}

	public void weekScreenSetup() {

		position = "weekScreen";

		// window.setVisible(false);

		introductionTextPanel.setVisible(false);
		introductionButtonPanel.setVisible(false);

		weekScreenPanel = new JPanel();
		weekScreenPanel.setBackground(Color.white);
		weekScreenPanel.setBounds(100, 100, 600, 300);

		weekScreenLabel = new JLabel("Week " + week);
		weekScreenLabel.setBackground(Color.white);
		weekScreenLabel.setForeground(Color.black);
		weekScreenLabel.setFont(titleFont);
		weekScreenLabel.setEnabled(false);

		weekScreenButton = new JButton("Next");
		weekScreenButton.setBackground(Color.white);
		weekScreenButton.setForeground(Color.black);
		weekScreenButton.addActionListener(wsHandler);
		weekScreenButton.setFont(normalFont);
		weekScreenButton.setFocusPainted(false);

		weekButtonPanel = new JPanel();
		weekButtonPanel.setBackground(Color.white);
		weekButtonPanel.setBounds(300, 400, 200, 100);

		weekButtonPanel.add(weekScreenButton);
		weekScreenPanel.add(weekScreenLabel);

		con.add(weekScreenPanel);
		con.add(weekButtonPanel);

		weekSetupCheck++;

		// window.setVisible(true);

	}

	public void lifeScreenSetup() {

		position = "lifeScreen";

		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
//		familyScreenContinuePanel.setVisible(false);
		familyScreenBuyPanel.setVisible(false);

		lifeScreenStockPanel = new JPanel();
		lifeScreenStockPanel.setBackground(Color.white);
		lifeScreenStockPanel.setBounds(400, 100, 300, 100);

		lifeScreenStockAddRemovePanel = new JPanel();
		lifeScreenStockAddRemovePanel.setBackground(Color.red);
		lifeScreenStockAddRemovePanel.setBounds(400, 200, 300, 50);
		lifeScreenStockAddRemovePanel.setLayout(new GridLayout(1, 2));

		lifeScreenStockLabel = new JLabel("$ " + stocks);
		lifeScreenStockLabel.setEnabled(false);
		lifeScreenStockLabel.setBackground(Color.white);
		lifeScreenStockLabel.setForeground(Color.black);
		lifeScreenStockLabel.setFont(titleFont);

		lifeScreenStockAddButton = new JButton("Add");
		lifeScreenStockAddButton.setBackground(Color.white);
		lifeScreenStockAddButton.setForeground(Color.black);
		lifeScreenStockAddButton.setActionCommand("lifeScreenStockAddButton");
		lifeScreenStockAddButton.addActionListener(lsHandler);
		lifeScreenStockAddButton.setFont(normalFont);
		lifeScreenStockAddButton.setFocusPainted(false);

		lifeScreenStockRemoveButton = new JButton("Remove");
		lifeScreenStockRemoveButton.setBackground(Color.white);
		lifeScreenStockRemoveButton.setForeground(Color.black);
		lifeScreenStockRemoveButton.setActionCommand("lifeScreenStockRemoveButton");
		lifeScreenStockRemoveButton.addActionListener(lsHandler);
		lifeScreenStockRemoveButton.setFont(normalFont);
		lifeScreenStockRemoveButton.setFocusPainted(false);

		lifeScreenStockAddRemovePanel.add(lifeScreenStockAddButton);
		lifeScreenStockAddRemovePanel.add(lifeScreenStockRemoveButton);

		lifeScreenStockPanel.add(lifeScreenStockLabel);

		con.add(lifeScreenWalletPanel);
		con.add(lifeScreenStockAddRemovePanel);
		con.add(lifeScreenStockPanel);

		lifeSetupCheck++;

	}

	public void weekScreen() {

		position = "weekScreen";

		hungerPanel.setVisible(false);
		familyScreenReturnPanel.setVisible(false);
		familyScreenBuyPanel.setVisible(false);
//		familyScreenPeoplePanel.setVisible(false);
		familyScreenFeedPanel.setVisible(false);
		familyScreenMedicineAmountPanel.setVisible(false);
		familyScreenFoodAmountPanel.setVisible(false);
		lifeScreenWalletPanel.setVisible(false);
		familyScreenContinuePanel.setVisible(false);
		lifeScreenStockAddRemovePanel.setVisible(false);
		lifeScreenStockPanel.setVisible(false);
		lifeScreenContinuePanel.setVisible(false);

		weekScreenLabel.setText("Week " + week);
		weekScreenPanel.setVisible(true);
		weekButtonPanel.setVisible(true);

	}

	public void lifeScreen() {

		position = "lifeScreen";

		familyScreenBuyPanel.setVisible(false);
		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
//		familyScreenContinuePanel.setVisible(false);

		lifeScreenStockAddRemovePanel.setVisible(true);
		lifeScreenStockPanel.setVisible(true);

	}

	public class TitleScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			introductionSetup();
		}
	}

	public void familyScreenSetup() {

		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);

		position = "familyScreen";

		hungerPanel = new JPanel();
		hungerPanel.setBackground(Color.white);
		hungerPanel.setBounds(460, 410, 350, 40);
		
		hungerLabel = new JLabel("Hungry");
		hungerLabel.setEnabled(true);
		hungerLabel.setBackground(Color.red);
		hungerLabel.setForeground(Color.red);
		hungerLabel.setFont(normalFont);
		
		lifeScreenContinuePanel = new JPanel();
		lifeScreenContinuePanel.setBackground(Color.white);
		lifeScreenContinuePanel.setBounds(300, 450, 200, 50);

		lifeScreenContinueButton = new JButton("Next Week");
		lifeScreenContinueButton.setBackground(Color.white);
		lifeScreenContinueButton.setForeground(Color.black);
		lifeScreenContinueButton.setActionCommand("lifeScreenContinueButton");
		lifeScreenContinueButton.addActionListener(lsHandler);
		lifeScreenContinueButton.setFont(normalFont);
		lifeScreenContinueButton.setFocusPainted(false);

		familyScreenFoodAmountPanel = new JPanel();
		familyScreenFoodAmountPanel.setBackground(Color.white);
		familyScreenFoodAmountPanel.setBounds(50, 50, 200, 50);
		familyScreenFoodAmountPanel.setLayout(new GridLayout(1, 3));

		familyScreenFeedPanel = new JPanel();
		familyScreenFeedPanel.setBackground(Color.white);
		familyScreenFeedPanel.setBounds(460, 450, 350, 50);

		familyScreenFeedButton = new JButton("Don't Feed Family");
		familyScreenFeedButton.setBackground(Color.white);
		familyScreenFeedButton.setForeground(Color.black);
		familyScreenFeedButton.addActionListener(lsHandler);
		familyScreenFeedButton.setActionCommand("familyScreenFeedButton");
		familyScreenFeedButton.setFocusPainted(false);
		familyScreenFeedButton.setFont(normalFont);

		familyScreenMedicineAmountPanel = new JPanel();
		familyScreenMedicineAmountPanel.setBackground(Color.white);
		familyScreenMedicineAmountPanel.setBounds(550, 50, 200, 50);
		familyScreenMedicineAmountPanel.setLayout(new GridLayout(1, 3));

		familyScreenPlaceholderLabel1 = new JLabel();
		familyScreenPlaceholderLabel1.setEnabled(false);
		familyScreenPlaceholderLabel1.setBackground(Color.white);
		familyScreenPlaceholderLabel1.setForeground(Color.black);
		familyScreenPlaceholderLabel1.setFont(normalFont);

		familyScreenPlaceholderLabel2 = new JLabel();
		familyScreenPlaceholderLabel2.setEnabled(false);
		familyScreenPlaceholderLabel2.setBackground(Color.white);
		familyScreenPlaceholderLabel2.setForeground(Color.black);
		familyScreenPlaceholderLabel2.setFont(normalFont);

		familyScreenMedicineLabel = new JLabel("X");
		familyScreenMedicineLabel.setEnabled(false);
		familyScreenMedicineLabel.setBackground(Color.white);
		familyScreenMedicineLabel.setForeground(Color.black);
		familyScreenMedicineLabel.setFont(normalFont);

		familyScreenFoodLabel1 = new JLabel("X");
		familyScreenFoodLabel1.setEnabled(false);
		familyScreenFoodLabel1.setBackground(Color.white);
		familyScreenFoodLabel1.setForeground(Color.black);
		familyScreenFoodLabel1.setFont(normalFont);

		familyScreenFoodLabel2 = new JLabel("X");
		familyScreenFoodLabel2.setEnabled(false);
		familyScreenFoodLabel2.setBackground(Color.white);
		familyScreenFoodLabel2.setForeground(Color.black);
		familyScreenFoodLabel2.setFont(normalFont);

		familyScreenFoodLabel3 = new JLabel("X");
		familyScreenFoodLabel3.setEnabled(false);
		familyScreenFoodLabel3.setBackground(Color.white);
		familyScreenFoodLabel3.setForeground(Color.black);
		familyScreenFoodLabel3.setFont(normalFont);

		familyScreenBuyPanel = new JPanel();
		familyScreenBuyPanel.setBackground(Color.white);
		familyScreenBuyPanel.setBounds(400, 100, 300, 200);
		familyScreenBuyPanel.setLayout(new GridLayout(2, 1));

		familyScreenFoodBuyButton = new JButton("FOOD");
		familyScreenFoodBuyButton.setBackground(Color.white);
		familyScreenFoodBuyButton.setForeground(Color.black);
		familyScreenFoodBuyButton.addActionListener(lsHandler);
		familyScreenFoodBuyButton.setActionCommand("familyScreenFoodBuyButton");
		familyScreenFoodBuyButton.setFocusPainted(false);
		familyScreenFoodBuyButton.setFont(normalFont);

		familyScreenMedicineBuyButton = new JButton("MEDICINE");
		familyScreenMedicineBuyButton.setBackground(Color.white);
		familyScreenMedicineBuyButton.setForeground(Color.black);
		familyScreenMedicineBuyButton.addActionListener(lsHandler);
		familyScreenMedicineBuyButton.setActionCommand("familyScreenMedicineBuyButton");
		familyScreenMedicineBuyButton.setFocusPainted(false);
		familyScreenMedicineBuyButton.setFont(normalFont);

		lifeScreenWalletLabel = new JLabel("Wallet: $ " + wallet);
		lifeScreenWalletLabel.setEnabled(false);
		lifeScreenWalletLabel.setBackground(Color.white);
		lifeScreenWalletLabel.setForeground(Color.black);
		lifeScreenWalletLabel.setFont(walletFont);

		lifeScreenWalletPanel = new JPanel();
		lifeScreenWalletPanel.setBackground(Color.white);
		lifeScreenWalletPanel.setBounds(50, 150, 300, 100);

		familyScreenContinuePanel = new JPanel();
		familyScreenContinuePanel.setBackground(Color.white);
		familyScreenContinuePanel.setBounds(50, 450, 150, 50);

		familyScreenReturnPanel = new JPanel();
		familyScreenReturnPanel.setBackground(Color.white);
		familyScreenReturnPanel.setBounds(50, 400, 150, 50);

		familyScreenReturnButton = new JButton("Shop");
		familyScreenReturnButton.setBackground(Color.white);
		familyScreenReturnButton.setForeground(Color.black);
		familyScreenReturnButton.setActionCommand("familyScreenReturnButton");
		familyScreenReturnButton.addActionListener(lsHandler);
		familyScreenReturnButton.setFont(normalFont);
		familyScreenReturnButton.setFocusPainted(false);

		familyScreenContinueButton = new JButton("Stocks");
		familyScreenContinueButton.setBackground(Color.white);
		familyScreenContinueButton.setForeground(Color.black);
		familyScreenContinueButton.setActionCommand("familyScreenContinueButton");
		familyScreenContinueButton.addActionListener(lsHandler);
		familyScreenContinueButton.setFont(normalFont);
		familyScreenContinueButton.setFocusPainted(false);

		familyScreenFeedPanel.add(familyScreenFeedButton);

		familyScreenMedicineAmountPanel.add(familyScreenPlaceholderLabel1);
		familyScreenMedicineAmountPanel.add(familyScreenPlaceholderLabel2);
		familyScreenMedicineAmountPanel.add(familyScreenMedicineLabel);

		familyScreenFoodAmountPanel.add(familyScreenFoodLabel1);
		familyScreenFoodAmountPanel.add(familyScreenFoodLabel2);
		familyScreenFoodAmountPanel.add(familyScreenFoodLabel3);

		lifeScreenContinuePanel.add(lifeScreenContinueButton);
		familyScreenReturnPanel.add(familyScreenReturnButton);
		lifeScreenWalletPanel.add(lifeScreenWalletLabel);
		familyScreenContinuePanel.add(familyScreenContinueButton);
		familyScreenBuyPanel.add(familyScreenFoodBuyButton);
		familyScreenBuyPanel.add(familyScreenMedicineBuyButton);
		hungerPanel.add(hungerLabel);
		
		System.out.println("youhungercheck "+yourselfHungerCheck);
		if(familyHungerCheck == 0 && familyLeftCheck == 0) {
			hungerPanel.setVisible(false);
		} else if (familyHungerCheck == 1 && familyLeftCheck == 0) {
			hungerPanel.setVisible(true);
		} else if (yourselfHungerCheck == 0 && familyLeftCheck == 1) {
			hungerPanel.setVisible(false);
		} else if (yourselfHungerCheck == 1 && familyLeftCheck == 1) {
			hungerPanel.setVisible(true);
			hungerLabel.setText("Hungry");
		} else if (yourselfHungerCheck == 2 && familyLeftCheck == 1) {
			hungerPanel.setVisible(true);
			hungerLabel.setText("VERY HUNGRY");
		}
		
		con.add(hungerPanel);
		con.add(lifeScreenContinuePanel);
		con.add(familyScreenReturnPanel);
		con.add(familyScreenFeedPanel);
		con.add(familyScreenMedicineAmountPanel);
		con.add(familyScreenFoodAmountPanel);
		con.add(familyScreenBuyPanel);
		con.add(lifeScreenWalletPanel);
		con.add(familyScreenContinuePanel);

		familySetupCheck++;
	}

	public void familyScreen() {

		position = "familyScreen";

		newsScreenLabelPanel.setVisible(false);
		newsScreenTextPanel.setVisible(false);
		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
		newsScreenPanel.setVisible(false);

		if(familyLeftCheck == 1) {
			familyScreenFeedButton.setText("Don't Feed Yourself");
		}
		System.out.println("youhungercheck "+yourselfHungerCheck);
		if(familyHungerCheck == 0 && familyLeftCheck == 0) {
			hungerPanel.setVisible(false);
		} else if (familyHungerCheck == 1 && familyLeftCheck == 0) {
			hungerPanel.setVisible(true);
		} else if (yourselfHungerCheck == 0 && familyLeftCheck == 1) {
			hungerPanel.setVisible(false);
		} else if (yourselfHungerCheck == 1 && familyLeftCheck == 1) {
			hungerPanel.setVisible(true);
			hungerLabel.setText("Hungry");
		} else if (yourselfHungerCheck == 2 && familyLeftCheck == 1) {
			hungerPanel.setVisible(true);
			badJobCheck++;
			hungerLabel.setText("VERY HUNGRY");
		}
		lifeScreenContinuePanel.setVisible(true);
		familyScreenReturnPanel.setVisible(true);
		familyScreenFeedPanel.setVisible(true);
		familyScreenMedicineAmountPanel.setVisible(true);
		familyScreenFoodAmountPanel.setVisible(true);
		familyScreenBuyPanel.setVisible(true);
		lifeScreenWalletPanel.setVisible(true);
		familyScreenContinuePanel.setVisible(true);
	}

	public void intermediate() {

		System.out.println("badJobCheck "+badJobCheck);
		
		wallet += salary;
		
		lifeScreenWalletLabel.setText("Wallet: $ " + wallet);

		feedCheck();
		
		if(familyLeftCheck == 1) {
			familySalary = 0;
		}
		
		wallet += familySalary;
		
		stock();
		
		
		if(yourselfHungerCheck == 3) {
			deathScreen();
			System.out.println("YOUR DEAD");
		} else if (week == 4 || badJobCheck == 3) {
			emergencyScreen();
		} else {
			news();
		}
		
		

//		System.out.println(familyHungerCheck);
	}
	
	public void deathScreen() {
		
		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
		
		newsScreenTextPanel.setVisible(true);
		newsScreenTextArea.setText("You have died of Hungry, restart the game to try again");
		
	}

	public int feedCheck() {

		if (familyLeftCheck == 0) {
			if (feedCheck == 1) {
				feedCheck = 0;
				familyHungerCheck = 0;
				yourselfHungerCheck = 0;
				familyScreenFeedButton.setText("Don't Feed Family");
			} else if (feedCheck == 0) {
				yourselfHungerCheck++;
				familyHungerCheck++;
			}

		} else if (familyLeftCheck == 1) {

			if (feedCheck == 1) {
				feedCheck = 0;
				yourselfHungerCheck = 0;
				familyScreenFeedButton.setText("Don't Feed Yourself");
			} else if (feedCheck == 0) {
				yourselfHungerCheck++;
			}

		}

		if (familyHungerCheck == 2) {
			System.out.println("Family Left");
			familyLeftCheck = 1;
		}
		
		
		System.out.println("familyLeftCheck"+familyLeftCheck);
		System.out.println("familyHungerCheck"+familyHungerCheck);
		return 0;

	}

	public void news() {

		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
		
		if(emergencyScreenCheck == 1) {
			emergencyScreenButtonPanel.setVisible(false);
		}
		
		
		position = "news";

		if (newsSetupCheck == 0) {

			newsScreenPanel = new JPanel();
			newsScreenPanel.setBackground(Color.white);
			newsScreenPanel.setBounds(300, 450, 200, 50);

			newsScreenButton = new JButton("Begin Week");
			newsScreenButton.setBackground(Color.white);
			newsScreenButton.setForeground(Color.black);
			newsScreenButton.setFocusPainted(false);
			newsScreenButton.addActionListener(lsHandler);
			newsScreenButton.setActionCommand("newsScreenButton");
			newsScreenButton.setFont(normalFont);

			newsScreenTextPanel = new JPanel();
			newsScreenTextPanel.setBackground(Color.white);
			newsScreenTextPanel.setBounds(100, 100, 600, 150);
			
			newsScreenLabelPanel = new JPanel();
			newsScreenLabelPanel.setBackground(Color.white);
			newsScreenLabelPanel.setBounds(100, 250, 600, 150);
			newsScreenLabelPanel.setLayout(new GridLayout(3,1));
			
			newsScreenStockLabel = new JLabel("Stock");
			newsScreenStockLabel.setEnabled(false);
			newsScreenStockLabel.setBackground(Color.white);
			newsScreenStockLabel.setForeground(Color.black);
			newsScreenStockLabel.setFont(normalFont);
			
			newsScreenFamilyLeftLabel = new JLabel("Family Left");
			newsScreenFamilyLeftLabel.setEnabled(false);
			newsScreenFamilyLeftLabel.setBackground(Color.white);
			newsScreenFamilyLeftLabel.setForeground(Color.black);
			newsScreenFamilyLeftLabel.setFont(normalFont);
			
			newsScreenSalaryLabel = new JLabel("Salary");
			newsScreenSalaryLabel.setEnabled(false);
			newsScreenSalaryLabel.setBackground(Color.white);
			newsScreenSalaryLabel.setForeground(Color.black);
			newsScreenSalaryLabel.setFont(normalFont);

			newsScreenTextArea = new JTextArea("test");
			newsScreenTextArea.setEnabled(false); // Makes text Not selectable
			newsScreenTextArea.setBounds(100, 100, 600, 250);
			newsScreenTextArea.setBackground(Color.white);
			newsScreenTextArea.setForeground(Color.black);
			newsScreenTextArea.setFont(normalFont);
			newsScreenTextArea.setLineWrap(true); // Warps your lines automatically

			newsScreenTextArea.setText(newsText.get(week - 1));
			
			newsIntermediate();
			
			newsScreenLabelPanel.add(newsScreenStockLabel);
			newsScreenLabelPanel.add(newsScreenSalaryLabel);
			newsScreenLabelPanel.add(newsScreenFamilyLeftLabel);
			newsScreenPanel.add(newsScreenButton);
			newsScreenTextPanel.add(newsScreenTextArea);

			con.add(newsScreenLabelPanel);
			con.add(newsScreenTextPanel);
			con.add(newsScreenPanel);
			newsSetupCheck = 1;

		} else {

			newsIntermediate();
			
			newsScreenLabelPanel.setVisible(true);
			newsScreenTextPanel.setVisible(true);
			newsScreenPanel.setVisible(true);
			newsScreenTextArea.setText(newsText.get(week - 1));
		}

	}
	
	public void emergencyScreen() {
		
		
		weekScreenPanel.setVisible(false);
		weekButtonPanel.setVisible(false);
		
		if(emergencyScreenCheck == 0) {
			
			emergencyScreenButtonPanel = new JPanel();
			emergencyScreenButtonPanel.setBackground(Color.white);
			emergencyScreenButtonPanel.setBounds(300, 450, 200, 50);
			
			emergencyScreenButton = new JButton("Continue");
			emergencyScreenButton.setBackground(Color.white);
			emergencyScreenButton.setForeground(Color.black);
			emergencyScreenButton.setFocusable(false);
			emergencyScreenButton.setFont(normalFont);
			emergencyScreenButton.addActionListener(lsHandler);
			emergencyScreenButton.setActionCommand("emergencyScreenButton");
			
			emergencyScreenButtonPanel.add(emergencyScreenButton);
			
			con.add(emergencyScreenButtonPanel);
			
			emergencyScreenCheck = 1;
			
		}
		
		emergencyScreenButtonPanel.setVisible(true);
		newsScreenTextPanel.setVisible(true);
		
		if(week == 9) {
			newsScreenTextArea.setText("this is a test for week");
		} else if (badJobCheck == 3) {
			newsScreenTextArea.setText("This is a test for job");
		}
			
		
		
	}
	
	public void newsIntermediate() {
	
		
		if (stockPercentageList.get(week - 2).getNegative() == false) {
			newsScreenStockLabel.setText("Last week the Stock went up "+ (int)( stockPercentageList.get(week - 2).getStockPercent()*100 )+" %");
		} else if (stockPercentageList.get(week - 2).getNegative() == true) {
			newsScreenStockLabel.setText("Last week the Stock went down "+ (int)( stockPercentageList.get(week - 2).getStockPercent()*100 )+" %");
		}
		
		newsScreenSalaryLabel.setText("Your Job earned you $ "+salary);
		
		if(familyLeftCheck == 0) {
			newsScreenFamilyLeftLabel.setText("Your Family Earned you $ "+familySalary);
		} else if (familyLeftCheck == 1){
			newsScreenFamilyLeftLabel.setText("Your Family Left you because you didn't feed them.");
		}
	
		
	}

	public int stock() {

		if (stockPercentageList.get(week - 2).getNegative() == false) {
			stockPercentage = 1 + stockPercentageList.get(week - 2).getStockPercent();
			stocks = (int) (stocks * stockPercentage);
			stockPrice = (int) (stockPrice * stockPercentage);
			lifeScreenStockLabel.setText("$  " + stocks);
		} else if (stockPercentageList.get(week - 2).getNegative() == true) {
			stockPercentage = 1 - stockPercentageList.get(week - 2).getStockPercent();
			stocks = (int) (stocks * stockPercentage);
			stockPrice = (int) (stockPrice * stockPercentage);
			lifeScreenStockLabel.setText("$  " + stocks);
		}
		return 0;
	}

	public class IntroductionScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			introductionDialogueSwitch++;
			if (introductionDialogueSwitch > 5) { // this is an int not variable REMEBER
				weekScreenSetup();
			} else {

				introduction();

			}

		}
	}

	public class WeekScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (familySetupCheck == 0) {
				familyScreenSetup();
			} else {
				intermediate();
			}

		}
	}

	public class LifeScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			buttonAction = event.getActionCommand();

			switch (buttonAction) {
			case "lifeScreenStockAddButton":

				if (wallet >= stockPrice) {
					System.out.println("Add stock");
					wallet -= stockPrice;
					lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
					stocks += stockPrice;
					lifeScreenStockLabel.setText("$ " + stocks);
				} else {
					System.out.println("No money");
				}

				break;
			case "lifeScreenStockRemoveButton":

				if (stocks > 0) {

					wallet += stocks;
					stocks = 0;
					lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
					lifeScreenStockLabel.setText("" + stocks);

				} else {
					System.out.println("No stock");
				}

				break;
			case "lifeScreenContinueButton":

				if (lifeSetupCheck == 0) {
					lifeScreenSetup();
				} else {
					week++;
					weekScreen();
					System.out.println("Continue");
				}

				break;

			case "familyScreenContinueButton":

				if (lifeSetupCheck == 0) {
					lifeScreenSetup();
				} else {
					lifeScreen();
				}
				break;
			case "familyScreenFoodBuyButton":

				if (wallet >= foodPrice) {

					if (food1Check == 0) {
						wallet -= foodPrice;
						lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
						familyScreenFoodLabel1.setText("O");
						foodAmount++;
						food1Check = 1;
						System.out.println("Buy Food 1");
					} else if (food2Check == 0) {
						wallet -= foodPrice;
						lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
						familyScreenFoodLabel2.setText("O");
						foodAmount++;
						food2Check = 1;
						System.out.println("Buy Food 2");
					} else if (food3Check == 0) {
						wallet -= foodPrice;
						lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
						familyScreenFoodLabel3.setText("O");
						foodAmount++;
						food3Check = 1;
						System.out.println("Buy Food 3");
					} else {
						System.out.println("Storage Full");
					}

				} else {
					System.out.println("No money");
				}

				break;

			case "familyScreenMedicineBuyButton":

				if (wallet >= medicinePrice) {

					if (medicineCheck == 0) {

						wallet -= medicinePrice;
						lifeScreenWalletLabel.setText("Wallet: $ " + wallet);
						familyScreenMedicineLabel.setText("O");
						medicineAmount++;
						medicineCheck++;
						System.out.println("Buy Med");

					} else {
						System.out.println("Storage full");

					}

				} else {
					System.out.println("No money");
				}

				break;

			case "familyScreenFeedButton":

				if (familyLeftCheck == 0) {

					if (feedCheck == 0) {

						if (foodAmount >= 1) {

							if (food3Check == 1) {

								foodAmount--;
								food3Check = 0;
								familyScreenFoodLabel3.setText("X");
								familyScreenFeedButton.setText("Feed Family");
								feedCheck = 1;
							} else if (food2Check == 1) {

								foodAmount--;
								food2Check = 0;
								familyScreenFoodLabel2.setText("X");
								familyScreenFeedButton.setText("Feed Family");
								feedCheck = 1;
							} else if (food1Check == 1) {

								foodAmount--;
								food1Check = 0;
								familyScreenFoodLabel1.setText("X");
								familyScreenFeedButton.setText("Feed Family");
								feedCheck = 1;
							}
						}

					} else if (feedCheck == 1) {

						if (food1Check == 0) {

							foodAmount++;
							food1Check = 1;
							familyScreenFoodLabel1.setText("O");
							familyScreenFeedButton.setText("Don't Feed Family");
							feedCheck = 0;
						} else if (food2Check == 0) {

							foodAmount++;
							food2Check = 1;
							familyScreenFoodLabel2.setText("O");
							familyScreenFeedButton.setText("Don't Feed Family");
							feedCheck = 0;
						} else if (food3Check == 0) {

							foodAmount++;
							food3Check = 1;
							familyScreenFoodLabel3.setText("O");
							familyScreenFeedButton.setText("Don't Feed Family");
							feedCheck = 0;
						} else {
							System.out.println("Storage Full, Must feed");
						}
					}

				} else if (familyLeftCheck == 1) {

					System.out.println("Food Amount"+foodAmount);
					System.out.println("Feed Check"+feedCheck);
					if (feedCheck == 0) {

						if (foodAmount >= 1) {

							if (food3Check == 1) {

								foodAmount--;
								food3Check = 0;
								familyScreenFoodLabel3.setText("X");
								familyScreenFeedButton.setText("Feed Yourself");
								feedCheck = 1;
							} else if (food2Check == 1) {

								foodAmount--;
								food2Check = 0;
								familyScreenFoodLabel2.setText("X");
								familyScreenFeedButton.setText("Feed Yourself");
								feedCheck = 1;
							} else if (food1Check == 1) {

								foodAmount--;
								food1Check = 0;
								familyScreenFoodLabel1.setText("X");
								familyScreenFeedButton.setText("Feed Yourself");
								feedCheck = 1;
							}
						}

					} else if (feedCheck == 1) {

						if (food1Check == 0) {

							foodAmount++;
							food1Check = 1;
							familyScreenFoodLabel1.setText("O");
							familyScreenFeedButton.setText("Don't Feed Yourself");
							feedCheck = 0;
						} else if (food2Check == 0) {

							foodAmount++;
							food2Check = 1;
							familyScreenFoodLabel2.setText("O");
							familyScreenFeedButton.setText("Don't Feed Yourself");
							feedCheck = 0;
						} else if (food3Check == 0) {

							foodAmount++;
							food3Check = 1;
							familyScreenFoodLabel3.setText("O");
							familyScreenFeedButton.setText("Don't Feed Yourself");
							feedCheck = 0;
						} else {
							System.out.println("Storage Full, Must feed");
						}
					}

				}

				break;
			case "familyScreenReturnButton":

				if (position.equals("lifeScreen")) {
					familyScreen();
				} else {
					System.out.println("Already on Shop");
				}
				break;
			case "newsScreenButton":

				familyScreen();
				break;
			
			case "emergencyScreenButton":
				
				news();
				
				break;
			}

		}
	}

}
