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
* ���ϸ� : se_bns_1610_l.jsp
* ��� :  �Ǹ�-���˹����� - ���˹�����ó��
* �ۼ����� : 2009-04-29
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
	SE_BNS_1610_LDataSet ds = (SE_BNS_1610_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1610_LCURLISTRecord rec = (SE_BNS_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "dept_cd"			, rec.dept_cd			);
			rx.add(record, "dept_nm"			, rec.dept_nm			);
			rx.add(record, "part_cd"			, rec.part_cd			);
			rx.add(record, "part_nm"			, rec.part_nm			);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "area_nm"			, rec.area_nm			);
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_seq"				, rec.bo_seq			);
			rx.add(record, "bo_nm"				, rec.bo_nm				);
			rx.addCData(record, "bo_head_nm"			, rec.bo_head_nm		);
			rx.add(record, "ewh_seq"			, rec.ewh_seq			);
			rx.add(record, "uprc"				, rec.uprc				);
			rx.add(record, "divn_uprc"			, rec.divn_uprc			);
			rx.add(record, "qunt"				, rec.qunt				);
			rx.add(record, "compen_divn_amt"	, rec.compen_divn_amt	);
			rx.add(record, "nocompen_divn_amt"	, rec.nocompen_divn_amt	);
			rx.add(record, "divn_dt"			, rec.divn_dt			);
			rx.add(record, "bns_item_cd"		, rec.bns_item_cd		);
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
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<bo_head_nm/>
			<ewh_seq/>
			<uprc/>
			<divn_uprc/>
			<compen_divn_amt/>
			<nocompen_divn_amt/>
			<divn_dt/>
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

<% /* �ۼ��ð� : Wed Apr 29 18:09:33 KST 2009 */ %>
