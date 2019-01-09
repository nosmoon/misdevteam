<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mt_commatr_5030_l.jsp
* ��� : 
* �ۼ����� : 2010-04-12
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
	MT_COMMATR_5030_LDataSet ds = (MT_COMMATR_5030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "basi_sect", "");
	//resform = rx.add(resData, "resform", "");

	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_5030_LCURLISTRecord rec = (MT_COMMATR_5030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);			
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "sect_yn", rec.sect_yn);
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
	<CURLIST>
		<record>
			<medi_cd/>
			<issu_dt/>
			<fac_clsf/>
			<fac_nm/>
			<issu_pcnt_0100/>
			<issu_pcnt_0200/>
			<issu_pcnt_9999/>
			<issu_pcnt/>
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
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Apr 12 11:27:07 KST 2010 */ %>