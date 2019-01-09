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
* ���ϸ� : se_snd_3500_m.jsp
* ��� :  �Ǹ�-�߼۰���-��Ÿ�μ�ó��������
* �ۼ����� : 2009-03-24
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_3500_MDataSet ds = (SE_SND_3500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	int recordSet = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		/****** ROUTELIST BEGIN */
		int routelist = rx.add(comboSet, "routelist", "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_3500_MROUTELISTRecord rec = (SE_SND_3500_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(routelist, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		
		int routelist2 = rx.add(comboSet, "routelist2", "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_3500_MROUTELISTRecord rec = (SE_SND_3500_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(routelist2, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		
		}
		
		int placlist = rx.add(comboSet, "placlist", "");
		for(int i = 0; i < ds.placlist.size(); i++) {
			SE_SND_3500_MPLACLISTRecord rec = (SE_SND_3500_MPLACLISTRecord)ds.placlist.get(i);
			int record = rx.add(placlist, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		
		int placlist2 = rx.add(comboSet, "placlist2", "");
		for(int i = 0; i < ds.placlist.size(); i++) {
			SE_SND_3500_MPLACLISTRecord rec = (SE_SND_3500_MPLACLISTRecord)ds.placlist.get(i);
			int record = rx.add(placlist2, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		
		
		/****** MEDILIST BEGIN */
		int medilist = rx.add(comboSet, "medilist", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_3500_MMEDILISTRecord rec = (SE_SND_3500_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(medilist, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		
		int medilist2 = rx.add(comboSet, "medilist2", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_3500_MMEDILISTRecord rec = (SE_SND_3500_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(medilist2, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		
		/****** MEDILIST END */

	}
	catch (Exception e) {
	}
	finally {
		
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<ROUTELIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</ROUTELIST>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<PLACLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</PLACLIST>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<MEDILIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</MEDILIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Mar 20 14:07:08 KST 2009 */ %>