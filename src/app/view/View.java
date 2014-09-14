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

public class View extends JFrame {

	private Controller controller;

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
	private JTextField StudentEducationalCenter;
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
	private JPanel borrowedBelonginsPnl;
	private JPanel topBorrowedBelongingsPnl;
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
	private JButton AllBookSearchBackBtn;
	private JButton BelongingSearchBackBtn;
	private JButton SearchBackBtn;
	private JPanel BelongingRegistrationPnl;
	private JPanel MagazineRegistrationPnl;
	private JPanel BookRegistrationPnl;
	private JPanel MovieRegistrationPnl;
	private JPanel SettingPnl;
	private JPanel AllBookSearchPnl;
	private JPanel AllMagazineSearchPnl;
	private JPanel AllMovieSearchPnl;
	private JPanel BelongingSearch;
	private JButton newBookBtn;
	private JButton newMagazineBtn;
	private JButton newMovieBtn;
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
	private JComboBox<String> BookSearchParametersComboBox;
	private JTextField BookSearch;
	private JButton AllBookSearchGoBtn;
	private JScrollPane AllBooksSPane;
	private JLabel lblFilterBy;
	private JLabel lblFilterBy_1;
	private JTextField AllMagazineFilterParameter;
	private JLabel lblSearchParameter_1;
	private JComboBox AllMagazineComboBox;
	private JScrollPane scrollPane_1;
	private JLabel lblFilterBy_2;
	private JComboBox comboBox_1;
	private JLabel lblSearchParameter_2;
	private JTextField textField_1;
	private JButton btnGo_1;
	private JPanel BorrowedBooksPnl;
	private JButton BorrowedBooksBackBtn;
	private JLabel lblBorrowersName;
	private JTextField textField_2;
	private JButton btnFilter;
	private JScrollPane scrollPane;
	private JLabel lblBorrowedBooks;
	private JPanel AvailableBooksPnl;
	private JButton btnBack;
	private JLabel lblAvailableBooks;
	private JScrollPane AvailableBooksSPane;
	private JPanel TopBooksPnl;
	private JButton TopBooksBackBtn;
	private JLabel lblTopOfThe;
	private JScrollPane TopBooksSPane;
	private JPanel AvailableMoviesPnl;
	private JPanel BorrowedMoviesPnl;
	private JPanel TopMoviesPnl;
	private JPanel panel_1;
	private JLabel lblBooks;
	private JRadioButton lblAll;
	private JRadioButton lblBorrowed;
	private JRadioButton lblAvailable;
	private JRadioButton lblTop_1;
	private JLabel label_1;
	private JLabel lblTypeOfSearch;
	private JRadioButton rdbtnSpecialSearch;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
	private JButton btnNewButton_1;
	private JLabel lblTypeOfSearch_2;
	private JRadioButton rdbtnAll_1;
	private JRadioButton rdbtnBorrowed_1;
	private JRadioButton rdbtnAvailable_1;
	private JRadioButton rdbtnTop_1;
	private JRadioButton rdbtnSpecialSearch_2;
	private JButton btnNewButton_2;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JLabel label_3;
	private JButton AllMagazineFilterBtn;
	private JButton AllMagazineSearchBackBtn;
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
	private JButton btnSearchImage;
	private JLabel lblNewLabel;

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

		JMenuBar menuSup = new JMenuBar();
		setJMenuBar(menuSup);

		JMenu subMenuArchivo = new JMenu("Archivo");
		menuSup.add(subMenuArchivo);

		JMenuItem opcionSalir = new JMenuItem("Salir");
		opcionSalir.setIcon(new ImageIcon(View.class
				.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		subMenuArchivo.add(opcionSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		StartPnl = new JPanel();
		StartPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(StartPnl, "name_268387601552984");
		StartPnl.setLayout(new MigLayout("",
				"[][140.00,grow][46.00][349.00,grow][right]",
				"[][][grow][][grow][][grow]"));

		JPanel MainPanelOptions = new JPanel();
		MainPanelOptions.setBackground(new Color(255, 255, 255));
		StartPnl.add(MainPanelOptions, "cell 0 0 1 7,grow");
		MainPanelOptions.setLayout(new MigLayout("", "[100px][][][]",
				"[][][][][][][][][][][][]"));

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

		HistoryBtn = new JButton("History");
		MainPanelOptions.add(HistoryBtn, "cell 0 9,alignx center");

		JButton ManualBtn = new JButton("Manual");
		MainPanelOptions.add(ManualBtn, "cell 0 10,alignx center");

		CreditsBtn = new JButton("Credits");
		MainPanelOptions.add(CreditsBtn, "cell 0 11,alignx center");

		JLabel MyBelongingLbl = new JLabel("Mis Pertenencias");
		MyBelongingLbl.setFont(new Font("Consolas", Font.BOLD, 30));
		StartPnl.add(MyBelongingLbl, "cell 1 0 3 1");

		JLabel lblTodas = new JLabel("Todas");
		lblTodas.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblTodas, "cell 1 1");

		JLabel lblTotal1 = new JLabel("Total:");
		lblTotal1.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(lblTotal1, "cell 2 1");

		JLabel TotalBelongingsLblM = new JLabel("Blank");
		TotalBelongingsLblM.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(TotalBelongingsLblM, "cell 3 1");

		JPanel allBelongingsPnl = new JPanel();
		StartPnl.add(allBelongingsPnl, "cell 1 2 3 1,grow");

		JLabel lblPrestadas = new JLabel("Prestadas");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblPrestadas, "cell 1 3");

		JLabel lblTotal2 = new JLabel("Total:");
		lblTotal2.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(lblTotal2, "cell 2 3");

		JLabel TotalBorrowedLblM = new JLabel("Blank");
		TotalBorrowedLblM.setFont(new Font("Consolas", Font.ITALIC, 18));
		StartPnl.add(TotalBorrowedLblM, "cell 3 3");

		borrowedBelonginsPnl = new JPanel();
		StartPnl.add(borrowedBelonginsPnl, "cell 1 4 3 1,grow");

		JLabel lblTop = new JLabel("Top");
		lblTop.setFont(new Font("Consolas", Font.PLAIN, 21));
		StartPnl.add(lblTop, "cell 1 5");

		topBorrowedBelongingsPnl = new JPanel();
		StartPnl.add(topBorrowedBelongingsPnl, "cell 1 6 3 1,grow");

		SearchPnl = new JPanel();
		contentPane.add(SearchPnl, "name_10085986187124");
		SearchPnl.setLayout(new MigLayout("", "[269.00,grow]",
				"[][][grow][][][grow]"));

		SearchBackBtn = new JButton("Back");
		SearchPnl.add(SearchBackBtn, "flowx,cell 0 0");

		JLabel lblBsqueda = new JLabel("Search");
		SearchPnl.add(lblBsqueda, "cell 0 0 3 1");

		JLabel lblTipoDeMaterial = new JLabel(
				"Select the type of Belonging, and type of search you wish to use");
		SearchPnl.add(lblTipoDeMaterial, "cell 0 1");

		panel_1 = new JPanel();
		SearchPnl.add(panel_1, "flowx,cell 0 2,alignx center,growy");
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

		lblAll = new JRadioButton("All");
		buttonGroup.add(lblAll);
		panel_1.add(lblAll, "cell 1 2,growx");

		lblBorrowed = new JRadioButton("Borrowed");
		buttonGroup.add(lblBorrowed);
		panel_1.add(lblBorrowed, "cell 1 3");

		lblAvailable = new JRadioButton("Available");
		buttonGroup.add(lblAvailable);
		panel_1.add(lblAvailable, "cell 1 4");

		lblTop_1 = new JRadioButton("Top");
		buttonGroup.add(lblTop_1);
		panel_1.add(lblTop_1, "cell 1 5");

		rdbtnSpecialSearch = new JRadioButton("Special search");
		buttonGroup.add(rdbtnSpecialSearch);
		panel_1.add(rdbtnSpecialSearch, "cell 1 6");

		btnNewButton = new JButton("Search");
		panel_1.add(btnNewButton, "cell 0 7 2 1,alignx center");

		panel_2 = new JPanel();
		SearchPnl.add(panel_2, "cell 0 2,alignx center,growy");
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
		buttonGroup_1.add(rdbtnAll);
		panel_2.add(rdbtnAll, "cell 1 2");

		rdbtnBorrowed = new JRadioButton("Borrowed");
		buttonGroup_1.add(rdbtnBorrowed);
		panel_2.add(rdbtnBorrowed, "cell 1 3");

		rdbtnAvailable = new JRadioButton("Available");
		buttonGroup_1.add(rdbtnAvailable);
		panel_2.add(rdbtnAvailable, "cell 1 4");

		rdbtnTop = new JRadioButton("Top");
		buttonGroup_1.add(rdbtnTop);
		panel_2.add(rdbtnTop, "cell 1 5");

		rdbtnSpecialSearch_1 = new JRadioButton("Special search");
		buttonGroup_1.add(rdbtnSpecialSearch_1);
		panel_2.add(rdbtnSpecialSearch_1, "cell 1 6");

		btnNewButton_1 = new JButton("Search");
		panel_2.add(btnNewButton_1, "cell 0 7 2 1,alignx center");

		panel_3 = new JPanel();
		SearchPnl.add(panel_3, "cell 0 2,alignx center,growy");
		panel_3.setLayout(new MigLayout("", "[][]", "[][][][][][][][]"));

		lblMovies = new JLabel("Movies");
		lblMovies.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_3.add(lblMovies, "cell 0 0 2 1");

		lblTypeOfSearch_2 = new JLabel("Type of search:");
		panel_3.add(lblTypeOfSearch_2, "cell 0 1 2 1");

		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(View.class
				.getResource("/image/film50.png")));
		panel_3.add(label_3, "cell 0 2 1 5");

		rdbtnAll_1 = new JRadioButton("All");
		buttonGroup_2.add(rdbtnAll_1);
		panel_3.add(rdbtnAll_1, "cell 1 2");

		rdbtnBorrowed_1 = new JRadioButton("Borrowed");
		buttonGroup_2.add(rdbtnBorrowed_1);
		panel_3.add(rdbtnBorrowed_1, "cell 1 3");

		rdbtnAvailable_1 = new JRadioButton("Available");
		buttonGroup_2.add(rdbtnAvailable_1);
		panel_3.add(rdbtnAvailable_1, "cell 1 4");

		rdbtnTop_1 = new JRadioButton("Top");
		buttonGroup_2.add(rdbtnTop_1);
		panel_3.add(rdbtnTop_1, "cell 1 5");

		rdbtnSpecialSearch_2 = new JRadioButton("Special search");
		buttonGroup_2.add(rdbtnSpecialSearch_2);
		panel_3.add(rdbtnSpecialSearch_2, "cell 1 6");

		btnNewButton_2 = new JButton("Search");
		panel_3.add(btnNewButton_2, "cell 0 7 2 1,alignx center");

		AllBookSearchPnl = new JPanel();
		AllBookSearchPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(AllBookSearchPnl, "name_69265426665252");
		AllBookSearchPnl.setLayout(new MigLayout("", "[][125.00][][][grow]",
				"[][][][grow]"));

		AllBookSearchBackBtn = new JButton("Back");
		AllBookSearchPnl.add(AllBookSearchBackBtn, "flowx,cell 0 0 2 1");

		JLabel lblBookSearch = new JLabel("All books search");
		AllBookSearchPnl.add(lblBookSearch, "cell 0 0");

		lblFilterBy = new JLabel("Filter by:");
		AllBookSearchPnl.add(lblFilterBy, "cell 0 1");

		lblSearchParameter = new JLabel("Search parameter:");
		AllBookSearchPnl.add(lblSearchParameter, "cell 1 1");

		BookSearchParametersComboBox = new JComboBox<String>();
		BookSearchParametersComboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Title", "Author", "Editorial", "Edition" }));
		AllBookSearchPnl.add(BookSearchParametersComboBox,
				"flowx,cell 0 2,alignx left");

		BookSearch = new JTextField();
		AllBookSearchPnl.add(BookSearch, "cell 1 2,growx");
		BookSearch.setColumns(10);

		AllBookSearchGoBtn = new JButton("Go!");
		AllBookSearchPnl.add(AllBookSearchGoBtn, "cell 2 2");

		AllBooksSPane = new JScrollPane();
		AllBookSearchPnl.add(AllBooksSPane, "cell 0 3 5 1,grow");

		BorrowedBooksPnl = new JPanel();
		BorrowedBooksPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(BorrowedBooksPnl, "name_142213558231291");
		BorrowedBooksPnl.setLayout(new MigLayout("", "[][][grow]",
				"[][][][grow]"));

		BorrowedBooksBackBtn = new JButton("Back");
		BorrowedBooksPnl.add(BorrowedBooksBackBtn, "flowx,cell 0 0");

		lblBorrowersName = new JLabel("Borrower's name:");
		BorrowedBooksPnl.add(lblBorrowersName, "cell 0 1");

		textField_2 = new JTextField();
		BorrowedBooksPnl.add(textField_2, "cell 0 2,growx");
		textField_2.setColumns(10);

		btnFilter = new JButton("Filter");
		BorrowedBooksPnl.add(btnFilter, "cell 1 2");

		lblBorrowedBooks = new JLabel("Borrowed books");
		BorrowedBooksPnl.add(lblBorrowedBooks, "cell 0 0");

		scrollPane = new JScrollPane();
		BorrowedBooksPnl.add(scrollPane, "cell 0 3 3 1,grow");

		AvailableBooksPnl = new JPanel();
		AvailableBooksPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(AvailableBooksPnl, "name_143497875137437");
		AvailableBooksPnl
				.setLayout(new MigLayout("", "[][][grow]", "[][grow]"));

		btnBack = new JButton("Back");
		AvailableBooksPnl.add(btnBack, "cell 0 0");

		lblAvailableBooks = new JLabel("Available books");
		AvailableBooksPnl.add(lblAvailableBooks, "cell 1 0");

		AvailableBooksSPane = new JScrollPane();
		AvailableBooksPnl.add(AvailableBooksSPane, "cell 0 1 3 1,grow");

		TopBooksPnl = new JPanel();
		TopBooksPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(TopBooksPnl, "name_143792841267241");
		TopBooksPnl.setLayout(new MigLayout("", "[][][grow]", "[][grow]"));

		TopBooksBackBtn = new JButton("Back");
		TopBooksPnl.add(TopBooksBackBtn, "cell 0 0");

		lblTopOfThe = new JLabel("Top of the most borrowed books");
		TopBooksPnl.add(lblTopOfThe, "cell 1 0");

		TopBooksSPane = new JScrollPane();
		TopBooksPnl.add(TopBooksSPane, "cell 0 1 3 1,grow");

		AllMagazineSearchPnl = new JPanel();
		AllMagazineSearchPnl.setBackground(new Color(255, 255, 255));
		contentPane.add(AllMagazineSearchPnl, "name_69270385054519");
		AllMagazineSearchPnl.setLayout(new MigLayout("", "[][][][grow]", "[][][][grow]"));

		AllMagazineSearchBackBtn = new JButton("Back");
		AllMagazineSearchPnl.add(AllMagazineSearchBackBtn, "flowx,cell 0 0 4 1");

		JLabel lblMagazineSearch = new JLabel("Magazine search");
		AllMagazineSearchPnl.add(lblMagazineSearch, "cell 0 0");

		lblFilterBy_1 = new JLabel("Filter by:");
		AllMagazineSearchPnl.add(lblFilterBy_1, "cell 0 1");

		lblSearchParameter_1 = new JLabel("Search parameter:");
		AllMagazineSearchPnl.add(lblSearchParameter_1, "cell 1 1");

		AllMagazineComboBox = new JComboBox();
		AllMagazineComboBox.setModel(new DefaultComboBoxModel(new String[] { "Title","Borrower" }));
		AllMagazineSearchPnl.add(AllMagazineComboBox, "cell 0 2,alignx left");

		AllMagazineFilterParameter = new JTextField();
		AllMagazineSearchPnl.add(AllMagazineFilterParameter, "cell 1 2,growx");
		AllMagazineFilterParameter.setColumns(10);

		AllMagazineFilterBtn = new JButton("Go!");
		AllMagazineSearchPnl.add(AllMagazineFilterBtn, "cell 2 2");

		scrollPane_1 = new JScrollPane();
		AllMagazineSearchPnl.add(scrollPane_1, "cell 0 3 4 1,grow");

		BorrowedMoviesPnl = new JPanel();
		contentPane.add(BorrowedMoviesPnl, "name_145417321054389");

		AvailableMoviesPnl = new JPanel();
		contentPane.add(AvailableMoviesPnl, "name_145402808945152");

		TopMoviesPnl = new JPanel();
		contentPane.add(TopMoviesPnl, "name_145477900267668");

		AllMovieSearchPnl = new JPanel();
		contentPane.add(AllMovieSearchPnl, "name_69274240397564");
		AllMovieSearchPnl.setLayout(new MigLayout("", "[][grow][]", "[][][]"));

		JButton MovieSearchBackBtn = new JButton("Back");
		AllMovieSearchPnl.add(MovieSearchBackBtn, "flowx,cell 0 0");

		JLabel lblMovieSearch = new JLabel("Movie search");
		AllMovieSearchPnl.add(lblMovieSearch, "cell 0 0");

		lblFilterBy_2 = new JLabel("Filter by:");
		AllMovieSearchPnl.add(lblFilterBy_2, "cell 0 1");

		lblSearchParameter_2 = new JLabel("Search parameter:");
		AllMovieSearchPnl.add(lblSearchParameter_2, "cell 1 1");

		comboBox_1 = new JComboBox();
		AllMovieSearchPnl.add(comboBox_1, "cell 0 2,growx");

		textField_1 = new JTextField();
		AllMovieSearchPnl.add(textField_1, "flowx,cell 1 2,growx");
		textField_1.setColumns(10);

		btnGo_1 = new JButton("Go!");
		AllMovieSearchPnl.add(btnGo_1, "cell 2 2");

		BorrowerRegistrationPnl = new JPanel();
		contentPane.add(BorrowerRegistrationPnl, "name_440112681124098");
		BorrowerRegistrationPnl.setLayout(new MigLayout("", "[grow]",
				"[][][][][][][][][][][][][][]"));

		BorrowerRegistrationBackBtn = new JButton("Volver");
		BorrowerRegistrationBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BorrowerRegistrationPnl.add(BorrowerRegistrationBackBtn,
				"flowx,cell 0 0");

		JLabel lblRegistroDeNuevo = new JLabel("Registro de nuevo prestatario");
		BorrowerRegistrationPnl.add(lblRegistroDeNuevo, "cell 0 0");

		JLabel lblSeleccionesElijaLa = new JLabel(
				"Seleccione la categoria de prestatario a crear");
		BorrowerRegistrationPnl.add(lblSeleccionesElijaLa, "cell 0 1");

		JPanel panel = new JPanel();
		BorrowerRegistrationPnl.add(panel, "cell 0 2,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		newRelativeBtn = new JButton("Familiar");
		panel.add(newRelativeBtn);
		newRelativeBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/family25.png")));

		newStudentBtn = new JButton("Estudiante");
		panel.add(newStudentBtn);
		newStudentBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/graduate9.png")));

		newCoworkerBtn = new JButton("Colega");
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

		JLabel lblPrimerApellido = new JLabel("First lastname:");
		CoworkerRegistrationPnl.add(lblPrimerApellido,
				"cell 0 2,alignx trailing");

		CoworkerFirstLastName = new JTextField();
		CoworkerRegistrationPnl.add(CoworkerFirstLastName, "cell 1 2,growx");
		CoworkerFirstLastName.setColumns(10);

		JLabel lblSegundoApellido = new JLabel("Second lastname:");
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
		StudentRegistrationPnl.add(lblNombre_1, "cell 0 1,alignx left");

		StudentName = new JTextField();
		StudentRegistrationPnl.add(StudentName, "cell 0 2,growx");
		StudentName.setColumns(10);

		JLabel lblPrimerApellido_1 = new JLabel("Primer apellido:");
		StudentRegistrationPnl.add(lblPrimerApellido_1,
				"cell 0 3,alignx trailing");

		StudentFirstLastName = new JTextField();
		StudentRegistrationPnl.add(StudentFirstLastName, "cell 1 3,growx");
		StudentFirstLastName.setColumns(10);

		JLabel lblSegundoApellido_1 = new JLabel("Segundo apellido:");
		StudentRegistrationPnl.add(lblSegundoApellido_1,
				"cell 0 4,alignx trailing");

		StudentSecondLastName = new JTextField();
		StudentRegistrationPnl.add(StudentSecondLastName, "cell 1 4,growx");
		StudentSecondLastName.setColumns(10);

		JLabel lblTelfono = new JLabel("Teléfono:");
		StudentRegistrationPnl.add(lblTelfono, "cell 0 6,alignx trailing");

		StudentPhoneNumber = new JTextField();
		StudentRegistrationPnl.add(StudentPhoneNumber, "cell 1 6,growx");
		StudentPhoneNumber.setColumns(10);

		JLabel lblCorreoElectrnico_1 = new JLabel("Correo electrónico:");
		StudentRegistrationPnl.add(lblCorreoElectrnico_1,
				"cell 0 7,alignx trailing");

		StudentEmail = new JTextField();
		StudentRegistrationPnl.add(StudentEmail, "cell 1 7,growx");
		StudentEmail.setColumns(10);

		JLabel lblInstitucinDondeEstudia = new JLabel(
				"Institución donde estudia:");
		StudentRegistrationPnl.add(lblInstitucinDondeEstudia,
				"cell 0 9,alignx trailing");

		StudentEducationalCenter = new JTextField();
		StudentRegistrationPnl.add(StudentEducationalCenter, "cell 1 9,growx");
		StudentEducationalCenter.setColumns(10);

		JLabel lblCarnetDeEstudiante = new JLabel("Carnet de estudiante:");
		StudentRegistrationPnl.add(lblCarnetDeEstudiante,
				"cell 0 10,alignx trailing");

		StudentID = new JTextField();
		StudentRegistrationPnl.add(StudentID, "cell 1 10,growx");
		StudentID.setColumns(10);

		StudentRegistrationBtn = new JButton("Register");
		StudentRegistrationPnl.add(StudentRegistrationBtn,
				"cell 1 11,alignx right");

		RelativeRegistrationPnl = new JPanel();
		contentPane.add(RelativeRegistrationPnl, "name_442084621359804");
		RelativeRegistrationPnl.setLayout(new MigLayout("",
				"[][226.00][grow][]", "[][][][][][][][][][]"));

		RelativeRegistrationBackBtn = new JButton("Volver");
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

		RelativeRegistrationBtn = new JButton("Registrar");
		RelativeRegistrationPnl.add(RelativeRegistrationBtn, "cell 1 9");

		BelongingRegistrationPnl = new JPanel();
		contentPane.add(BelongingRegistrationPnl, "name_69061404162527");
		BelongingRegistrationPnl.setLayout(new MigLayout("", "[][]", "[][][]"));

		BelongingRegistrationBackBtn = new JButton("Back");
		BelongingRegistrationPnl.add(BelongingRegistrationBackBtn,
				"flowx,cell 0 0,alignx left");

		JLabel lblBelongingRegistration = new JLabel("Belonging registration");
		BelongingRegistrationPnl.add(lblBelongingRegistration, "cell 0 0");

		newBookBtn = new JButton("");
		newBookBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/book139.png")));
		BelongingRegistrationPnl.add(newBookBtn, "flowx,cell 1 2");

		newMagazineBtn = new JButton("");
		newMagazineBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/magazine.png")));
		BelongingRegistrationPnl.add(newMagazineBtn, "cell 1 2");

		newMovieBtn = new JButton("");
		newMovieBtn.setIcon(new ImageIcon(View.class
				.getResource("/image/film50.png")));
		BelongingRegistrationPnl.add(newMovieBtn, "cell 1 2");

		MagazineRegistrationPnl = new JPanel();
		contentPane.add(MagazineRegistrationPnl, "name_69108422085933");
		MagazineRegistrationPnl.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][][]"));

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
		
		lblImage_2 = new JLabel("Image:");
		MagazineRegistrationPnl.add(lblImage_2, "cell 1 5,alignx trailing");
		
		lblRating_2 = new JLabel("Rating:");
		MagazineRegistrationPnl.add(lblRating_2, "cell 1 7,alignx trailing");
		
		PruebaCombobox MagazineRatingCombobox = new PruebaCombobox();   // Combobox de revista, combobox es una clase (PruebaCombobox)
		MagazineRegistrationPnl.add(MagazineRatingCombobox, "cell 2 7");
		
		MagazineRegistrationBtn = new JButton("Register");
		MagazineRegistrationPnl.add(MagazineRegistrationBtn, "cell 1 8");

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
		
		PruebaCombobox BookRatingCombobox = new PruebaCombobox();  // Combobox rating de registrar libro, el combobox es una clase
		BookRegistrationPnl.add(BookRatingCombobox, "cell 2 5");
				
				lblImage_1 = new JLabel("Image:");
				BookRegistrationPnl.add(lblImage_1, "cell 1 6");
				
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(View.class.getResource("/image/default_image.png")));
				BookRegistrationPnl.add(lblNewLabel, "cell 2 6");
				
				btnSearchImage = new JButton("Search Image");
				btnSearchImage.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						JFileChooser chooser = new JFileChooser(); //Creamos objeto de JFileChooser
						int opcion = chooser.showOpenDialog(contentPane);//Abrir ventana de dialogo para escoger imagen
						if (opcion == JFileChooser.APPROVE_OPTION) { //Si hacemos click en Abrir o Aceptar
			            	String archivo = chooser.getSelectedFile().getPath(); //Obtener nombre del archivo
			                ImageIcon imagen = new ImageIcon(archivo); //Imagen nueva
			                imagen = new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_DEFAULT)); //resize imagen
			                lblNewLabel.setIcon(imagen);
		               	BookRegistrationPnl.add(lblNewLabel, "cell 2 6");
					}}
				});
				BookRegistrationPnl.add(btnSearchImage, "cell 3 6,aligny bottom");
				
						BookRegistrationBtn = new JButton("Register");
						BookRegistrationPnl.add(BookRegistrationBtn, "cell 2 9,alignx center");

		MovieRegistrationPnl = new JPanel();
		contentPane.add(MovieRegistrationPnl, "name_69169014990127");
		MovieRegistrationPnl.setLayout(new MigLayout("", "[][][grow][]",
				"[][][][][][][][][][]"));

		MovieRegistrationBackBtn = new JButton("Back");
		MovieRegistrationPnl.add(MovieRegistrationBackBtn, "flowx,cell 0 0");

		JLabel lblMovieRegistration = new JLabel("Movie registration");
		MovieRegistrationPnl.add(lblMovieRegistration, "cell 0 0");

		JLabel lblName = new JLabel("Name:");
		MovieRegistrationPnl.add(lblName, "cell 1 1,alignx trailing");

		MovieName = new JTextField();
		MovieRegistrationPnl.add(MovieName, "cell 2 1,growx");
		MovieName.setColumns(10);

		JLabel lblImage = new JLabel("Image:");
		MovieRegistrationPnl.add(lblImage, "cell 1 2");

		lblRating = new JLabel("Rating:");
		MovieRegistrationPnl.add(lblRating, "cell 1 4");
		
		PruebaCombobox MovieRatingCombobox = new PruebaCombobox();  // Combobox rating de pel�cula, combobox es una clase
		MovieRegistrationPnl.add(MovieRatingCombobox, "cell 2 4");

		lblGenre = new JLabel("Genre:");
		MovieRegistrationPnl.add(lblGenre, "cell 1 6,alignx trailing");

		MovieGenre = new JTextField();
		MovieRegistrationPnl.add(MovieGenre, "cell 2 6,growx");
		MovieGenre.setColumns(10);

		lblDirector = new JLabel("Director:");
		MovieRegistrationPnl.add(lblDirector, "cell 1 7,alignx trailing");

		MovieDirector = new JTextField();
		MovieRegistrationPnl.add(MovieDirector, "cell 2 7,growx");
		MovieDirector.setColumns(10);

		lblReleaseDate = new JLabel("Release date:");
		MovieRegistrationPnl.add(lblReleaseDate, "cell 1 8");

		MovieRegistrationBtn = new JButton("Register");
		MovieRegistrationPnl.add(MovieRegistrationBtn, "cell 2 9,alignx right");

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

		lblExplanation = new JLabel("Explanation");
		lblExplanation.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation, "cell 1 7");

		lblExplanation_1 = new JLabel("Explanation");
		lblExplanation_1.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_1, "cell 1 1");

		lblExplanation_2 = new JLabel("Explanation");
		lblExplanation_2.setFont(new Font("Consolas", Font.ITALIC, 11));
		SettingPnl.add(lblExplanation_2, "cell 1 4");

		lblExplanation_3 = new JLabel("Explanation");
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

		BelongingSearch = new JPanel();
		contentPane.add(BelongingSearch, "name_69278881556951");
		BelongingSearch.setLayout(new MigLayout("", "[]", "[]"));

		BelongingSearchBackBtn = new JButton("Back");
		BelongingSearch.add(BelongingSearchBackBtn, "cell 0 0,alignx left");

		CreditsPnl = new JPanel();
		contentPane.add(CreditsPnl, "name_5917427800206");
		CreditsPnl.setLayout(new MigLayout("", "[356.00px][714.00px]",
				"[15px][][][][][][][][][][][][][]"));

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(View.class.getResource("/image/logo.png")));
		CreditsPnl.add(lblLogo, "cell 0 0 2 1,alignx center,aligny top");

		JLabel lblCreadores = new JLabel("Proyecto creado por:");
		CreditsPnl.add(lblCreadores, "cell 0 1 2 1");

		JLabel lblRoberto = new JLabel("Roberto Chen Zheng");
		CreditsPnl.add(lblRoberto, "cell 1 2");

		JLabel lblVinicio = new JLabel("Vinicio Flores Hernández");
		CreditsPnl.add(lblVinicio, "cell 1 3");

		JLabel lblFaubricio = new JLabel("Faubricio Forester Soto");
		CreditsPnl.add(lblFaubricio, "cell 1 4");

		JLabel lblPedro = new JLabel("Pedro Rodríguez de Oliveira");
		CreditsPnl.add(lblPedro, "cell 1 5");

		JLabel lblCreadoraLogo = new JLabel("Creadora del logo:");
		CreditsPnl.add(lblCreadoraLogo, "cell 0 7");

		CreditsBackBtn = new JButton("Volver a la ventana principal");
		CreditsBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel lblDayana = new JLabel("Dayana Méndez Salas");
		CreditsPnl.add(lblDayana, "cell 1 8");

		JLabel lblVersion = new JLabel("Versión:");
		CreditsPnl.add(lblVersion, "cell 0 10");

		JLabel lblVersionNum = new JLabel("0.5");
		CreditsPnl.add(lblVersionNum, "cell 1 11");
		CreditsPnl.add(CreditsBackBtn, "cell 1 13,alignx right");
	}

	private void addEvents() {
		// TODO
		AllMagazineFilterBtn.addActionListener(controller);
		AllMagazineSearchBackBtn.addActionListener(controller);
		searchBtn.addActionListener(controller);
		RelativeRegistrationBackBtn.addActionListener(controller);
		RelativeRegistrationBtn.addActionListener(controller);
		StudentRegistrationBackBtn.addActionListener(controller);
		StudentRegistrationBtn.addActionListener(controller);
		CoworkerRegistrationBackBtn.addActionListener(controller);
		CoworkerRegistrationBtn.addActionListener(controller);
		newBorrowerBtn.addActionListener(controller);
		newBelongingBtn.addActionListener(controller);
		CreditsBtn.addActionListener(controller);
		settingsBtn.addActionListener(controller);
		newRelativeBtn.addActionListener(controller);
		newStudentBtn.addActionListener(controller);
		newCoworkerBtn.addActionListener(controller);
		BorrowerRegistrationBackBtn.addActionListener(controller);
		CreditsBackBtn.addActionListener(controller);
		BelongingRegistrationBackBtn.addActionListener(controller);
		BookRegistrationBackBtn.addActionListener(controller);
		MagazineRegistrationBackBtn.addActionListener(controller);
		MovieRegistrationBackBtn.addActionListener(controller);
		SettingBackBtn.addActionListener(controller);
		AllBookSearchBackBtn.addActionListener(controller);
		BelongingSearchBackBtn.addActionListener(controller);
		SearchBackBtn.addActionListener(controller);
		newBookBtn.addActionListener(controller);
		newMagazineBtn.addActionListener(controller);
		newMovieBtn.addActionListener(controller);
		MovieRegistrationBtn.addActionListener(controller);
		BookRegistrationBtn.addActionListener(controller);
		SettingsChangeTopXBtn.addActionListener(controller);
		SettingsChangeLoanDaysBtn.addActionListener(controller);
		SettingsChangeToleranceDaysBtn.addActionListener(controller);
		SettingsChangeTimesBorrowedBtn.addActionListener(controller);
		SettingsChangeMonthsBtn.addActionListener(controller);
		SettingsGoToTheFutureBtn.addActionListener(controller);
		HistoryBtn.addActionListener(controller);
		
		AllMagazineFilterBtn.addActionListener(controller);;
		AllMagazineSearchBackBtn.addActionListener(controller);;
		
		MagazineRegistrationBtn.addActionListener(controller);;

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

	public JTextField getStudentEducationalCenter() {
		return StudentEducationalCenter;
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

	public JPanel getBorrowedBelonginsPnl() {
		return borrowedBelonginsPnl;
	}

	public JPanel getTopBorrowedBelongingsPnl() {
		return topBorrowedBelongingsPnl;
	}

	public JButton getSearchBtn() {
		return searchBtn;
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

	public JButton getBookSearchBackBtn() {
		return AllBookSearchBackBtn;
	}

	public JButton getBelongingSearchBackBtn() {
		return BelongingSearchBackBtn;
	}

	public JButton getSearchBackBtn() {
		return SearchBackBtn;
	}

	public JPanel getBelongingRegistrationPnl() {
		return BelongingRegistrationPnl;
	}

	public JPanel getMagazineRegistrationPnl() {
		return MagazineRegistrationPnl;
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
	/// MOVIE REGISTRATION  ///////

	public JPanel getMovieRegistrationPnl() {
		return MovieRegistrationPnl;
	}

	public JPanel getSettingPnl() {
		return SettingPnl;
	}

	public JPanel getBookSearchPnl() {
		return AllBookSearchPnl;
	}

	public JPanel getMagazineSearchPnl() {
		return AllMagazineSearchPnl;
	}

	public JPanel getMovieSearchPnl() {
		return AllMovieSearchPnl;
	}

	public JPanel getBelongingSearch() {
		return BelongingSearch;
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
	public JButton getAllMagazineFilterBtn() {
		return AllMagazineFilterBtn;
	}
	public JTextField getAllMagazineFilterParameter() {
		return AllMagazineFilterParameter;
	}
	public JComboBox getAllMagazineComboBox() {
		return AllMagazineComboBox;
	}
	public JButton getAllMagazineSearchBackBtn() {
		return AllMagazineSearchBackBtn;
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
}
