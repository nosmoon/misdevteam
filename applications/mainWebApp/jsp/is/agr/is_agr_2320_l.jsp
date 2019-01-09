<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_2320_LDataSet ds = (IS_AGR_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2320_LCURLISTRecord rec = (IS_AGR_2320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "t_no", rec.t_no);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "s_purc_amt", rec.s_purc_amt);
			rx.add(record, "prft_amt", rec.prft_amt);
			//rx.add(record, "prft_rate", rec.prft_rate);
			rx.add(record, "prft_rate", DigitUtil.cutUnderPoint(rec.prft_rate,2));
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<is_agr_2320_l>
	<dataSet>
		<CURLIST>
			
		</CURLIST>
	</dataSet>
</is_agr_2320_l>
*/
%>

<% /* 작성시간 : Tue May 29 11:33:59 KST 2012 */ %>