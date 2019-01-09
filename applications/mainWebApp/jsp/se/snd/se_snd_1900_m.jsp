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
* ���ϸ� : se_snd_1500_m.jsp
* ��� : �Ǹ� - �߼۰��� - �߼۸����� - �ʱ�ȭ��
* �ۼ����� : 2009.02.04
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
	SE_SND_1900_MDataSet ds = (SE_SND_1900_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int recordSet 			= 0;

	//formData 				= rx.add(root		, "initData"	, "");
	formData 				= rx.add(root		, "comboSet"		, "");
	try {
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1900_MCURLISTRecord rec = (SE_SND_1900_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "etclist"		, "");
		for(int i = 0; i < ds.etclist.size(); i++) {
			SE_SND_1900_METCLISTRecord rec = (SE_SND_1900_METCLISTRecord)ds.etclist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "stetlist"		, "");
		for(int i = 0; i < ds.stetlist.size(); i++) {
			SE_SND_1900_MSTETLISTRecord rec = (SE_SND_1900_MSTETLISTRecord)ds.stetlist.get(i);
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
		<rownum/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Feb 04 17:46:06 KST 2009 */ %>