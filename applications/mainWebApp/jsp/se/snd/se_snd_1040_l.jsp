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
* ���ϸ� : se_snd_1040_l.jsp
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱��� - ��ǥ�뼱 ��ȸ
* �ۼ����� : 2009.07.04
* �ۼ��� : �̱�Ź
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_1040_LDataSet ds = (SE_SND_1040_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	//formData 	= rx.add(root		, "code"		, "");
	recordSet 	= rx.add(root	, "code"	, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1040_LCURLISTRecord rec = (SE_SND_1040_LCURLISTRecord)ds.curlist.get(i);
		
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rptv_route_clsf"			, rec.rptv_route_clsf		);			
			rx.add(record, "rptv_route_cd"				, rec.rptv_route_cd			);			
			rx.add(record, "rptv_route_nm"				, rec.rptv_route_nm			);
		
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<% /* �ۼ��ð� : Mon Feb 02 14:56:04 KST 2009 */ %>