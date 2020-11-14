package api;

import api.facades.TemplateFacade;

public class Template {

    /**
     * Generates the api, and is created in the ICommand class
     * Set your programs current version here
     */

    private static final String VERSION = "0.1";

    private final TemplateFacade templateFacade;

    public Template(TemplateFacade templateFacade) {
        this.templateFacade = templateFacade;
    }

    public static String getVERSION() {
        return VERSION;
    }

    public TemplateFacade getTemplateFacade() {
        return templateFacade;
    }
}
