package gerkhinmanju.TestRunnerTemplate;

import java.io.File;

public class TestRunnerTemplateGenerator {

    public String sTemplatePath = null;
    public File fTemplateFile = null;

    public TestRunnerTemplateGenerator(String sTemplatePath){
        this.sTemplatePath = sTemplatePath;
        this.fTemplateFile = new File(this.sTemplatePath);
    }

    public boolean genTestRunner(){
        /**
         * Need FeatureFile Name & Path
         * Need Glue Path
         */
        return true;
    }

}
