package lab.five.client.ribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		
		return
			getWord("lab-5-subject") + " " +
			getWord("lab-5-verb") + " " + 
			getWord("lab-5-article") + " " + 
			getWord("lab-5-adjective") + " " + 
			getWord("lab-5-noun") + ".";
	}
	
	public String getWord(String service) {
		
		return template.getForObject("http://" + service, String.class);
	}
}

