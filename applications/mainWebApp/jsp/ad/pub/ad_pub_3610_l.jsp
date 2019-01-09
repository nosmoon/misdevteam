<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3610_LDataSet ds = (AD_PUB_3610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3610_LCURLISTRecord rec = (AD_PUB_3610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			//rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_nm);
			rx.add(record, "mchrg_pers_nm", rec.mchrg_nm);
			rx.add(record, "cslcrg_pers_nm", rec.cslcrg_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn_nm", rec.agn);
			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "tot_rcpm_amt", rec.tot_rcpm_amt);
			rx.add(record, "misu_amt", rec.misu_tot_amt);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "uprc_amt", rec.uprc);
			rx.add(record, "coms", rec.coms);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<ad_pub_3610_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_dt/>
				<pubc_side/>
				<pubc_slip_no/>
				<medi_cd/>
				<medi_nm/>
				<slcrg_nm/>
				<mchrg_nm/>
				<cslcrg_nm/>
				<dlco_nm/>
				<agn/>
				<hndl_plac_nm/>
				<advt_fee/>
				<vat/>
				<tot_rcpm_amt/>
				<misu_tot_amt/>
				<fee/>
				<cm/>
				<dn/>
				<uprc/>
				<coms/>
			</record>
		</CURLIST>
	</dataSet>
</ad_pub_3610_l>
*/
%>

<% /* 작성시간 : Mon Mar 02 14:07:44 KST 2015 */ %>