/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nghia
 */
public class Regex {
    private static Pattern pattern;
    private static Pattern pattern1;

	private Matcher matcher;

	private static final String string =   "^[A-Za-z0-9\n]+$";
	private static final String number =   "^[0-9]*$";
	private static final String number1 =   "^[0-9]+$";

	public Regex() {
		pattern = Pattern.compile(string);
                pattern1 = Pattern.compile(number);
	}

	public boolean string(String regex) {
		matcher = pattern.matcher(regex);
		return matcher.matches();
	}
        
        public boolean number(String regex) {
		matcher = pattern1.matcher(regex);
		return matcher.matches();
	}

	public boolean number1(String regex) {
		matcher = pattern1.matcher(regex);
		return matcher.matches();
	}
    
}
