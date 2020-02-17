package gerkhinmanju;

import gerkhinmanju.FileManager.FileContent;
import io.cucumber.java.bs.A;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ManjuGerkhinHome {

    public static List<File> stepDefs = new ArrayList<File>();
    public static List<File> featurefiles = new ArrayList<File>();

    public static void main(String[] args) throws Exception {


        String sHome = System.getProperty("user.dir");

        String sFeaturesHome = "\\src\\test\\bddfeatures";
        String sGlueHome = "\\src\\main\\java\\stepdefs";

        String sGenFeatureFilePath = "\\src\\test\\resources\\generatedfeaturefiles";
        String sGenTestRunnerFilePath = "\\src\\test\\java\\generatedtestrunners";


        FileContent featurecontent = new FileContent(sHome + sFeaturesHome);
        featurefiles = featurecontent.getFiles(".feature");

        FileContent stepdefcontent = new FileContent(sHome + sGlueHome);
        stepDefs = stepdefcontent.getFiles(".java");

        ////////////////////////////////////////////////////
        //FeatureFile COntent Grabber
        if (featurefiles.size() > 0) {

            /**
             * Parse each FeatureFile with GerkhinDocument Class and
             * Depending on the selected tag create feature file for each of the feature.
             * and store in generated feature files path.
             */


        } else {
            System.out.println("No Featurefiles Present");
            return;
        }


        ////////////////////////////////////////////////////


    }

}
