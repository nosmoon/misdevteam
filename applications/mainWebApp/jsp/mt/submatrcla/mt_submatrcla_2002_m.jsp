<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrcla.rec.*
	,  chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_2002_MDataSet ds = (MT_SUBMATRCLA_2002_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** ov_uprc_yn BEGIN */
		recordSet = rx.add(dataSet, "uprc_yn", ds.uprc_yn);
		/****** ov_uprc_yn END */
		
		/****** ov_child_cmpy BEGIN */
		recordSet = rx.add(dataSet, "child_cmpy", ds.child_cmpy);
		/****** ov_child_cmpy END */
		
		/****** ov_via_dept_cd BEGIN */
		recordSet = rx.add(dataSet, "via_dept_cd", ds.via_dept_cd);
		/****** ov_via_dept_cd END */
		
		/****** ov_via_dept_cd BEGIN */
		recordSet = rx.add(dataSet, "via_dept_nm", ds.via_dept_nm);
		/****** ov_via_dept_cd END */
		
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "res_yn", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_SUBMATRCLA_2002_MCURLIST5Record rec = (MT_SUBMATRCLA_2002_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
		
		/****** CURLIST4 BEGIN  권한*/
		recordSet = rx.add(dataSet, "dept_cd", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATRCLA_2002_MCURLIST4Record rec = (MT_SUBMATRCLA_2002_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.dept_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN 신청회사구분*/
		recordSet = rx.add(dataSet, "item", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATRCLA_2002_MCURLIST3Record rec = (MT_SUBMATRCLA_2002_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRCLA_2002_MCURLIST2Record rec = (MT_SUBMATRCLA_2002_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "temp", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATRCLA_2002_MCURLIST1Record rec = (MT_SUBMATRCLA_2002_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
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
	<CURLIST4>
		<record>
			<dept_cd/>
			<dept_nm/>
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
			<cdnm_cd/>
			<cdabrvnm_cd/>
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
			<cdnm_cd/>
			<cdabrvnm_cd/>
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 25 19:43:03 KST 2009 */ %>