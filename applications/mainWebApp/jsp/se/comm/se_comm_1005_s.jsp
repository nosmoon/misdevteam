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
* ���ϸ� : se_comm_1105_s.jsp
* ��� : ����� �ڵ�,�� 1����ȸ
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
	SE_COMM_1005_SDataSet ds = (SE_COMM_1005_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tempRes", "");

	try {
		if(ds != null){
			rx.add(resData, "rsltcnt", ds.rsltcnt);
			rx.add(resData, "cd", ds.cd);
			rx.add(resData, "cdnm", ds.cdnm);
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
		<bo_cd/>
		<bo_seq/>
		<bo_nm/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Feb 23 13:19:18 KST 2009 */ %>