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
* ���ϸ� : se_comm_2010_l.jsp
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱��� - �ʱ�ȭ��
* �ۼ����� : 2009.02.02
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
	SE_SND_1000_MDataSet ds = (SE_SND_1000_MDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	
	//formData 		= rx.add(root		, "initData"	, "");
	formData 		= rx.add(root	, "comboSet"	, "");

	try {
		recordSet	= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1000_MCURLISTRecord rec = (SE_SND_1000_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "routelist"	, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_1000_MROUTELISTRecord rec = (SE_SND_1000_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "medilist"	, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_1000_MMEDILISTRecord rec = (SE_SND_1000_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "ecntlist"	, "");
		for(int i = 0; i < ds.ecntlist.size(); i++) {
			SE_SND_1000_MECNTLISTRecord rec = (SE_SND_1000_MECNTLISTRecord)ds.ecntlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "ledtlist"	, "");
		for(int i = 0; i < ds.ledtlist.size(); i++) {
			SE_SND_1000_MLEDTLISTRecord rec = (SE_SND_1000_MLEDTLISTRecord)ds.ledtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
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
<resData>
	<ROUTELIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</ROUTELIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
		<curlist/>
		<routelist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Feb 02 12:10:07 KST 2009 */ %>