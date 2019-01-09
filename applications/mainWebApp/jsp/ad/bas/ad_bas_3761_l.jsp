<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3761_LDataSet ds = (AD_BAS_3761_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData5", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "hndl_evlt", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3761_LCURLISTRecord rec = (AD_BAS_3761_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "sect", rec.sect);
			rx.add(record, "hndl_nm_cd", rec.hndl_nm_cd);
			rx.add(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "hndl_evlt", rec.hndl_evlt_cd);
			rx.add(record, "points", rec.points);
			rx.add(record, "other", rec.other);						
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_remk", rec.slcrg_remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
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
<ad_bas_3761_l>
	<dataSet>
		<CURLIST>
			<record>
				<medi_cd/>
				<pubc_dt/>
				<pubc_seq/>
				<sect/>
				<hndl_nm_cd/>
				<advt_cont/>
				<dn/>
				<cm/>
				<hndl_evlt_cd/>
				<remk/>
				<slcrg_remk/>
				<slcrg_nm/>
			</record>
		</CURLIST>
	</dataSet>
</ad_bas_3761_l>
*/
%>

<% /* 작성시간 : Tue Feb 04 14:57:48 KST 2014 */ %>