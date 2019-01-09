<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2330_LDataSet ds = (SP_SAL_2330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2330_LCURLIST1Record rec = (SP_SAL_2330_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "dduc_posb_amt", rec.dduc_posb_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
		}
		/****** CURLIST1 END */
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
<sp_sal_2330_l>
	<dataSet>
		<CURLIST1>
			<record>
				<area_nm/>
				<bo_cd/>
				<bo_nm/>
				<req_amt/>
				<dduc_posb_amt/>
				<misu_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</sp_sal_2330_l>
*/
%>

<% /* �ۼ��ð� : Wed Jul 18 11:55:58 KST 2012 */ %>