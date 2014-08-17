package oauth.client;

import java.net.URI;

import org.springframework.security.oauth2.consumer.OAuth2RestTemplate;
import org.springframework.security.oauth2.consumer.token.OAuth2ClientTokenServices;

public class OauthServiceImpl implements OauthService {

	private String providerNameURL = null;

	private OAuth2RestTemplate providerNameRestTemplate;
	private OAuth2ClientTokenServices tokenServices;
	
	public String getUserName() {
		byte[] content = (getProviderNameRestTemplate().getForObject(URI.create(providerNameURL), byte[].class));
		return new String(content);
	}
	
	public String getProviderNameURL() {
		return providerNameURL;
	}
	public void setProviderNameURL(String providerNameURL) {
		this.providerNameURL = providerNameURL;
	}
	public OAuth2RestTemplate getProviderNameRestTemplate() {
		return providerNameRestTemplate;
	}
	public void setProviderNameRestTemplate(OAuth2RestTemplate providerNameRestTemplate) {
		this.providerNameRestTemplate = providerNameRestTemplate;
	}
	public OAuth2ClientTokenServices getTokenServices() {
		return tokenServices;
	}
	public void setTokenServices(OAuth2ClientTokenServices tokenServices) {
		this.tokenServices = tokenServices;
	}

	
	
}
