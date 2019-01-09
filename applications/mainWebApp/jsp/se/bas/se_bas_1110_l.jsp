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

<%
	RwXml rx = new RwXml();
	SE_BAS_1110_LDataSet ds = (SE_BAS_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	errcode = (String)ds.errcode;
	errmsg  = (String)ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
		recordSet = rx.add(recordSet, "main", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1110_LCURLISTRecord rec = (SE_BAS_1110_LCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"	, rec.cmpy_cd);  	//ȸ���ڵ�
			rx.add(record, "area_cd"	, rec.area_cd);		//�����ڵ�
			rx.add(record, "area_nm"	, rec.area_nm);		//������
			rx.add(record, "sido_cd"	, rec.sido_cd);		//�õ��ڵ�
			rx.add(record, "sido_nm"	, rec.sido_nm);		//�õ���
			rx.add(record, "chrg_pers"	, rec.chrg_pers);	//���
			rx.add(record, "flnm"		, rec.flnm);		//����ڸ�
			rx.add(record, "dept_nm"	, rec.dept_nm);		//�μ���
			rx.add(record, "dept_cd"	, rec.dept_cd);		//�μ��ڵ�
			rx.add(record, "use_yn"		, rec.use_yn);		//��뱸��
			rx.add(record, "area_cd_key", rec.area_cd_key);	//�����ڵ�
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
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