package com.ebenz.camel_microservice_b.dto;

import com.ebenz.camel_microservice_b.utils.BooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonRecord {
    @JsonProperty("Age")
    private Integer age;
    @JsonProperty("Gender")
    private char gender;
    @JsonProperty("Smoking")
    @JsonDeserialize(using = BooleanDeserializer.class)
    private Boolean smoking;
    @JsonProperty("Hx Smoking")
    @JsonAlias({"Hx_Smoking", "hx_Smoking"})
    @JsonDeserialize(using = BooleanDeserializer.class)
    private Boolean hxSmoking;
    @JsonProperty("Hx_Radiothreapy")
    @JsonAlias({"Hx_Radiothreapy"})
    @JsonDeserialize(using = BooleanDeserializer.class)
    private Boolean hx_Radiothreapy;
    @JsonProperty("Thyroid_Function")
    private String thyroid_Function;
    @JsonProperty("Physical_Examination")
    private String physical_Examination;
    @JsonProperty("Adenopathy")
    private String adenopathy;
    @JsonProperty("Pathology")
    private String pathology;
    @JsonProperty("Focality")
    private String focality;
    @JsonProperty("Risk")
    private String risk;
    @JsonProperty("T")
    private String t;
    @JsonProperty("N")
    private String n;
    @JsonProperty("M")
    private String m;
    @JsonProperty("Stage")
    private String stage;
    @JsonProperty("Response")
    private String response;
    @JsonProperty("Recurred")
    private String recurred;
    public JsonRecord() {
    }

    public JsonRecord(Integer age, char gender, Boolean smoking, Boolean hx_Smoking, Boolean hx_Radiothreapy, String thyroid_Function, String physical_Examination, String adenopathy, String pathology, String focality, String risk, String t, String n, String m, String stage, String response, String recurred) {
        this.age = age;
        this.gender = gender;
        this.smoking = smoking;
        this.hxSmoking = hx_Smoking;
        this.hx_Radiothreapy = hx_Radiothreapy;
        this.thyroid_Function = thyroid_Function;
        this.physical_Examination = physical_Examination;
        this.adenopathy = adenopathy;
        this.pathology = pathology;
        this.focality = focality;
        this.risk = risk;
        this.t = t;
        this.n = n;
        this.m = m;
        this.stage = stage;
        this.response = response;
        this.recurred = recurred;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Boolean getSmoking() {
        return smoking;
    }

    public void setSmoking(Boolean smoking) {
        this.smoking = smoking;
    }

    public Boolean getHx_Smoking() {
        return hxSmoking;
    }

    public void setHx_Smoking(Boolean hx_Smoking) {
        this.hxSmoking = hx_Smoking;
    }

    public Boolean getHx_Radiothreapy() {
        return hx_Radiothreapy;
    }

    public void setHx_Radiothreapy(Boolean hx_Radiothreapy) {
        this.hx_Radiothreapy = hx_Radiothreapy;
    }

    public String getThyroid_Function() {
        return thyroid_Function;
    }

    public void setThyroid_Function(String thyroid_Function) {
        this.thyroid_Function = thyroid_Function;
    }

    public String getPhysical_Examination() {
        return physical_Examination;
    }

    public void setPhysical_Examination(String physical_Examination) {
        this.physical_Examination = physical_Examination;
    }

    public String getAdenopathy() {
        return adenopathy;
    }

    public void setAdenopathy(String adenopathy) {
        this.adenopathy = adenopathy;
    }

    public String getPathology() {
        return pathology;
    }

    public void setPathology(String pathology) {
        this.pathology = pathology;
    }

    public String getFocality() {
        return focality;
    }

    public void setFocality(String focality) {
        this.focality = focality;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getRecurred() {
        return recurred;
    }

    public void setRecurred(String recurred) {
        this.recurred = recurred;
    }

    @Override
    public String toString() {
        return "CsvRecord{" +
                "age=" + age +
                ", gender=" + gender +
                ", smoking=" + smoking +
                ", hx_Smoking=" + hxSmoking +
                ", hx_Radiothreapy=" + hx_Radiothreapy +
                ", thyroid_Function='" + thyroid_Function + '\'' +
                ", physical_Examination='" + physical_Examination + '\'' +
                ", adenopathy='" + adenopathy + '\'' +
                ", pathology='" + pathology + '\'' +
                ", focality='" + focality + '\'' +
                ", risk='" + risk + '\'' +
                ", t='" + t + '\'' +
                ", n='" + n + '\'' +
                ", m='" + m + '\'' +
                ", stage='" + stage + '\'' +
                ", response='" + response + '\'' +
                ", recurred='" + recurred + '\'' +
                '}';
    }
}
