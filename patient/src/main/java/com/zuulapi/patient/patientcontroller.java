package com.zuulapi.patient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientcontroller {

@GetMapping("/patient")
public String doc()
{
return "List of patient";
}
}
