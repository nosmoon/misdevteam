<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	HD_DDEMP_6004_MDataSet ds = (HD_DDEMP_6004_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_DDEMP_6004_MCURLIST4Record rec = (HD_DDEMP_6004_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd", rec.mang_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd", StringUtil.replaceToXml(rec.mang_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_DDEMP_6004_MCURLIST3Record rec = (HD_DDEMP_6004_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_DDEMP_6004_MCURLIST2Record rec = (HD_DDEMP_6004_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_DDEMP_6004_MCURLIST1Record rec = (HD_DDEMP_6004_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");
		
		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_DDEMP_6004_MCURLIST7Record rec = (HD_DDEMP_6004_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */
		
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_DDEMP_6004_MCURLIST6Record rec = (HD_DDEMP_6004_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			rx.add(record, "mang_cd", rec.mang_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd", StringUtil.replaceToXml(rec.mang_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_DDEMP_6004_MCURLIST5Record rec = (HD_DDEMP_6004_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
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
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST7>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST7>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST6>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd/>
			</record>
		</CURLIST6>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_ddemp_6004_m>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_ddemp_6004_m>
*/
%>

<% /* 작성시간 : Fri Aug 10 10:29:31 KST 2018 */ %>