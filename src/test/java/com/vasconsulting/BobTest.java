package com.vasconsulting;

import org.junit.Test;

import junit.framework.TestCase;

public class BobTest extends TestCase {

  public void testQuestion() {
    Bob bob = new Bob();
    assertEquals("Sure", bob.talk("Bob how are you?"));
  }

  public void testIsBobMad() {
    Bob bob = new Bob();
    assertEquals("Sure", bob.talk("Bob are you mad?"));
  }

  public void testHowOldIsBob() {
    Bob bob = new Bob();
    assertEquals("Sure", bob.talk("How old are you?"));
  }

  public void testWhatsGoingOn(){
    Bob bob = new Bob();
    assertEquals("Sure", bob.talk("What's going on?"));
  }

  public void testAllCaps(){
    Bob bob = new Bob();
    assertEquals("Woah, chill out!", bob.talk("HEY YOU"));
  }

  public void testShutUp(){
    Bob bob = new Bob();
    assertEquals("Woah, chill out!", bob.talk("SHUT UP"));
  }

  public void testGetOutOfHere(){
    Bob bob = new Bob();
    assertEquals("Woah, chill out!", bob.talk("GET OUT OF HERE"));
  }

  public void testSayNothing(){
    Bob bob = new Bob();
    assertEquals("Fine. Be that way!", bob.talk(""));
  }

  public void testSayLongerNothing(){
    Bob bob = new Bob();
    assertEquals("Fine. Be that way!", bob.talk("           "));
  }

  public void testAnythingElse(){
    Bob bob = new Bob();
    assertEquals("Whatever.", bob.talk("Let's go behind the School!"));
  }
}
