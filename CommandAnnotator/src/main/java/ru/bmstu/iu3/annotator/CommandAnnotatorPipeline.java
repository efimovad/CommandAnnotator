package ru.bmstu.iu3.annotator;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.util.JCasUtil.select;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.jcas.JCas;

import ru.bmstu.iu3.CommandAnnotation;

public class CommandAnnotatorPipeline {
	public static void main(String[] args) throws UIMAException {
	    String text = "hello computer time kawaii kawai";
	    
	    
	    AnalysisEngine analysisEngine = createEngine(CommandAnnotator.class);
	    
	    JCas jCas = analysisEngine.newJCas();
	    jCas.setDocumentText(text);
	    analysisEngine.process(jCas);

	    
	    for (CommandAnnotation annot : select(jCas, CommandAnnotation.class)) {
	    
	      System.out.println(" " + annot.getType().getName() + ": " + annot.getCoveredText());
	    }
	    
	  }
}


