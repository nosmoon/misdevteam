<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_comm_1305_s.jsp
* ��� : 
* �ۼ����� : 2009-02-23
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_COMM_1305_SDataSet ds = (SE_COMM_1305_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");
	resform = rx.add(resData, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "rsltcnt", ds.rsltcnt);
			rx.add(resform, "bo_head_prn", ds.bo_head_prn);
			rx.addCData(resform, "bo_head_nm", ds.bo_head_nm);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<rsltcnt/>
		<bo_head_prn/>
		<bo_head_nm/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Feb 23 13:56:07 KST 2009 */ %>
