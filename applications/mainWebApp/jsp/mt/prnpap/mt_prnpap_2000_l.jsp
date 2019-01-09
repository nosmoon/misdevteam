<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_2000_LDataSet ds = (MT_PRNPAP_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
        
		/****** CURLIST4 BEGIN   인쇄용지구분 */
		recordSet = rx.add(dataSet, "prt_paper_clsf", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PRNPAP_2000_LCURLIST4Record rec = (MT_PRNPAP_2000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "label", rec.cd+" " +rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN 용지규격 */
		recordSet = rx.add(dataSet, "paper_std", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PRNPAP_2000_LCURLIST3Record rec = (MT_PRNPAP_2000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd+" "+rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN 양출여부 */
		recordSet = rx.add(dataSet, "qunt_out_yn", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_2000_LCURLIST2Record rec = (MT_PRNPAP_2000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd+" "+rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

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
	<CURLIST4>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 15:04:59 KST 2009 */ %>