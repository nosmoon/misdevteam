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
* ���ϸ� : se_qty_2105_l.jsp
* ��� : 
* �ۼ����� : 2009-03-04
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
	SE_QTY_2105_LDataSet ds = (SE_QTY_2105_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "medicombo", "");

	try {
	
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2105_LCOMMCDCUR1Record rec = (SE_QTY_2105_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add(item, "value", rec.medi_cd);
			rx.add(item, "label", rec.medi_nm);
		}
		
		int tmpsect_cd = rx.add(comboSet, "tmpsect_cd", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_QTY_2105_LCOMMCDCUR2Record rec = (SE_QTY_2105_LCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( tmpsect_cd , "item" , "");
			rx.add(item, "pcode", rec.medi_cd);
			rx.add(item, "value", rec.sect_nm_cd);
			rx.add(item, "label", rec.sect_nm);
			
		}
		
		int sect_cd = rx.add(comboSet, "sect_cd", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_QTY_2105_LCOMMCDCUR2Record rec = (SE_QTY_2105_LCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( sect_cd , "item" , "");
			rx.add(item, "value", rec.sect_nm_cd);
			rx.add(item, "label", rec.sect_nm);
			
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
	<COMMCDCUR2>
		<record>
			<medi_cd/>
			<sect_nm_cd/>
			<sect_nm/>
		</record>
	</COMMCDCUR2>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<COMMCDCUR1>
		<record>
			<medi_cd/>
			<medi_nm/>
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
		<commcdcur2/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Mar 04 16:13:37 KST 2009 */ %>