<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.ds.*
	,	chosun.ciis.se.sal.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_2400_m.jsp
* ��� : ��꼭�ܰǵ��-�ʱ�ȭ��
* �ۼ����� : 2009-07-21
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
	SE_SAL_2500_MDataSet ds = (SE_SAL_2500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");
	rx.add(comboSet, "semuro_id", ds.semuro_id);

	try {
		int bank_cd = rx.add(comboSet, "bank_cd", "");
		item  = rx.add(bank_cd , "item" , "");
		rx.add(item, "value", "");
		//rx.add(item, "label", "����");
		rx.add(item, "label", "");
		rx.add(item, "acct_mang_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_SAL_2500_MCOMMCDCUR1Record rec = (SE_SAL_2500_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( bank_cd , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
			rx.add(item, "acct_mang_cd", rec.cd_abrv_nm);
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


<% /* �ۼ��ð� : Tue Mar 17 19:51:08 KST 2009 */ %>