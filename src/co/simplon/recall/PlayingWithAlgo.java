package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {
	
	// fait
	public static String helloWorld(String name) {
		String message;
		//message = name == "" ? "Hello World": "Hello "+name; (version courte)
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	// fait
	public static List<String> selectElementsStartingWithA(String array[]) {
		List<String> reponse = new ArrayList<String> ();
		for (int i = 0 ; i < array.length ; i++) {
			if (array [i].charAt(0) == 'a') {
				reponse.add(array [i]);
			}
		}
		return reponse;
	}

	// fait
	public static List<String> selectElementsStartingWithVowel(String array[]) {
		List<String> reponse = new ArrayList<String>();
		char lettre;
		for (int i = 0; i < array.length ; i++) {
			if (array [i] == null) {
				lettre = ' ';
			}
			else {
			lettre = array [i].charAt(0);
			}
			if ((lettre == 'a') | (lettre == 'e') | (lettre == 'i') | (lettre == 'o') | (lettre == 'u') | (lettre == 'y')) {
			reponse.add(array [i]);
			}
		}
		return reponse;
	}

	// fait
	public static String[] removeNullElements(String array[]) {
		ArrayList<String> temp = new ArrayList<String> ();
		for (int i = 0 ; i < array.length ; i++) {
			if ( array [i] != null) {
				temp.add(array [i]);
			}
		}
		String reponse [ ]= new String [temp.size()];
		for (int i = 0 ; i < temp.size() ; i++) {
			reponse [i] = temp.get (i);
		}
		return reponse;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	// fait
	public static String[] reverseOrderInArray(String array[]) {
		String resultat [] =  new String [array.length];
		for (int i = 0 ; i < array.length ; i++) {
			resultat [i] = array [array.length - 1 - i];
		}
		return resultat;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	// fait
	public static String getFirstHalf(String string) {
		char lettre;
		String moitie = "";
		int nombreLettres;
		if (string.length () % 2 == 0) {
			nombreLettres = string.length () / 2;
		}
		else {
			nombreLettres = string.length () / 2 + 1;
		}
		for (int i = 0; i < nombreLettres ; i++) {
			lettre = string.charAt(i);
			moitie = moitie + lettre; 
		}			
		return moitie;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		return null;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	// fait
	public static long addingTwoNumbers(long number1, long number2) {
		long resultat;
		resultat = number1 + number2;
		return resultat;
	}

	// fait
	public static long addingThreeNumbers(long number1, long number2, long number3) {;
		long resultat;
		resultat = number1 + number2 + number3;
		return resultat;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}
	// fait
	public static int[] allElementsExceptFirstThree(int array[]) {
		int resultat [] = new int [array.length-3];
		for (int i = 0; i <= resultat.length-1; i++) {
			resultat [i] = array [i + 3];
		}
		return resultat;
	}

	// fait
	public static int[] addElementToBeginning(int array[], int element) {
		int resultat [] = new int [array.length + 1];
		for (int i = 1; i < resultat.length; i++) {
			resultat [i] = array [i - 1];
		}
		resultat [0] = element;
		return resultat;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	// fait
	public static int roundUp(float number) {
		float resultat = Math.round(number);
		return (int) resultat;
	}

	// fais
	public static int findLastDayOfMonth(int month, int year) {
		int nbrJours;
		if (month == 2) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400== 0) ){
				nbrJours = 29;
			}
			else {
				nbrJours = 28;
			}
		}
		else if (((month % 2 != 0) && (month < 8)) || ((month % 2 ==0) && (month > 8))) {
			nbrJours = 31;
		}
		else {
			nbrJours = 30;
		}
		return nbrJours;
	}

	// fait
	public static int factorial(int number) {
		int resultat = number;
		for (int i = 1; i < number; i++) {
			resultat = resultat * (number - i);
		}
		return resultat;
	}

	// fait
	public static int convertToCelsius(int temperature) {
		int resultat;
		double celsius = (temperature - 32) / 1.8;
		resultat = (int) Math.round(celsius);
		return resultat;
	}
	
	// fait
	public static boolean checkIfPair(int number) {
		boolean reponse = false;
		if (number % 2 == 0) {
			reponse = true;
		}
		return reponse;
	}
	
	// fait
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean reponse = true;
		if (number1 % 2 != 0) {
			reponse = false;
		}
		else if (number2 % 2 != 0) {
			reponse = false;
		}
		else if (number3 % 2 == 0) {
			reponse = false;
		}
		return reponse;
	}
	
	// fait
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int sum = number1 + number2 + number3;
		boolean reponse = true;
		if (sum % 2 != 0) {
			reponse = false;
		}
		return reponse;
	}
	
	// fait
	public static boolean checkIfAllElementsPair(int[] array) {
		boolean reponse = true;
		for (int i = 0; i <array.length; i ++) {
			if (array [i] % 2 != 0) {
				reponse = false;
			}
		}
		return reponse;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	// fait
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean reponse = false;
		int carre1 = number1 * number1;
		int carre2 = number2 * number2;
		int carre3 = number3 * number3;
		int sommecarres;
		int carreHypothenuse;
		if ((carre1 > carre2) && (carre1 > carre3)) {
			carreHypothenuse = carre1;
			sommecarres = carre2 + carre3;
		}
		else if ((carre2 > carre1) && (carre2 > carre3)) {
			carreHypothenuse = carre2;
			sommecarres = carre1 + carre3;
		}
		else {
			carreHypothenuse = carre3;
			sommecarres = carre1 + carre2;
		}
		if (sommecarres == carreHypothenuse) {
			reponse = true;
		}
		return reponse;
	}
	
	// fait
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		boolean achat = true;
		if ((prix > 22) || (prix % 2 != 0)) {
			achat = false;
		}
		return achat;
	}
	
	// fait
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean achat = false;
		double prixSolde = prix * (100 - pourcentDeRemise) / 100;
		if (prixSolde <= 100){
			achat = true;
		}
		return achat;
	}
	
	// fait
	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		boolean reponse = false;
		if ((number1 % 7 == 0) || (number2 % 7 == 0) || ((number1 + number2) % 7 == 0)) {
			reponse = true;	
		}
		return reponse;
	}
	
	// fait
	public static boolean checkCase2a(int number1, int number2) {
		// check si un de 2 chiffres mais pas leur somme se divise par 7
		boolean reponse = false;
		if (((number1 % 7 == 0) || (number2 % 7 == 0)) && ((number1 + number2) % 7 != 0)) {
			reponse = true;
		}
		return reponse;
	}
	
	// faiT
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		boolean reponse = false;
		if (((number1 < number2) && (number2 < number3)) || ((number1 > number2) && (number2 > number3))) {
			reponse = true;
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		for (int i = 1; i <= array.length - 2; i++) {
			reponse.add (array [i]);
		}
		return reponse;
	}
	
	// fait
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		int reponse [] = new int [array.length - 2];
		for (int i = 1; i <= array.length - 2; i++) {
			reponse [i - 1] = array [i];
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		for (int i = 0; i < array.length; i += 2) {
			reponse.add(array [i]);
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> reverseOrder(int array[]) {
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		for (int i = array.length - 1 ; i >= 0; i--) {
			reponse.add (array [i]);
		}
		return reponse;
	}
	
	// fait
	public static int[] reverseOrderInt(int array[]) {
		int reponse [] = new int [array.length];
		for (int i = array.length - 1, j = 0 ; (i >= 0 && j <= array.length - 1); i--, j++) {
			reponse [j] = array[i];
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		int middle = array.length / 2;
		for (int i = 0; i < array.length; i++){
			if (i == middle) {
				reponse.add (element);
				reponse.add (array[i]);
			}
			else {
				reponse.add (array[i]);
			}
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		for (int i = 0 ; i < list.size() ; i++) {
			if ((list.get(i) % 2 == 0) || (list.get(i) == 0)) {
				reponse.add(list.get(i));
			}
		}
		return reponse;
	}
	
	// fait
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {;
		ArrayList<Integer> reponse = new ArrayList<Integer> ();
		for (int i = 0; i < list.size() ; i += 2) {
			reponse.add(list.get(i));
		}
		return reponse;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	// fait
	public static boolean checkIfStringStartsWithA( String word ) {
		boolean reponse = false;
		char lettre = word.charAt(0);
		if ((lettre == 'a') || (lettre == 'A')) {
			reponse = true;
		}
		return reponse;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	// fait
	public static boolean checkIfStringEndsWithS( String word ) {
		boolean reponse = false;
		char lettre = word.charAt(word.length() - 1);
		if ((lettre =='s') || (lettre == 'S')){
			reponse = true;
		}
		return reponse;
	}
	
	// fait
	public static String findShortestWord(String[] array ) {
		String solution = array [0];
		for (int i = 1; i < array.length; i++) {
			if (solution.length () > array [i].length ()) {
				solution = array [i];
			}
		}
		return solution;
	}
	
	// fait
	public static String swapFirstandLastLetter(String array ) {
		char premiereLettre = array.charAt(0);
		char derniereLettre = array.charAt(array.length() - 1);
		String milieu = array.substring (1 , array.length() - 1);
		String reponse = derniereLettre + milieu + premiereLettre;
	return reponse;
	}
	
	// fait
	public static int[] swapFirstandLastElement(int[] array ) {
		int solution [] = new int [array.length];
		solution [array.length - 1] = array [0];
		solution [0] = array [array.length -1];
		for (int i = 1 ; i < array.length - 1 ; i++) {
			solution [i] = array [i];
		}
		return solution;
	}

}
