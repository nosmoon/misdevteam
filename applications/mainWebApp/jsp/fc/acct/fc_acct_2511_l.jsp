<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
    ,   chosun.ciis.co.base.util.*;	
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2511_LDataSet ds = (FC_ACCT_2511_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2511_LCURLISTRecord rec = (FC_ACCT_2511_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");			
			rx.add(record, "fisc_dt"        , StringUtil.replaceToXml(rec.fisc_dt       )   );
			rx.add(record, "slip_no"        , StringUtil.replaceToXml(rec.slip_no       )   );
			rx.add(record, "rmks"           , StringUtil.replaceToXml(rec.rmks          )   );
			rx.add(record, "dr_amt"         , StringUtil.replaceToXml(rec.dr_amt        )   );
			rx.add(record, "crdt_amt"       , StringUtil.replaceToXml(rec.crdt_amt      )   );
			rx.add(record, "mang_clsf_cd"   , StringUtil.replaceToXml(rec.mang_clsf_cd  )   );
			rx.add(record, "comp_dt"        , StringUtil.replaceToXml(rec.comp_dt       )   );
			rx.add(record, "mang_no"        , StringUtil.replaceToXml(rec.mang_no       )   );
			rx.add(record, "dlco_clsf_cd"   , StringUtil.replaceToXml(rec.dlco_clsf_cd  )   );
			rx.add(record, "dlco_cd"        , StringUtil.replaceToXml(rec.dlco_cd       )   );
			rx.add(record, "dlco_nm"        , StringUtil.replaceToXml(rec.dlco_nm       )   );
			rx.add(record, "boks_dlco_nm"   , StringUtil.replaceToXml(rec.boks_dlco_nm  )   );
			rx.add(record, "incmg_emp_no"   , StringUtil.replaceToXml(rec.incmg_emp_no  )   );
			rx.add(record, "clam_dept_cd"   , StringUtil.replaceToXml(rec.clam_dept_cd  )   );
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<fisc_dt/>
			<slip_no/>
			<rmks/>
			<dr_amt/>
			<crdt_amt/>
			<mang_clsf_cd/>
			<comp_dt/>
			<mang_no/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<boks_dlco_nm/>
			<incmg_emp_no/>
			<clam_dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 11 16:20:15 KST 2009 */ %>