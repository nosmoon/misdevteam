<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.ang.ds.*
	,	chosun.ciis.se.ang.rec.*
	,	org.json.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_ang_1010_l.jsp
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	//-----------------------------------------
	// ** XML �����ϴ� ������ ���� �״�� ����� **
	//-----------------------------------------
	
	RwXml rx = new RwXml();
	SE_ANG_1010_LDataSet ds = (SE_ANG_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_ANG_1010_LTEAM_CDCURRecord rec = (SE_ANG_1010_LTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_ANG_1010_LPART_CDCURRecord rec = (SE_ANG_1010_LPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_ANG_1010_LAREA_CDCURRecord rec = (SE_ANG_1010_LAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		
	} catch (Exception e) {
	} finally {
	
		//-----------------------------------------
		// *����: ������ XML ��ü��  �������� ����� ����
		//-----------------------------------------
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());


		//-----------------------------------------
		// *�ű�: ������ XML�� JSON���·� ��ȯ�Ͽ� ������
		//-----------------------------------------
		JSONObject obj = XML.toJSONObject(rx.getXml());
		out.println(obj.toString());
		out.println(rx.xmlEndFlush());
	}


%>
