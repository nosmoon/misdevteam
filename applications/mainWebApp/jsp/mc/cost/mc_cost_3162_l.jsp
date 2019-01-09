<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3162_LDataSet ds = (MC_COST_3162_LDataSet)request.getAttribute("ds");
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
			MC_COST_3162_LCURLISTRecord rec = (MC_COST_3162_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "gubun1", rec.gubun1);
			//rx.add(record, "sort_key1", rec.sort_key1);
			//rx.add(record, "gubun2", rec.gubun2);
			//rx.add(record, "gubun3", rec.gubun3);
			//rx.add(record, "ajsumamt_m01", rec.ajsumamt_m01);
			//rx.add(record, "aj11amt_m01", rec.aj11amt_m01);
			//rx.add(record, "aj13amt_m01", rec.aj13amt_m01);
			//rx.add(record, "aj19amt_m01", rec.aj19amt_m01);
			//rx.add(record, "ajsub1sum_m01", rec.ajsub1sum_m01);
			//rx.add(record, "aj21amt_m01", rec.aj21amt_m01);
			//rx.add(record, "aj22amt_m01", rec.aj22amt_m01);
			//rx.add(record, "aj23amt_m01", rec.aj23amt_m01);
			//rx.add(record, "aj24amt_m01", rec.aj24amt_m01);
			//rx.add(record, "aj27amt_m01", rec.aj27amt_m01);
			//rx.add(record, "aj31amt_m01", rec.aj31amt_m01);
			//rx.add(record, "aj41amt_m01", rec.aj41amt_m01);
			//rx.add(record, "aj42amt_m01", rec.aj42amt_m01);
			//rx.add(record, "aj49amt_m01", rec.aj49amt_m01);
			//rx.add(record, "ajsub2sum_m01", rec.ajsub2sum_m01);
			//rx.add(record, "aj61amt_m01", rec.aj61amt_m01);
			//rx.add(record, "aj71amt_m01", rec.aj71amt_m01);
			//rx.add(record, "aj81amt_m01", rec.aj81amt_m01);
			//rx.add(record, "ajexamt_m01", rec.ajexamt_m01);
			//rx.add(record, "aj11amt_m02", rec.aj11amt_m02);
			//rx.add(record, "aj13amt_m02", rec.aj13amt_m02);
			//rx.add(record, "aj19amt_m02", rec.aj19amt_m02);
			//rx.add(record, "ajsub1sum_m02", rec.ajsub1sum_m02);
			//rx.add(record, "aj21amt_m02", rec.aj21amt_m02);
			//rx.add(record, "aj22amt_m02", rec.aj22amt_m02);
			//rx.add(record, "aj23amt_m02", rec.aj23amt_m02);
			//rx.add(record, "aj24amt_m02", rec.aj24amt_m02);
			//rx.add(record, "aj27amt_m02", rec.aj27amt_m02);
			//rx.add(record, "aj31amt_m02", rec.aj31amt_m02);
			//rx.add(record, "aj41amt_m02", rec.aj41amt_m02);
			//rx.add(record, "aj42amt_m02", rec.aj42amt_m02);
			//rx.add(record, "aj49amt_m02", rec.aj49amt_m02);
			//rx.add(record, "ajsub2sum_m02", rec.ajsub2sum_m02);
			//rx.add(record, "aj61amt_m02", rec.aj61amt_m02);
			//rx.add(record, "aj71amt_m02", rec.aj71amt_m02);
			//rx.add(record, "aj81amt_m02", rec.aj81amt_m02);
			//rx.add(record, "ajexamt_m02", rec.ajexamt_m02);
			//rx.add(record, "aj11amt_m03", rec.aj11amt_m03);
			//rx.add(record, "aj13amt_m03", rec.aj13amt_m03);
			//rx.add(record, "aj19amt_m03", rec.aj19amt_m03);
			//rx.add(record, "ajsub1sum_m03", rec.ajsub1sum_m03);
			//rx.add(record, "aj21amt_m03", rec.aj21amt_m03);
			//rx.add(record, "aj22amt_m03", rec.aj22amt_m03);
			//rx.add(record, "aj23amt_m03", rec.aj23amt_m03);
			//rx.add(record, "aj24amt_m03", rec.aj24amt_m03);
			//rx.add(record, "aj27amt_m03", rec.aj27amt_m03);
			//rx.add(record, "aj31amt_m03", rec.aj31amt_m03);
			//rx.add(record, "aj41amt_m03", rec.aj41amt_m03);
			//rx.add(record, "aj42amt_m03", rec.aj42amt_m03);
			//rx.add(record, "aj49amt_m03", rec.aj49amt_m03);
			//rx.add(record, "ajsub2sum_m03", rec.ajsub2sum_m03);
			//rx.add(record, "aj61amt_m03", rec.aj61amt_m03);
			//rx.add(record, "aj71amt_m03", rec.aj71amt_m03);
			//rx.add(record, "aj81amt_m03", rec.aj81amt_m03);
			//rx.add(record, "ajexamt_m03", rec.ajexamt_m03);
			//rx.add(record, "aj11amt_m04", rec.aj11amt_m04);
			//rx.add(record, "aj13amt_m04", rec.aj13amt_m04);
			//rx.add(record, "aj19amt_m04", rec.aj19amt_m04);
			//rx.add(record, "ajsub1sum_m04", rec.ajsub1sum_m04);
			//rx.add(record, "aj21amt_m04", rec.aj21amt_m04);
			//rx.add(record, "aj22amt_m04", rec.aj22amt_m04);
			//rx.add(record, "aj23amt_m04", rec.aj23amt_m04);
			//rx.add(record, "aj24amt_m04", rec.aj24amt_m04);
			//rx.add(record, "aj27amt_m04", rec.aj27amt_m04);
			//rx.add(record, "aj31amt_m04", rec.aj31amt_m04);
			//rx.add(record, "aj41amt_m04", rec.aj41amt_m04);
			//rx.add(record, "aj42amt_m04", rec.aj42amt_m04);
			//rx.add(record, "aj49amt_m04", rec.aj49amt_m04);
			//rx.add(record, "ajsub2sum_m04", rec.ajsub2sum_m04);
			//rx.add(record, "aj61amt_m04", rec.aj61amt_m04);
			//rx.add(record, "aj71amt_m04", rec.aj71amt_m04);
			//rx.add(record, "aj81amt_m04", rec.aj81amt_m04);
			//rx.add(record, "ajexamt_m04", rec.ajexamt_m04);
			//rx.add(record, "aj11amt_m05", rec.aj11amt_m05);
			//rx.add(record, "aj13amt_m05", rec.aj13amt_m05);
			//rx.add(record, "aj19amt_m05", rec.aj19amt_m05);
			//rx.add(record, "ajsub1sum_m05", rec.ajsub1sum_m05);
			//rx.add(record, "aj21amt_m05", rec.aj21amt_m05);
			//rx.add(record, "aj22amt_m05", rec.aj22amt_m05);
			//rx.add(record, "aj23amt_m05", rec.aj23amt_m05);
			//rx.add(record, "aj24amt_m05", rec.aj24amt_m05);
			//rx.add(record, "aj27amt_m05", rec.aj27amt_m05);
			//rx.add(record, "aj31amt_m05", rec.aj31amt_m05);
			//rx.add(record, "aj41amt_m05", rec.aj41amt_m05);
			//rx.add(record, "aj42amt_m05", rec.aj42amt_m05);
			//rx.add(record, "aj49amt_m05", rec.aj49amt_m05);
			//rx.add(record, "ajsub2sum_m05", rec.ajsub2sum_m05);
			//rx.add(record, "aj61amt_m05", rec.aj61amt_m05);
			//rx.add(record, "aj71amt_m05", rec.aj71amt_m05);
			//rx.add(record, "aj81amt_m05", rec.aj81amt_m05);
			//rx.add(record, "ajexamt_m05", rec.ajexamt_m05);
			//rx.add(record, "aj11amt_m06", rec.aj11amt_m06);
			//rx.add(record, "aj13amt_m06", rec.aj13amt_m06);
			//rx.add(record, "aj19amt_m06", rec.aj19amt_m06);
			//rx.add(record, "ajsub1sum_m06", rec.ajsub1sum_m06);
			//rx.add(record, "aj21amt_m06", rec.aj21amt_m06);
			//rx.add(record, "aj22amt_m06", rec.aj22amt_m06);
			//rx.add(record, "aj23amt_m06", rec.aj23amt_m06);
			//rx.add(record, "aj24amt_m06", rec.aj24amt_m06);
			//rx.add(record, "aj27amt_m06", rec.aj27amt_m06);
			//rx.add(record, "aj31amt_m06", rec.aj31amt_m06);
			//rx.add(record, "aj41amt_m06", rec.aj41amt_m06);
			//rx.add(record, "aj42amt_m06", rec.aj42amt_m06);
			//rx.add(record, "aj49amt_m06", rec.aj49amt_m06);
			//rx.add(record, "ajsub2sum_m06", rec.ajsub2sum_m06);
			//rx.add(record, "aj61amt_m06", rec.aj61amt_m06);
			//rx.add(record, "aj71amt_m06", rec.aj71amt_m06);
			//rx.add(record, "aj81amt_m06", rec.aj81amt_m06);
			//rx.add(record, "ajexamt_m06", rec.ajexamt_m06);
			rx.add(record, "gubun1", StringUtil.replaceToXml(rec.gubun1));
			rx.add(record, "sort_key1", StringUtil.replaceToXml(rec.sort_key1));
			rx.add(record, "gubun2", StringUtil.replaceToXml(rec.gubun2));
			rx.add(record, "gubun3", StringUtil.replaceToXml(rec.gubun3));
			rx.add(record, "ajsumamt_m01", StringUtil.replaceToXml(rec.ajsumamt_m01));
			rx.add(record, "aj11amt_m01", StringUtil.replaceToXml(rec.aj11amt_m01));
			rx.add(record, "aj13amt_m01", StringUtil.replaceToXml(rec.aj13amt_m01));
			rx.add(record, "aj19amt_m01", StringUtil.replaceToXml(rec.aj19amt_m01));
			rx.add(record, "ajsub1sum_m01", StringUtil.replaceToXml(rec.ajsub1sum_m01));
			rx.add(record, "aj21amt_m01", StringUtil.replaceToXml(rec.aj21amt_m01));
			rx.add(record, "aj22amt_m01", StringUtil.replaceToXml(rec.aj22amt_m01));
			rx.add(record, "aj23amt_m01", StringUtil.replaceToXml(rec.aj23amt_m01));
			rx.add(record, "aj24amt_m01", StringUtil.replaceToXml(rec.aj24amt_m01));
			rx.add(record, "aj27amt_m01", StringUtil.replaceToXml(rec.aj27amt_m01));
			rx.add(record, "aj31amt_m01", StringUtil.replaceToXml(rec.aj31amt_m01));
			rx.add(record, "aj41amt_m01", StringUtil.replaceToXml(rec.aj41amt_m01));
			rx.add(record, "aj42amt_m01", StringUtil.replaceToXml(rec.aj42amt_m01));
			rx.add(record, "aj49amt_m01", StringUtil.replaceToXml(rec.aj49amt_m01));
			rx.add(record, "ajsub2sum_m01", StringUtil.replaceToXml(rec.ajsub2sum_m01));
			rx.add(record, "aj61amt_m01", StringUtil.replaceToXml(rec.aj61amt_m01));
			rx.add(record, "aj71amt_m01", StringUtil.replaceToXml(rec.aj71amt_m01));
			rx.add(record, "aj81amt_m01", StringUtil.replaceToXml(rec.aj81amt_m01));
			rx.add(record, "ajexamt_m01", StringUtil.replaceToXml(rec.ajexamt_m01));
			rx.add(record, "aj11amt_m02", StringUtil.replaceToXml(rec.aj11amt_m02));
			rx.add(record, "aj13amt_m02", StringUtil.replaceToXml(rec.aj13amt_m02));
			rx.add(record, "aj19amt_m02", StringUtil.replaceToXml(rec.aj19amt_m02));
			rx.add(record, "ajsub1sum_m02", StringUtil.replaceToXml(rec.ajsub1sum_m02));
			rx.add(record, "aj21amt_m02", StringUtil.replaceToXml(rec.aj21amt_m02));
			rx.add(record, "aj22amt_m02", StringUtil.replaceToXml(rec.aj22amt_m02));
			rx.add(record, "aj23amt_m02", StringUtil.replaceToXml(rec.aj23amt_m02));
			rx.add(record, "aj24amt_m02", StringUtil.replaceToXml(rec.aj24amt_m02));
			rx.add(record, "aj27amt_m02", StringUtil.replaceToXml(rec.aj27amt_m02));
			rx.add(record, "aj31amt_m02", StringUtil.replaceToXml(rec.aj31amt_m02));
			rx.add(record, "aj41amt_m02", StringUtil.replaceToXml(rec.aj41amt_m02));
			rx.add(record, "aj42amt_m02", StringUtil.replaceToXml(rec.aj42amt_m02));
			rx.add(record, "aj49amt_m02", StringUtil.replaceToXml(rec.aj49amt_m02));
			rx.add(record, "ajsub2sum_m02", StringUtil.replaceToXml(rec.ajsub2sum_m02));
			rx.add(record, "aj61amt_m02", StringUtil.replaceToXml(rec.aj61amt_m02));
			rx.add(record, "aj71amt_m02", StringUtil.replaceToXml(rec.aj71amt_m02));
			rx.add(record, "aj81amt_m02", StringUtil.replaceToXml(rec.aj81amt_m02));
			rx.add(record, "ajexamt_m02", StringUtil.replaceToXml(rec.ajexamt_m02));
			rx.add(record, "aj11amt_m03", StringUtil.replaceToXml(rec.aj11amt_m03));
			rx.add(record, "aj13amt_m03", StringUtil.replaceToXml(rec.aj13amt_m03));
			rx.add(record, "aj19amt_m03", StringUtil.replaceToXml(rec.aj19amt_m03));
			rx.add(record, "ajsub1sum_m03", StringUtil.replaceToXml(rec.ajsub1sum_m03));
			rx.add(record, "aj21amt_m03", StringUtil.replaceToXml(rec.aj21amt_m03));
			rx.add(record, "aj22amt_m03", StringUtil.replaceToXml(rec.aj22amt_m03));
			rx.add(record, "aj23amt_m03", StringUtil.replaceToXml(rec.aj23amt_m03));
			rx.add(record, "aj24amt_m03", StringUtil.replaceToXml(rec.aj24amt_m03));
			rx.add(record, "aj27amt_m03", StringUtil.replaceToXml(rec.aj27amt_m03));
			rx.add(record, "aj31amt_m03", StringUtil.replaceToXml(rec.aj31amt_m03));
			rx.add(record, "aj41amt_m03", StringUtil.replaceToXml(rec.aj41amt_m03));
			rx.add(record, "aj42amt_m03", StringUtil.replaceToXml(rec.aj42amt_m03));
			rx.add(record, "aj49amt_m03", StringUtil.replaceToXml(rec.aj49amt_m03));
			rx.add(record, "ajsub2sum_m03", StringUtil.replaceToXml(rec.ajsub2sum_m03));
			rx.add(record, "aj61amt_m03", StringUtil.replaceToXml(rec.aj61amt_m03));
			rx.add(record, "aj71amt_m03", StringUtil.replaceToXml(rec.aj71amt_m03));
			rx.add(record, "aj81amt_m03", StringUtil.replaceToXml(rec.aj81amt_m03));
			rx.add(record, "ajexamt_m03", StringUtil.replaceToXml(rec.ajexamt_m03));
			rx.add(record, "aj11amt_m04", StringUtil.replaceToXml(rec.aj11amt_m04));
			rx.add(record, "aj13amt_m04", StringUtil.replaceToXml(rec.aj13amt_m04));
			rx.add(record, "aj19amt_m04", StringUtil.replaceToXml(rec.aj19amt_m04));
			rx.add(record, "ajsub1sum_m04", StringUtil.replaceToXml(rec.ajsub1sum_m04));
			rx.add(record, "aj21amt_m04", StringUtil.replaceToXml(rec.aj21amt_m04));
			rx.add(record, "aj22amt_m04", StringUtil.replaceToXml(rec.aj22amt_m04));
			rx.add(record, "aj23amt_m04", StringUtil.replaceToXml(rec.aj23amt_m04));
			rx.add(record, "aj24amt_m04", StringUtil.replaceToXml(rec.aj24amt_m04));
			rx.add(record, "aj27amt_m04", StringUtil.replaceToXml(rec.aj27amt_m04));
			rx.add(record, "aj31amt_m04", StringUtil.replaceToXml(rec.aj31amt_m04));
			rx.add(record, "aj41amt_m04", StringUtil.replaceToXml(rec.aj41amt_m04));
			rx.add(record, "aj42amt_m04", StringUtil.replaceToXml(rec.aj42amt_m04));
			rx.add(record, "aj49amt_m04", StringUtil.replaceToXml(rec.aj49amt_m04));
			rx.add(record, "ajsub2sum_m04", StringUtil.replaceToXml(rec.ajsub2sum_m04));
			rx.add(record, "aj61amt_m04", StringUtil.replaceToXml(rec.aj61amt_m04));
			rx.add(record, "aj71amt_m04", StringUtil.replaceToXml(rec.aj71amt_m04));
			rx.add(record, "aj81amt_m04", StringUtil.replaceToXml(rec.aj81amt_m04));
			rx.add(record, "ajexamt_m04", StringUtil.replaceToXml(rec.ajexamt_m04));
			rx.add(record, "aj11amt_m05", StringUtil.replaceToXml(rec.aj11amt_m05));
			rx.add(record, "aj13amt_m05", StringUtil.replaceToXml(rec.aj13amt_m05));
			rx.add(record, "aj19amt_m05", StringUtil.replaceToXml(rec.aj19amt_m05));
			rx.add(record, "ajsub1sum_m05", StringUtil.replaceToXml(rec.ajsub1sum_m05));
			rx.add(record, "aj21amt_m05", StringUtil.replaceToXml(rec.aj21amt_m05));
			rx.add(record, "aj22amt_m05", StringUtil.replaceToXml(rec.aj22amt_m05));
			rx.add(record, "aj23amt_m05", StringUtil.replaceToXml(rec.aj23amt_m05));
			rx.add(record, "aj24amt_m05", StringUtil.replaceToXml(rec.aj24amt_m05));
			rx.add(record, "aj27amt_m05", StringUtil.replaceToXml(rec.aj27amt_m05));
			rx.add(record, "aj31amt_m05", StringUtil.replaceToXml(rec.aj31amt_m05));
			rx.add(record, "aj41amt_m05", StringUtil.replaceToXml(rec.aj41amt_m05));
			rx.add(record, "aj42amt_m05", StringUtil.replaceToXml(rec.aj42amt_m05));
			rx.add(record, "aj49amt_m05", StringUtil.replaceToXml(rec.aj49amt_m05));
			rx.add(record, "ajsub2sum_m05", StringUtil.replaceToXml(rec.ajsub2sum_m05));
			rx.add(record, "aj61amt_m05", StringUtil.replaceToXml(rec.aj61amt_m05));
			rx.add(record, "aj71amt_m05", StringUtil.replaceToXml(rec.aj71amt_m05));
			rx.add(record, "aj81amt_m05", StringUtil.replaceToXml(rec.aj81amt_m05));
			rx.add(record, "ajexamt_m05", StringUtil.replaceToXml(rec.ajexamt_m05));
			rx.add(record, "aj11amt_m06", StringUtil.replaceToXml(rec.aj11amt_m06));
			rx.add(record, "aj13amt_m06", StringUtil.replaceToXml(rec.aj13amt_m06));
			rx.add(record, "aj19amt_m06", StringUtil.replaceToXml(rec.aj19amt_m06));
			rx.add(record, "ajsub1sum_m06", StringUtil.replaceToXml(rec.ajsub1sum_m06));
			rx.add(record, "aj21amt_m06", StringUtil.replaceToXml(rec.aj21amt_m06));
			rx.add(record, "aj22amt_m06", StringUtil.replaceToXml(rec.aj22amt_m06));
			rx.add(record, "aj23amt_m06", StringUtil.replaceToXml(rec.aj23amt_m06));
			rx.add(record, "aj24amt_m06", StringUtil.replaceToXml(rec.aj24amt_m06));
			rx.add(record, "aj27amt_m06", StringUtil.replaceToXml(rec.aj27amt_m06));
			rx.add(record, "aj31amt_m06", StringUtil.replaceToXml(rec.aj31amt_m06));
			rx.add(record, "aj41amt_m06", StringUtil.replaceToXml(rec.aj41amt_m06));
			rx.add(record, "aj42amt_m06", StringUtil.replaceToXml(rec.aj42amt_m06));
			rx.add(record, "aj49amt_m06", StringUtil.replaceToXml(rec.aj49amt_m06));
			rx.add(record, "ajsub2sum_m06", StringUtil.replaceToXml(rec.ajsub2sum_m06));
			rx.add(record, "aj61amt_m06", StringUtil.replaceToXml(rec.aj61amt_m06));
			rx.add(record, "aj71amt_m06", StringUtil.replaceToXml(rec.aj71amt_m06));
			rx.add(record, "aj81amt_m06", StringUtil.replaceToXml(rec.aj81amt_m06));
			rx.add(record, "ajexamt_m06", StringUtil.replaceToXml(rec.ajexamt_m06));
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
<mc_cost_3162_l>
	<dataSet>
		<CURLIST>
			<record>
				<gubun1/>
				<sort_key1/>
				<gubun2/>
				<gubun3/>
				<ajsumamt_m01/>
				<aj11amt_m01/>
				<aj13amt_m01/>
				<aj19amt_m01/>
				<ajsub1sum_m01/>
				<aj21amt_m01/>
				<aj22amt_m01/>
				<aj23amt_m01/>
				<aj24amt_m01/>
				<aj27amt_m01/>
				<aj31amt_m01/>
				<aj41amt_m01/>
				<aj42amt_m01/>
				<aj49amt_m01/>
				<ajsub2sum_m01/>
				<aj61amt_m01/>
				<aj71amt_m01/>
				<aj81amt_m01/>
				<ajexamt_m01/>
				<aj11amt_m02/>
				<aj13amt_m02/>
				<aj19amt_m02/>
				<ajsub1sum_m02/>
				<aj21amt_m02/>
				<aj22amt_m02/>
				<aj23amt_m02/>
				<aj24amt_m02/>
				<aj27amt_m02/>
				<aj31amt_m02/>
				<aj41amt_m02/>
				<aj42amt_m02/>
				<aj49amt_m02/>
				<ajsub2sum_m02/>
				<aj61amt_m02/>
				<aj71amt_m02/>
				<aj81amt_m02/>
				<ajexamt_m02/>
				<aj11amt_m03/>
				<aj13amt_m03/>
				<aj19amt_m03/>
				<ajsub1sum_m03/>
				<aj21amt_m03/>
				<aj22amt_m03/>
				<aj23amt_m03/>
				<aj24amt_m03/>
				<aj27amt_m03/>
				<aj31amt_m03/>
				<aj41amt_m03/>
				<aj42amt_m03/>
				<aj49amt_m03/>
				<ajsub2sum_m03/>
				<aj61amt_m03/>
				<aj71amt_m03/>
				<aj81amt_m03/>
				<ajexamt_m03/>
				<aj11amt_m04/>
				<aj13amt_m04/>
				<aj19amt_m04/>
				<ajsub1sum_m04/>
				<aj21amt_m04/>
				<aj22amt_m04/>
				<aj23amt_m04/>
				<aj24amt_m04/>
				<aj27amt_m04/>
				<aj31amt_m04/>
				<aj41amt_m04/>
				<aj42amt_m04/>
				<aj49amt_m04/>
				<ajsub2sum_m04/>
				<aj61amt_m04/>
				<aj71amt_m04/>
				<aj81amt_m04/>
				<ajexamt_m04/>
				<aj11amt_m05/>
				<aj13amt_m05/>
				<aj19amt_m05/>
				<ajsub1sum_m05/>
				<aj21amt_m05/>
				<aj22amt_m05/>
				<aj23amt_m05/>
				<aj24amt_m05/>
				<aj27amt_m05/>
				<aj31amt_m05/>
				<aj41amt_m05/>
				<aj42amt_m05/>
				<aj49amt_m05/>
				<ajsub2sum_m05/>
				<aj61amt_m05/>
				<aj71amt_m05/>
				<aj81amt_m05/>
				<ajexamt_m05/>
				<aj11amt_m06/>
				<aj13amt_m06/>
				<aj19amt_m06/>
				<ajsub1sum_m06/>
				<aj21amt_m06/>
				<aj22amt_m06/>
				<aj23amt_m06/>
				<aj24amt_m06/>
				<aj27amt_m06/>
				<aj31amt_m06/>
				<aj41amt_m06/>
				<aj42amt_m06/>
				<aj49amt_m06/>
				<ajsub2sum_m06/>
				<aj61amt_m06/>
				<aj71amt_m06/>
				<aj81amt_m06/>
				<ajexamt_m06/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3162_l>
*/
%>

<% /* 작성시간 : Tue May 26 10:48:43 KST 2009 */ %>