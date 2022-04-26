/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 *
 * @author miguel
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class DemoResponse {

	private Date timestamp;
	private String reference;
}
