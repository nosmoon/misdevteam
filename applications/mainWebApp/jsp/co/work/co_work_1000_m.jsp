<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.work.ds.*
	,	chosun.ciis.co.work.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_work_1000_m.jsp
* 기능 : 마감업무현황 - 초기화면
* 작성일자 : 2009-06-04
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_WORK_1000_MDataSet ds = (CO_WORK_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	int item = 0;
	resform = rx.add(root, "resform", "");

	try {
		int job_clsf = rx.add(resform, "job_clsf_tmp", "");
		for(int i = 0; i < ds.jobclsflist.size(); i++) {
			CO_WORK_1000_MJOBCLSFLISTRecord rec = (CO_WORK_1000_MJOBCLSFLISTRecord)ds.jobclsflist.get(i);
			item  = rx.add(job_clsf , "item" , "");
			rx.add(item, "value", rec.job_clsf);
			rx.add(item, "label", rec.job_clsf_nm);
		}
		int cd_clsf = rx.add(resform, "cd_clsf_tmp", "");
		for(int i = 0; i < ds.cdclsflist.size(); i++) {
			CO_WORK_1000_MCDCLSFLISTRecord rec = (CO_WORK_1000_MCDCLSFLISTRecord)ds.cdclsflist.get(i);
			item  = rx.add(cd_clsf , "item" , "");
			rx.add(item, "pcode", rec.job_clsf);
			rx.add(item, "value", rec.cd_clsf);
			rx.add(item, "label", rec.cd_clsf_nm);
		}
		int cd = rx.add(resform, "cd_tmp", "");
		for(int i = 0; i < ds.cdlist.size(); i++) {
			CO_WORK_1000_MCDLISTRecord rec = (CO_WORK_1000_MCDLISTRecord)ds.cdlist.get(i);
			item  = rx.add(cd , "item" , "");
			rx.add(item, "pcode1", rec.job_clsf);
			rx.add(item, "pcode2", rec.cd_clsf);
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd_nm);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CDLIST>
		<record>
			<job_clsf/>
			<cd_clsf/>
			<cd/>
			<cd_nm/>
		</record>
	</CDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<JOBCLSFLIST>
		<record>
			<job_clsf/>
			<job_clsf_nm/>
		</record>
	</JOBCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CDCLSFLIST>
		<record>
			<job_clsf/>
			<cd_clsf/>
			<cd_clsf_nm/>
		</record>
	</CDCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<jobclsflist/>
		<cdclsflist/>
		<cdlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Jun 04 17:51:12 KST 2009 */ %>