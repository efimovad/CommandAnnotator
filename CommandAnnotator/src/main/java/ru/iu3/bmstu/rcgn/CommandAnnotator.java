package ru.iu3.bmstu.rcgn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.jcas.JCas;

import ru.bmstu.iu3.type.CommandAnnotation;


@TypeCapability(outputs = { "ru.bmstu.iu3.type.CommandAnnotation",
"ru.bmstu.iu3.type.CommandAnnotation:building" })

public class CommandAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) { 
		
		String orgText = aJCas.getDocumentText();
	    int orgEnd = 0;
	    
	    try {
	    
	    	readCommand(); 
	    	
	    	StringTokenizer st = new StringTokenizer(orgText);
	    	
	    	while (st.hasMoreTokens()) {
	    	
	    		String thisTok = st.nextToken();
	    		
	    		if (checker(thisTok)) {
	  	      		
	    			int orgBegin = orgText.indexOf(thisTok, orgEnd);
	  	      		orgEnd = orgBegin + thisTok.length();
	  	      	
	  	      		CommandAnnotation annotation = new CommandAnnotation(aJCas,orgBegin,orgEnd);
	  	      		annotation.addToIndexes();
	  	      	}
	    	}
	    }
	    
	    catch (Exception ex) {
	    	ex.printStackTrace();
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
