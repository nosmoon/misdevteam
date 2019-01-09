<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1140_LDataSet ds = (IS_BAS_1140_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int formData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "tempData", "");			
	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(root, "tempData", "");
		
		rx.add(dataSet, "supr_dept_cd", ds.supr_dept_cd);
		rx.add(dataSet, "supr_dept_nm", ds.supr_dept_nm);
		rx.add(dataSet, "step", ds.step);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<is_bas_1140_l>
	<dataSet>
		<CURLIST>
			<record>
				<supr_dept_cd/>
				<supr_dept_nm/>
				<step/>
			</record>
		</CURLIST>
	</dataSet>
</is_bas_1140_l>
*/
%>

<% /* 작성시간 : Mon Dec 17 19:04:16 KST 2012 */ %>