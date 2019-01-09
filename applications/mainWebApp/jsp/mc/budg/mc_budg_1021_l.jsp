<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_1021_LDataSet ds = (MC_BUDG_1021_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_1021_LCURLISTRecord rec = (MC_BUDG_1021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_type_cd", rec.budg_type_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "ycbrnm1", rec.ycbrnm1);
			rx.add(record, "ycbrnm2", rec.ycbrnm2);
			rx.add(record, "ycbrnm3", rec.ycbrnm3);
			rx.add(record, "ycbrnm4", rec.ycbrnm4);
			rx.add(record, "budg_clas_cd", rec.budg_clas_cd);
			rx.add(record, "cyov_yn", rec.cyov_yn);
			rx.add(record, "lesd_yn", rec.lesd_yn);
			rx.add(record, "advc_cndt_yn", rec.advc_cndt_yn);
			rx.add(record, "fixfee_yn", rec.fixfee_yn);
			rx.add(record, "posbfee_yn", rec.posbfee_yn);
			rx.add(record, "limt_chk_yn", rec.limt_chk_yn);
			rx.add(record, "medi_dstb_cd", rec.medi_dstb_cd);
			rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
			rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			rx.add(record, "dstb_acct_cd", rec.dstb_acct_cd);
			rx.add(record, "via_dept_cd", rec.via_dept_cd);
			rx.add(record, "drcr_bal_clsf", rec.drcr_bal_clsf);
			rx.add(record, "use_bgn_dt", rec.use_bgn_dt);
			rx.add(record, "use_end_dt", rec.use_end_dt);
			rx.add(record, "item_01", rec.item_01);
			rx.add(record, "item_02", rec.item_02);
			rx.add(record, "item_03", rec.item_03);
			rx.add(record, "item_04", rec.item_04);
			rx.add(record, "item_05", rec.item_05);
			rx.add(record, "item_06", rec.item_06);
			rx.add(record, "item_07", rec.item_07);
			rx.add(record, "item_08", rec.item_08);
			rx.add(record, "item_09", rec.item_09);
			rx.add(record, "item_10", rec.item_10);
			rx.add(record, "item_11", rec.item_11);
			rx.add(record, "item_12", rec.item_12);
			rx.add(record, "item_13", rec.item_13);
			rx.add(record, "item_14", rec.item_14);
			rx.add(record, "item_15", rec.item_15);
			rx.add(record, "item_16", rec.item_16);
			rx.add(record, "item_17", rec.item_17);
			rx.add(record, "item_18", rec.item_18);
			rx.add(record, "item_19", rec.item_19);
			rx.add(record, "item_20", rec.item_20);
			rx.add(record, "item_21", rec.item_21);
			rx.add(record, "item_22", rec.item_22);
			rx.add(record, "item_23", rec.item_23);
			rx.add(record, "item_24", rec.item_24);
			rx.add(record, "item_25", rec.item_25);
			rx.add(record, "item_26", rec.item_26);
			rx.add(record, "item_27", rec.item_27);
			rx.add(record, "item_28", rec.item_28);
			rx.add(record, "item_29", rec.item_29);
			rx.add(record, "item_30", rec.item_30);
			rx.add(record, "item_31", rec.item_31);
			rx.add(record, "item_32", rec.item_32);
			rx.add(record, "item_33", rec.item_33);
			rx.add(record, "item_34", rec.item_34);
			rx.add(record, "item_35", rec.item_35);
			rx.add(record, "item_36", rec.item_36);
			//rx.add(record, "budg_type_cd", StringUtil.replaceToXml(rec.budg_type_cd));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "ycbrnm1", StringUtil.replaceToXml(rec.ycbrnm1));
			//rx.add(record, "ycbrnm2", StringUtil.replaceToXml(rec.ycbrnm2));
			//rx.add(record, "ycbrnm3", StringUtil.replaceToXml(rec.ycbrnm3));
			//rx.add(record, "ycbrnm4", StringUtil.replaceToXml(rec.ycbrnm4));
			//rx.add(record, "budg_clas_cd", StringUtil.replaceToXml(rec.budg_clas_cd));
			//rx.add(record, "cyov_yn", StringUtil.replaceToXml(rec.cyov_yn));
			//rx.add(record, "lesd_yn", StringUtil.replaceToXml(rec.lesd_yn));
			//rx.add(record, "advc_cndt_yn", StringUtil.replaceToXml(rec.advc_cndt_yn));
			//rx.add(record, "fixfee_yn", StringUtil.replaceToXml(rec.fixfee_yn));
			//rx.add(record, "posbfee_yn", StringUtil.replaceToXml(rec.posbfee_yn));
			//rx.add(record, "limt_chk_yn", StringUtil.replaceToXml(rec.limt_chk_yn));
			//rx.add(record, "medi_dstb_cd", StringUtil.replaceToXml(rec.medi_dstb_cd));
			//rx.add(record, "whco_comn_cost_yn", StringUtil.replaceToXml(rec.whco_comn_cost_yn));
			//rx.add(record, "whco_ndstb_cd", StringUtil.replaceToXml(rec.whco_ndstb_cd));
			//rx.add(record, "dstb_acct_cd", StringUtil.replaceToXml(rec.dstb_acct_cd));
			//rx.add(record, "via_dept_cd", StringUtil.replaceToXml(rec.via_dept_cd));
			//rx.add(record, "drcr_bal_clsf", StringUtil.replaceToXml(rec.drcr_bal_clsf));
			//rx.add(record, "use_bgn_dt", StringUtil.replaceToXml(rec.use_bgn_dt));
			//rx.add(record, "use_end_dt", StringUtil.replaceToXml(rec.use_end_dt));
			//rx.add(record, "item_01", StringUtil.replaceToXml(rec.item_01));
			//rx.add(record, "item_02", StringUtil.replaceToXml(rec.item_02));
			//rx.add(record, "item_03", StringUtil.replaceToXml(rec.item_03));
			//rx.add(record, "item_04", StringUtil.replaceToXml(rec.item_04));
			//rx.add(record, "item_05", StringUtil.replaceToXml(rec.item_05));
			//rx.add(record, "item_06", StringUtil.replaceToXml(rec.item_06));
			//rx.add(record, "item_07", StringUtil.replaceToXml(rec.item_07));
			//rx.add(record, "item_08", StringUtil.replaceToXml(rec.item_08));
			//rx.add(record, "item_09", StringUtil.replaceToXml(rec.item_09));
			//rx.add(record, "item_10", StringUtil.replaceToXml(rec.item_10));
			//rx.add(record, "item_11", StringUtil.replaceToXml(rec.item_11));
			//rx.add(record, "item_12", StringUtil.replaceToXml(rec.item_12));
			//rx.add(record, "item_13", StringUtil.replaceToXml(rec.item_13));
			//rx.add(record, "item_14", StringUtil.replaceToXml(rec.item_14));
			//rx.add(record, "item_15", StringUtil.replaceToXml(rec.item_15));
			//rx.add(record, "item_16", StringUtil.replaceToXml(rec.item_16));
			//rx.add(record, "item_17", StringUtil.replaceToXml(rec.item_17));
			//rx.add(record, "item_18", StringUtil.replaceToXml(rec.item_18));
			//rx.add(record, "item_19", StringUtil.replaceToXml(rec.item_19));
			//rx.add(record, "item_20", StringUtil.replaceToXml(rec.item_20));
			//rx.add(record, "item_21", StringUtil.replaceToXml(rec.item_21));
			//rx.add(record, "item_22", StringUtil.replaceToXml(rec.item_22));
			//rx.add(record, "item_23", StringUtil.replaceToXml(rec.item_23));
			//rx.add(record, "item_24", StringUtil.replaceToXml(rec.item_24));
			//rx.add(record, "item_25", StringUtil.replaceToXml(rec.item_25));
			//rx.add(record, "item_26", StringUtil.replaceToXml(rec.item_26));
			//rx.add(record, "item_27", StringUtil.replaceToXml(rec.item_27));
			//rx.add(record, "item_28", StringUtil.replaceToXml(rec.item_28));
			//rx.add(record, "item_29", StringUtil.replaceToXml(rec.item_29));
			//rx.add(record, "item_30", StringUtil.replaceToXml(rec.item_30));
			//rx.add(record, "item_31", StringUtil.replaceToXml(rec.item_31));
			//rx.add(record, "item_32", StringUtil.replaceToXml(rec.item_32));
			//rx.add(record, "item_33", StringUtil.replaceToXml(rec.item_33));
			//rx.add(record, "item_34", StringUtil.replaceToXml(rec.item_34));
			//rx.add(record, "item_35", StringUtil.replaceToXml(rec.item_35));
			//rx.add(record, "item_36", StringUtil.replaceToXml(rec.item_36));
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
<mc_budg_1021_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_type_cd/>
				<budg_cd/>
				<budg_cdnm/>
				<ycbrnm1/>
				<ycbrnm2/>
				<ycbrnm3/>
				<ycbrnm4/>
				<budg_clas_cd/>
				<cyov_yn/>
				<lesd_yn/>
				<advc_cndt_yn/>
				<fixfee_yn/>
				<posbfee_yn/>
				<limt_chk_yn/>
				<medi_dstb_cd/>
				<whco_comn_cost_yn/>
				<whco_ndstb_cd/>
				<dstb_acct_cd/>
				<via_dept_cd/>
				<drcr_bal_clsf/>
				<use_bgn_dt/>
				<use_end_dt/>
				<item_01/>
				<item_02/>
				<item_03/>
				<item_04/>
				<item_05/>
				<item_06/>
				<item_07/>
				<item_08/>
				<item_09/>
				<item_10/>
				<item_11/>
				<item_12/>
				<item_13/>
				<item_14/>
				<item_15/>
				<item_16/>
				<item_17/>
				<item_18/>
				<item_19/>
				<item_20/>
				<item_21/>
				<item_22/>
				<item_23/>
				<item_24/>
				<item_25/>
				<item_26/>
				<item_27/>
				<item_28/>
				<item_29/>
				<item_30/>
				<item_31/>
				<item_32/>
				<item_33/>
				<item_34/>
				<item_35/>
				<item_36/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_1021_l>
*/
%>

<% /* 작성시간 : Mon May 11 21:09:56 KST 2009 */ %>