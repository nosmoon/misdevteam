<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_2400_m.jsp
* ��� : �����������μ��縶��
* �ۼ����� : 2009-03-17
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
	SE_QTY_2400_MDataSet ds = (SE_QTY_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int send_clos_grp_clsf = rx.add(comboSet, "send_clos_grp_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2400_MCOMMCDCUR1Record rec = (SE_QTY_2400_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( send_clos_grp_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
	<COMMCDCUR1>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue Mar 17 19:51:08 KST 2009 */ %>