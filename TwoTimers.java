/*
 * Example TwoTimers: a name conflict between two classes that both
 * have a class named Timer
 *
 * @author Jim Teresco
 * @version Spring 2020
 *
 * Based on example from Darren Lim
 * Siena College, Computer Science 225, Spring 2017
 *
 */

import java.util.*;
import javax.swing.*;

public class TwoTimers {

    public static void main(String[] args) {

	// this will cause an error: Java doesn't know which Timer
	// to use!
        new Timer();
    }

    // pretend we actually use some stuff from javax.swing to justify the
    // problematic import
}
