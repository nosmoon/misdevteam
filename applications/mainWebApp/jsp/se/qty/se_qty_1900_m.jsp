<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_1900_m.jsp
* ��� : �߼ۺμ�����-�ʱ�ȭ��
* �ۼ����� : 2009-02-26
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
	SE_QTY_1900_MDataSet ds = (SE_QTY_1900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		//�����÷� ���� ��������(�׸��� ��ȸ�� �̸� �����;���)
		rx.add(comboSet, "rownum1", ds.rownum1);
		rx.add(comboSet, "rownum2", ds.rownum2);
		
		int teamlist = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_QTY_1900_MTEAM_CDCURRecord rec = (SE_QTY_1900_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_QTY_1900_MPART_CDCURRecord rec = (SE_QTY_1900_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_QTY_1900_MAREA_CDCURRecord rec = (SE_QTY_1900_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
