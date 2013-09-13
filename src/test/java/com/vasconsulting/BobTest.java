package com.vasconsulting;

import org.junit.Test;

import junit.framework.TestCase;

public class BobTest extends TestCase {

  public void testQuestion() {
    Bob bob = new Bob();
    assertEquals("Sure", bob.talk("Bob how are you?"));
  }
}
