<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ss.sls.brmgr.rec.*
	,	chosun.ciis.ss.sls.brmgr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SL_I_ABCDataSet ds = (SL_I_ABCDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int detaildata = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	detaildata = rx.add(root, "detaildata", "");
	System.out.println(root);
	try {
		/****** ABCCUR BEGIN */
		recordSet = rx.add(detaildata, "ABCCUR", "");

		for(int i = 0; i < ds.abccur.size(); i++) {
			SL_I_ABCABCCURRecord rec = (SL_I_ABCABCCURRecord)ds.abccur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "basiyymm", rec.basiyymm);
			rx.add(record, "rdr_no", rec.rdr_no);
			rx.add(record, "medicd", rec.medicd);
			rx.add(record, "cntrno", rec.cntrno);
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "subsfrmm", rec.subsfrmm);
			rx.add(record, "valyymm", rec.valyymm);
			rx.add(record, "abcvalyymm", rec.abcvalyymm);
			rx.add(record, "dscnamt", rec.dscnamt);
			rx.add(record, "subsqty", rec.subsqty);
			//rx.add(record, "resitypecd", rec.resitypecd);
			rx.add(record, "rdr_extndt", rec.rdr_extndt);
			rx.add(record, "clamtmms", rec.clamtmms);
			rx.add(record, "re_freemms", rec.re_freemms);
			rx.add(record, "clamthsty", rec.clamthsty);
			rx.add(record, "status", rec.status);
			//rx.add(record, "basiyymm", StringUtil.replaceToXml(rec.basiyymm));
			//rx.add(record, "rdr_no", StringUtil.replaceToXml(rec.rdr_no));
			//rx.add(record, "medicd", StringUtil.replaceToXml(rec.medicd));
			//rx.add(record, "cntrno", StringUtil.replaceToXml(rec.cntrno));
			//rx.add(record, "bocd", StringUtil.replaceToXml(rec.bocd));
			//rx.add(record, "valyymm", StringUtil.replaceToXml(rec.valyymm));
			//rx.add(record, "abcvalyymm", StringUtil.replaceToXml(rec.abcvalyymm));
			//rx.add(record, "dscnamt", StringUtil.replaceToXml(rec.dscnamt));
			//rx.add(record, "subsqty", StringUtil.replaceToXml(rec.subsqty));
			rx.add(record, "resitypecd", StringUtil.replaceToXml(rec.resitypecd));
			//rx.add(record, "rdr_extndt", StringUtil.replaceToXml(rec.rdr_extndt));
			//rx.add(record, "clamtmms", StringUtil.replaceToXml(rec.clamtmms));
			//rx.add(record, "re_freemms", StringUtil.replaceToXml(rec.re_freemms));
			//rx.add(record, "clamthsty", StringUtil.replaceToXml(rec.clamthsty));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
		}
		rx.add(recordSet, "totalcnt", ds.abccur.size());
		/****** ABCCUR END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(detaildata, "errcode", errcode);
		rx.add(detaildata, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<sl_i_abc>
	<detaildata>
		<ABCCUR>
			<record>
				<basiyymm/>
				<rdr_no/>
				<medicd/>
				<cntrno/>
				<bocd/>
				<valyymm/>
				<abcvalyymm/>
				<dscnamt/>
				<subsqty/>
				<resitypecd/>
				<rdr_extndt/>
				<clamtmms/>
				<re_freemms/>
				<clamthsty/>
				<status/>
			</record>
		</ABCCUR>
	</detaildata>
</sl_i_abc>
*/
%>

<% /* 작성시간 : Thu Feb 25 15:02:39 KST 2010 */ %>