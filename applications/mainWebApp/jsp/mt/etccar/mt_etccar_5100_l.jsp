<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_5100_LDataSet ds = (MT_ETCCAR_5100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_5100_LCURLISTRecord rec = (MT_ETCCAR_5100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "driv_dt", rec.driv_dt);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "oil_kind", rec.oil_kind);
			rx.add(record, "rungag", rec.rungag);
			rx.add(record, "carsno", rec.carsno);
			rx.add(record, "buyoil_qunt01", rec.buyoil_qunt01);
			rx.add(record, "buyoil_qunt02", rec.buyoil_qunt02);
			rx.add(record, "buyoil_qunt03", rec.buyoil_qunt03);
			rx.add(record, "buyoil_qunt04", rec.buyoil_qunt04);
			rx.add(record, "buyoil_qunt05", rec.buyoil_qunt05);
			rx.add(record, "buyoil_qunt06", rec.buyoil_qunt06);
			rx.add(record, "buyoil_qunt07", rec.buyoil_qunt07);
			rx.add(record, "buyoil_qunt08", rec.buyoil_qunt08);
			rx.add(record, "buyoil_qunt09", rec.buyoil_qunt09);
			rx.add(record, "buyoil_qunt10", rec.buyoil_qunt10);
			rx.add(record, "buyoil_qunt11", rec.buyoil_qunt11);
			rx.add(record, "buyoil_qunt12", rec.buyoil_qunt12);
			rx.add(record, "buyoil_qunt13", rec.buyoil_qunt13);
			rx.add(record, "buyoil_qunt14", rec.buyoil_qunt14);
			rx.add(record, "buyoil_qunt15", rec.buyoil_qunt15);
			rx.add(record, "buyoil_qunt16", rec.buyoil_qunt16);
			rx.add(record, "buyoil_qunt17", rec.buyoil_qunt17);
			rx.add(record, "buyoil_qunt18", rec.buyoil_qunt18);
			rx.add(record, "buyoil_qunt19", rec.buyoil_qunt19);
			rx.add(record, "buyoil_qunt20", rec.buyoil_qunt20);
			rx.add(record, "buyoil_qunt21", rec.buyoil_qunt21);
			rx.add(record, "buyoil_qunt22", rec.buyoil_qunt22);
			rx.add(record, "buyoil_qunt23", rec.buyoil_qunt23);
			rx.add(record, "buyoil_qunt24", rec.buyoil_qunt24);
			rx.add(record, "buyoil_qunt25", rec.buyoil_qunt25);
			rx.add(record, "buyoil_qunt26", rec.buyoil_qunt26);
			rx.add(record, "buyoil_qunt27", rec.buyoil_qunt27);
			rx.add(record, "buyoil_qunt28", rec.buyoil_qunt28);
			rx.add(record, "buyoil_qunt29", rec.buyoil_qunt29);
			rx.add(record, "buyoil_qunt30", rec.buyoil_qunt30);
			rx.add(record, "buyoil_qunt31", rec.buyoil_qunt31);
		  rx.add(record, "buyoil_qunt", rec.buyoil_qunt);
      rx.add(record, "fuel", rec.fuel);
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
			<driv_dt/>
			<car_no/>
			<cmpy_mang_nm/>
			<oil_kind/>
			<rungag/>
			<carsno/>
			<buyoil_qunt01/>
			<buyoil_qunt02/>
			<buyoil_qunt03/>
			<buyoil_qunt04/>
			<buyoil_qunt05/>
			<buyoil_qunt06/>
			<buyoil_qunt07/>
			<buyoil_qunt08/>
			<buyoil_qunt09/>
			<buyoil_qunt10/>
			<buyoil_qunt11/>
			<buyoil_qunt12/>
			<buyoil_qunt13/>
			<buyoil_qunt14/>
			<buyoil_qunt15/>
			<buyoil_qunt16/>
			<buyoil_qunt17/>
			<buyoil_qunt18/>
			<buyoil_qunt19/>
			<buyoil_qunt20/>
			<buyoil_qunt21/>
			<buyoil_qunt22/>
			<buyoil_qunt23/>
			<buyoil_qunt24/>
			<buyoil_qunt25/>
			<buyoil_qunt26/>
			<buyoil_qunt27/>
			<buyoil_qunt28/>
			<buyoil_qunt29/>
			<buyoil_qunt30/>
			<buyoil_qunt31/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 22 15:36:48 KST 2009 */ %>