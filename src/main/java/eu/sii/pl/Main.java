package eu.sii.pl;

import eu.sii.pl.model.Parameters;
import eu.sii.pl.service.ClassFileCreator;
import eu.sii.pl.service.ClassTemplateGenerator;
import eu.sii.pl.service.DirectoryCreator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        String ultimatePackageName = "eu.sii.pl.examples";
        String ultimatePackagePath = "src/main/java/" + ultimatePackageName.replace(".", "/");
        Map<String, String> interfaceMap = new HashMap<>();
        interfaceMap.put("eu.sii.pl.examples.interfaces.ThisInterface", "ThisInterface");
        interfaceMap.put("eu.sii.pl.examples.interfaces.AnotherInterface", "AnotherInterface");

        DirectoryCreator.createDirectory(ultimatePackagePath);
        DirectoryCreator.createDirectory(ultimatePackagePath + "/interfaces");
        DirectoryCreator.createDirectory(ultimatePackagePath + "/one");
        DirectoryCreator.createDirectory(ultimatePackagePath + "/two");

        Parameters parametersOne = new Parameters();
        parametersOne.setType("class");
        parametersOne.setClassName("FirstClass");
        parametersOne.setClassPackageName(ultimatePackageName);
        parametersOne.setClassPackagePath(ultimatePackagePath);
        parametersOne.setInterfaceImplemented(true);
        parametersOne.setInterfaceMap(interfaceMap);

        Parameters parametersTwo = new Parameters();
        parametersTwo.setType("class");
        parametersTwo.setClassName("AbcClass");
        parametersTwo.setClassPackageName(ultimatePackageName + ".one");
        parametersTwo.setClassPackagePath(ultimatePackagePath);
        parametersTwo.setExtended(true);
        parametersTwo.setExtendedClass("FirstClass");
        parametersTwo.setExtendedClassPath(ultimatePackageName + ".FirstClass");
        parametersTwo.setInterfaceImplemented(true);
        parametersTwo.setInterfaceMap(interfaceMap);

        Parameters parametersThree = new Parameters();
        parametersThree.setType("class");
        parametersThree.setClassName("XyzClass");
        parametersThree.setClassPackageName(ultimatePackageName + ".two");
        parametersThree.setClassPackagePath(ultimatePackagePath);

        Parameters parametersInterface = new Parameters();
        parametersInterface.setType("interface");
        parametersInterface.setInterfaceName("ThisInterface");
        parametersInterface.setInterfacePackageName(ultimatePackageName + ".interfaces");
        parametersInterface.setInterfacePackagePath(ultimatePackagePath);

        Parameters parametersInterface2 = new Parameters();
        parametersInterface2.setType("interface");
        parametersInterface2.setInterfaceName("AnotherInterface");
        parametersInterface2.setInterfacePackageName(ultimatePackageName + ".interfaces");
        parametersInterface2.setInterfacePackagePath(ultimatePackagePath);

        String templateOne = ClassTemplateGenerator.buildClassTemplate(parametersOne);
        String templateTwo = ClassTemplateGenerator.buildClassTemplate(parametersTwo);
        String templateThree = ClassTemplateGenerator.buildClassTemplate(parametersThree);
        String templateInterface = ClassTemplateGenerator.buildClassTemplate(parametersInterface);
        String templateInterface2 = ClassTemplateGenerator.buildClassTemplate(parametersInterface2);

        ClassFileCreator.writeClassToFile(templateOne, new File(ultimatePackagePath + "/" + parametersOne.getClassName() + ".java"));
        ClassFileCreator.writeClassToFile(templateTwo, new File(ultimatePackagePath + "/one" + "/" + parametersTwo.getClassName() + ".java"));
        ClassFileCreator.writeClassToFile(templateThree, new File(ultimatePackagePath + "/two" + "/" + parametersThree.getClassName() + ".java"));
        ClassFileCreator.writeClassToFile(templateInterface, new File(ultimatePackagePath + "/interfaces" + "/" + parametersInterface.getInterfaceName() + ".java"));
        ClassFileCreator.writeClassToFile(templateInterface2, new File(ultimatePackagePath + "/interfaces" + "/" + parametersInterface2.getInterfaceName() + ".java"));

    }
}
