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
	HD_EVLU_5601_LDataSet ds = (HD_EVLU_5601_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5601_LCURLISTRecord rec = (HD_EVLU_5601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "evlu_step_clsf", rec.evlu_step_clsf);
			rx.add(record, "rfl_ratio", rec.rfl_ratio);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "evlu_step_clsf", StringUtil.replaceToXml(rec.evlu_step_clsf));
			//rx.add(record, "rfl_ratio", StringUtil.replaceToXml(rec.rfl_ratio));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_evlu_5601_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<evlu_step_clsf/>
				<rfl_ratio/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5601_l>
*/
%>

<% /* �ۼ��ð� : Fri Jun 05 10:11:41 KST 2009 */ %>