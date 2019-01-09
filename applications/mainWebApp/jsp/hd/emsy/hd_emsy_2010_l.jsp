<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.emsy.rec.*
	,	chosun.ciis.hd.emsy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml(); 
	ArrayList ds = (ArrayList)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	//String errcode = ds.errcode;
	//String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.size(); i++) {
			HashMap rMap = (HashMap)ds.get(i);
			//HD_EMSY_2009_LCURLISTRecord rec = (HD_EMSY_2009_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rMap.get("dept_nm").toString());
			rx.addCData(record, "emp_no", rMap.get("emp_no").toString());
			rx.addCData(record, "flnm", rMap.get("flnm").toString());
			rx.addCData(record, "prn", rMap.get("prn").toString());
			rx.addCData(record, "dhtml", rMap.get("dhtml").toString());
			//rx.add(record, "nm_korn", rec.nm_korn);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
		}
		rx.add(recordSet, "totalcnt", ds.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		//errcode += " JSP Error";
		//errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		//rx.add(dataSet, "errcode", errcode);
		//rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
	
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_emsy_2009_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_emsy_2009_l>
*/
%>

<% /* 작성시간 : Wed Oct 06 18:07:05 KST 2010 */ %>