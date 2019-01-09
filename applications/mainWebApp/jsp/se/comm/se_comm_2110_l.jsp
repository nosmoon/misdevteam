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
* ���ϸ� : se_comm_2110_l.jsp
* ��� :  ���۴ܰ� ��ȸ
* �ۼ����� : 2009-02-18
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
	SE_COMM_2110_LDataSet ds 	= (SE_COMM_2110_LDataSet)request.getAttribute("ds");
	int root 					= RwXml.rootNodeID;
	int formData 				= 0;
	
	formData					= rx.add(root	,	"gridData"	, "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2110_LCURLISTRecord rec = (SE_COMM_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd		);
			rx.add(record, "aply_dt"			, rec.aply_dt			);
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm);
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas	);
			rx.add(record, "tran_uprc_clas_nm"	, rec.tran_uprc_clas_nm	);
			rx.add(record, "tran_cost"			, rec.tran_cost			);
			rx.add(record, "route_clsf"			, rec.route_clsf		);
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm		);
			rx.add(record, "route_cd"			, rec.route_cd			);
			rx.add(record, "route_nm"			, rec.route_nm			);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd		);
			rx.add(record, "prt_plac_nm"		, rec.prt_plac_nm		);
			rx.add(record, "load_wgt"			, rec.load_wgt			);
			rx.add(record, "route_lgth"			, rec.route_lgth		);
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
			<tran_uprc_cd/>
			<aply_dt/>
			<tran_uprc_route_nm/>
			<tran_uprc_clas/>
			<tran_uprc_clas_nm/>
			<tran_cost/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<prt_plac_cd/>
			<prt_plac_nm/>
			<load_wgt/>
			<route_lgth/>
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

<% /* �ۼ��ð� : Wed Feb 18 10:26:50 KST 2009 */ %>