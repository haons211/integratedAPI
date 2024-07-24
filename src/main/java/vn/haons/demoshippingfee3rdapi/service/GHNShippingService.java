package vn.haons.demoshippingfee3rdapi.service;



import io.github.cdimascio.dotenv.Dotenv;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GHNShippingService implements ShippingService {

    RestTemplate restTemplate;



    public Object getProvince() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Token", "b592119a-48d8-11ef-8e53-0a00184fe6941");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String URL ="https://dev-online-gateway.ghn.vn/shiip/public-api/master-data/province";
        return restTemplate.exchange(URL, HttpMethod.GET, entity, Object.class);
    }


}


