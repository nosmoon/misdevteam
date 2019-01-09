<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_3100_MDataSet ds = (MT_SUBMATRCLA_3100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "frex_clsf", "");
        for(int i = 0; i < ds.curlist7.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST7Record rec = (MT_SUBMATRCLA_3100_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "part_clas1", "");
        for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST4Record rec = (MT_SUBMATRCLA_3100_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "dept_cd", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST3Record rec = (MT_SUBMATRCLA_3100_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.dept_cd);
			rx.add(record, "label", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");
 
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST2Record rec = (MT_SUBMATRCLA_3100_MCURLIST2Record)ds.curlist2.get(i);
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
			MT_SUBMATRCLA_3100_MCURLIST1Record rec = (MT_SUBMATRCLA_3100_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "part_clas2", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST5Record rec = (MT_SUBMATRCLA_3100_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
		
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "fact_cd", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATRCLA_3100_MCURLIST6Record rec = (MT_SUBMATRCLA_3100_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
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
<mt_submatrcla_3100_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST4>
	</dataSet>
</mt_submatrcla_3100_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_3100_m>
	<dataSet>
		<CURLIST3>
			<record>
				<dept_cd/>
				<dept_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_submatrcla_3100_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_3100_m>
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
</mt_submatrcla_3100_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_3100_m>
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
</mt_submatrcla_3100_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_3100_m>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST5>
	</dataSet>
</mt_submatrcla_3100_m>
*/
%>

<% /* 작성시간 : Wed Mar 04 19:58:39 KST 2015 */ %>