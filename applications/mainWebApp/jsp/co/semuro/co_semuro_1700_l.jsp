<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1700_LDataSet ds = (CO_SEMURO_1700_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int  rowCnt = 0;
    int  flagGubun = 0;
    String flagString = "";
    String flagStd="";
    String flagSuplyAmt = "";
    String flagTaxAmt = "";
    String flagItemRemk = "";
    String rtnString = "";


	dataSet = rx.add(root, "tempData", "");
	recordSet = rx.add(dataSet, "sendData", "");

	try {
		/****** CURLIST2 BEGIN */

		flagGubun = 13;

		for(int i = 0; i < ds.curlist2.size(); i++) {
			CO_SEMURO_1700_LCURLIST2Record rec = (CO_SEMURO_1700_LCURLIST2Record)ds.curlist2.get(i);
			flagString = flagString + flagGubun + ":" + rec.item_nm + "+";
			flagGubun = flagGubun + 1;
			flagString = flagString + flagGubun + ":" + rec.uprc + "+";
			flagGubun = flagGubun + 1;
			flagString = flagString + flagGubun + ":" + rec.qunt + "+";
			flagGubun = flagGubun + 1;
			flagString = flagString + flagGubun + ":" + rec.item_dt + "+";

			flagStd = flagStd + rec.std + ";";
			flagSuplyAmt = flagSuplyAmt + rec.item_suply_amt + ";";
			flagTaxAmt = flagTaxAmt + rec.item_tax_amt + ";";
			flagItemRemk = flagItemRemk + rec.item_remk + ";";
		}

		rowCnt = 4 - ds.curlist2.size();
		if (rowCnt > 0 )
		{
			for( int i = 0 ; i < rowCnt * 4 ; i++){
				flagGubun = flagGubun + 1;
				flagString = flagString + flagGubun + ":+";

			}
			for ( int i = 0; i < rowCnt ; i++){
				flagStd = flagStd + ";";
				flagSuplyAmt= flagSuplyAmt + ";";
				flagTaxAmt = flagTaxAmt + ";";
				flagItemRemk = flagItemRemk + ";";
			}
		}

//		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */


			CO_SEMURO_1700_LCURLISTRecord rec = (CO_SEMURO_1700_LCURLISTRecord)ds.curlist.get(0);


			rx.add(recordSet, "tmsg_type", rec.tmsg_type);
			rx.add(recordSet, "tax_stmt_clsf", rec.tax_stmt_clsf);
			rx.add(recordSet, "rmsg_pers_clsf", rec.rmsg_pers_clsf);

			rtnString = rec.flag_1 + "+" + rec.flag_2 + "+" + rec.flag_3 + "+" + rec.flag_4 + "+" + rec.flag_5 + "+" + rec.flag_6 + "+" + rec.flag_7 + "+" + rec.flag_8 + "+" + rec.flag_9 + "+" + rec.flag_10 + "+" + rec.flag_11 + "+" + rec.flag_12;
			rtnString = rtnString + "+"+  flagString;
			rtnString = rtnString +  rec.flag_29 + "+"  + rec.head_30 + flagStd + flagSuplyAmt + flagTaxAmt + flagItemRemk + rec.tail_30;
			rx.add(recordSet, "rtnString", rtnString);

			System.out.println(rtnString);

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
	<CURLIST2>
		<record>
			<item_nm/>
			<uprc/>
			<qunt/>
			<item_dt/>
			<std/>
			<item_suply_amt/>
			<item_tax_amt/>
			<item_remk/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<tmsg_type/>
			<tax_stmt_clsf/>
			<rmsg_pers_clsf/>
			<flag_1/>
			<flag_2/>
			<flag_3/>
			<flag_4/>
			<flag_5/>
			<flag_6/>
			<flag_7/>
			<flag_8/>
			<flag_9/>
			<flag_10/>
			<flag_11/>
			<flag_12/>
			<flag_29/>
			<head_30/>
			<tail_30/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Mar 15 19:03:07 KST 2009 */ %>