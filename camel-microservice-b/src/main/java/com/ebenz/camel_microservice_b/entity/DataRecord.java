package com.ebenz.camel_microservice_b.entity;

import jakarta.persistence.*;

@Entity
public class DataRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Gender")
    private char gender;
    @Column(name = "Smoking")
    private Boolean smoking;
    @Column(name = "Hx_Smoking")
    private Boolean hx_Smoking;
    @Column(name = "Hx_Radiotherapy")
    private Boolean hx_Radiotherapy;
    @Column(name = "Thyroid_Function")
    private String thyroid_Function;
    @Column(name = "Physical_Examination")
    private String physical_Examination;
    @Column(name = "Adenopathy")
    private String adenopathy;
    @Column(name = "Pathology")
    private String pathology;
    @Column(name = "Focality")
    private String focality;
    @Column(name = "Risk")
    private String risk;
    @Column(name = "T")
    private String t;
    @Column(name = "N")
    private String n;
    @Column(name = "M")
    private String m;
    @Column(name = "Stage")
    private String stage;
    @Column(name = "Response")
    private String response;
    @Column(name = "Recurred")
    private String recurred;

    public DataRecord() {
    }

    public DataRecord(Long id, Integer age, char gender, Boolean smoking, Boolean hx_Smoking, Boolean hx_Radiotherapy, String thyroid_Function, String physical_Examination, String adenopathy, String pathology, String focality, String risk, String t, String n, String m, String stage, String response, String recurred) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.smoking = smoking;
        this.hx_Smoking = hx_Smoking;
        this.hx_Radiotherapy = hx_Radiotherapy;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return hx_Smoking;
    }

    public void setHx_Smoking(Boolean hx_Smoking) {
        this.hx_Smoking = hx_Smoking;
    }

    public Boolean getHx_Radiotherapy() {
        return hx_Radiotherapy;
    }

    public void setHx_Radiotherapy(Boolean hx_Radiotherapy) {
        this.hx_Radiotherapy = hx_Radiotherapy;
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
        return "DataRecord{" +
                "id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", smoking=" + smoking +
                ", hx_Smoking=" + hx_Smoking +
                ", hx_Radiotherapy=" + hx_Radiotherapy +
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
