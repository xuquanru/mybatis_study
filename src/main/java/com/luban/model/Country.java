package com.luban.model;

/**
 * @program: mybatis_study
 * @description
 * @author: Stephen
 * @create: 2019-06-09 21:17
 **/
public class Country {
    private String id;
    private String countryname;
    private String countrycode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
