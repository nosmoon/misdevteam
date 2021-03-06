<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.artmgr.rec.*
	,	chosun.ciis.as.artmgr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ARTMGR_1002_LDataSet ds = (AS_ARTMGR_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_ARTMGR_1002_LCURLISTRecord rec = (AS_ARTMGR_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "art_prod_no", StringUtil.replaceToXml(rec.art_prod_no));
			rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			rx.add(record, "art_cate_nm", StringUtil.replaceToXml(rec.art_cate_nm));
			rx.add(record, "author", StringUtil.replaceToXml(rec.author));
			rx.add(record, "art_prod_nm", StringUtil.replaceToXml(rec.art_prod_nm));
			rx.add(record, "art_prod_size", StringUtil.replaceToXml(rec.art_prod_size));
			rx.add(record, "fram_size", StringUtil.replaceToXml(rec.fram_size));
			rx.add(record, "fram_yn", StringUtil.replaceToXml(rec.fram_yn));
			rx.add(record, "make_yymm", StringUtil.replaceToXml(rec.make_yymm));
			rx.add(record, "get_dt", StringUtil.replaceToXml(rec.get_dt));
			rx.add(record, "get_resn", StringUtil.replaceToXml(rec.get_resn));
			rx.add(record, "ap_amt", StringUtil.replaceToXml(rec.ap_amt));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_tel", StringUtil.replaceToXml(rec.dlco_tel));
			rx.add(record, "keep_plac", StringUtil.replaceToXml(rec.keep_plac));
			rx.add(record, "keep_dt", StringUtil.replaceToXml(rec.keep_dt));
			rx.add(record, "art_prod_evlu", StringUtil.replaceToXml(rec.art_prod_evlu));
			rx.add(record, "last_chk_dt", StringUtil.replaceToXml(rec.last_chk_dt));
			rx.add(record, "dnt_clsf", StringUtil.replaceToXml(rec.dnt_clsf));
			rx.add(record, "dnt_clsf_nm", StringUtil.replaceToXml(rec.dnt_clsf_nm));
			rx.add(record, "art_prod_remk", StringUtil.replaceToXml(rec.art_prod_remk));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			rx.add(record, "incmg_pers_nm", StringUtil.replaceToXml(rec.incmg_pers_nm));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "art_prod_no", rec.art_prod_no);
			//rx.add(record, "aset_no", rec.aset_no);
			//rx.add(record, "aset_nm", rec.aset_nm);
			//rx.add(record, "art_cate_nm", rec.art_cate_nm);
			//rx.add(record, "author", rec.author);
			//rx.add(record, "art_prod_nm", rec.art_prod_nm);
			//rx.add(record, "art_prod_size", rec.art_prod_size);
			//rx.add(record, "fram_size", rec.fram_size);
			//rx.add(record, "fram_yn", rec.fram_yn);
			//rx.add(record, "make_yymm", rec.make_yymm);
			//rx.add(record, "get_dt", rec.get_dt);
			//rx.add(record, "get_resn", rec.get_resn);
			//rx.add(record, "ap_amt", rec.ap_amt);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "dlco_tel", rec.dlco_tel);
			//rx.add(record, "keep_plac", rec.keep_plac);
			//rx.add(record, "keep_dt", rec.keep_dt);
			//rx.add(record, "art_prod_evlu", rec.art_prod_evlu);
			//rx.add(record, "last_chk_dt", rec.last_chk_dt);
			//rx.add(record, "dnt_clsf", rec.dnt_clsf);
			//rx.add(record, "dnt_clsf_nm", rec.dnt_clsf_nm);
			//rx.add(record, "art_prod_remk", rec.art_prod_remk);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			//rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_artmgr_1002_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<art_prod_no/>
				<aset_no/>
				<aset_nm/>
				<art_cate_nm/>
				<author/>
				<art_prod_nm/>
				<art_prod_size/>
				<fram_size/>
				<fram_yn/>
				<make_yymm/>
				<get_dt/>
				<get_resn/>
				<ap_amt/>
				<dlco_nm/>
				<dlco_tel/>
				<keep_plac/>
				<keep_dt/>
				<art_prod_evlu/>
				<last_chk_dt/>
				<dnt_clsf/>
				<dnt_clsf_nm/>
				<art_prod_remk/>
				<remk/>
				<incmg_dt_tm/>
				<incmg_pers_nm/>
			</record>
		</CURLIST>
	</dataSet>
</as_artmgr_1002_l>
*/
%>

<% /* 작성시간 : Wed Jul 08 10:56:42 KST 2009 */ %>