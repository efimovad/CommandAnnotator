package ru.bmstu.iu3.rcgn;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.util.JCasUtil.select;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.Suite;
import org.junit.runners.MethodSorters;

import ru.bmstu.iu3.type.CommandAnnotation;
import ru.iu3.bmstu.rcgn.CommandAnnotator;

@FixMethodOrder(MethodSorters.JVM)
public class CommandAnnotatorTest {

  @Test
  public void findOneCommand() throws Exception {
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText("The meeting is over at Yorktown 01-144 time");
    commandAnnotatorAE.process(jCas);

    CommandAnnotation commands = JCasUtil.selectByIndex(jCas, CommandAnnotation.class, 0);
    assertNotNull(commands);

    assertEquals("time", commands.getCoveredText());
  }
  
  @Test
  public void findSomeCommands() throws Exception {
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText("hello kawaii say trash stuff time read show");
    commandAnnotatorAE.process(jCas); 
    
    ArrayList<String> mycommands = new ArrayList<String>(); 
    mycommands.add("kawaii");
    mycommands.add("time");
    mycommands.add("read");
    mycommands.add("show");
    
    int i = 0;
    for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
	      assertEquals(mycommands.get(i), annot.getCoveredText());
	      i++;
    }
	      
  }
  
  @Test 
  public void findNoCommand() throws Exception {
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText("hello say trash stuff");
    commandAnnotatorAE.process(jCas); 
    
    CommandAnnotation commands = JCasUtil.selectByIndex(jCas, CommandAnnotation.class, 0);
    assertNull(commands);
	      
  }
  
  @Test 
  public void find10Command() throws Exception {
	String str = "hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii";
	
	long start = System.currentTimeMillis();
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText(str);
    commandAnnotatorAE.process(jCas); 
    long finish = System.currentTimeMillis();
    
    System.out.println("time10:");
	System.out.println(finish-start);
    
    ArrayList<String> mycommands = new ArrayList<String>(); 
    mycommands.add("time");
    mycommands.add("kawaii");
    
    
    int stime = 0;
    int skawaii = 0;
    
    for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
    	if (mycommands.get(0).equals(annot.getCoveredText()))
    		stime++;
    	if (mycommands.get(1).equals(annot.getCoveredText()))
    		skawaii++;	   
    }

    assertEquals(stime,5);
    assertEquals(skawaii,5);	      
  }

@Test 
  public void find50Command() throws Exception {
	String str = "hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii        ";
	
	long start = System.currentTimeMillis();
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText(str);
    commandAnnotatorAE.process(jCas); 
    long finish = System.currentTimeMillis();
    
    System.out.println("time50:");
	System.out.println(finish-start);
    
    ArrayList<String> mycommands = new ArrayList<String>(); 
    mycommands.add("time");
    mycommands.add("kawaii");
    
    
    int stime = 0;
    int skawaii = 0;
    
    for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
    	if (mycommands.get(0).equals(annot.getCoveredText()))
    		stime++;
    	if (mycommands.get(1).equals(annot.getCoveredText()))
    		skawaii++;	   
    }

    assertEquals(stime,25);
    assertEquals(skawaii,25);	      
  }

@Test 
  public void find100Command() throws Exception {
	String str = "hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii hello time kawaii" ;
	
	long start = System.currentTimeMillis();
	AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
    JCas jCas = commandAnnotatorAE.newJCas();
    jCas.setDocumentText(str);
    commandAnnotatorAE.process(jCas); 
    long finish = System.currentTimeMillis();
    
    System.out.println("time100:");
	System.out.println(finish-start);
    
    ArrayList<String> mycommands = new ArrayList<String>(); 
    mycommands.add("time");
    mycommands.add("kawaii");
    
    
    int stime = 0;
    int skawaii = 0;
    
    for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
    	if (mycommands.get(0).equals(annot.getCoveredText()))
    		stime++;
    	if (mycommands.get(1).equals(annot.getCoveredText()))
    		skawaii++;	   
    }

    assertEquals(stime,50);
    assertEquals(skawaii,50);
	      
  }
  
  @Test 
  public void find1000Command() throws Exception {
	
	  
	  String str = " hello time kawaii ";
	  String newstr = "hi ";
	  
	  for (int i=0 ; i < 500 ; i++) {
		  newstr = newstr + str;
	  }
	 
	  long start = System.currentTimeMillis();
	  AnalysisEngine commandAnnotatorAE = createEngine(CommandAnnotator.class);
	  JCas jCas = commandAnnotatorAE.newJCas();
	  jCas.setDocumentText(newstr);
	  commandAnnotatorAE.process(jCas); 
	  long finish = System.currentTimeMillis();
	  
	  System.out.println("time1000:");
	  System.out.println(finish-start);
	  
	  ArrayList<String> mycommands = new ArrayList<String>(); 
	  mycommands.add("time");
	  mycommands.add("kawaii");
    
	  int stime = 0;
	  int skawaii = 0;
    
	  for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
		  if (mycommands.get(0).equals(annot.getCoveredText()))
    		stime++;
		  if (mycommands.get(1).equals(annot.getCoveredText()))
    		skawaii++;	   
    }

    assertEquals(stime,500);
    assertEquals(skawaii,500);
	      
  }
    
}

