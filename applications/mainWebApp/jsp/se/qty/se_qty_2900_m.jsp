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
* ���ϸ� : se_qty_2900_m.jsp
* ��� :  �μ����� - �߼ۺμ� - �߼ۺμ�������Ȳ
* �ۼ����� : 2009-03-09
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_2900_MDataSet ds = (SE_QTY_2900_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	
	String today	= year + month + day;
	rx.add(root		, "end_issu_dt"	, today);
	
	cal.add(Calendar.YEAR, -1);
	
	year 			= String.valueOf(cal.get(cal.YEAR));
	month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	day				= day.length() == 1 ? "0" + day : day;
	today			= year + month + day;
	
	rx.add(root		, "bgn_issu_dt"	, today);
	
	formData				= rx.add(root		, "comboSet"		, "");
	try {
		int teamlist = rx.add(formData, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_QTY_2900_MTEAM_CDCURRecord rec = (SE_QTY_2900_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		int partlist_temp = rx.add(formData, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_QTY_2900_MPART_CDCURRecord rec = (SE_QTY_2900_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		int arealist_temp = rx.add(formData, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_QTY_2900_MAREA_CDCURRecord rec = (SE_QTY_2900_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2900_MCURLISTRecord rec = (SE_QTY_2900_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Mar 09 14:36:04 KST 2009 */ %>