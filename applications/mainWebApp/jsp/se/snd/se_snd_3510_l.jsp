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
* ���ϸ� : se_snd_3500_l.jsp
* ��� :  �Ǹ�-�߼۰���-��Ÿ�μ�ó���� ����
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
	SE_SND_3510_LDataSet ds = (SE_SND_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_3510_LCURLISTRecord rec = (SE_SND_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			System.out.println("route_clsf>>>>>>>>>>>>>"+rec.route_clsf);
			rx.add(record, "route_clsf", rec.route_clsf);               
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "asin_prt_plac_cd", rec.asin_prt_plac_cd);
			rx.add(record, "real_prt_plac_cd", rec.real_prt_plac_cd);
			rx.add(record, "remk", rec.remk);
		}

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<route_clsf/>
			<medi_cd/>
			<asin_prt_plac_cd/>
			<real_prt_plac_cd/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Mar 20 14:09:40 KST 2009 */ %>