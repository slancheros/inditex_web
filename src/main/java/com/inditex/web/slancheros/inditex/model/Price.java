package com.inditex.web.slancheros.inditex.model;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





/*    @RequestMapping(value = "/weekly/{service}/{location}/{units}", method = RequestMethod.GET)
    public String getWeeklyForecast(@PathVariable String service, @PathVariable String  location, @PathVariable String units) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity <String> requestEntity = new HttpEntity<String>(headers);
        Map<String, String> params = new HashMap<String, String>();
        params.put("location", location);
        params.put("units", units);
        String url = "http://openmap-weather-service/weekly/{location}/{units}";
        URI uri = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(params)
                .toUri();
        String response = restTemplate.exchange(uri,  HttpMethod.GET, requestEntity, String.class).getBody();
        return response;
    }




}*/
@RestController
public class Price {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getWeeklyForecast() {
        return "Hello Sandra";
    }
}
