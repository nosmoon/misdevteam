<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5401_LDataSet ds = (HD_EVLU_5401_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5401_LCURLISTRecord rec = (HD_EVLU_5401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "evlu_subj_cd", rec.evlu_subj_cd);
			rx.add(record, "evlu_clon_cd", rec.evlu_clon_cd);
			rx.add(record, "evlu_subj_cd_nm", rec.evlu_subj_cd_nm);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "evlu_subj_cd", StringUtil.replaceToXml(rec.evlu_subj_cd));
			//rx.add(record, "evlu_clon_cd", StringUtil.replaceToXml(rec.evlu_clon_cd));
			//rx.add(record, "evlu_subj_cd_nm", StringUtil.replaceToXml(rec.evlu_subj_cd_nm));
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
<hd_evlu_5401_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<evlu_subj_cd/>
				<evlu_clon_cd/>
				<evlu_subj_cd_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5401_l>
*/
%>

<% /* 작성시간 : Thu Jun 04 10:33:11 KST 2009 */ %>