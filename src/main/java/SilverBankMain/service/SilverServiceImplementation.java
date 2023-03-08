package SilverBankMain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SilverBankMain.ModelDTO.SilverModelDTO;
import SilverBankMain.model.SilverModel;
import SilverBankMain.repository.SilverRepository;

@Service
public class SilverServiceImplementation implements SilverService{
	
	@Autowired
	private SilverRepository silverRepo;
	
	@Override
	public String saveContactForm(SilverModelDTO silverModelDto) {		
		SilverModel silverModel = new SilverModel();		
		silverModel.setSilverFullName(silverModelDto.getSilverFullName());
		silverModel.setSilverEmail(silverModelDto.getSilverEmail());
		silverModel.setSilverMessage(silverModelDto.getSilverMessage());
		silverModel.setSilverPhoneNumber(silverModelDto.getSilverPhoneNumber());
		silverModel.setSilverTopic(silverModelDto.getSilverTopic());		
		silverRepo.save(silverModel);
		return "Success..!";		
	}

}
