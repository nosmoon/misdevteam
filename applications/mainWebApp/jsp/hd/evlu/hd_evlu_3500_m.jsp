<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3500_MDataSet ds = (HD_EVLU_3500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_030", ds.getXx_cd_030());
		rx.add(dataSet, "xx_cd_040", ds.getXx_cd_040());
		rx.add(dataSet, "xx_evlu_stat_cd_010", ds.getXx_evlu_stat_cd_010());
		rx.add(dataSet, "xx_evlu_stat_cd_020", ds.getXx_evlu_stat_cd_020());
		
		/****** XX_CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "XX_CURLIST4", "");

		for(int i = 0; i < ds.xx_curlist4.size(); i++) {
			HD_EVLU_3500_MXX_CURLIST4Record rec = (HD_EVLU_3500_MXX_CURLIST4Record)ds.xx_curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_curlist4.size());
		/****** XX_CURLIST4 END */
		
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_EVLU_3500_MCURLIST3Record rec = (HD_EVLU_3500_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");
		int item = rx.add(recordSet, "item", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_3500_MCURLIST2Record rec = (HD_EVLU_3500_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EVLU_3500_MCURLIST1Record rec = (HD_EVLU_3500_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "evlu_cd", rec.evlu_cd);
			rx.add(record, "evlu_cdnm", rec.evlu_cdnm);
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
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
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
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<evlu_cd/>
			<evlu_cdnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 02 17:40:07 KST 2009 */ %>