package app.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JSpinner;
import javax.swing.JRadioButton;

import app.controller.Controller;
import app.model.Model;

import java.awt.Toolkit;

import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;

import java.awt.GridLayout;

public class View extends JFrame {

	private Controller controller;

	public Controller getController() {
		return controller;
	}
	private JPanel contentPane;
	private JTextField CoworkerName;
	private JTextField CoworkerFirstLastName;
	private JTextField CoworkerSecondLastName;
	private JTextField CoworkerPhoneNumber;
	private JTextField CoworkerEmail;
	private JTextField CoworkerWorkPosition;
	private JTextField StudentName;
	private JTextField StudentFirstLastName;
	private JTextField StudentSecondLastName;
	private JTextField StudentPhoneNumber;
	private JTextField StudentEmail;
	private JTextField StudentID;
	private JTextField RelativeName;
	private JTextField RelativeFirstName;
	private JTextField RelativePhoneNumber;
	private JTextField RelativeSecondLastName;
	private JTextField RelativeEmail;
	private JTextField RelativeKinship;
	private JButton RelativeRegistrationBackBtn;
	private JButton RelativeRegistrationBtn;
	private JButton StudentRegistrationBackBtn;
	private JButton StudentRegistrationBtn;
	private JButton CoworkerRegistrationBackBtn;
	private JButton CoworkerRegistrationBtn;
	private JButton newBorrowerBtn;
	private JButton newBelongingBtn;
	private JButton CreditsBtn;
	private JButton settingsBtn;
	private JPanel StartPnl;
	private JButton searchBtn;
	private JPanel SearchPnl;
	private JPanel CreditsPnl;
	private JPanel BorrowerRegistrationPnl;
	private JPanel CoworkerRegistrationPnl;
	private JPanel StudentRegistrationPnl;
	private JPanel RelativeRegistrationPnl;
	private JButton newRelativeBtn;
	private JButton newStudentBtn;
	private JButton newCoworkerBtn;
	private JButton BorrowerRegistrationBackBtn;
	private JButton CreditsBackBtn;
	private JButton BelongingRegistrationBackBtn;
	private JButton BookRegistrationBackBtn;
	private JButton MagazineRegistrationBackBtn;
	private JButton MovieRegistrationBackBtn;
	private JButton SettingBackBtn;
	private JButton AllXSearchBackBtn;
	private JButton SearchBackBtn;
	private JPanel BelongingRegistrationPnl;
	private JPanel MagazineRegistrationPnl;
	private JPanel BookRegistrationPnl;
	private JPanel MovieRegistrationPnl;
	private JPanel SettingPnl;
	private JPanel AllXSearch;
	private JButton newBookBtn;
	private JButton newMagazineBtn;
	private JButton newMovieBtn;
	private JButton ManualBtn;
	private JLabel lblRating;
	private JLabel lblGenre;
	private JLabel lblDirector;
	private JLabel lblReleaseDate;
	private JTextField MovieName;
	private JTextField MovieGenre;
	private JTextField MovieDirector;
	private JButton MovieRegistrationBtn;
	private JLabel lblName_1;
	private JLabel lblAuthor;
	private JLabel lblEditorial;
	private JLabel lblEdition;
	private JLabel lblRating_1;
	private JTextField BookName;
	private JTextField BookAuthor;
	private JTextField BookEditorial;
	private JTextField BookEdition;
	private JButton BookRegistrationBtn;
	private JLabel lblTopx;
	private JButton SettingsChangeTopXBtn;
	private JLabel lblLoanDays;
	private JLabel lblToleranceDays;
	private JButton SettingsChangeLoanDaysBtn;
	private JButton SettingsChangeToleranceDaysBtn;
	private JLabel lblTimesborrowed;
	private JLabel lblMonths;
	private JSpinner SettingsChangeMonthsSpn;
	private JLabel lblSettings;
	private JSpinner SettingsChangeTimesBorrowedSpn;
	private JLabel lblSpecialSearch;
	private JButton SettingsChangeTimesBorrowedBtn;
	private JButton SettingsChangeMonthsBtn;
	private JLabel lblSystemDate;
	private JSpinner SettingsChangeLoanDaysSpn;
	private JSpinner SettingsChangeToleranceDaysSpn;
	private JSpinner SettingsChangeTopXSpn;
	private JLabel label;
	private JLabel lblDaysIntoThe;
	private JSpinner SettingsGoToTheFutureSpn;
	private JButton SettingsGoToTheFutureBtn;
	private JLabel SettingsCurrentLoanDaysLbl;
	private JLabel SettingsCurrentToleranceDaysLbl;
	private JLabel lblCurrent;
	private JLabel SettingsCurrentTopXLbl;
	private JLabel lblExplanation;
	private JLabel lblExplanation_1;
	private JLabel lblExplanation_2;
	private JLabel lblCurrent_1;
	private JLabel lblCurrent_2;
	private JLabel lblExplanation_3;
	private JLabel lblCurrent_3;
	private JLabel SettingsCurrentTimesBorrowedLbl;
	private JLabel lblCurrent_4;
	private JLabel lblExplanation_4;
	private JLabel SettingsCurrentMonthsLbl;
	private JLabel lblCurrentDate;
	private JLabel SettingsCurrentDateLbl;
	private JButton HistoryBtn;
	private JLabel lblSearchParameter;
	private JComboBox<String> AllXSearchParametersComboBox;
	private JTextField AllXFilterParameterTf;
	private JButton AllXFilterBtn;
	private JScrollPane AllXScrollPane;
	private JLabel lblFilterBy;
	private JPanel BorrowedXPnl;
	private JButton BorrowedXBackBtn;
	private JLabel lblBorrowersName;
	private JTextField BorrowedXParameterTf;
	private JButton BorrowedXFilterBtn;
	private JScrollPane BorrowedXScrollPane;
	private JLabel BorrowedXLbl2;
	private JPanel AvailableXPnl;
	private JButton AvailableXBackBtn;
	private JLabel AvailableXLbl2;
	private JScrollPane AvailableXScrollPane;
	private JPanel TopXPnl;
	private JButton TopXBackBtn;
	private JLabel TopXLbl2;
	private JScrollPane TopXScrollPane;
	private JPanel panel_1;
	private JLabel lblBooks;
	private JRadioButton lblAll;
	private JRadioButton lblBorrowed;
	private JRadioButton lblAvailable;
	private JRadioButton lblTop_1;
	private JLabel label_1;
	private JLabel lblTypeOfSearch;
	private JRadioButton rdbtnSpecialSearch;
	private JButton BookCSearchBtn;
	private final ButtonGroup BooksButtonGroup = new ButtonGroup();
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblMagazines;
	private JLabel lblMovies;
	private JLabel lblTypeOfSearch_1;
	private JLabel label_2;
	private JRadioButton rdbtnAll;
	private JRadioButton rdbtnBorrowed;
	private JRadioButton rdbtnAvailable;
	private JRadioButton rdbtnTop;
	private JRadioButton rdbtnSpecialSearch_1;
	private JButton MagazineCSearchBtn;
	private JLabel lblTypeOfSearch_2;
	private JRadioButton rdbtnAll_1;
	private JRadioButton rdbtnBorrowed_1;
	private JRadioButton rdbtnAvailable_1;
	private JRadioButton rdbtnTop_1;
	private JRadioButton rdbtnSpecialSearch_2;
	private JButton MovieCSearchBtn;
	private final ButtonGroup MagazinesButtonGroup = new ButtonGroup();
	private final ButtonGroup MoviesButtonGroup = new ButtonGroup();
	private JLabel MovieCSearch;
	private JLabel lblName_2;
	private JLabel lblPublicationPeriod;
	private JLabel lblTheme;
	private JLabel lblImage_2;
	private JLabel lblRating_2;
	private JButton MagazineRegistrationBtn;
	private JTextField MagazineRegistrationName;
	private JTextField MagazineRegistrationPublicationPeriod;
	private JTextField MagazineRegistrationTheme;
	private JLabel lblImage_1;
	private JButton BookSearchImageBn;
	private JLabel BookImageLbl;
	private JPanel SpecialSXPnl;
	private JButton SpecialSXBackBtn;
	private JLabel lblSpecialSearch_1;
	private JScrollPane SpecialSXScrollPane;
	private JLabel lblCurrentDate_1;
	private JLabel currentSystemDate;
	private JPanel LendingPnl;
	private JButton btnBack; 
	private JLabel lblMaterialStatus;
	private JLabel lblLendingAndDevolution;
	private JLabel lblDevolution;
	private JLabel lblLending;
	private JLabel lblWhoIsBorrowing;
	private JLabel lblNewLabel_2;
	private JButton btnDevolveMaterial;
	private JButton btnLendMaterial;
	private JComboBox comboBox;
	private JButton MagazineSearchImageBn;
	private JLabel MagazineImagelbl;
	private JTextField MovieReleaseDate;
	private JLabel MovieImagelbl;
	private JButton MovieSearchImageBn;
	private JLabel lblChooseBelongingsType;
	private JSpinner BookRatingSpinner;
	private JSpinner MovieRatingSpinner;
	private JSpinner MagazineRatingSpinner;
	private JLabel TotalBorrowedLblM;
	private JLabel TotalBelongingsLblM;
	//
	//private BookEdit bookEditPnl;
	private CoworkerEdit coworkerEditPnl;
	private MagazineEdit magazineEditPnl;
	private MovieEdit movieEditPnl;
	private RelativeEdit relativeEditPnl;
	private StudentEdit studentEditPnl;
	//
	private JScrollPane allBelongingsPnl;
	private JPanel allBelongingsViewport;
	private JScrollPane borrowedBelonginsPnl;
	private JPanel borrowedBelonginsViewport;
	private JScrollPane topBorrowedBelongingsPnl;
	private JPanel topBorrowedBelongingsViewport;
	private JPanel AllXViewport;
	private JPanel BorrowedXViewport;
	private JPanel AvailableXViewport;
	private JPanel TopXViewport;
	private JPanel SpecialSXViewport;
	private JLabel AllXLbl;
	private JLabel BorrowedXLbl;
	private JLabel AvailableXLbl;
	private JLabel TopXNumberLbl;
	private JLabel TopXLbl;
	private JLabel lblBelongings;
	private JLabel lblBorrowers;
	private JPanel panel_4;
	private JLabel lblRelatives;
	private JLabel lblRelatives_1;
	private JButton SearchRelativesBtn;
	private JPanel panel_5;
	private JLabel lblCoworkers;
	private JLabel lblCoworkers_1;
	private JButton CoworkerSearchBtn;
	private JPanel panel_6;
	private JLabel lblStudents;
	private JLabel lblStudents_1;
	private JButton StudentSearchBtn;
	private JPanel BorrowersSearchPnl;
	private JButton BorrowersSearchBackBtn;
	private JScrollPane BorrowersScrollPane;
	protected JPanel BorrowersSearchViewport;
	protected JLabel BorrowersSearchXLbl;
	protected JLabel lblSelectTheType;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public View(Model model) {
		controller = new Controller(model, this);
		initComponents();
		addEvents();
	}

	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				View.class.getResource("/image/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		StartPnl = new JPanel();
		StartPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(StartPnl, "name_268387601552984");
		StartPnl.setLayout(new MigLayout("", "[][140.00,grow][46.00][349.00,grow][right]", "[][][grow][][grow][][grow]"));

		JPanel MainPanelOptions = new JPanel();
		MainPanelOptions.setBackground(new Color(255, 255, 255));
		StartPnl.add(MainPanelOptions, "cell 0 0 1 7,grow");
		MainPanelOptions.setLayout(new MigLayout("", "[100px][][][]", "[][][][][][][][][][][][][]"));

		searchBtn = new JButton("");
		searchBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/magnifier13.png")));
		MainPanelOptions.add(searchBtn, "flowy,cell 0 0");

		newBorrowerBtn = new JButton("");
		newBorrowerBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/add70.png")));
		MainPanelOptions.add(newBorrowerBtn, "cell 0 1");

		newBelongingBtn = new JButton("");
		newBelongingBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/new10.png")));
		MainPanelOptions.add(newBelongingBtn, "cell 0 2");

		settingsBtn = new JButton("");
		settingsBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/three115.png")));
		MainPanelOptions.add(settingsBtn, "cell 0 3");
		
		lblCurrentDate_1 = new JLabel("Current date:");
		MainPanelOptions.add(lblCurrentDate_1, "cell 0 8");
		
		currentSystemDate = new JLabel("New label");
		MainPanelOptions.add(currentSystemDate, "cell 0 9,growx");

		HistoryBtn = new JButton("History");
		MainPanelOptions.add(HistoryBtn, "cell 0 10,alignx center");

		ManualBtn = new JButton("Manual");
		MainPanelOptions.add(ManualBtn, "cell 0 11,alignx center");

		CreditsBtn = new JButton("Credits");
		MainPanelOptions.add(CreditsBtn, "cell 0 12,alignx center");

		JLabel MyBelongingLbl = new JLabel("My Belongings");
		MyBelongingLbl.setFont(new Font("Consolas", Font.BOLD, 30));
		StartPnl.add(MyBelongingLbl, "cell 1 0 3 1");

		JLabel lblTodas = new JLabel("All");
		lblTodas.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblTodas, "cell 1 1");

		JLabel lblTotal1 = new JLabel("Total:");
		lblTotal1.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(lblTotal1, "cell 2 1");

		TotalBelongingsLblM = new JLabel("Blank");
		TotalBelongingsLblM.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(TotalBelongingsLblM, "cell 3 1");
		
		allBelongingsPnl = new JScrollPane();
		StartPnl.add(allBelongingsPnl, "cell 1 2 3 1,grow");
		
		allBelongingsViewport = new JPanel();
		allBelongingsViewport.setLayout(new BoxLayout(allBelongingsViewport, BoxLayout.LINE_AXIS));
		allBelongingsPnl.setViewportView(allBelongingsViewport);
		

		JLabel lblPrestadas = new JLabel("Lent");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblPrestadas, "cell 1 3");

		JLabel lblTotal2 = new JLabel("Total:");
		lblTotal2.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(lblTotal2, "cell 2 3");

		TotalBorrowedLblM = new JLabel("Blank");
		TotalBorrowedLblM.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(TotalBorrowedLblM, "cell 3 3");
		
		borrowedBelonginsPnl = new JScrollPane();
		StartPnl.add(borrowedBelonginsPnl, "cell 1 4 3 1,grow");
		
		borrowedBelonginsViewport = new JPanel();
		borrowedBelonginsViewport.setLayout(new BoxLayout(borrowedBelonginsViewport, BoxLayout.LINE_AXIS));
		borrowedBelonginsPnl.setViewportView(borrowedBelonginsViewport);
		

		JLabel lblTop = new JLabel("Top");
		lblTop.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblTop, "cell 1 5");
		
		topBorrowedBelongingsPnl = new JScrollPane();
		StartPnl.add(topBorrowedBelongingsPnl, "cell 1 6 3 1,grow");
		
		topBorrowedBelongingsViewport = new JPanel();
		topBorrowedBelongingsViewport.setLayout(new BoxLayout(topBorrowedBelongingsViewport, BoxLayout.LINE_AXIS));
		topBorrowedBelongingsPnl.setViewportView(topBorrowedBelongingsViewport);
		        
		BorrowersSearchPnl = new JPanel();
		BorrowersSearchPnl.setForeground(new Color(0, 0, 0));
		BorrowersSearchPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(BorrowersSearchPnl, "name_4030812266153");
		BorrowersSearchPnl.setLayout(new MigLayout("", "[55px,grow]", "[23px][grow]"));
		        
		BorrowersSearchBackBtn = new JButton("Back");
		BorrowersSearchPnl.add(BorrowersSearchBackBtn, "flowx,cell 0 0,alignx left,aligny top");
		        
		BorrowersScrollPane = new JScrollPane();
		BorrowersSearchPnl.add(BorrowersScrollPane, "cell 0 1,grow");
		        
		BorrowersSearchViewport = new JPanel();
		BorrowersScrollPane.setViewportView(BorrowersSearchViewport);
		BorrowersSearchViewport.setLayout(new BoxLayout(BorrowersSearchViewport, BoxLayout.PAGE_AXIS));
		        
		BorrowersSearchXLbl = new JLabel("X");
		BorrowersSearchPnl.add(BorrowersSearchXLbl, "cell 0 0");
		
		
		LendingPnl = new JPanel();
		contentPane.add(LendingPnl, "name_12656327016431");
		LendingPnl.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][]"));
		        
		btnBack = new JButton("Back");
		LendingPnl.add(btnBack, "flowx,cell 0 0");
		                
		lblLendingAndDevolution = new JLabel("Lending and Devolution");
		LendingPnl.add(lblLendingAndDevolution, "cell 0 0");
		                        
		lblMaterialStatus = new JLabel("Material current status:");
		LendingPnl.add(lblMaterialStatus, "flowx,cell 0 1");
		                                
		lblDevolution = new JLabel("Devolution");
		LendingPnl.add(lblDevolution, "cell 0 3");
		                                        
		btnDevolveMaterial = new JButton("Devolve Material");
		LendingPnl.add(btnDevolveMaterial, "cell 0 4,alignx right");
		                                                
		lblLending = new JLabel("Lending");
		LendingPnl.add(lblLending, "cell 0 6");
		                                                        
		lblWhoIsBorrowing = new JLabel("Who is borrowing it?");
		LendingPnl.add(lblWhoIsBorrowing, "cell 0 7");
		                                                                
		comboBox = new JComboBox();
		LendingPnl.add(comboBox, "cell 0 8,growx");
		                                                                        
		btnLendMaterial = new JButton("Lend Material");
		LendingPnl.add(btnLendMaterial, "cell 0 9,alignx right");
		                                                                                
		lblNewLabel_2 = new JLabel("New label");
		LendingPnl.add(lblNewLabel_2, "cell 0 1");

		SearchPnl = new JPanel();
		contentPane.add(SearchPnl, "name_10085986187124");
		SearchPnl.setLayout(new MigLayout("", "[269.00,grow]", "[][][][grow][][][grow][grow]"));

		SearchBackBtn = new JButton("Back");
		SearchPnl.add(SearchBackBtn, "flowx,cell 0 0");

		JLabel lblBsqueda = new JLabel("Search");
		SearchPnl.add(lblBsqueda, "cell 0 0");
		
		lblBelongings = new JLabel("Belongings");
		lblBelongings.setFont(new Font("Consolas", Font.PLAIN, 20));
		SearchPnl.add(lblBelongings, "cell 0 1");
		
				JLabel lblTipoDeMaterial = new JLabel(
						"Select the type of belonging, and type of search you wish to consult");
				SearchPnl.add(lblTipoDeMaterial, "cell 0 2");

		panel_1 = new JPanel();
		SearchPnl.add(panel_1, "flowx,cell 0 3,alignx center,growy");
		panel_1.setLayout(new MigLayout("", "[][][]", "[][][][][][][][]"));

		lblBooks = new JLabel("Books");
		lblBooks.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_1.add(lblBooks, "cell 0 0");

		lblTypeOfSearch = new JLabel("Type of search:");
		panel_1.add(lblTypeOfSearch, "cell 0 1 2 1");

		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(View.class
				.getResource("/image/book139.png")));
		panel_1.add(label_1, "cell 0 2 1 4");

		lblAll = new JRadioButton("All", true);
		BooksButtonGroup.add(lblAll);
		panel_1.add(lblAll, "cell 1 2,growx");

		lblBorrowed = new JRadioButton("Borrowed");
		BooksButtonGroup.add(lblBorrowed);
		panel_1.add(lblBorrowed, "cell 1 3");

		lblAvailable = new JRadioButton("Available");
		BooksButtonGroup.add(lblAvailable);
		panel_1.add(lblAvailable, "cell 1 4");

		lblTop_1 = new JRadioButton("Top");
		BooksButtonGroup.add(lblTop_1);
		panel_1.add(lblTop_1, "cell 1 5");

		rdbtnSpecialSearch = new JRadioButton("Special search");
		BooksButtonGroup.add(rdbtnSpecialSearch);
		panel_1.add(rdbtnSpecialSearch, "cell 1 6");

		BookCSearchBtn = new JButton("Search");
		panel_1.add(BookCSearchBtn, "cell 0 7 2 1,alignx center");

		panel_2 = new JPanel();
		SearchPnl.add(panel_2, "cell 0 3,alignx center,growy");
		panel_2.setLayout(new MigLayout("", "[][]", "[][][][][][][][]"));

		lblMagazines = new JLabel("Magazines");
		lblMagazines.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_2.add(lblMagazines, "cell 0 0 2 1");

		lblTypeOfSearch_1 = new JLabel("Type of search:");
		panel_2.add(lblTypeOfSearch_1, "cell 0 1 2 1");

		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(View.class
				.getResource("/image/magazine.png")));
		panel_2.add(label_2, "cell 0 2 1 5");

		rdbtnAll = new JRadioButton("All");
		rdbtnAll.setSelected(true);
		MagazinesButtonGroup.add(rdbtnAll);
		panel_2.add(rdbtnAll, "cell 1 2");

		rdbtnBorrowed = new JRadioButton("Borrowed");
		MagazinesButtonGroup.add(rdbtnBorrowed);
		panel_2.add(rdbtnBorrowed, "cell 1 3");

		rdbtnAvailable = new JRadioButton("Available");
		MagazinesButtonGroup.add(rdbtnAvailable);
		panel_2.add(rdbtnAvailable, "cell 1 4");

		rdbtnTop = new JRadioButton("Top");
		MagazinesButtonGroup.add(rdbtnTop);
		panel_2.add(rdbtnTop, "cell 1 5");

		rdbtnSpecialSearch_1 = new JRadioButton("Special search");
		MagazinesButtonGroup.add(rdbtnSpecialSearch_1);
		panel_2.add(rdbtnSpecialSearch_1, "cell 1 6");

		MagazineCSearchBtn = new JButton("Search");
		panel_2.add(MagazineCSearchBtn, "cell 0 7 2 1,alignx center");

		panel_3 = new JPanel();
		SearchPnl.add(panel_3, "cell 0 3,alignx center,growy");
		panel_3.setLayout(new MigLayout("", "[][]", "[][][][][][][][]"));

		lblMovies = new JLabel("Movies");
		lblMovies.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_3.add(lblMovies, "cell 0 0 2 1");

		lblTypeOfSearch_2 = new JLabel("Type of search:");
		panel_3.add(lblTypeOfSearch_2, "cell 0 1 2 1");

		MovieCSearch = new JLabel("");
		MovieCSearch.setIcon(new ImageIcon(View.class
				.getResource("/image/film50.png")));
		panel_3.add(MovieCSearch, "cell 0 2 1 5");

		rdbtnAll_1 = new JRadioButton("All");
		rdbtnAll_1.setSelected(true);
		MoviesButtonGroup.add(rdbtnAll_1);
		panel_3.add(rdbtnAll_1, "cell 1 2");

		rdbtnBorrowed_1 = new JRadioButton("Borrowed");
		MoviesButtonGroup.add(rdbtnBorrowed_1);
		panel_3.add(rdbtnBorrowed_1, "cell 1 3");

		rdbtnAvailable_1 = new JRadioButton("Available");
		MoviesButtonGroup.add(rdbtnAvailable_1);
		panel_3.add(rdbtnAvailable_1, "cell 1 4");

		rdbtnTop_1 = new JRadioButton("Top");
		MoviesButtonGroup.add(rdbtnTop_1);
		panel_3.add(rdbtnTop_1, "cell 1 5");

		rdbtnSpecialSearch_2 = new JRadioButton("Special search");
		MoviesButtonGroup.add(rdbtnSpecialSearch_2);
		panel_3.add(rdbtnSpecialSearch_2, "cell 1 6");

		MovieCSearchBtn = new JButton("Search");
		panel_3.add(MovieCSearchBtn, "cell 0 7 2 1,alignx center");
		
		lblBorrowers = new JLabel("Borrowers");
		lblBorrowers.setFont(new Font("Consolas", Font.PLAIN, 20));
		SearchPnl.add(lblBorrowers, "cell 0 4");
		
		lblSelectTheType = new JLabel("Select the type of borrower you wish to consult");
		SearchPnl.add(lblSelectTheType, "cell 0 5");
		
		panel_4 = new JPanel();
		SearchPnl.add(panel_4, "flowx,cell 0 6,alignx center,growy");
		panel_4.setLayout(new MigLayout("", "[]", "[][][]"));
		
		lblRelatives = new JLabel("Relatives");
		lblRelatives.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_4.add(lblRelatives, "cell 0 0");
		
		lblRelatives_1 = new JLabel("");
		lblRelatives_1.setIcon(new ImageIcon(View.class.getResource("/image/family25.png")));
		panel_4.add(lblRelatives_1, "cell 0 1,alignx center");
		
		SearchRelativesBtn = new JButton("Search");
		panel_4.add(SearchRelativesBtn, "cell 0 2,alignx center");
		
		panel_6 = new JPanel();
		SearchPnl.add(panel_6, "cell 0 6,alignx center,growy");
		panel_6.setLayout(new MigLayout("", "[][]", "[][][][]"));
		
		lblStudents = new JLabel("Students");
		lblStudents.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_6.add(lblStudents, "cell 0 0,alignx center");
		
		lblStudents_1 = new JLabel("");
		lblStudents_1.setIcon(new ImageIcon(View.class.getResource("/image/graduate9.png")));
		panel_6.add(lblStudents_1, "cell 0 1,alignx center");
		
		StudentSearchBtn = new JButton("Search");
		panel_6.add(StudentSearchBtn, "cell 0 2,alignx center,aligny top");
		
		panel_5 = new JPanel();
		SearchPnl.add(panel_5, "cell 0 6,alignx center,growy");
		panel_5.setLayout(new MigLayout("", "[][]", "[][][][]"));
		
		lblCoworkers = new JLabel("Coworkers");
		lblCoworkers.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_5.add(lblCoworkers, "cell 0 0,alignx center");
		
		lblCoworkers_1 = new JLabel("");
		lblCoworkers_1.setIcon(new ImageIcon(View.class.getResource("/image/business53.png")));
		panel_5.add(lblCoworkers_1, "cell 0 1,alignx center");
		
		CoworkerSearchBtn = new JButton("Search");
		panel_5.add(CoworkerSearchBtn, "cell 0 2,alignx center");

		AllXSearch = new JPanel();
		AllXSearch.setBackground(new Color(255, 255, 255));
		contentPane.add(AllXSearch, "name_69265426665252");
		AllXSearch.setLayout(new MigLayout("", "[][125.00][][][grow]", "[][][][grow]"));
		
				AllXSearchBackBtn = new JButton("Back");
				AllXSearch.add(AllXSearchBackBtn, "cell 0 0");

		lblFilterBy = new JLabel("Filter by:");
		AllXSearch.add(lblFilterBy, "cell 0 1");

		lblSearchParameter = new JLabel("Search parameter:");
		AllXSearch.add(lblSearchParameter, "cell 1 1");

		AllXSearchParametersComboBox = new JComboBox<String>();
		AllXSearch.add(AllXSearchParametersComboBox,
				"flowx,cell 0 2,alignx left");

		AllXFilterParameterTf = new JTextField();
		AllXSearch.add(AllXFilterParameterTf, "cell 1 2,growx");
		AllXFilterParameterTf.setColumns(10);

		AllXFilterBtn = new JButton("Filter");
		AllXSearch.add(AllXFilterBtn, "cell 2 2");

		AllXScrollPane = new JScrollPane();
		AllXSearch.add(AllXScrollPane, "cell 0 3 5 1,grow");
		
		AllXViewport = new JPanel();
		AllXViewport.setLayout(new BoxLayout(AllXViewport, BoxLayout.PAGE_AXIS));
		AllXScrollPane.setViewportView(AllXViewport);
		
				JLabel XSearchLbl = new JLabel("All ");
				AllXSearch.add(XSearchLbl, "flowx,cell 1 0 3 1");
				
				AllXLbl = new JLabel("X");
				AllXSearch.add(AllXLbl, "cell 1 0");

		BorrowedXPnl = new JPanel();
		BorrowedXPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(BorrowedXPnl, "name_142213558231291");
		BorrowedXPnl.setLayout(new MigLayout("", "[][][grow]",
				"[][][][grow]"));

		BorrowedXBackBtn = new JButton("Back");
		BorrowedXPnl.add(BorrowedXBackBtn, "flowx,cell 0 0");

		lblBorrowersName = new JLabel("Borrower's name:");
		BorrowedXPnl.add(lblBorrowersName, "cell 0 1");

		BorrowedXParameterTf = new JTextField();
		BorrowedXPnl.add(BorrowedXParameterTf, "cell 0 2,growx");
		BorrowedXParameterTf.setColumns(10);

		BorrowedXFilterBtn = new JButton("Filter");
		BorrowedXPnl.add(BorrowedXFilterBtn, "cell 1 2");

		BorrowedXLbl2 = new JLabel("Borrowed");
		BorrowedXPnl.add(BorrowedXLbl2, "cell 0 0");

		BorrowedXScrollPane = new JScrollPane();
		BorrowedXPnl.add(BorrowedXScrollPane, "cell 0 3 3 1,grow");
		
		BorrowedXViewport = new JPanel();
		BorrowedXViewport.setLayout(new BoxLayout(BorrowedXViewport, BoxLayout.PAGE_AXIS));
		BorrowedXScrollPane.setViewportView(BorrowedXViewport);
		
		BorrowedXLbl = new JLabel("X");
		BorrowedXPnl.add(BorrowedXLbl, "cell 0 0");

		AvailableXPnl = new JPanel();
		AvailableXPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(AvailableXPnl, "name_143497875137437");
		AvailableXPnl
				.setLayout(new MigLayout("", "[][][grow]", "[][grow]"));

		AvailableXBackBtn = new JButton("Back");
		AvailableXPnl.add(AvailableXBackBtn, "cell 0 0");

		AvailableXLbl2 = new JLabel("Available");
		AvailableXPnl.add(AvailableXLbl2, "flowx,cell 1 0");

		AvailableXScrollPane = new JScrollPane();
		AvailableXPnl.add(AvailableXScrollPane, "cell 0 1 3 1,grow");
		
		AvailableXViewport = new JPanel();
		AvailableXViewport.setLayout(new BoxLayout(AvailableXViewport, BoxLayout.PAGE_AXIS));
		AvailableXScrollPane.setViewportView(AvailableXViewport);
		
		AvailableXLbl = new JLabel("X");
		AvailableXPnl.add(AvailableXLbl, "cell 1 0");

		TopXPnl = new JPanel();
		TopXPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(TopXPnl, "name_143792841267241");
		TopXPnl.setLayout(new MigLayout("", "[][][grow]", "[][grow]"));

		TopXBackBtn = new JButton("Back");
		TopXPnl.add(TopXBackBtn, "cell 0 0");

		TopXLbl2 = new JLabel("Top");
		TopXPnl.add(TopXLbl2, "flowx,cell 1 0");

		TopXScrollPane = new JScrollPane();
		TopXPnl.add(TopXScrollPane, "cell 0 1 3 1,grow");
		
		TopXViewport = new JPanel();
		TopXViewport.setLayout(new BoxLayout(TopXViewport, BoxLayout.PAGE_AXIS));
		TopXScrollPane.setViewportView(TopXViewport);
		
		TopXNumberLbl = new JLabel("number");
		TopXPnl.add(TopXNumberLbl, "cell 1 0");
		
		TopXLbl = new JLabel("X");
		TopXPnl.add(TopXLbl, "cell 1 0");
		
		SpecialSXPnl = new JPanel();
		SpecialSXPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(SpecialSXPnl, "name_188006296778183");
		SpecialSXPnl.setLayout(new MigLayout("", "[grow][]", "[][grow]"));
		
		SpecialSXBackBtn = new JButton("Back");
		SpecialSXPnl.add(SpecialSXBackBtn, "flowx,cell 0 0");
		
		SpecialSXScrollPane = new JScrollPane();
		SpecialSXPnl.add(SpecialSXScrollPane, "cell 0 1 2 1,grow");
		
		SpecialSXViewport = new JPanel();
		SpecialSXViewport.setLayout(new BoxLayout(SpecialSXViewport, BoxLayout.PAGE_AXIS));
		SpecialSXScrollPane.setViewportView(SpecialSXViewport);
		
		lblSpecialSearch_1 = new JLabel("Special search");
		SpecialSXPnl.add(lblSpecialSearch_1, "cell 0 0");

		BorrowerRegistrationPnl = new JPanel();
		contentPane.add(BorrowerRegistrationPnl, "name_440112681124098");
		BorrowerRegistrationPnl.setLayout(new MigLayout("", "[grow]",
				"[][][][][][][][][][][][][][]"));

		BorrowerRegistrationBackBtn = new JButton("Back");
		BorrowerRegistrationBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BorrowerRegistrationPnl.add(BorrowerRegistrationBackBtn,
				"flowx,cell 0 0");

		JLabel lblRegistroDeNuevo = new JLabel("New Borrower's Register");
		BorrowerRegistrationPnl.add(lblRegistroDeNuevo, "cell 0 0");

		JLabel lblSeleccionesElijaLa = new JLabel(
				"Choose the borrower's category to create");
		BorrowerRegistrationPnl.add(lblSeleccionesElijaLa, "cell 0 1");

		JPanel panel = new JPanel();
		BorrowerRegistrationPnl.add(panel, "cell 0 2,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		newRelativeBtn = new JButton("Relative");
		panel.add(newRelativeBtn);
		newRelativeBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/family25.png")));

		newStudentBtn = new JButton("Student");
		panel.add(newStudentBtn);
		newStudentBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/graduate9.png")));

		newCoworkerBtn = new JButton("Coworker");
		panel.add(newCoworkerBtn);
		newCoworkerBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/business53.png")));

		CoworkerRegistrationPnl = new JPanel();
		contentPane.add(CoworkerRegistrationPnl, "name_442060658397681");
		CoworkerRegistrationPnl.setLayout(new MigLayout("",
				"[252.00][188.00][grow][]", "[][][][][][][][][][]"));

		CoworkerRegistrationBackBtn = new JButton("Back");
		CoworkerRegistrationPnl.add(CoworkerRegistrationBackBtn,
				"flowx,cell 0 0");

		JLabel CoworkerRegistrationLbl = new JLabel("Coworker registration");
		CoworkerRegistrationPnl.add(CoworkerRegistrationLbl,
				"cell 0 0,alignx right");

		JLabel CoworkerNameLbl = new JLabel("Name:");
		CoworkerRegistrationPnl
				.add(CoworkerNameLbl, "cell 0 1,alignx trailing");

		CoworkerName = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerName, "cell 1 1,growx");
		CoworkerName.setColumns(10);

		JLabel lblPrimerApellido = new JLabel("First last name:");
		CoworkerRegistrationPnl.add(lblPrimerApellido,
				"cell 0 2,alignx trailing");

		CoworkerFirstLastName = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerFirstLastName, "cell 1 2,growx");
		CoworkerFirstLastName.setColumns(10);

		JLabel lblSegundoApellido = new JLabel("Second last name:");
		CoworkerRegistrationPnl.add(lblSegundoApellido,
				"cell 0 3,alignx trailing");

		CoworkerSecondLastName = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerSecondLastName, "cell 1 3,growx");
		CoworkerSecondLastName.setColumns(10);

		JLabel lblTelefono = new JLabel("Phone number:");
		CoworkerRegistrationPnl.add(lblTelefono, "cell 0 5,alignx trailing");

		CoworkerPhoneNumber = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerPhoneNumber, "cell 1 5,growx");
		CoworkerPhoneNumber.setColumns(10);

		JLabel CoworkerEmailLbl = new JLabel("Email:");
		CoworkerRegistrationPnl.add(CoworkerEmailLbl,
				"cell 0 6,alignx trailing");

		CoworkerEmail = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerEmail, "cell 1 6,growx");
		CoworkerEmail.setColumns(10);

		JLabel CoworkerWorkPositionLbl = new JLabel("Work position:");
		CoworkerRegistrationPnl.add(CoworkerWorkPositionLbl,
				"cell 0 8,alignx trailing");

		CoworkerWorkPosition = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerWorkPosition, "cell 1 8,growx");
		CoworkerWorkPosition.setColumns(10);

		CoworkerRegistrationBtn = new JButton("Register");
		CoworkerRegistrationPnl.add(CoworkerRegistrationBtn,
				"cell 1 9,alignx right");

		StudentRegistrationPnl = new JPanel();
		contentPane.add(StudentRegistrationPnl, "name_442145250348966");
		StudentRegistrationPnl.setLayout(new MigLayout("",
				"[][202.00][159.00,grow][71.00]", "[][][][][][][][][][][][]"));

		StudentRegistrationBackBtn = new JButton("Back");
		StudentRegistrationPnl
				.add(StudentRegistrationBackBtn, "flowx,cell 0 0");

		JLabel StudentRegistrationLbl = new JLabel("Student registration");
		StudentRegistrationPnl.add(StudentRegistrationLbl, "cell 0 0");
				
						JLabel lblNombre_1 = new JLabel("Name:");
						StudentRegistrationPnl.add(lblNombre_1, "cell 0 2,alignx right");
		
				StudentName = new JTextField();
				StudentRegistrationPnl.add(StudentName, "cell 1 2,growx");
				StudentName.setColumns(10);

		JLabel lblPrimerApellido_1 = new JLabel("First last name:");
		StudentRegistrationPnl.add(lblPrimerApellido_1,
				"cell 0 3,alignx trailing");

		StudentFirstLastName = new JTextField();
		StudentRegistrationPnl.add(StudentFirstLastName, "cell 1 3,growx");
		StudentFirstLastName.setColumns(10);

		JLabel lblSegundoApellido_1 = new JLabel("Second last name:");
		StudentRegistrationPnl.add(lblSegundoApellido_1,
				"cell 0 4,alignx trailing");

		StudentSecondLastName = new JTextField();
		StudentRegistrationPnl.add(StudentSecondLastName, "cell 1 4,growx");
		StudentSecondLastName.setColumns(10);

		JLabel lblTelfono = new JLabel("Phone number:");
		StudentRegistrationPnl.add(lblTelfono, "cell 0 6,alignx trailing");

		StudentPhoneNumber = new JTextField();
		StudentRegistrationPnl.add(StudentPhoneNumber, "cell 1 6,growx");
		StudentPhoneNumber.setColumns(10);

		JLabel lblCorreoElectrnico_1 = new JLabel("Email:");
		StudentRegistrationPnl.add(lblCorreoElectrnico_1,
				"cell 0 7,alignx trailing");

		StudentEmail = new JTextField();
		StudentRegistrationPnl.add(StudentEmail, "cell 1 7,growx");
		StudentEmail.setColumns(10);
		
				JLabel lblCarnetDeEstudiante = new JLabel("ID:");
				StudentRegistrationPnl.add(lblCarnetDeEstudiante,
						"cell 0 9,alignx trailing");
		
				StudentID = new JTextField();
				StudentRegistrationPnl.add(StudentID, "cell 1 9,growx");
				StudentID.setColumns(10);

		StudentRegistrationBtn = new JButton("Register");
		StudentRegistrationPnl.add(StudentRegistrationBtn,
				"cell 1 11,alignx right");

		RelativeRegistrationPnl = new JPanel();
		contentPane.add(RelativeRegistrationPnl, "name_442084621359804");
		RelativeRegistrationPnl.setLayout(new MigLayout("",
				"[][226.00][grow][]", "[][][][][][][][][][]"));

		RelativeRegistrationBackBtn = new JButton("Back");
		RelativeRegistrationPnl.add(RelativeRegistrationBackBtn,
				"flowx,cell 0 0");

		JLabel lblRegistroDeFamiliar = new JLabel("Relative registration");
		RelativeRegistrationPnl.add(lblRegistroDeFamiliar, "cell 0 0");

		JLabel lblNombre_2 = new JLabel("Name:");
		RelativeRegistrationPnl.add(lblNombre_2, "cell 0 1,alignx right");

		RelativeName = new JTextField();
		RelativeRegistrationPnl.add(RelativeName, "cell 1 1,growx");
		RelativeName.setColumns(10);

		JLabel lblPrimerApellido_2 = new JLabel("First last name:");
		RelativeRegistrationPnl.add(lblPrimerApellido_2,
				"cell 0 2,alignx right");

		RelativeFirstName = new JTextField();
		RelativeRegistrationPnl.add(RelativeFirstName, "cell 1 2,growx");
		RelativeFirstName.setColumns(10);

		JLabel lblSegundoApellido_2 = new JLabel("Second last name:");
		RelativeRegistrationPnl.add(lblSegundoApellido_2,
				"cell 0 3,alignx right");

		RelativeSecondLastName = new JTextField();
		RelativeRegistrationPnl.add(RelativeSecondLastName, "cell 1 3,growx");
		RelativeSecondLastName.setColumns(10);

		JLabel lblTelfono_1 = new JLabel("Phone number:");
		RelativeRegistrationPnl.add(lblTelfono_1, "cell 0 5,alignx right");

		RelativePhoneNumber = new JTextField();
		RelativeRegistrationPnl.add(RelativePhoneNumber, "cell 1 5,growx");
		RelativePhoneNumber.setColumns(10);

		JLabel lblCorreoElectrnico_2 = new JLabel("Email:");
		RelativeRegistrationPnl.add(lblCorreoElectrnico_2,
				"cell 0 6,alignx right");

		RelativeEmail = new JTextField();
		RelativeRegistrationPnl.add(RelativeEmail, "cell 1 6,growx");
		RelativeEmail.setColumns(10);

		JLabel RelativeKinshipLbl = new JLabel("Kinship:");
		RelativeRegistrationPnl
				.add(RelativeKinshipLbl, "cell 0 8,alignx right");

		RelativeKinship = new JTextField();
		RelativeRegistrationPnl.add(RelativeKinship, "cell 1 8,growx");
		RelativeKinship.setColumns(10);

		RelativeRegistrationBtn = new JButton("Register");
		RelativeRegistrationPnl.add(RelativeRegistrationBtn, "cell 1 9");

		BelongingRegistrationPnl = new JPanel();
		contentPane.add(BelongingRegistrationPnl, "name_69061404162527");
		BelongingRegistrationPnl.setLayout(new MigLayout("", "[778.00]", "[][][]"));

		BelongingRegistrationBackBtn = new JButton("Back");
		BelongingRegistrationPnl.add(BelongingRegistrationBackBtn,
				"flowx,cell 0 0,alignx left");

		JLabel lblBelongingRegistration = new JLabel("New Belonging's Registration");
		BelongingRegistrationPnl.add(lblBelongingRegistration, "cell 0 0");
				
				lblChooseBelongingsType = new JLabel("Choose belonging's type to create");
				BelongingRegistrationPnl.add(lblChooseBelongingsType, "cell 0 1");
		
				newBookBtn = new JButton("Book");
				newBookBtn.setIcon(new ImageIcon(View.class
						.getResource("/image/book139.png")));
				BelongingRegistrationPnl.add(newBookBtn, "flowx,cell 0 2,alignx center");
		
				newMagazineBtn = new JButton("Magazine");
				newMagazineBtn.setIcon(new ImageIcon(View.class
						.getResource("/image/magazine.png")));
				BelongingRegistrationPnl.add(newMagazineBtn, "cell 0 2");
				
						newMovieBtn = new JButton("Movie");
						newMovieBtn.setIcon(new ImageIcon(View.class
								.getResource("/image/film50.png")));
						BelongingRegistrationPnl.add(newMovieBtn, "cell 0 2");

		MagazineRegistrationPnl = new JPanel();
		contentPane.add(MagazineRegistrationPnl, "name_69108422085933");
		MagazineRegistrationPnl.setLayout(new MigLayout("", "[][][][159.00]", "[][][][][][][][][]"));

		MagazineRegistrationBackBtn = new JButton("Back");
		MagazineRegistrationPnl.add(MagazineRegistrationBackBtn,
				"flowx,cell 0 0");

		JLabel lblMagazineRegistration = new JLabel("Magazine registration");
		MagazineRegistrationPnl.add(lblMagazineRegistration, "cell 0 0");
		
		lblName_2 = new JLabel("Name:");
		MagazineRegistrationPnl.add(lblName_2, "cell 1 1,alignx trailing");
		
		MagazineRegistrationName = new JTextField();
		MagazineRegistrationPnl.add(MagazineRegistrationName, "cell 2 1,growx");
		MagazineRegistrationName.setColumns(10);
		
		lblPublicationPeriod = new JLabel("Publication period:");
		MagazineRegistrationPnl.add(lblPublicationPeriod, "cell 1 2,alignx trailing");
		
		MagazineRegistrationPublicationPeriod = new JTextField();
		MagazineRegistrationPnl.add(MagazineRegistrationPublicationPeriod, "cell 2 2,growx");
		MagazineRegistrationPublicationPeriod.setColumns(10);
		
		lblTheme = new JLabel("Theme:");
		MagazineRegistrationPnl.add(lblTheme, "cell 1 3,alignx trailing");
		
		MagazineRegistrationTheme = new JTextField();
		MagazineRegistrationPnl.add(MagazineRegistrationTheme, "cell 2 3,growx");
		MagazineRegistrationTheme.setColumns(10);
		
		lblRating_2 = new JLabel("Rating:");
		MagazineRegistrationPnl.add(lblRating_2, "cell 1 4,alignx trailing");
		
		MagazineRatingSpinner = new JSpinner();
		MagazineRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		MagazineRegistrationPnl.add(MagazineRatingSpinner, "cell 2 4");
		
		lblImage_2 = new JLabel("Image:");
		MagazineRegistrationPnl.add(lblImage_2, "cell 1 5,alignx trailing");
		
		MagazineImagelbl = new JLabel("");
		MagazineImagelbl.setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
		MagazineRegistrationPnl.add(MagazineImagelbl, "cell 2 5");
		
		MagazineSearchImageBn = new JButton("Search Image");
		MagazineRegistrationPnl.add(MagazineSearchImageBn, "cell 3 5,aligny baseline");
		
		MagazineRegistrationBtn = new JButton("Register");
		MagazineRegistrationPnl.add(MagazineRegistrationBtn, "cell 2 8,alignx center");

		BookRegistrationPnl = new JPanel();
		contentPane.add(BookRegistrationPnl, "name_69114565454795");
		BookRegistrationPnl.setLayout(new MigLayout("", "[][][][86.00]", "[][][][][][][154.00][][][]"));

		BookRegistrationBackBtn = new JButton("Back");
		BookRegistrationPnl.add(BookRegistrationBackBtn, "flowx,cell 0 0");

		JLabel lblBookRegistration = new JLabel("Book registration");
		BookRegistrationPnl.add(lblBookRegistration, "cell 0 0");

		lblName_1 = new JLabel("Name:");
		BookRegistrationPnl.add(lblName_1, "cell 1 1,alignx trailing");

		BookName = new JTextField();
		BookRegistrationPnl.add(BookName, "cell 2 1,growx");
		BookName.setColumns(10);

		lblAuthor = new JLabel("Author:");
		BookRegistrationPnl.add(lblAuthor, "cell 1 2,alignx trailing");

		BookAuthor = new JTextField();
		BookRegistrationPnl.add(BookAuthor, "cell 2 2,growx");
		BookAuthor.setColumns(10);

		lblEditorial = new JLabel("Editorial:");
		BookRegistrationPnl.add(lblEditorial, "cell 1 3,alignx trailing");

		BookEditorial = new JTextField();
		BookRegistrationPnl.add(BookEditorial, "cell 2 3,growx");
		BookEditorial.setColumns(10);

		lblEdition = new JLabel("Edition:");
		BookRegistrationPnl.add(lblEdition, "cell 1 4,alignx trailing");

		BookEdition = new JTextField();
		BookRegistrationPnl.add(BookEdition, "cell 2 4,growx");
		BookEdition.setColumns(10);
		
				lblRating_1 = new JLabel("Rating:");
				BookRegistrationPnl.add(lblRating_1, "cell 1 5,alignx right");
				
				BookRatingSpinner = new JSpinner();
				BookRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
				BookRegistrationPnl.add(BookRatingSpinner, "cell 2 5");
				
				lblImage_1 = new JLabel("Image:");
				BookRegistrationPnl.add(lblImage_1, "cell 1 6");
				
				BookImageLbl = new JLabel("");
				BookImageLbl.setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
				BookRegistrationPnl.add(BookImageLbl, "cell 2 6");
				
				BookSearchImageBn = new JButton("Search Image");
				
				BookRegistrationPnl.add(BookSearchImageBn, "cell 3 6,aligny bottom");
				
						BookRegistrationBtn = new JButton("Register");
						BookRegistrationPnl.add(BookRegistrationBtn, "cell 2 9,alignx center");

		MovieRegistrationPnl = new JPanel();
		contentPane.add(MovieRegistrationPnl, "name_69169014990127");
		MovieRegistrationPnl.setLayout(new MigLayout("", "[][][257.00][]", "[][][][][][][][][][]"));

		MovieRegistrationBackBtn = new JButton("Back");
		MovieRegistrationPnl.add(MovieRegistrationBackBtn, "flowx,cell 0 0");

		JLabel lblMovieRegistration = new JLabel("Movie registration");
		MovieRegistrationPnl.add(lblMovieRegistration, "cell 0 0");

		JLabel lblName = new JLabel("Name:");
		MovieRegistrationPnl.add(lblName, "cell 1 1,alignx trailing");

		MovieName = new JTextField();
		MovieRegistrationPnl.add(MovieName, "cell 2 1,growx");
		MovieName.setColumns(10);
								
										lblGenre = new JLabel("Genre:");
										MovieRegistrationPnl.add(lblGenre, "cell 1 2,alignx trailing");
						
								MovieGenre = new JTextField();
								MovieRegistrationPnl.add(MovieGenre, "cell 2 2,growx");
								MovieGenre.setColumns(10);
						
								lblDirector = new JLabel("Director:");
								MovieRegistrationPnl.add(lblDirector, "cell 1 3,alignx trailing");
						
								MovieDirector = new JTextField();
								MovieRegistrationPnl.add(MovieDirector, "cell 2 3,growx");
								MovieDirector.setColumns(10);
				
						lblReleaseDate = new JLabel("Release date:");
						MovieRegistrationPnl.add(lblReleaseDate, "cell 1 4,alignx trailing");
						
						MovieReleaseDate = new JTextField();
						MovieRegistrationPnl.add(MovieReleaseDate, "cell 2 4,growx");
						MovieReleaseDate.setColumns(10);
				
						lblRating = new JLabel("Rating:");
						MovieRegistrationPnl.add(lblRating, "cell 1 5,alignx right");
				
				MovieRatingSpinner = new JSpinner();
				MovieRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
				MovieRegistrationPnl.add(MovieRatingSpinner, "cell 2 5");
		
				JLabel lblImage = new JLabel("Image:");
				MovieRegistrationPnl.add(lblImage, "cell 1 6,alignx right");
		
		MovieImagelbl = new JLabel("");
		MovieImagelbl.setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
		MovieRegistrationPnl.add(MovieImagelbl, "cell 2 6");
		
		MovieSearchImageBn = new JButton("Search Image");
		MovieRegistrationPnl.add(MovieSearchImageBn, "cell 3 6,aligny bottom");

		MovieRegistrationBtn = new JButton("Register");
		MovieRegistrationPnl.add(MovieRegistrationBtn, "cell 2 9,alignx center");

		SettingPnl = new JPanel();
		contentPane.add(SettingPnl, "name_69192387445960");
		SettingPnl.setLayout(new MigLayout("", "[][439.00][grow][]",
				"[][][][][][][][][][][][][][][][][][][][][][][]"));

		SettingBackBtn = new JButton("Back");
		SettingBackBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingBackBtn, "cell 0 0");

		lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Consolas", Font.PLAIN, 24));
		SettingPnl.add(lblSettings, "cell 1 0");

		lblLoanDays = new JLabel("Loan days");
		lblLoanDays.setFont(new Font("Consolas", Font.BOLD, 16));
		SettingPnl.add(lblLoanDays, "flowx,cell 1 1");

		lblCurrent_2 = new JLabel("Current:");
		lblCurrent_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblCurrent_2, "flowx,cell 1 2");

		SettingsCurrentLoanDaysLbl = new JLabel("0000");
		SettingsCurrentLoanDaysLbl
				.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsCurrentLoanDaysLbl, "cell 1 2");

		SettingsChangeLoanDaysSpn = new JSpinner();
		SettingsChangeLoanDaysSpn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingsChangeLoanDaysSpn.setModel(new SpinnerNumberModel(
				new Integer(1), new Integer(1), null, new Integer(1)));
		SettingPnl.add(SettingsChangeLoanDaysSpn, "flowx,cell 1 3");

		lblToleranceDays = new JLabel("Tolerance days");
		lblToleranceDays.setFont(new Font("Consolas", Font.BOLD, 16));
		SettingPnl.add(lblToleranceDays, "flowx,cell 1 4");

		lblCurrent_1 = new JLabel("Current:");
		lblCurrent_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblCurrent_1, "flowx,cell 1 5");

		SettingsCurrentToleranceDaysLbl = new JLabel("0000");
		SettingsCurrentToleranceDaysLbl.setFont(new Font("Consolas",
				Font.PLAIN, 11));
		SettingPnl.add(SettingsCurrentToleranceDaysLbl, "cell 1 5");

		SettingsChangeToleranceDaysSpn = new JSpinner();
		SettingsChangeToleranceDaysSpn.setModel(new SpinnerNumberModel(
				new Integer(0), new Integer(0), null, new Integer(1)));
		SettingsChangeToleranceDaysSpn.setFont(new Font("Consolas", Font.PLAIN,
				11));
		SettingPnl.add(SettingsChangeToleranceDaysSpn, "flowx,cell 1 6");

		lblTopx = new JLabel("TopX");
		lblTopx.setFont(new Font("Consolas", Font.BOLD, 16));
		SettingPnl.add(lblTopx, "flowx,cell 1 7");

		lblCurrent = new JLabel("Current:");
		lblCurrent.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblCurrent, "flowx,cell 1 8");

		SettingsChangeTopXSpn = new JSpinner();
		SettingsChangeTopXSpn.setModel(new SpinnerNumberModel(new Integer(2),
				new Integer(2), null, new Integer(1)));
		SettingsChangeTopXSpn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsChangeTopXSpn, "flowx,cell 1 9");

		lblSpecialSearch = new JLabel("Special search");
		lblSpecialSearch.setFont(new Font("Consolas", Font.BOLD, 16));
		SettingPnl.add(lblSpecialSearch, "flowx,cell 1 11");

		lblTimesborrowed = new JLabel("Times borrowed:");
		lblTimesborrowed.setFont(new Font("Consolas", Font.PLAIN, 15));
		SettingPnl.add(lblTimesborrowed, "cell 1 12");

		lblCurrent_3 = new JLabel("Current:");
		lblCurrent_3.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblCurrent_3, "flowx,cell 1 13");

		SettingsChangeTimesBorrowedSpn = new JSpinner();
		SettingsChangeTimesBorrowedSpn.setFont(new Font("Consolas", Font.PLAIN,
				11));
		SettingsChangeTimesBorrowedSpn.setModel(new SpinnerNumberModel(
				new Integer(0), new Integer(0), null, new Integer(1)));
		SettingPnl.add(SettingsChangeTimesBorrowedSpn, "flowx,cell 1 14");

		lblMonths = new JLabel("Months:");
		lblMonths.setFont(new Font("Consolas", Font.PLAIN, 15));
		SettingPnl.add(lblMonths, "cell 1 15");

		lblCurrent_4 = new JLabel("Current:");
		lblCurrent_4.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblCurrent_4, "flowx,cell 1 16");

		SettingsChangeMonthsSpn = new JSpinner();
		SettingsChangeMonthsSpn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingsChangeMonthsSpn.setModel(new SpinnerNumberModel(new Integer(1),
				new Integer(1), null, new Integer(1)));
		SettingPnl.add(SettingsChangeMonthsSpn, "flowx,cell 1 17");

		lblSystemDate = new JLabel("System date");
		lblSystemDate.setFont(new Font("Consolas", Font.BOLD, 16));
		SettingPnl.add(lblSystemDate, "flowx,cell 1 19");

		lblCurrentDate = new JLabel("Current date:");
		SettingPnl.add(lblCurrentDate, "flowy,cell 1 20");

		label = new JLabel("");
		SettingPnl.add(label, "flowx,cell 1 21");

		lblDaysIntoThe = new JLabel("Days into the future:");
		lblDaysIntoThe.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(lblDaysIntoThe, "cell 1 21");

		SettingsCurrentTopXLbl = new JLabel("0000");
		SettingsCurrentTopXLbl.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsCurrentTopXLbl, "cell 1 8");

		lblExplanation = new JLabel("Set the amount of members of the list of most borrowed");
		lblExplanation.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation, "cell 1 7");

		lblExplanation_1 = new JLabel("The number of days you want to loan your belongings");
		lblExplanation_1.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_1, "cell 1 1");

		lblExplanation_2 = new JLabel("An amount of days that indicate some extra days of loan");
		lblExplanation_2.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_2, "cell 1 4");

		lblExplanation_3 = new JLabel("Searches belongings borrowed a certain amount of times in a set time period");
		lblExplanation_3.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_3, "cell 1 11");

		SettingsCurrentTimesBorrowedLbl = new JLabel("0000");
		SettingsCurrentTimesBorrowedLbl.setFont(new Font("Consolas",
				Font.PLAIN, 11));
		SettingPnl.add(SettingsCurrentTimesBorrowedLbl, "cell 1 13");

		SettingsCurrentMonthsLbl = new JLabel("0000");
		SettingsCurrentMonthsLbl.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsCurrentMonthsLbl, "cell 1 16");

		lblExplanation_4 = new JLabel("Explanation");
		lblExplanation_4.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_4, "cell 1 19");

		SettingsGoToTheFutureSpn = new JSpinner();
		SettingsGoToTheFutureSpn.setModel(new SpinnerNumberModel(
				new Integer(1), new Integer(1), null, new Integer(1)));
		SettingsGoToTheFutureSpn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsGoToTheFutureSpn, "flowx,cell 1 22");

		SettingsGoToTheFutureBtn = new JButton("Go!");
		SettingsGoToTheFutureBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsGoToTheFutureBtn, "cell 1 22");

		SettingsCurrentDateLbl = new JLabel("00/00/0000");
		SettingPnl.add(SettingsCurrentDateLbl, "cell 1 20");

		SettingsChangeLoanDaysBtn = new JButton("Change");
		SettingsChangeLoanDaysBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsChangeLoanDaysBtn, "cell 1 3");

		SettingsChangeToleranceDaysBtn = new JButton("Change");
		SettingsChangeToleranceDaysBtn.setFont(new Font("Consolas", Font.PLAIN,
				11));
		SettingPnl.add(SettingsChangeToleranceDaysBtn, "cell 1 6");

		SettingsChangeTopXBtn = new JButton("Change");
		SettingsChangeTopXBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsChangeTopXBtn, "cell 1 9");

		SettingsChangeTimesBorrowedBtn = new JButton("Change");
		SettingsChangeTimesBorrowedBtn.setFont(new Font("Consolas", Font.PLAIN,
				11));
		SettingPnl.add(SettingsChangeTimesBorrowedBtn, "cell 1 14");

		SettingsChangeMonthsBtn = new JButton("Change");
		SettingsChangeMonthsBtn.setFont(new Font("Consolas", Font.PLAIN, 11));
		SettingPnl.add(SettingsChangeMonthsBtn, "cell 1 17");

		CreditsPnl = new JPanel();
		contentPane.add(CreditsPnl, "name_5917427800206");
		CreditsPnl.setLayout(new MigLayout("", "[356.00px][714.00px]", "[15px][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(View.class.getResource("/image/logo.png")));
		CreditsPnl.add(lblLogo, "cell 0 0 2 1,alignx center,aligny top");

		JLabel lblCreadores = new JLabel("Project created by:");
		CreditsPnl.add(lblCreadores, "cell 0 1 2 1");

		JLabel lblRoberto = new JLabel("Roberto Chen Zheng");
		CreditsPnl.add(lblRoberto, "cell 1 2");

		JLabel lblVinicio = new JLabel("Vinicio Flores Hernández");
		CreditsPnl.add(lblVinicio, "cell 1 3");

		JLabel lblFaubricio = new JLabel("Faubricio Forester Soto");
		CreditsPnl.add(lblFaubricio, "cell 1 4");

		JLabel lblPedro = new JLabel("Pedro Rodríguez de Oliveira");
		CreditsPnl.add(lblPedro, "cell 1 5");

		JLabel lblCreadoraLogo = new JLabel("Logo creator:");
		CreditsPnl.add(lblCreadoraLogo, "cell 0 7");

		JLabel lblDayana = new JLabel("Dayana Méndez Salas");
		CreditsPnl.add(lblDayana, "cell 1 8");

		JLabel lblVersion = new JLabel("Version:");
		CreditsPnl.add(lblVersion, "cell 0 10");

		JLabel lblVersionNum = new JLabel("0.8");
		CreditsPnl.add(lblVersionNum, "cell 1 11");
		
				CreditsBackBtn = new JButton("Back");
				CreditsBackBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				CreditsPnl.add(CreditsBackBtn, "cell 0 17,alignx left");
	}

	private void addEvents() {
		// TODO
		//Start panel
		newBorrowerBtn.addActionListener(controller);
		newBelongingBtn.addActionListener(controller);
		CreditsBtn.addActionListener(controller);
		settingsBtn.addActionListener(controller);
		searchBtn.addActionListener(controller);
		HistoryBtn.addActionListener(controller);
		ManualBtn.addActionListener(controller);
		
		//Settings panel
		SettingBackBtn.addActionListener(controller);
		SettingsChangeTopXBtn.addActionListener(controller);
		SettingsChangeLoanDaysBtn.addActionListener(controller);
		SettingsChangeToleranceDaysBtn.addActionListener(controller);
		SettingsChangeTimesBorrowedBtn.addActionListener(controller);
		SettingsChangeMonthsBtn.addActionListener(controller);
		SettingsGoToTheFutureBtn.addActionListener(controller);
				
		//Relative registration panel
		RelativeRegistrationBackBtn.addActionListener(controller);
		RelativeRegistrationBtn.addActionListener(controller);
		StudentRegistrationBackBtn.addActionListener(controller);
		StudentRegistrationBtn.addActionListener(controller);
		CoworkerRegistrationBackBtn.addActionListener(controller);
		CoworkerRegistrationBtn.addActionListener(controller);
		
		// New borrower panel
		newRelativeBtn.addActionListener(controller);
		newStudentBtn.addActionListener(controller);
		newCoworkerBtn.addActionListener(controller);
		BorrowerRegistrationBackBtn.addActionListener(controller);
		
		//Credits
		CreditsBackBtn.addActionListener(controller);
		
		//New belonging registration
		BelongingRegistrationBackBtn.addActionListener(controller);
		newBookBtn.addActionListener(controller);
		newMagazineBtn.addActionListener(controller);
		newMovieBtn.addActionListener(controller);
		
		//Book registration panel
		BookRegistrationBackBtn.addActionListener(controller);
		BookRegistrationBtn.addActionListener(controller);
		
		//Magazine registration panel
		MagazineRegistrationBackBtn.addActionListener(controller);
		MagazineRegistrationBtn.addActionListener(controller);;
		
		//Movie registration panel
		MovieRegistrationBackBtn.addActionListener(controller);
		MovieRegistrationBtn.addActionListener(controller);
		
		//All X search panel
		AllXSearchBackBtn.addActionListener(controller);
		AllXFilterBtn.addActionListener(controller);
		
		//Borrowed X
		BorrowedXBackBtn.addActionListener(controller);
		BorrowedXFilterBtn.addActionListener(controller);
		
		//Special X search
		SpecialSXBackBtn.addActionListener(controller);
		
		//Top X
		TopXBackBtn.addActionListener(controller);
		
		//Available X
		AvailableXBackBtn.addActionListener(controller);
		
		//Searches panel
		SearchBackBtn.addActionListener(controller);
		BookCSearchBtn.addActionListener(controller);
		MovieCSearchBtn.addActionListener(controller);
		MagazineCSearchBtn.addActionListener(controller);
		
		BookSearchImageBn.addActionListener(controller);
		MagazineSearchImageBn.addActionListener(controller);
		MovieSearchImageBn.addActionListener(controller);
		
		
		SearchRelativesBtn.addActionListener(controller);
		StudentSearchBtn.addActionListener(controller);
		CoworkerSearchBtn.addActionListener(controller);
		
		BorrowersSearchBackBtn.addActionListener(controller);
		
		//TODO
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getCoworkerName() {
		return CoworkerName;
	}

	public JTextField getCoworkerFirstLastName() {
		return CoworkerFirstLastName;
	}

	public JTextField getCoworkerSecondLastName() {
		return CoworkerSecondLastName;
	}

	public JTextField getCoworkerPhoneNumber() {
		return CoworkerPhoneNumber;
	}

	public JTextField getCoworkerEmail() {
		return CoworkerEmail;
	}

	public JTextField getCoworkerWorkPosition() {
		return CoworkerWorkPosition;
	}

	public JTextField getStudentName() {
		return StudentName;
	}

	public JTextField getStudentFirstLastName() {
		return StudentFirstLastName;
	}

	public JTextField getStudentSecondLastName() {
		return StudentSecondLastName;
	}

	public JTextField getStudentPhoneNumber() {
		return StudentPhoneNumber;
	}

	public JTextField getStudentEmail() {
		return StudentEmail;
	}

	public JTextField getStudentID() {
		return StudentID;
	}

	public JTextField getRelativeName() {
		return RelativeName;
	}

	public JTextField getRelativeFirstName() {
		return RelativeFirstName;
	}

	public JTextField getRelativePhoneNumber() {
		return RelativePhoneNumber;
	}

	public JTextField getRelativeSecondLastName() {
		return RelativeSecondLastName;
	}

	public JTextField getRelativeEmail() {
		return RelativeEmail;
	}

	public JTextField getRelativeKinship() {
		return RelativeKinship;
	}

	public JButton getRelativeRegistrationBackBtn() {
		return RelativeRegistrationBackBtn;
	}

	public JButton getRelativeRegistrationBtn() {
		return RelativeRegistrationBtn;
	}

	public JButton getStudentRegistrationBackBtn() {
		return StudentRegistrationBackBtn;
	}

	public JButton getStudentRegistrationBtn() {
		return StudentRegistrationBtn;
	}

	public JButton getCoworkerRegistrationBackBtn() {
		return CoworkerRegistrationBackBtn;
	}

	public JButton getCoworkerRegistrationBtn() {
		return CoworkerRegistrationBtn;
	}

	public JButton getNewBorrowerBtn() {
		return newBorrowerBtn;
	}

	public JButton getNewBelongingBtn() {
		return newBelongingBtn;
	}

	public JButton getCreditsBtn() {
		return CreditsBtn;
	}

	public JButton getSettingsBtn() {
		return settingsBtn;
	}

	public JPanel getStartPnl() {
		return StartPnl;
	}

	public JButton getSearchBtn() {
		return searchBtn;
	}

	public JButton getManualBtn(){
		return ManualBtn;
	}
	
	public JPanel getSearchPnl() {
		return SearchPnl;
	}

	public JPanel getCreditsPnl() {
		return CreditsPnl;
	}

	public JPanel getBorrowerRegistrationPnl() {
		return BorrowerRegistrationPnl;
	}

	public JPanel getCoworkerRegistrationPnl() {
		return CoworkerRegistrationPnl;
	}

	public JPanel getStudentRegistrationPnl() {
		return StudentRegistrationPnl;
	}

	public JPanel getRelativeRegistrationPnl() {
		return RelativeRegistrationPnl;
	}

	public JButton getNewRelativeBtn() {
		return newRelativeBtn;
	}

	public JButton getNewStudentBtn() {
		return newStudentBtn;
	}

	public JButton getNewCoworkerBtn() {
		return newCoworkerBtn;
	}

	public JButton getBorrowerRegistrationBackBtn() {
		return BorrowerRegistrationBackBtn;
	}

	public JButton getCreditsBackBtn() {
		return CreditsBackBtn;
	}

	public JButton getBelongingRegistrationBackBtn() {
		return BelongingRegistrationBackBtn;
	}

	public JButton getBookRegistrationBackBtn() {
		return BookRegistrationBackBtn;
	}

	public JButton getMagazineRegistrationBackBtn() {
		return MagazineRegistrationBackBtn;
	}

	public JButton getMovieRegistrationBackBtn() {
		return MovieRegistrationBackBtn;
	}

	public JButton getSettingBackBtn() {
		return SettingBackBtn;
	}

	public JButton getAllXSearchBackBtn() {
		return AllXSearchBackBtn;
	}

	public JButton getSearchBackBtn() {
		return SearchBackBtn;
	}

	public JPanel getBelongingRegistrationPnl() {
		return BelongingRegistrationPnl;
	}
	
	////////////////////////////////////////////////////////
	/// MOVIE REGISTRATION /////////////

	public JPanel getMovieRegistrationPnl() {
		return MovieRegistrationPnl;
	}
	
	public JTextField getMovieRegistrationName() {
		return MovieName;
	}
	
	public JTextField getMovieRegistrationGenre() {
		return MovieGenre;
	}

	public JTextField getMovieRegistrationDirector() {
		return MovieDirector;
	}
	
	public JTextField getMovieRegistrationReleaseDate() {
		return MovieReleaseDate;
	}
	

	
	////////////////////////////////////////////////////// 
	// BOOK REGISTRATION /////

	public JPanel getBookRegistrationPnl() {
		return BookRegistrationPnl;
	}
	
	public JTextField getBookName() {
		return BookName;		
	}
	
	public JTextField getBookAuthor() {
		return BookAuthor;
	}
	
	public JTextField getBookEditorial() {
		return BookEditorial;
	}
	
	public JTextField getBookEdition() {
		return BookEdition;
	}
	
	
	
	/////////////////////////////////////////////////////////
	/// MAGAZINE REGISTRATION  ///////

	public JPanel getMagazineRegistrationPnl() {
		return MagazineRegistrationPnl;
	}
	
	public JTextField getMagazineRegistrationName() {
		return MagazineRegistrationName;
	}
	
	public JTextField getMagazineRegistrationPublicPeriod() {
		return MagazineRegistrationPublicationPeriod;
	}
	public JTextField getMagazineRegistrationTheme() {
		return MagazineRegistrationTheme;
	}
	

	//////////////////////////////////////////////////////////
	

	public JPanel getSettingPnl() {
		return SettingPnl;
	}

	public JPanel getAllXSearch() {
		return AllXSearch;
	}

	public JButton getNewBookBtn() {
		return newBookBtn;
	}

	public JButton getNewMagazineBtn() {
		return newMagazineBtn;
	}

	public JButton getNewMovieBtn() {
		return newMovieBtn;
	}

	public JButton getSettingsChangeLoanDaysBtn() {
		return SettingsChangeLoanDaysBtn;
	}

	public JButton getSettingsChangeToleranceDaysBtn() {
		return SettingsChangeToleranceDaysBtn;
	}

	public JButton getSettingsChangeTopXBtn() {
		return SettingsChangeTopXBtn;
	}

	public JLabel getSettingsCurrentTimesBorrowedLbl() {
		return SettingsCurrentTimesBorrowedLbl;
	}

	public JSpinner getSettingChangeTimesBorrowedSpn() {
		return SettingsChangeTimesBorrowedSpn;
	}

	public JSpinner getSettingsChangeLoanDaysSpn() {
		return SettingsChangeLoanDaysSpn;
	}

	public JLabel getSettingsCurrentLoanDaysLbl() {
		return SettingsCurrentLoanDaysLbl;
	}

	public JLabel getSettingsCurrentToleranceDaysLbl() {
		return SettingsCurrentToleranceDaysLbl;
	}

	public JSpinner getSettingsChangeToleranceDaysSpn() {
		return SettingsChangeToleranceDaysSpn;
	}

	public JLabel getSettingsCurrentTopXLbl() {
		return SettingsCurrentTopXLbl;
	}

	public JSpinner getSettingsChangeTopXSpn() {
		return SettingsChangeTopXSpn;
	}

	public JButton getSettingsChangeTimesBorrowedBtn() {
		return SettingsChangeTimesBorrowedBtn;
	}

	public JSpinner getSettingsChangeMonthsSpn() {
		return SettingsChangeMonthsSpn;
	}

	public JButton getSettingsChangeMonthsBtn() {
		return SettingsChangeMonthsBtn;
	}

	public JSpinner getSettingsGoToTheFutureSpn() {
		return SettingsGoToTheFutureSpn;
	}

	public JButton getSettingsGoToTheFutureBtn() {
		return SettingsGoToTheFutureBtn;
	}

	public JLabel getSettingsCurrentDateLbl() {
		return SettingsCurrentDateLbl;
	}

	public JLabel getSettingsCurrentMonthsLbl() {
		return SettingsCurrentMonthsLbl;
	}

	public JButton getBookRegistrationBtn() {
		return BookRegistrationBtn;
	}
	public JButton getMovieRegistrationBtn() {
		return MovieRegistrationBtn;
	}
	public JButton getMagazineRegistrationBtn() {
		return MagazineRegistrationBtn;
	}
	public JButton getAllBookSearchGoBtn() {
		return AllXFilterBtn;
	}
	public JButton getBookCSearchBtn() {
		return BookCSearchBtn;
	}
	public JButton getMagazineCSearchBtn() {
		return MagazineCSearchBtn;
	}
	public JButton getMovieCSearchBtn() {
		return MovieCSearchBtn;
	}
	public JPanel getBorrowedXPnl() {
		return BorrowedXPnl;
	}
	public JPanel getAvailableXPnl() {
		return AvailableXPnl;
	}
	public JPanel getTopXPnl() {
		return TopXPnl;
	}
	public ButtonGroup getBookBottonGroup(){
		return BooksButtonGroup;
	}
	public ButtonGroup getMagazineBottonGroup(){
		return MagazinesButtonGroup;
	}
	public ButtonGroup getMovieBottonGroup(){
		return MoviesButtonGroup;
	}
	public JPanel getSpecialSXPnl() {
		return SpecialSXPnl;
	}
	public JButton getSpecialSXBackBtn() {
		return SpecialSXBackBtn;
	}
	public JButton getTopXBackBtn() {
		return TopXBackBtn;
	}
	public JScrollPane getAvailableXScrollPane() {
		return AvailableXScrollPane;
	}
	public JButton getAvailableXBackBtn() {
		return AvailableXBackBtn;
	}
	public JButton getBorrowedXBackBtn() {
		return BorrowedXBackBtn;
	}
	public JTextField getBorrowedXParameterTf() {
		return BorrowedXParameterTf;
	}
	public JButton getBorrowedXFilterBtn() {
		return BorrowedXFilterBtn;
	}
	public JScrollPane getBorrowedXScrollPane() {
		return BorrowedXScrollPane;
	}

	public JScrollPane getAllXScrollPane() {
		return AllXScrollPane;
	}
	public JTextField getAllXFilterParameterTf() {
		return AllXFilterParameterTf;
	}
	public JScrollPane getTopXScrollPane() {
		return TopXScrollPane;
	}
	public JScrollPane getSpecialSXScrollPane() {
		return SpecialSXScrollPane;
	}

	public JLabel getBookImageLbl() {
		return BookImageLbl;
	}
	public JButton getBookSearchImageBn() {
		return BookSearchImageBn;
	}
	public JLabel getMagazineImagelbl() {
		return MagazineImagelbl;
	}
	public JButton getMagazineSearchImageBn() {
		return MagazineSearchImageBn;
	}
	public JLabel getMovieImagelbl() {
		return MovieImagelbl;
	}
	public JButton getMovieSearchImageBn() {
		return MovieSearchImageBn;
	}
	public JSpinner getBookRatingSpinner() {
		return BookRatingSpinner;
	}
	public JSpinner getMovieRatingSpinner() {
		return MovieRatingSpinner;
	}
	public JSpinner getMagazineRatingSpinner() {
		return MagazineRatingSpinner;
	}
	public JLabel getTotalBorrowedLblM() {
		return TotalBorrowedLblM;
	}
	public JLabel getCurrentSystemDate() {
		return currentSystemDate;
	}
	public JLabel getTotalBelongingsLblM() {
		return TotalBelongingsLblM;
	}
	public JPanel getAllBelongingsViewport() {
		return allBelongingsViewport;
	}
	public JPanel getBorrowedBelonginsViewport() {
		return borrowedBelonginsViewport;
	}
	public JPanel getTopBorrowedBelongingsViewport() {
		return topBorrowedBelongingsViewport;
	}
	public JPanel getAllXViewport() {
		return AllXViewport;
	}
	public JPanel getBorrowedXViewport() {
		return BorrowedXViewport;
	}
	public JPanel getAvailableXViewport() {
		return AvailableXViewport;
	}
	public JPanel getTopXViewport() {
		return TopXViewport;
	}
	public JPanel getSpecialSXViewport() {
		return SpecialSXViewport;
	}
	
	public JComboBox<String> getAllXSearchParametersComboBox() {
		return AllXSearchParametersComboBox;
	}
	public JLabel getAllXLbl() {
		return AllXLbl;
	}
	public JLabel getBorrowedXLbl() {
		return BorrowedXLbl;
	}
	public JLabel getTopXLbl() {
		return TopXLbl;
	}
	public JLabel getTopXNumberLbl() {
		return TopXNumberLbl;
	}
	public JButton getSearchRelativesBtn() {
		return SearchRelativesBtn;
	}
	public JButton getStudentSearchBtn() {
		return StudentSearchBtn;
	}
	public JButton getCoworkerSearchBtn() {
		return CoworkerSearchBtn;
	}
	public JPanel getBorrowersSearchPnl(){
		return BorrowersSearchPnl;
	}
	public JLabel getBorrowersSearchXLbl() {
		return BorrowersSearchXLbl;
	}
	public JPanel getBorrowersSearchViewport() {
		return BorrowersSearchViewport;
	}
	public JButton getBorrowersSearchBackBtn() {
		return BorrowersSearchBackBtn;
	}
}
