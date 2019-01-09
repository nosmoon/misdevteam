<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6121_LDataSet ds = (FC_ACCT_6121_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6121_LCURLISTRecord rec = (FC_ACCT_6121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "make_dt", rec.make_dt);
			//rx.add(record, "prof_type_cd", rec.prof_type_cd);
			//rx.add(record, "sgamt6042", rec.sgamt6042);
			//rx.add(record, "sgvat6042", rec.sgvat6042);
			//rx.add(record, "sgamt8035", rec.sgamt8035);
			//rx.add(record, "sgvat8035", rec.sgvat8035);
			//rx.add(record, "sgamt6054", rec.sgamt6054);
			//rx.add(record, "sgvat6054", rec.sgvat6054);
			//rx.add(record, "sgtotamt", rec.sgtotamt);
			//rx.add(record, "sgtotvat", rec.sgtotvat);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "hjpamt6042", rec.hjpamt6042);
			//rx.add(record, "hjpvat6042", rec.hjpvat6042);
			//rx.add(record, "hjpamt8035", rec.hjpamt8035);
			//rx.add(record, "hjpvat8035", rec.hjpvat8035);
			//rx.add(record, "hjpamt6054", rec.hjpamt6054);
			//rx.add(record, "hjpvat6054", rec.hjpvat6054);
			//rx.add(record, "hjptotamt", rec.hjptotamt);
			//rx.add(record, "hjptotvat", rec.hjptotvat);
			//rx.add(record, "diftotamt", rec.diftotamt);
			//rx.add(record, "diftotvat", rec.diftotvat);
			rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			rx.add(record, "sgamt6042", StringUtil.replaceToXml(rec.sgamt6042));
			rx.add(record, "sgvat6042", StringUtil.replaceToXml(rec.sgvat6042));
			rx.add(record, "sgamt8035", StringUtil.replaceToXml(rec.sgamt8035));
			rx.add(record, "sgvat8035", StringUtil.replaceToXml(rec.sgvat8035));
			rx.add(record, "sgamt6054", StringUtil.replaceToXml(rec.sgamt6054));
			rx.add(record, "sgvat6054", StringUtil.replaceToXml(rec.sgvat6054));
			rx.add(record, "sgtotamt", StringUtil.replaceToXml(rec.sgtotamt));
			rx.add(record, "sgtotvat", StringUtil.replaceToXml(rec.sgtotvat));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "hjpamt6042", StringUtil.replaceToXml(rec.hjpamt6042));
			rx.add(record, "hjpvat6042", StringUtil.replaceToXml(rec.hjpvat6042));
			rx.add(record, "hjpamt8035", StringUtil.replaceToXml(rec.hjpamt8035));
			rx.add(record, "hjpvat8035", StringUtil.replaceToXml(rec.hjpvat8035));
			rx.add(record, "hjpamt6054", StringUtil.replaceToXml(rec.hjpamt6054));
			rx.add(record, "hjpvat6054", StringUtil.replaceToXml(rec.hjpvat6054));
			rx.add(record, "hjptotamt", StringUtil.replaceToXml(rec.hjptotamt));
			rx.add(record, "hjptotvat", StringUtil.replaceToXml(rec.hjptotvat));
			rx.add(record, "diftotamt", StringUtil.replaceToXml(rec.diftotamt));
			rx.add(record, "diftotvat", StringUtil.replaceToXml(rec.diftotvat));
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
<fc_acct_6121_l>
	<dataSet>
		<CURLIST>
			<record>
				<make_dt/>
				<prof_type_cd/>
				<sgamt6042/>
				<sgvat6042/>
				<sgamt8035/>
				<sgvat8035/>
				<sgamt6054/>
				<sgvat6054/>
				<sgtotamt/>
				<sgtotvat/>
				<mang_clsf_cd/>
				<hjpamt6042/>
				<hjpvat6042/>
				<hjpamt8035/>
				<hjpvat8035/>
				<hjpamt6054/>
				<hjpvat6054/>
				<hjptotamt/>
				<hjptotvat/>
				<diftotamt/>
				<diftotvat/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6121_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 15:11:41 KST 2009 */ %>