<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bns_1100_m.jsp
* ��� : 
* �ۼ����� : 2009-03-11
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_1100_MDataSet ds = (SE_BNS_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");
	
	try {
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_BNS_1100_MMEDILISTRecord rec = (SE_BNS_1100_MMEDILISTRecord)ds.medilist.get(i);
			
			item  = rx.add( medi_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int biclas_cd = rx.add(comboSet, "biclas_cd", "");
		for(int i = 0; i < ds.biclascdlist.size(); i++) {
			SE_BNS_1100_MBICLASCDLISTRecord rec = (SE_BNS_1100_MBICLASCDLISTRecord)ds.biclascdlist.get(i);
			
			item  = rx.add( biclas_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int send_clsf = rx.add(comboSet, "send_clsf", "");
		for(int i = 0; i < ds.sendclsflist.size(); i++) {
			SE_BNS_1100_MSENDCLSFLISTRecord rec = (SE_BNS_1100_MSENDCLSFLISTRecord)ds.sendclsflist.get(i);
			
			item  = rx.add( send_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int stmt_issu_clsf = rx.add(comboSet, "stmt_issu_clsf", "");
		for(int i = 0; i < ds.stmtissulist.size(); i++) {
			SE_BNS_1100_MSTMTISSULISTRecord rec = (SE_BNS_1100_MSTMTISSULISTRecord)ds.stmtissulist.get(i);
			
			item  = rx.add( stmt_issu_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}		
		int ps_clsf = rx.add(comboSet, "ps_clsf", "");
		for(int i = 0; i < ds.psclsflist.size(); i++) {
			SE_BNS_1100_MPSCLSFLISTRecord rec = (SE_BNS_1100_MPSCLSFLISTRecord)ds.psclsflist.get(i);
			
			item  = rx.add( ps_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int stmt_item_clsf = rx.add(comboSet, "stmt_item_clsf", "");
		for(int i = 0; i < ds.stmtitemlist.size(); i++) {
			SE_BNS_1100_MSTMTITEMLISTRecord rec = (SE_BNS_1100_MSTMTITEMLISTRecord)ds.stmtitemlist.get(i);
			
			item  = rx.add( stmt_item_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
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
	<BICLASCDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</BICLASCDLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<SENDCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SENDCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<STMTISSULIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</STMTISSULIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<MEDILIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDILIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<medilist/>
		<biclascdlist/>
		<sendclsflist/>
		<stmtissulist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Mar 11 10:07:49 KST 2009 */ %>