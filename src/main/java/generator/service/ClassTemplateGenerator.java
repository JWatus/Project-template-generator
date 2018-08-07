package generator.service;

import generator.model.Parameters;

public class ClassTemplateGenerator {

    public static String buildClassTemplate(Parameters parameters) {

        StringBuilder templateBuilder = new StringBuilder();
        if (parameters.getType() == "class")
            templateBuilder.append("package " + parameters.getClassPackageName() + ";");
        if (parameters.getType() == "interface")
            templateBuilder.append("package " + parameters.getInterfacePackageName() + ";");
        templateBuilder.append("\n\n");

        if (parameters.isExtended()) {
            templateBuilder.append("import " + parameters.getExtendedClassPath() + ";");
            templateBuilder.append("\n\n");
        }
        if (parameters.isInterfaceImplemented()) {
            parameters.getInterfaceMap().keySet().forEach(s -> templateBuilder.append("import " + s + ";\n"));
            templateBuilder.append("\n");
        }

        templateBuilder.append("/**\n");

        if (parameters.getType() == "class")
            templateBuilder.append("Test documentation of " + parameters.getType() + ": " + parameters.getClassName());
        if (parameters.getType() == "interface")
            templateBuilder.append("Test documentation of " + parameters.getType() + ": " + parameters.getInterfaceName());

        templateBuilder.append("\nThis is example " + parameters.getType() + " of template provider.\n");
        templateBuilder.append("*/\n");
        templateBuilder.append("public " + parameters.getType() + " ");

        if (parameters.getType() == "class")
            templateBuilder.append(parameters.getClassName());
        if (parameters.getType() == "interface")
            templateBuilder.append(parameters.getInterfaceName());

        if (parameters.isExtended())
            templateBuilder.append(" extends " + parameters.getExtendedClass());
        if (parameters.isInterfaceImplemented() && parameters.getType() == "class") {
            templateBuilder.append(" implements ");
            parameters.getInterfaceMap().values().forEach(s -> templateBuilder.append(s + ","));
            templateBuilder.deleteCharAt(templateBuilder.toString().length() - 1);
        }

        templateBuilder.append(" {\n\n}");

        System.out.println(templateBuilder.toString() + "\n\n");

        return templateBuilder.toString();
    }
}
