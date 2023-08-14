package com.utest.automation.model;

public class Devices {

    private final String computer;
    private final String version;
    private final String language;
    private final String mobile;
    private final String model;
    private final String system;

    public Devices(String computer,String version,String language,String mobile,String model,String system){

        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.system = system;
    }

    public String getComputer() {
        return computer;
    }

    public String getVersion() {
        return version;
    }

    public String getLanguage() {
        return language;
    }

    public String getMobile() {
        return mobile;
    }

    public String getModel() {
        return model;
    }

    public String getSystem() {
        return system;
    }
}
