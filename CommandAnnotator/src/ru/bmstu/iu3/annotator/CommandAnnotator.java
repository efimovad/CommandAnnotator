package ru.bmstu.iu3.annotator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

import org.apache.uima.analysis_component.CasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.jcas.JCas;
//import org.apache.uima.tutorial.RoomNumber;

import ru.bmstu.iu3.CommandAnnotation;
//import ru.bmstu.iu3.CommandRecognizer;

public class CommandAnnotator extends CasAnnotator_ImplBase {

	@Override
	public void process(CAS aCas) throws AnalysisEngineProcessException {
		
		try {
			readCommand();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		CAS myView = aCas.getView("OriginalDocument");
		Type annot = myView.getAnnotationType();
	    Type cross = myView.getTypeSystem().getType("ru.bmstu.iu3.CommandRecognizer");
	    Feature other = cross.getFeatureByBaseName("otherAnnotation");
	    
	    String orgText = myView.getDocumentText();
		
	    int orgEnd = 0;
	    int commandBegin = 0;
	    int commandEnd = 0;
	    
	    try {
	    	JCas aJCas = myView.getJCas();
	    
	    	StringTokenizer st = new StringTokenizer(orgText);
	    	while (st.hasMoreTokens()) {
		      
	    		CommandAnnotation annotation = new CommandAnnotation(aJCas);
	    		
	    		String thisTok = st.nextToken();
	    		
	    		if (checker(thisTok)) {
	  	      		int orgBegin = orgText.indexOf(thisTok, orgEnd);
	  	      		orgEnd = orgBegin + thisTok.length();
	  	      		System.out.println("original BEGIN:"+orgBegin+" original END:"+orgEnd);
	  	      		annotation.setBegin(orgBegin);
	  	      		annotation.setEnd(orgEnd);
	  	      		annotation.addToIndexes();
	  	      	}
	    	}
	    }
	
	    catch (CASException ex) {
	    	System.out.println("Hello, CASException");
	    }
	    
	  }

	  static ArrayList<String> commands;
	  
	  private void readCommand() throws FileNotFoundException, IOException {
		  Scanner s = new Scanner(new File("./commands/commands.txt"));
		  commands = new ArrayList<String>();
		  while (s.hasNext()){
		      commands.add(s.next());
		  }
		  s.close();
	  }
	  
	  private boolean checker(String word) {
		  for (String command:commands) {
			if(word.equals(command))
				return true;
		  }
		  return false;
      }

	}
