package com.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**享元对象工厂
 * @author snailfast
 *
 */
public class WebSiteFactory {
	private static Map<String, WebSite> flyweigts = new HashMap<>();
	
	public static WebSite getWebSite(String webSiteName){
		WebSite webSite = flyweigts.get(webSiteName);
		if(null == webSite){
			webSite = new WebSite(webSiteName);
			flyweigts.put(webSiteName, webSite);
		}
		return webSite;
	}
}
