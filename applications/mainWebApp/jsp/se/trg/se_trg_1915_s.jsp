<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1915_s.jsp
* ��� : �ν�Ȯ���� - ������ ��,��Ʈ,������ ��������
* �ۼ����� : 2009-07-01
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
	SE_TRG_1915_SDataSet ds = (SE_TRG_1915_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "recv", "");

	try {
		if(ds != null){
			rx.add(resData, "team_nm", ds.team_nm);
			rx.add(resData, "part_nm", ds.part_nm);
			rx.add(resData, "area_nm", ds.area_nm);
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
		<team_nm/>
		<part_nm/>
		<area_nm/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Jul 01 20:44:51 KST 2009 */ %>