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
	MT_ETCCAR_9401_LDataSet ds = (MT_ETCCAR_9401_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_9401_LCURLISTRecord rec = (MT_ETCCAR_9401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "cd01", rec.cd01);
			rx.add(record, "cd02", rec.cd02);
			rx.add(record, "cd03", rec.cd03);
			rx.add(record, "cd04", rec.cd04);
			rx.add(record, "cd05", rec.cd05);
			rx.add(record, "cd06", rec.cd06);
			rx.add(record, "cd07", rec.cd07);
			rx.add(record, "cd08", rec.cd08);
			rx.add(record, "cd09", rec.cd09);
			rx.add(record, "cd10", rec.cd10);
			rx.add(record, "cd11", rec.cd11);
			rx.add(record, "cd12", rec.cd12);
			rx.add(record, "cd13", rec.cd13);
			rx.add(record, "cd14", rec.cd14);
			rx.add(record, "cd15", rec.cd15);
			rx.add(record, "cd16", rec.cd16);
			rx.add(record, "cd17", rec.cd17);
			rx.add(record, "cd18", rec.cd18);
			rx.add(record, "cd19", rec.cd19);
			rx.add(record, "cd20", rec.cd20);
			rx.add(record, "cd21", rec.cd21);
			rx.add(record, "cd22", rec.cd22);
			rx.add(record, "cd23", rec.cd23);
			rx.add(record, "cd24", rec.cd24);
			rx.add(record, "cd25", rec.cd25);
			rx.add(record, "cd26", rec.cd26);
			rx.add(record, "cd27", rec.cd27);
			rx.add(record, "cd28", rec.cd28);
			rx.add(record, "cd29", rec.cd29);
			rx.add(record, "cd30", rec.cd30);
			rx.add(record, "cd31", rec.cd31);
			rx.add(record, "cd00", rec.cd00);
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "cd01", StringUtil.replaceToXml(rec.cd01));
			//rx.add(record, "cd02", StringUtil.replaceToXml(rec.cd02));
			//rx.add(record, "cd03", StringUtil.replaceToXml(rec.cd03));
			//rx.add(record, "cd04", StringUtil.replaceToXml(rec.cd04));
			//rx.add(record, "cd05", StringUtil.replaceToXml(rec.cd05));
			//rx.add(record, "cd06", StringUtil.replaceToXml(rec.cd06));
			//rx.add(record, "cd07", StringUtil.replaceToXml(rec.cd07));
			//rx.add(record, "cd08", StringUtil.replaceToXml(rec.cd08));
			//rx.add(record, "cd09", StringUtil.replaceToXml(rec.cd09));
			//rx.add(record, "cd10", StringUtil.replaceToXml(rec.cd10));
			//rx.add(record, "cd11", StringUtil.replaceToXml(rec.cd11));
			//rx.add(record, "cd12", StringUtil.replaceToXml(rec.cd12));
			//rx.add(record, "cd13", StringUtil.replaceToXml(rec.cd13));
			//rx.add(record, "cd14", StringUtil.replaceToXml(rec.cd14));
			//rx.add(record, "cd15", StringUtil.replaceToXml(rec.cd15));
			//rx.add(record, "cd16", StringUtil.replaceToXml(rec.cd16));
			//rx.add(record, "cd17", StringUtil.replaceToXml(rec.cd17));
			//rx.add(record, "cd18", StringUtil.replaceToXml(rec.cd18));
			//rx.add(record, "cd19", StringUtil.replaceToXml(rec.cd19));
			//rx.add(record, "cd20", StringUtil.replaceToXml(rec.cd20));
			//rx.add(record, "cd21", StringUtil.replaceToXml(rec.cd21));
			//rx.add(record, "cd22", StringUtil.replaceToXml(rec.cd22));
			//rx.add(record, "cd23", StringUtil.replaceToXml(rec.cd23));
			//rx.add(record, "cd24", StringUtil.replaceToXml(rec.cd24));
			//rx.add(record, "cd25", StringUtil.replaceToXml(rec.cd25));
			//rx.add(record, "cd26", StringUtil.replaceToXml(rec.cd26));
			//rx.add(record, "cd27", StringUtil.replaceToXml(rec.cd27));
			//rx.add(record, "cd28", StringUtil.replaceToXml(rec.cd28));
			//rx.add(record, "cd29", StringUtil.replaceToXml(rec.cd29));
			//rx.add(record, "cd30", StringUtil.replaceToXml(rec.cd30));
			//rx.add(record, "cd31", StringUtil.replaceToXml(rec.cd31));
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
<mt_etccar_9401_l>
	<dataSet>
		<CURLIST>
			<record>
				<car_no/>
				<cd01/>
				<cd02/>
				<cd03/>
				<cd04/>
				<cd05/>
				<cd06/>
				<cd07/>
				<cd08/>
				<cd09/>
				<cd10/>
				<cd11/>
				<cd12/>
				<cd13/>
				<cd14/>
				<cd15/>
				<cd16/>
				<cd17/>
				<cd18/>
				<cd19/>
				<cd20/>
				<cd21/>
				<cd22/>
				<cd23/>
				<cd24/>
				<cd25/>
				<cd26/>
				<cd27/>
				<cd28/>
				<cd29/>
				<cd30/>
				<cd31/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9401_l>
*/
%>

<% /* 작성시간 : Wed Sep 12 19:17:22 KST 2012 */ %>