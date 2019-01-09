<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_1001_LDataSet ds = (HD_DDEMP_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		rx.add(dataSet, "xx_proc_clsf_010", ds.getXx_proc_clsf_010());
		rx.add(dataSet, "xx_proc_clsf_020", ds.getXx_proc_clsf_020());
		rx.add(dataSet, "xx_rcpt_clsf", ds.getXx_rcpt_clsf());
		rx.add(dataSet, "xx_rcpt_clsf_nm", ds.getXx_rcpt_clsf_nm());
		rx.add(dataSet, "xx_job_clsf_00", ds.getXx_job_clsf_00());
		rx.add(dataSet, "xx_cd_clsf_030", ds.getXx_cd_clsf_030());
		rx.add(dataSet, "xx_cd_clsf_040", ds.getXx_cd_clsf_040());
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_job_clsf_03", ds.getXx_job_clsf_03());
		rx.add(dataSet, "xx_cd_clsf_050", ds.getXx_cd_clsf_050());
		
		/****** CURLIST BEGIN */
		
		depth1 = rx.add(dataSet, "octgr_cd", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DDEMP_1001_LCURLISTRecord rec = (HD_DDEMP_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("OCTGR_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "lve_job_resn_cd", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DDEMP_1001_LCURLISTRecord rec = (HD_DDEMP_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("LVE_JOB_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
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
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jun 11 21:01:53 KST 2009 */ %>