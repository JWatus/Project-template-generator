package generator.model;

import java.util.Map;

public class Parameters {

    private String type;
    private String className;
    private String classPackagePath;
    private String classPackageName;
    private String interfaceName;
    private String interfacePackagePath;
    private String interfacePackageName;
    private boolean isExtended;
    private String extendedClass;
    private String extendedClassPath;
    private boolean isInterfaceImplemented;
    private Map<String, String> interfaceMap;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassPackagePath() {
        return classPackagePath;
    }

    public void setClassPackagePath(String classPackagePath) {
        this.classPackagePath = classPackagePath;
    }

    public String getClassPackageName() {
        return classPackageName;
    }

    public void setClassPackageName(String classPackageName) {
        this.classPackageName = classPackageName;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfacePackagePath() {
        return interfacePackagePath;
    }

    public void setInterfacePackagePath(String interfacePackagePath) {
        this.interfacePackagePath = interfacePackagePath;
    }

    public String getInterfacePackageName() {
        return interfacePackageName;
    }

    public void setInterfacePackageName(String interfacePackageName) {
        this.interfacePackageName = interfacePackageName;
    }

    public boolean isExtended() {
        return isExtended;
    }

    public void setExtended(boolean extended) {
        isExtended = extended;
    }

    public String getExtendedClass() {
        return extendedClass;
    }

    public void setExtendedClass(String extendedClass) {
        this.extendedClass = extendedClass;
    }

    public String getExtendedClassPath() {
        return extendedClassPath;
    }

    public void setExtendedClassPath(String extendedClassPath) {
        this.extendedClassPath = extendedClassPath;
    }

    public boolean isInterfaceImplemented() {
        return isInterfaceImplemented;
    }

    public void setInterfaceImplemented(boolean interfaceImplemented) {
        isInterfaceImplemented = interfaceImplemented;
    }

    public Map<String, String> getInterfaceMap() {
        return interfaceMap;
    }

    public void setInterfaceMap(Map<String, String> interfaceMap) {
        this.interfaceMap = interfaceMap;
    }
}
