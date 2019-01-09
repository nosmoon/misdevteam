<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_2202_LDataSet ds = (HD_INFO_2202_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_2202_LCURLIST1Record rec = (HD_INFO_2202_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "flnm_engl", rec.flnm_engl);
			rx.add(record, "flnm_chin", rec.flnm_chin);
			rx.add(record, "chk", "");

			if(rec.bi_yymm.length() != 7){
				rx.add(record, "bi_yymm", rec.bi_yymm);
			}else{
				if(Integer.parseInt(rec.bi_yymm.substring(6)) > 2){
					rx.add(record, "bi_yymm", "20"+rec.bi_yymm.substring(0,4));
				}else{
					rx.add(record, "bi_yymm", "19"+rec.bi_yymm.substring(0,4));
				}	
			}
		
			rx.add(record, "issu_resn", rec.issu_resn);
			rx.add(record, "issu_resn_nm", rec.issu_resn_nm);
			rx.add(record, "real_fee_paymt_yn", rec.real_fee_paymt_yn);
			rx.add(record, "real_fee_paymt_yn_nm", rec.real_fee_paymt_yn_nm);
			rx.add(record, "real_fee_paymt_amt", rec.real_fee_paymt_amt);
			rx.add(record, "id_card_typ", rec.id_card_typ);
			rx.add(record, "id_card_typ_nm", rec.id_card_typ_nm);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "issu_yn", rec.issu_yn);
			rx.add(record, "issu_yn_nm", rec.issu_yn_nm);
			rx.add(record, "remk", rec.remk);
			
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "flnm_engl", StringUtil.replaceToXml(rec.flnm_engl));
			//rx.add(record, "flnm_chin", StringUtil.replaceToXml(rec.flnm_chin));
			//rx.add(record, "bi_yymm", StringUtil.replaceToXml(rec.bi_yymm));
			//rx.add(record, "issu_resn", StringUtil.replaceToXml(rec.issu_resn));
			//rx.add(record, "real_fee_paymt_yn", StringUtil.replaceToXml(rec.real_fee_paymt_yn));
			//rx.add(record, "real_fee_paymt_amt", StringUtil.replaceToXml(rec.real_fee_paymt_amt));
			//rx.add(record, "id_card_typ", StringUtil.replaceToXml(rec.id_card_typ));
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "issu_yn", StringUtil.replaceToXml(rec.issu_yn));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_info_2202_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<flnm_engl/>
				<flnm_chin/>
				<bi_yymm/>
				<issu_resn/>
				<real_fee_paymt_yn/>
				<real_fee_paymt_amt/>
				<id_card_typ/>
				<issu_dt/>
				<issu_yn/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_2202_l>
*/
%>

<% /* 작성시간 : Mon Jun 01 20:35:02 KST 2009 */ %>