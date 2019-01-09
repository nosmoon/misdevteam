<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_9001_LDataSet ds = (MT_ETCCAR_9001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	formData = rx.add(root, "main", "");
	
	try {
		/****** CURLIST BEGIN */
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_9001_LCURLISTRecord rec = (MT_ETCCAR_9001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "drvr_cd", rec.drvr_cd);
			rx.add(record, "drvr_nm", rec.drvr_nm);
			rx.add(record, "driv_yn", rec.driv_yn);
			rx.add(record, "nondriv_clsf", rec.nondriv_clsf);
			//rx.add(record, "drvr_cd", StringUtil.replaceToXml(rec.drvr_cd));
			//rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			//rx.add(record, "driv_yn", StringUtil.replaceToXml(rec.driv_yn));
			//rx.add(record, "nondriv_clsf", StringUtil.replaceToXml(rec.nondriv_clsf));
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<mt_etccar_9001_l>
	<dataSet>
		<CURLIST>
			<record>
				<drvr_cd/>
				<drvr_nm/>
				<driv_yn/>
				<nondriv_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9001_l>
*/
%>

<% /* 작성시간 : Fri Aug 24 14:52:08 KST 2012 */ %>