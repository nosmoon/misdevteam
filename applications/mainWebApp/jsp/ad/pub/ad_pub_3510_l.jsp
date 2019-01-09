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
	AD_PUB_3510_LDataSet ds = (AD_PUB_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
		long tot_podr_amt = 0;
		long tot_misu_amt = 0;
		long tot_expct_amt = 0;
		long tot_sale_amt = 0;
		String pre_podr_slip_no = "";
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3510_LCURLISTRecord rec = (AD_PUB_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "podr_dt", rec.podr_dt);
			rx.add(record, "podr_slip_no", rec.podr_slip_no);
			rx.add(record, "occr_arow", rec.occr_arow);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "spl_dlco", rec.spl_dlco);
			rx.addCData(record, "dlco_no", rec.dlco_no.replaceAll("amp;",""));
			rx.addCData(record, "brnd_cd", rec.brnd_cd);
			rx.addCData(record, "item_nm", rec.item_nm);
			rx.add(record, "podr_uprc", rec.podr_uprc);
			rx.add(record, "uprc_fee", rec.uprc_fee);
			rx.add(record, "podr_cnt", rec.podr_cnt);
			rx.add(record, "podr_amt", rec.podr_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "mms_uprc", rec.mms_uprc);
			rx.add(record, "mms_cnt", rec.mms_cnt);
			rx.add(record, "mms_fee", rec.mms_fee);
			rx.add(record, "expct_amt", rec.expct_amt);
			if("Y".equals(rec.exct_yn)){
				rx.add(record, "exct_yn", "정산완료");
			}else if("S".equals(rec.exct_yn)){
				rx.add(record, "exct_yn", "일부정산");
			}else{
				rx.add(record, "exct_yn", "미정산");
			}
			rx.add(record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
			rx.add(record, "exct_dt", rec.exct_dt);
			rx.add(record, "exct_uprc", rec.exct_uprc);
			rx.add(record, "exct_cnt", rec.exct_cnt);
			rx.add(record, "exct_amt", rec.exct_amt);
			rx.add(record, "fee_rate", rec.fee_rate);
			rx.add(record, "tot_fee", rec.tot_fee);
			rx.add(record, "m_amt", rec.m_amt);
			rx.add(record, "easy_amt", rec.easy_amt);
			rx.add(record, "sale_amt", rec.sale_amt);
			tot_sale_amt += StringUtil.toLong(rec.sale_amt);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			//같은 발주전표의 발주금액,미수금액,예상매출액은 한번만 누적시킴
			//if("".equals(pre_podr_slip_no) || !rec.podr_slip_no.equals(pre_podr_slip_no)){
				tot_podr_amt += StringUtil.toLong(rec.podr_amt);
				tot_misu_amt += StringUtil.toLong(rec.misu_amt);
				tot_expct_amt += StringUtil.toLong(rec.expct_amt);
			//}
			//pre_podr_slip_no = rec.podr_slip_no;
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		int recordSet2 = rx.add(dataSet, "gridData2", "");
    	int record2 = rx.add(recordSet2, "record", "");
		rx.add(record2, "occr_dt", "");
		rx.add(record2, "podr_slip_no", "");
		rx.add(record2, "dlco_no", "");
		rx.add(record2, "podr_amt", "");
		rx.add(record2, "misu_amt", "");
		rx.add(record2, "mms_misu_mat", "");
		rx.add(record2, "slcrg_pers", "");
		rx.add(record2, "mchrg_pers", "");
				
		int resForm = rx.add(dataSet, "resForm", "");
		rx.add(resForm, "tot_podr_amt", tot_podr_amt);
		rx.add(resForm, "tot_misu_amt", tot_misu_amt);
		rx.add(resForm, "tot_expct_amt", tot_expct_amt);
		rx.add(resForm, "tot_sale_amt", tot_sale_amt);						
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
<ad_pub_3510_l>
	<dataSet>
		<CURLIST>
			<record>
				<podr_dt/>
				<podr_slip_no/>
				<occr_arow/>
				<medi_cd/>
				<spl_dlco/>
				<dlco_no/>
				<brnd_cd/>
				<item_nm/>
				<podr_uprc/>
				<uprc_fee/>
				<podr_cnt/>
				<podr_amt/>
				<misu_amt/>
				<mms_uprc/>
				<mms_cnt/>
				<mms_fee/>
				<expct_amt/>
				<exct_yn/>
				<sale_stmt_issu_yn/>
				<exct_dt/>
				<exct_uprc/>
				<exct_cnt/>
				<exct_amt/>
				<fee_rate/>
				<tot_fee/>
				<m_amt/>
				<easy_amt/>
				<sale_amt/>
				<slcrg_pers/>
				<mchrg_pers/>
			</record>
		</CURLIST>
	</dataSet>
</ad_pub_3510_l>
*/
%>

<% /* 작성시간 : Mon Feb 09 17:03:13 KST 2015 */ %>