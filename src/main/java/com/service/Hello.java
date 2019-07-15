/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* Copyright (c) 2019 , Inc. All Rights Reserved.* * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*/
package com.service;

import org.springframework.stereotype.Service;

import com.DTO.DTOData;

/**
 *This class is used for 
 * @author Vakeel.Ahamad
 *
 */
@Service
public class Hello {
	
	
	public void hello(){
		DTOData data=new DTOData();
		data.getFoo();
	}

}
