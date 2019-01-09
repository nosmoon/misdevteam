<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_3018_LDataSet ds = (MT_PAPINOUT_3018_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "gridData4", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "gridData4", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_3018_LCURLISTRecord rec = (MT_PAPINOUT_3018_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pj_kind", rec.pj_kind);
			rx.add(record, "pj_kind_nm", rec.pj_kind_nm);
			rx.add(record, "cnt00", rec.cnt00);
			rx.add(record, "wgt00", rec.wgt00);
			rx.add(record, "cnt01", rec.cnt01);
			rx.add(record, "wgt01", rec.wgt01);
			rx.add(record, "cnt02", rec.cnt02);
			rx.add(record, "wgt02", rec.wgt02);
			rx.add(record, "cnt03", rec.cnt03);
			rx.add(record, "wgt03", rec.wgt03);
			rx.add(record, "cnt04", rec.cnt04);
			rx.add(record, "wgt04", rec.wgt04);
			rx.add(record, "cnt05", rec.cnt05);
			rx.add(record, "wgt05", rec.wgt05);
			//rx.add(record, "pj_kind", StringUtil.replaceToXml(rec.pj_kind));
			//rx.add(record, "pj_kind_nm", StringUtil.replaceToXml(rec.pj_kind_nm));
			//rx.add(record, "cnt00", StringUtil.replaceToXml(rec.cnt00));
			//rx.add(record, "wgt00", StringUtil.replaceToXml(rec.wgt00));
			//rx.add(record, "cnt01", StringUtil.replaceToXml(rec.cnt01));
			//rx.add(record, "wgt01", StringUtil.replaceToXml(rec.wgt01));
			//rx.add(record, "cnt02", StringUtil.replaceToXml(rec.cnt02));
			//rx.add(record, "wgt02", StringUtil.replaceToXml(rec.wgt02));
			//rx.add(record, "cnt03", StringUtil.replaceToXml(rec.cnt03));
			//rx.add(record, "wgt03", StringUtil.replaceToXml(rec.wgt03));
			//rx.add(record, "cnt04", StringUtil.replaceToXml(rec.cnt04));
			//rx.add(record, "wgt04", StringUtil.replaceToXml(rec.wgt04));
			//rx.add(record, "cnt05", StringUtil.replaceToXml(rec.cnt05));
			//rx.add(record, "wgt05", StringUtil.replaceToXml(rec.wgt05));
		}
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
<mt_papinout_3018_l>
	<dataSet>
		<CURLIST>
			<record>
				<pj_kind/>
				<pj_kind_nm/>
				<cnt00/>
				<wgt00/>
				<cnt01/>
				<wgt01/>
				<cnt02/>
				<wgt02/>
				<cnt03/>
				<wgt03/>
				<cnt04/>
				<wgt04/>
				<cnt05/>
				<wgt05/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papinout_3018_l>
*/
%>

<% /* 작성시간 : Fri Feb 14 17:26:18 KST 2014 */ %>