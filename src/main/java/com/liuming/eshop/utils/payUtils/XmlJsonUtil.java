package com.liuming.eshop.utils.payUtils;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class XmlJsonUtil {
	private static final String xml = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg><appid><![CDATA[wxa03c653bcd16441a]]></appid><mch_id><![CDATA[1390106602]]></mch_id><nonce_str><![CDATA[wzgyyFqQlILZAzTL]]></nonce_str><sign><![CDATA[898FD840B049041EB81A4CC0975A0CA3]]></sign><result_code><![CDATA[SUCCESS]]></result_code><prepay_id><![CDATA[wx20161102160452d6e18347200295455162]]></prepay_id><trade_type><![CDATA[APP]]></trade_type></xml>";

    public static String xml2JSON(String xml){
        return new XMLSerializer().read(xml).toString();
    }
     
    public static String json2XML(String json){
        JSONObject jobj = JSONObject.fromObject(json);
        String xml =  new XMLSerializer().write(jobj);
        return xml;
    }
     
    public static void main(String[] args) {
        String json = xml2JSON(xml);
        System.out.println("json="+json);
    }
}