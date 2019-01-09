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
* ���ϸ� : se_trg_1630_l.jsp
* ��� : �����򰡰����ȸ - Ȯ����
* �ۼ����� : 2009-04-06
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
	SE_TRG_1630_LDataSet ds = (SE_TRG_1630_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab3list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1630_LCURLISTRecord rec = (SE_TRG_1630_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "trgt", rec.trgt);
			rx.add(record, "tot_rslt", rec.tot_rslt);
			rx.add(record, "ufth_dedu", rec.ufth_dedu);
			rx.add(record, "camp_dedu", rec.camp_dedu);
			rx.add(record, "re_free_dedu", rec.re_free_dedu);
			rx.add(record, "exst_rdr_dedu", rec.exst_rdr_dedu);
			rx.add(record, "rslt", rec.rslt);
			rx.add(record, "scor", rec.scor);
			rx.add(record, "std_scor", rec.std_scor);
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
			<chrg_flnm/>
			<bo_nm/>
			<bo_head_nm/>
			<evlu_grp_nm/>
			<trgt/>
			<tot_rslt/>
			<ufth_dedu/>
			<camp_dedu/>
			<re_free_dedu/>
			<exst_rdr_dedu/>
			<rslt/>
			<scor/>
			<std_scor/>
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

<% /* �ۼ��ð� : Mon Apr 06 15:30:54 KST 2009 */ %>