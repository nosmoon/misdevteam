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
* ���ϸ� : se_qty_1100_m.jsp
* ��� : �������ϰ�ǥ�۾�-�ʱ�ȭ��
* �ۼ����� : 2009-02-12
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
	SE_QTY_1100_MDataSet ds = (SE_QTY_1100_MDataSet)request.getAttribute("ds");
	String menugb = request.getParameter("fwdData");	//"1":�μ�����ȭ��, "2":������ȭ��
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_QTY_1100_MTEAM_CDCURRecord rec = (SE_QTY_1100_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_QTY_1100_MPART_CDCURRecord rec = (SE_QTY_1100_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_QTY_1100_MAREA_CDCURRecord rec = (SE_QTY_1100_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		String sMedicd = "";
		String sMedinm = "";
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_1100_MCOMMCDCUR1Record rec = (SE_QTY_1100_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			sMedicd = rec.cd;
			sMedinm = rec.cdnm;
			if("1".equals(menugb)){	//�μ������ ����,�ҳ�
				if("110".equals(sMedicd) || "130".equals(sMedicd)){
					item  = rx.add( medi_cd , "item" , "");
					rx.add(item, "value", sMedicd);
					rx.add(item, "label", sMedinm);
				}
			}else{		//������ ������
				if("610".equals(sMedicd)){
					item  = rx.add( medi_cd , "item" , "");
					rx.add(item, "value", sMedicd);
					rx.add(item, "label", sMedinm);
				}
			}
		}
		
		int sell_net_clsf = rx.add(comboSet, "search_sell_net_clsf", "");
		for(int i = 0; i < ds.sellclsflist.size(); i++) {
			SE_QTY_1100_MSELLCLSFLISTRecord rec = (SE_QTY_1100_MSELLCLSFLISTRecord)ds.sellclsflist.get(i);
			
			item  = rx.add( sell_net_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
