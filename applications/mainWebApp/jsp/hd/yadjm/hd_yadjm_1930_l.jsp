<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1930_LDataSet ds = (HD_YADJM_1930_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1930_LCURLISTRecord rec = (HD_YADJM_1930_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			
			//주민등록번호, 사업자등록번호 상태값을 DB에 저장하지 않기 때문에
			//이 부분에서 그리드 값을 변경해주는 로직이 필요하다.
			int len = rec.ern.length();
			if(len == 10) rx.add(record, "num_type", "10");
			else rx.add(record, "num_type", "13");
			
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "firmnm", StringUtil.replaceToXml(rec.firmnm));
			rx.add(record, "dona_plac_clsf", StringUtil.replaceToXml(rec.dona_plac_clsf));
			rx.add(record, "dona_yymm", StringUtil.replaceToXml(rec.dona_yymm));
			rx.add(record, "dona_ptcr_noit", StringUtil.replaceToXml(rec.dona_ptcr_noit));
			rx.add(record, "dona_ptcr_amt", StringUtil.replaceToXml(rec.dona_ptcr_amt));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "rshp", StringUtil.replaceToXml(rec.rshp));
			rx.add(record, "obj_pers_flnm", StringUtil.replaceToXml(rec.obj_pers_flnm));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "corr_txn_prd_dduc_amt", StringUtil.replaceToXml(rec.corr_txn_prd_dduc_amt));
			rx.add(record, "cyov_amt", StringUtil.replaceToXml(rec.cyov_amt));
			rx.add(record, "lastyear_cyov_amt", rec.lastyear_cyov_amt);
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "firmnm", rec.firmnm);
			//rx.add(record, "dona_plac_clsf", rec.dona_plac_clsf);
			//rx.add(record, "dona_yymm", rec.dona_yymm);
			//rx.add(record, "dona_ptcr_noit", rec.dona_ptcr_noit);
			//rx.add(record, "dona_ptcr_amt", rec.dona_ptcr_amt);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "rshp", rec.rshp);
			//rx.add(record, "obj_pers_flnm", rec.obj_pers_flnm);
			//rx.add(record, "prn", rec.prn);
			//rx.add(record, "corr_txn_prd_dduc_amt", rec.corr_txn_prd_dduc_amt);
			//rx.add(record, "cyov_amt", rec.cyov_amt);
			//rx.add(record, "seq", rec.seq);
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
<hd_yadjm_1930_l>
	<dataSet>
		<CURLIST>
			<record>
				<ern/>
				<firmnm/>
				<dona_plac_clsf/>
				<dona_yymm/>
				<dona_ptcr_noit/>
				<dona_ptcr_amt/>
				<rmks/>
				<rshp/>
				<obj_pers_flnm/>
				<prn/>
				<corr_txn_prd_dduc_amt/>
				<cyov_amt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1930_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 16:56:00 KST 2009 */ %>