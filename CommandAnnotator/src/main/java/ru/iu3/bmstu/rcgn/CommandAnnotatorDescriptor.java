package ru.iu3.bmstu.rcgn;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.fit.factory.AnalysisEngineFactory;


public class CommandAnnotatorDescriptor {

	public static void main(String[] args) throws Exception {
		File outputDirectory = new File("desc/");
		outputDirectory.mkdirs();
		AnalysisEngineDescription aed = AnalysisEngineFactory.createEngineDescription(CommandAnnotator.class);
		aed.toXML(new FileOutputStream(new File(outputDirectory, "CommandAnnotatorDescriptor.xml")));
	}
}
