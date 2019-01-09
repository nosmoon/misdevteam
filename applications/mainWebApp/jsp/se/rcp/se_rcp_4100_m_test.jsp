<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*
	,	org.json.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_4100_m.jsp
* ��� : ���������Ա�����Ȳ-�ʱ�ȭ��
* �ۼ����� : 2009-05-11
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%

	RwXml rx = new RwXml();
	SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_RCP_4100_MTEAM_CDCURRecord rec = (SE_RCP_4100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_RCP_4100_MPART_CDCURRecord rec = (SE_RCP_4100_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_4100_MAREA_CDCURRecord rec = (SE_RCP_4100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		
	} catch (Exception e) {
	} finally {
//		out.println(rx.xmlFlush());
//		out.println(rx.xmlEndFlush());

		JSONObject obj = XML.toJSONObject(rx.getXml());
		out.println(obj.toString());
		out.println(rx.xmlEndFlush());
	}



/*
	System.out.println("start...");
	SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)request.getAttribute("ds");	
	JsonWrapper rx = new JsonWrapper();

	JsonRecord comboSet   = rx.add("comboSet");
	JsonRecord resData 	  = rx.add("resData");	
//	JsonRecord searchData = rx.add("searchData");	
//	JsonRecord gridData   = rx.add("gridData");	

	try {

		JsonRecord teamlist = comboSet.add("teamlist");
		JsonRecord partlist = comboSet.add("partlist");
		JsonRecord arealist = comboSet.add("arealist");

		//TEAMLIST
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			//�μ��ڵ�, �μ���			
			SE_RCP_4100_MTEAM_CDCURRecord rec = (SE_RCP_4100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			teamlist.addData("dept_cd", rec.dept_cd);
			teamlist.addData("dept_nm", rec.dept_nm);
			teamlist.apply();
		}
//		comboSet.addRecord(teamlist);
//		comboSet.add(teamlist);


		//PARTLIST
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			//�μ��ڵ�, �μ���
			SE_RCP_4100_MPART_CDCURRecord rec = (SE_RCP_4100_MPART_CDCURRecord)ds.part_cdcur.get(i);		
			partlist.addData("dept_cd", rec.dept_cd);
			partlist.addData("dept_nm", rec.dept_nm);
			partlist.addData("supr_dept_cd", rec.supr_dept_cd);
			partlist.apply();
		}
//		comboSet.addRecord(partlist);
//		comboSet.add(partlist);
		

		//AREALIST
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_4100_MAREA_CDCURRecord rec = (SE_RCP_4100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			arealist.addData("area_cd", rec.area_cd);
			arealist.addData("area_nm", rec.area_nm);
			arealist.addData("dept_cd", rec.dept_cd);
			arealist.addData("supr_dept_cd", rec.supr_dept_cd);
			arealist.apply();
		}
//		comboSet.addRecord(arealist);
//		comboSet.add(arealist);
		comboSet.make();
		

		resData.addData("dept_cd", "3101");
		resData.addData("part_cd", "310101");
		resData.addData("area_cd", "B01");
		resData.addData("yymm",    "201708");
		resData.apply();
		
		rx.build();

	} catch(Exception e) {
		System.out.println("**EXCEPTION**");
	} finally {
		out.println(rx.flush().toString());	
		System.out.println("**END**");
	}
*/	


/*
	SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)request.getAttribute("ds");	
	JsonObject	root = null;
				
	try {
		JsonObjectBuilder datalist = Json.createObjectBuilder();	

		JsonObjectBuilder partlist = Json.createObjectBuilder();
		JsonObjectBuilder arealist = Json.createObjectBuilder();		
		
		JsonArrayBuilder  dataarray = Json.createArrayBuilder();		
		JsonArrayBuilder  partarray = Json.createArrayBuilder();
		JsonArrayBuilder  areaarray = Json.createArrayBuilder();



		//teamlist
		JsonObjectBuilder teamlist  = Json.createObjectBuilder();
		JsonArrayBuilder  teamarray = Json.createArrayBuilder();
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			//�μ��ڵ�, �μ���
			SE_RCP_4100_MTEAM_CDCURRecord rec = (SE_RCP_4100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);			
			JsonObjectBuilder record = Json.createObjectBuilder();
			record.add("dept_cd", rec.dept_cd);
			record.add("dept_nm", rec.dept_nm); //record
			teamarray.add(record); 				//recordset
		}
		teamlist.add("teamlist", teamarray);	//record

		
		
		//partlist
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			//�μ��ڵ�, �μ���, �����μ��ڵ�
			SE_RCP_4100_MPART_CDCURRecord rec = (SE_RCP_4100_MPART_CDCURRecord)ds.part_cdcur.get(i);		
			JsonObjectBuilder record = Json.createObjectBuilder();
			record.add("dept_cd", rec.dept_cd);
			record.add("dept_nm", rec.dept_nm);
			record.add("supr_dept_cd", rec.supr_dept_cd);
			partarray.add(record);
		}
		partlist.add("partlist", partarray);



		//arealist
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_4100_MAREA_CDCURRecord rec = (SE_RCP_4100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			JsonObjectBuilder record = Json.createObjectBuilder();
			record.add("area_cd", rec.area_cd);
			record.add("area_nm", rec.area_nm);
			record.add("dept_cd", rec.dept_cd);
			record.add("supr_dept_cd", rec.supr_dept_cd);
			areaarray.add(record);
		}
		arealist.add("arealist", areaarray);	


		dataarray.add(teamlist);
		dataarray.add(partlist);
		dataarray.add(arealist);		
		datalist.add("root", dataarray);
		root = datalist.build();


		StringWriter sout = new StringWriter();
        JsonWriter writer = Json.createWriter(sout);
        writer.writeObject(root);
        writer.close();
        out.println(sout.getBuffer().toString());

	} catch (Exception e) {
	} finally {
	}
*/
	
/*
	System.out.println("start");
	String	buff = "";
	SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)request.getAttribute("ds");
	try {
	
		String teamlist = "{\"teamlist\":[";
		String record = "";
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_RCP_4100_MTEAM_CDCURRecord rec = (SE_RCP_4100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			record += (record == "") ? "" : ",";
			record += "{\"dept_cd\":\"" + rec.dept_cd + "\", \"dept_nm\":\"" + rec.dept_nm + "\"}";	//�μ��ڵ�, �μ���
		}
		teamlist += record + "]}";

		String partlist = "{\"partlist\":[";
		record = "";
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_RCP_4100_MPART_CDCURRecord rec = (SE_RCP_4100_MPART_CDCURRecord)ds.part_cdcur.get(i);
			record += (record == "") ? "" : ",";
			record += "{\"dept_cd\":\"" + rec.dept_cd + "\", \"dept_nm\":\"" + rec.dept_nm + "\", \"supr_dept_cd\":\"" + rec.supr_dept_cd + "\"}";	//�μ��ڵ�, �μ���, �����μ��ڵ�
		}
		partlist += record + "]}";
		
		String arealist = "{\"arealist\":[";
		record = "";
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_4100_MAREA_CDCURRecord rec = (SE_RCP_4100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			record += (record == "") ? "" : ",";
			record += "{\"area_cd\":\"" + rec.area_cd + "\", \"area_nm\":\"" + rec.area_nm + "\", \"dept_cd\":\"" + rec.dept_cd + "\", \"supr_dept_cd\":\"" + rec.supr_dept_cd + "\"}";
		}
		arealist += record + "]}";

		buff += "[" + teamlist + "," + partlist + "," + arealist + "]";
		//buff += "{\"record\":[" + teamlist + "," + partlist + "," + arealist + "]}";
	} catch (Exception e) {
	} finally {
		out.println(buff);
	}
*/	
	
/*
	RwXml rx = new RwXml();
	SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_RCP_4100_MTEAM_CDCURRecord rec = (SE_RCP_4100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_RCP_4100_MPART_CDCURRecord rec = (SE_RCP_4100_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_4100_MAREA_CDCURRecord rec = (SE_RCP_4100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
*/	
%>
