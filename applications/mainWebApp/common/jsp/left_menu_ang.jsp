<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.mng.rec.*
	,	chosun.ciis.co.mng.ds.*	
	,	org.json.*;
	"
%>
<%
System.out.println("jsp go2");

	//RwXml rx = new RwXml();
	CO_MNG_1010_LDataSet ds = (CO_MNG_1010_LDataSet)request.getAttribute("ds");
	//int root = RwXml.rootNodeID;
	//int leftData = rx.add(root, "leftData", "");
	//int items = 0;	
	//int details = 0;
	//int subdetails = 0;
	//int enddetails = 0;	
	String oldLevl = "0";
	String strJSON = "{\"root\":{\"leftData\":";	
	//String Test = "[{\"TV\":\"3d tv\"},{\"computer\":\"Computer\notebook\",\"LG\":\"1\",\"count\":\"20\"}]";
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_MNG_1010_LCURLISTRecord rec = (CO_MNG_1010_LCURLISTRecord)ds.curlist.get(i);
				if("1".equals(rec.menu_levl)){
					//items = rx.add(leftData, "items", "");				
					//rx.add(items, "menu_nm", rec.menu_nm);
					//rx.add(items, "exec_url", rec.exec_url);
					//rx.add(items, "visible_yn", true);
					if(i == 0){
						strJSON = strJSON + "{\"items\":[{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}else{
						if("2".equals(oldLevl)){
							strJSON = strJSON + "}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
						}else if("3".equals(oldLevl)){
							strJSON = strJSON + "}]}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";							
						}else if("4".equals(oldLevl)){
							strJSON = strJSON + "}]}]}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";						
						}
					}
				}
				else if("2".equals(rec.menu_levl)){
					//details = rx.add(items, "details", "");
					//rx.add(details, "menu_nm", rec.menu_nm);
					//rx.add(details, "exec_url", rec.exec_url);
					if(Integer.parseInt(oldLevl) < Integer.parseInt(rec.menu_levl)){//����1���� ����2�� 
						strJSON = strJSON + ",\"details\":[{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}else if(Integer.parseInt(oldLevl) > Integer.parseInt(rec.menu_levl) && "3".equals(oldLevl)){//����3���� ����2�� 
						strJSON = strJSON + "}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";						
					}else if(Integer.parseInt(oldLevl) > Integer.parseInt(rec.menu_levl) && "4".equals(oldLevl)){//����4���� ����2�� 
						strJSON = strJSON + "}]}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";						
					}
					else{//����2���� ����2�� 
						strJSON = strJSON + "},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}
					//��ȣ �ݱ�
					if(i == (ds.curlist.size()-1)){//������ ��
						strJSON = strJSON + "}]}"+"]}"+"}}";
					}
				}
				else if("3".equals(rec.menu_levl)){
					//subdetails = rx.add(details, "subdetails", "");
					//rx.add(subdetails, "menu_nm", rec.menu_nm);		
					//rx.add(subdetails, "exec_url", rec.exec_url);					
					if(Integer.parseInt(oldLevl) < Integer.parseInt(rec.menu_levl)){//����2���� ����3�� 
						strJSON = strJSON + ",\"subdetails\":[{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}else if(Integer.parseInt(oldLevl) > Integer.parseInt(rec.menu_levl)){//����4���� ����3�� 
						strJSON = strJSON + "}]},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";						
					}
					else{//����3���� ����3�� 
						strJSON = strJSON + "},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}
					//��ȣ �ݱ�
					if(i == (ds.curlist.size()-1)){//������ ��
						strJSON = strJSON + "}]}"+ "]}" +"]}"+"}}";
					}						
				}else if("4".equals(rec.menu_levl)){
					//enddetails = rx.add(subdetails, "enddetails", "");
					//rx.add(enddetails, "menu_nm", rec.menu_nm);
					//rx.add(enddetails, "exec_url", rec.exec_url);					
					if(Integer.parseInt(oldLevl) < Integer.parseInt(rec.menu_levl)){//����3���� ����4�� 
						strJSON = strJSON + ",\"enddetails\":[{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}
					else{//����4���� ����4�� 
						strJSON = strJSON + "},{\"menu_nm\":\""+rec.menu_nm+"\",\"exec_url\":\""+rec.exec_url+"\"";
					}
					//��ȣ �ݱ�
					if(i == (ds.curlist.size()-1)){//������ ��
						strJSON = strJSON + "}]}"+ "]}"+ "]}"+"]}"+"}}";
					}						
				}
				oldLevl = rec.menu_levl;
		} 
		//items = rx.add(leftData, "items", "");
	} catch (Exception e) {
	} finally {
		//System.out.println(rx.getXml());
		//JSONObject obj = XML.toJSONObject(rx.getXml());
		//JSONObject leftDataJO = obj.getJSONObject("root");
		//JSONObject leftDataJO2 = leftDataJO.getJSONObject("leftData");
		//if(leftDataJO2.optJSONArray("items") != null){
			//System.out.println(obj.toString());
			//out.println(obj.toString());
		//}else{
		//	System.out.println("22");
			//JSONObject itemsJO = leftDataJO2.getJSONObject("items");
			//JSONArray itemsJA = new JSONArray();
		//	System.out.println("221");
			//itemsJA.put(itemsJO);
 
			//System.out.println(itemsJA.toString());
			//out.println(itemsJA.toString());
			
		//}
		//out.println(obj.toString());
		//System.out.println(strJSON);	
		JSONObject obj = new JSONObject(strJSON);
		out.println(obj.toString());
		//out.println(strJSON);
		//out.println(rx.xmlEndFlush());		
	}	
%>
