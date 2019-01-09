<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1510_l.jsp
* ��� : �����򰡰������-����������
* �ۼ����� : 2009-04-03
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_TRG_1510_LDataSet ds = (SE_TRG_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");
	resform = rx.add(resData, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "evlu_dt", ds.evlu_dt);
			rx.add(resform, "clos_yn", ds.clos_yn);
		}
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1510_LCURLISTRecord rec = (SE_TRG_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "trgt", rec.trgt);
			rx.add(record, "rslt", rec.rslt);
			rx.add(record, "ufth_dedu", rec.ufth_dedu);
			rx.add(record, "re_free_dedu", rec.re_free_dedu);
			rx.add(record, "camp_dedu", rec.camp_dedu);
			rx.add(record, "exst_rdr_dedu", rec.exst_rdr_dedu);
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
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<evlu_grp_nm/>
			<trgt/>
			<rslt/>
			<ufth_dedu/>
			<re_free_dedu/>
			<camp_dedu/>
			<exst_rdr_dedu/>
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
		<evlu_dt/>
		<clos_yn/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Fri Apr 03 17:51:09 KST 2009 */ %>