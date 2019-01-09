<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_BAS_1120_LDataSet ds = (SE_BAS_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	//dataSet = rx.add(root, "dataSet", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");
		recordSet = rx.add(recordSet, "sub", "");
		
		String chg_dt_tm = "";
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1120_LCURLISTRecord rec = (SE_BAS_1120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"  , rec.cmpy_cd  );
			rx.add(record, "yymm"     , rec.yymm     );
			rx.add(record, "area_cd"  , rec.area_cd  );
			rx.add(record, "area_nm"  , rec.area_nm  );
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "flnm"     , rec.flnm     );
			
			if ( rec.chg_dt_tm != null ) {
				chg_dt_tm = String.valueOf(rec.chg_dt_tm);
			}
			rx.add(record, "chg_dt_tm", chg_dt_tm);
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
	<gridData2>
		<sub>
			<record>
				<dt/>
				<area_nm/>
				<chrg_pers/>
				<flnm/>
				<chg_dt_tm/>
			</record>
		</sub>
	</gridData2>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 14 16:34:22 KST 2009 */ %>