/*
 * The MIT License
 * Copyright © 2014-2021 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.iluwatar.application.controller;

/**
 * The Target to be invoked.
 */
public abstract class AbstractTarget {

  /**
   * The body of the page.
   */
  protected transient String body;

  /**
   * The title of the page.
   */
  protected transient String title;

  /**
   * The page divider.
   */
  final private transient static String DIVIDER = "-------------------------------------------------------------";;

  /**
   * The default constructor.
   */
  protected AbstractTarget() {

  }

  /**
   * Invoke the target and display the page with the appropriate text.
   */
  public void invoke() {

    clearScreen();
    //Print Title
    print(DIVIDER);
    print(title + " Page");
    print(DIVIDER);
     
    //Print Body
    print("");
    print(body);
    print("");

    //Print Navigation
    print(DIVIDER);
    print("Enter one of the following letters to navigate the site:");
    print("H (Home Page)  |  A (About Us)  |  C (Contact Us)  |  X (Exit)\n");
  }

  /**
   * Display the input text in the console.
   * @param text the text to be displayed
   */
  public static void print(final String text) {
    System.out.println(text);
  }

  /**
   * Clear the screen.
   */
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }  

}