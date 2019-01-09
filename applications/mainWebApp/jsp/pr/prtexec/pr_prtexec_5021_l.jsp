<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pr_prtexec_5021_l.jsp
* 기능 : 
* 작성일자 : 2010-03-10
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_5021_LDataSet ds = (PR_PRTEXEC_5021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		if(ds != null){
			rx.add(dataSet, "clos_yn", ds.clos_yn);
			rx.add(dataSet, "pcnt_compare", ds.pcnt_compare);
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
	<resform>
		<clos_yn/>
		<pcnt_compare/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Mar 10 10:42:59 KST 2010 */ %>