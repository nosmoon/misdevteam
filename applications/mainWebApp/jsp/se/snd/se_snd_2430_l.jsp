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
* ���ϸ� : se_snd_2430_s.jsp
* ��� : 
* �ۼ����� : 2009-02-19
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
	SE_SND_2430_LDataSet ds = (SE_SND_2430_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;

	formData				= rx.add(root	, "medilist"	, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2430_LCURLISTRecord rec = (SE_SND_2430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "medi_cd"		, rec.medi_cd		);
			rx.add(record, "medi_nm"		, rec.medi_nm		);
			rx.add(record, "sect_cd"		, rec.sect_cd		);
			rx.add(record, "sect_nm"		, rec.sect_nm		);
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd		);
			rx.add(record, "chg_reg_dt"		, rec.chg_reg_dt	);
			rx.add(record, "chg_no"			, rec.chg_no		);
			rx.add(record, "tran_uprc_cd"	, rec.tran_uprc_cd	);
			rx.add(record, "send_yn"		, rec.send_yn		);
			rx.add(record, "qty"			, rec.qty			);
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
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<cmpy_cd/>
			<chg_reg_dt/>
			<chg_no/>
			<tran_uprc_cd/>
			<send_yn/>
			<qty/>
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

<% /* �ۼ��ð� : Thu Feb 19 20:05:17 KST 2009 */ %>