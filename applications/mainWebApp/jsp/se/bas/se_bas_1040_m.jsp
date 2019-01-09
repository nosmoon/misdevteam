<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bas_1040_m.jsp
* ��� : �Ǹ� - �������� - �μ����� - ��, ��Ʈ �޺��ʱ�ȭ�� 
* �ۼ����� : 2009.07.11
* �ۼ��� : �̱�Ź
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_BAS_1040_MDataSet ds = (SE_BAS_1040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	errcode = (String)ds.errcode;
	errmsg  = (String)ds.errmsg;

	try {
		/****** TEAMLIST BEGIN */
		recordSet = rx.add(root, "codeData", "");
		recordSet = rx.add(recordSet, "teamlist", "");
		
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_BAS_1040_MTEAMLISTRecord rec = (SE_BAS_1040_MTEAMLISTRecord)ds.teamlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		rx.add(recordSet, "totalcnt", ds.teamlist.size());
		/****** TEAMLIST END */
		
		/****** PARTLIST BEGIN */
		recordSet--;
		recordSet = rx.add(recordSet, "partlist", "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BAS_1040_MPARTLISTRecord rec = (SE_BAS_1040_MPARTLISTRecord)ds.partlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		rx.add(recordSet, "totalcnt", ds.partlist.size());
		/****** PARTLIST END */
	
		
	
		
		
		
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<gridData>
	<main>
		<record>
		    <cmpy_cd/>
			<area_cd/>
			<area_nm/>
			<sido_cd/>
			<sido_nm/>
			<chrg_pers/>
			<flnm/>
			<dept_nm/>
		</record>
	</main>
</gridData>

*/
%>

<% /* �ۼ��ð� : Tue Jan 13 18:16:18 KST 2009 */ %>