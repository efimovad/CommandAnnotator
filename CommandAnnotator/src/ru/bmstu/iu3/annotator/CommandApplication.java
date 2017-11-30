package ru.bmstu.iu3.annotator;

import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.util.XMLInputSource;

public class CommandApplication {
	public static void main(String[] args) throws UIMAException, IOException {
	    // parse AnalysisEngine descriptor
	    XMLInputSource input = new XMLInputSource(
	            "desc/CommandAnnotatorDescriptor.xml");
	    AnalysisEngineDescription desc = UIMAFramework.getXMLParser().parseAnalysisEngineDescription(
	            input);

	    // create AnalysisEngine
	    AnalysisEngine seAnnotator = UIMAFramework.produceAnalysisEngine(desc);

	    // create CAS
	    CAS cas = seAnnotator.newCAS();

	    // Create the English document Sofa
	    CAS englishView = cas.createView("OriginalDocument");
	    englishView.setDocumentText("hello computer time kawaii kawai");

	    // call a CAS Analysis Engine that "translates" the English document
	    // and puts the translation into a German Sofa
	    seAnnotator.process(cas);

	    // get annotation iterator for the English CAS view
	    FSIndex anIndex = englishView.getAnnotationIndex();
	    FSIterator anIter = anIndex.iterator();

	    // and print out all annotations found
	    System.out.println("---Printing all annotations for English Sofa---");
	    while (anIter.isValid()) {
	      AnnotationFS annot = (AnnotationFS) anIter.get();
	      System.out.println(" " + annot.getType().getName() + ": " + annot.getCoveredText());
	      anIter.moveToNext();
	    }

	    // now try to get the CAS view for the German Sofa
	    System.out.println();

	    // Clean up
	    seAnnotator.destroy();
	  }
}
