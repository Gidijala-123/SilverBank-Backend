package SilverBankMain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SilverBankMain.ModelDTO.SilverModelDTO;
import SilverBankMain.service.SilverService;

@RestController
@CrossOrigin(origins = "*")
public class SilverController {
	
	@Autowired
	private SilverService silverService;
	
		
	@PostMapping("/saveContactForm")
	public String saveContact(@RequestBody SilverModelDTO silverModelDto) {
		return silverService.saveContactForm(silverModelDto);		
	}	
}