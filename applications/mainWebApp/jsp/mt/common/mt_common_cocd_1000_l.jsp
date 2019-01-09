<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.common.rec.*
	,	chosun.ciis.mt.common.ds.*;
	"
%>
 
<%
	RwXml rx = new RwXml();
	MT_COMMON_COCD_1000_LDataSet ds = (MT_COMMON_COCD_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	int comboSet = 0;
	try {
		/****** COMMCDCUR1 BEGIN */
		recordSet = rx.add(dataSet, "part_clas2", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			MT_COMMON_COCD_1000_LCOMMCDCUR1Record rec = (MT_COMMON_COCD_1000_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(recordSet, "item", "");
			//int record = rx.add(cd_clsf, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd+" "+StringUtil.replaceToXml(rec.cdnm));
		}
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
TrustForm의 Instance 선언부에 복사해서 사용
<mt_common_cocd_1000_l>
	<dataSet>
		<COMMCDCUR1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</COMMCDCUR1>
	</dataSet>
</mt_common_cocd_1000_l>
*/
%>

<% /* 작성시간 : Mon Mar 09 18:39:48 KST 2015 */ %>