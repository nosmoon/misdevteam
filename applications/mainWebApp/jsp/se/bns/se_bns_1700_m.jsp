<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bns_1700_m.jsp
* ��� :   �Ǹ�-���˹����� - ���˹������Ȳ��ȸ
* �ۼ����� : 2009-05-04
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
	SE_BNS_1700_MDataSet ds = (SE_BNS_1700_MDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	
	String today	= year + month;
	rx.add(root		, "divn_yymm"	, today);
	
	//formData 		= rx.add(root		, "initData"	, "");
	formData 		= rx.add(root	, "comboSet"	, "");

	try {
		recordSet	= rx.add(formData	, "teamlist"		, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_BNS_1700_MTEAMLISTRecord rec = (SE_BNS_1700_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
		}
		
		recordSet	= rx.add(formData	, "arealist_temp"	, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_BNS_1700_MAREALISTRecord rec = (SE_BNS_1700_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet	= rx.add(formData	, "partlist_temp"	, "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BNS_1700_MPARTLISTRecord rec = (SE_BNS_1700_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
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
	<TEAMLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAMLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<PARTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PARTLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<teamlist/>
		<partlist/>
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon May 04 11:01:47 KST 2009 */ %>