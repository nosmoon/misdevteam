<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_2000_MDataSet ds = (HD_EDU_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_emp_no_010", ds.getXx_emp_no_010());
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_pr_job_clsf_20", ds.getXx_pr_job_clsf_20());
		rx.add(dataSet, "xx_annc_clsf", ds.getXx_annc_clsf());
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "combo4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_EDU_2000_MCURLIST4Record rec = (HD_EDU_2000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "combo3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_EDU_2000_MCURLIST3Record rec = (HD_EDU_2000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "combo2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EDU_2000_MCURLIST2Record rec = (HD_EDU_2000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "combo1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EDU_2000_MCURLIST1Record rec = (HD_EDU_2000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "combo5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_EDU_2000_MCURLIST5Record rec = (HD_EDU_2000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
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
<hd_edu_2000_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_edu_2000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_2000_m>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_edu_2000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_2000_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_edu_2000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_2000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_edu_2000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_2000_m>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_edu_2000_m>
*/
%>

<% /* 작성시간 : Wed Apr 06 14:32:18 KST 2011 */ %>