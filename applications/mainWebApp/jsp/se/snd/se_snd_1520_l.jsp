<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_1520_l.jsp
* ��� : �Ǹ� - �߼۰��� - ���庰�μ� - ���庰 �μ� ��ȸ
* �ۼ����� : 2009.02.03
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_1520_LDataSet ds = (SE_SND_1520_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;

	formData				= rx.add(root	, "rowInfo"		, "");
	try {
		rx.add(formData		, "rownum"		, ds.rownum	);
	
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
	<CURLIST>
		<record>
			<tran_uprc_cd/>
			<aply_dt/>
			<tran_uprc_clas_nm/>
			<route_clsf_nm/>
			<tran_uprc_route_nm/>
			<prt_plac_nm/>
			<load_wgt/>
			<route_lgth/>
			<send_plac_nm/>
			<qty/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue Feb 24 13:19:52 KST 2009 */ %>