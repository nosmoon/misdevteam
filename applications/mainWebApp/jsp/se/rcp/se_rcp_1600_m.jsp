<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_1600_m.jsp
* ��� : ������µ��-�ʱ�ȭ��
* �ۼ����� : 2009-05-06
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
	SE_RCP_1600_MDataSet ds = (SE_RCP_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_RCP_1600_MTEAM_CDCURRecord rec = (SE_RCP_1600_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_RCP_1600_MPART_CDCURRecord rec = (SE_RCP_1600_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_RCP_1600_MAREA_CDCURRecord rec = (SE_RCP_1600_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		int cntr_stat_clsf = rx.add(comboSet, "cntr_stat_clsf", "");	
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_RCP_1600_MCOMMCDCUR1Record rec = (SE_RCP_1600_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( cntr_stat_clsf , "item" , "");
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "value", rec.cd );
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
