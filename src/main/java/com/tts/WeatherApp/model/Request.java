package com.tts.WeatherApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Request {
    private String zipCode;

    public Request() {
    }

//    public String getZipCode() {
//        return this.zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }

//    @Override
//    public String toString() {
//        return "{" +
//                " zipCode='" + getZipCode() + "'" +
//                "}";
//    }
}
