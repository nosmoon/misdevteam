<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_8009_LDataSet ds = (MT_PAPINOUT_8009_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_8009_LCURLIST1Record rec = (MT_PAPINOUT_8009_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "msprtdat", rec.msprtdat);
			rx.add(record, "msfactcd", rec.msfactcd);
			rx.add(record, "msfactnm", rec.msfactnm);
			rx.add(record, "msmccd", rec.msmccd);
			rx.add(record, "msmcnm", rec.msmcnm);
			rx.add(record, "cccodeval", rec.cccodeval);
			rx.add(record, "cccdnm", rec.cccdnm);
      rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "wgpapgyugk", rec.wgpapgyugk);
			rx.add(record, "wgprtmnsu", rec.wgprtmnsu);
			rx.add(record, "wgblkmnsu", rec.wgblkmnsu);
			rx.add(record, "wgcolmnsu", rec.wgcolmnsu);
			rx.add(record, "msprtbusu", rec.msprtbusu);
			rx.add(record, "msprtwt", rec.msprtwt);
			rx.add(record, "mspajijwwt", rec.mspajijwwt);
			rx.add(record, "msgitapaji", rec.msgitapaji);
			rx.add(record, "pajibiyul", rec.pajibiyul);
			rx.add(record, "msavg", rec.msavg);
			rx.add(record, "msprtmm", (rec.msprtdat.length() < 1 ) ? rec.msprtdat : rec.msprtdat.substring(0,4) + "-" + rec.msprtdat.substring(4,6) );
			rx.add(record, "msprtyy", (rec.msprtdat.length() < 1 ) ? rec.msprtdat : rec.msprtdat.substring(0,4) );
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<gubun/>
			<msprtdat/>
			<msfactcd/>
			<msfactnm/>
			<msmccd/>
			<msmcnm/>
			<cccodeval/>
			<cccdnm/>
			<wgpapgyugk/>
			<wgprtmnsu/>
			<wgblkmnsu/>
			<wgcolmnsu/>
			<msprtbusu/>
			<msprtwt/>
			<mspajijwwt/>
			<msgitapaji/>
			<pajibiyul/>
			<msavg/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 19:34:28 KST 2009 */ %>