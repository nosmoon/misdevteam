<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.ds.*
	,	chosun.ciis.se.snd.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_2910_l.jsp
* ��� : �߼۰��� - Ư�Ǻμ��߼۰���
* �ۼ����� : 2009-03-13
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
	SE_SND_2910_LDataSet ds = (SE_SND_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2910_LCURLISTRecord rec = (SE_SND_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "reg_seq", rec.reg_seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "prt_rfl_qty", rec.prt_rfl_qty);
			rx.add(record, "cnfm_stat_clsf_nm", rec.cnfm_stat_clsf_nm);
			rx.add(record, "arvl_clsf_nm", rec.arvl_clsf_nm);
			rx.add(record, "clos_tms", rec.clos_tms);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "route_clsf", rec.route_clsf);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "send_plac_seq", rec.bo_cd+rec.send_plac_seq);
			rx.add(record, "send_plac_nm", rec.send_plac_nm);
			rx.addCData(record, "aplc_pers_nm", rec.aplc_pers_nm);
			rx.add(record, "call_no", rec.call_no);
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
			<reg_dt/>
			<reg_seq/>
			<issu_dt/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<qty/>
			<prt_rfl_qty/>
			<cnfm_stat_clsf_nm/>
			<arvl_clsf_nm/>
			<clos_tms/>
			<area_nm/>
			<route_clsf/>
			<bo_cd/>
			<send_plac_seq/>
			<send_plac_nm/>
			<aplc_pers_nm/>
			<call_no/>
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

<% /* �ۼ��ð� : Fri Mar 13 15:18:12 KST 2009 */ %>