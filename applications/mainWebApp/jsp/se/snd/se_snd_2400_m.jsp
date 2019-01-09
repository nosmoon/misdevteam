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
* ���ϸ� : se_snd_2400_m.jsp
* ��� : �߼۰��� - ���۴ܰ�����
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
	SE_SND_2400_MDataSet ds = (SE_SND_2400_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	
	String today	= year + month + day;
	rx.add(root	, "now_dt"	, today		);
	
	

	String medi_cd  = ds.getMedi_cd();
	String medi_nm  = ds.getMedi_nm();
	String sect_cd  = ds.getSect_cd();
	String sect_nm  = ds.getSect_nm();
	String col_cnt  = ds.getCol_cnt();
	
	rx.add(root	, "medi_cd"	, medi_cd		);
	rx.add(root	, "medi_nm"	, medi_nm		);
	rx.add(root	, "sect_cd"	, sect_cd		);
	rx.add(root	, "sect_nm"	, sect_nm		);
	rx.add(root	, "col_cnt"	, col_cnt		);
	
	
	formData				= rx.add(root		, "comboSet"		, "");
	try {
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2400_MCURLISTRecord rec = (SE_SND_2400_MCURLISTRecord)ds.curlist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "routelist"			, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_2400_MROUTELISTRecord rec = (SE_SND_2400_MROUTELISTRecord)ds.routelist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "qtylist"				, "");
		for(int i = 0; i < ds.qtylist.size(); i++) {
			SE_SND_2400_MQTYLISTRecord rec = (SE_SND_2400_MQTYLISTRecord)ds.qtylist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "uprclist"			, "");
		for(int i = 0; i < ds.uprclist.size(); i++) {
			SE_SND_2400_MUPRCLISTRecord rec = (SE_SND_2400_MUPRCLISTRecord)ds.uprclist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "decidlist"			, "");
		for(int i = 0; i < ds.decidlist.size(); i++) {
			SE_SND_2400_MDECIDLISTRecord rec = (SE_SND_2400_MDECIDLISTRecord)ds.decidlist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
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
	<UPRCLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</UPRCLIST>
</resData>
*/
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
	<SECTLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</SECTLIST>
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
		</record>
	</MEDILIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<QTYLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</QTYLIST>
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
		<qtylist/>
		<uprclist/>
		<medilist/>
		<sectlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Thu Feb 19 13:47:00 KST 2009 */ %>