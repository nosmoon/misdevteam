<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_comm_2020_s.jsp
* ��� : �Ǹ� - �߼�ó ��ȸ - �߼�ó ��ȸ
* �ۼ����� : 2009.02.13
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
	SE_COMM_2020_SDataSet ds = (SE_COMM_2020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int recordSet = 0;
	recordSet = rx.add(root, "code", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2020_SCURLISTRecord rec = (SE_COMM_2020_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"				, rec.cmpy_cd				);
			rx.add(record, "bo_cd"					, rec.bo_cd					);
			rx.add(record, "send_plac_seq"			, rec.send_plac_seq			);
			rx.add(record, "send_plac_nm"			, rec.send_plac_nm			);
			rx.add(record, "area_cd"				, rec.area_cd				);
			rx.add(record, "area_nm"				, rec.area_nm				);
			rx.add(record, "ariv_nomn"				, rec.ariv_nomn				);
			rx.add(record, "adms_dstc_cd"			, rec.adms_dstc_cd			);
			rx.add(record, "adms_dstc_nm"			, rec.adms_dstc_nm			);
			rx.add(record, "bo_cd_send_plac_seq"	, rec.bo_cd_send_plac_seq	);
			rx.add(record, "bo_seq"					, rec.bo_seq				);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<bo_cd/>
			<send_plac_seq/>
			<send_plac_nm/>
			<area_cd/>
			<area_nm/>
			<ariv_nomn/>
			<adms_dstc_cd/>
			<adms_dstc_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Jan 23 11:20:56 KST 2009 */ %>