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
	HD_INFO_7120_LDataSet ds = (HD_INFO_7120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		rx.add(dataSet, "supr_dept_cd", ds.supr_dept_cd);
		rx.add(dataSet, "dept_cd", ds.dept_cd);
		rx.add(dataSet, "chrg_posk_cd", ds.chrg_posk_cd);
		rx.add(dataSet, "chrg_posk_cd_nm", "");
		rx.add(dataSet, "medi_cd", ds.medi_cd);
		rx.add(dataSet, "thrw_pgm", ds.thrw_pgm);
		rx.add(dataSet, "thrw_pgm_nm", "");
		rx.add(dataSet, "medi_cd2", ds.medi_cd2);
		rx.add(dataSet, "thrw_pgm2", ds.thrw_pgm2);
		rx.add(dataSet, "thrw_pgm2_nm", "");
		rx.add(dataSet, "pay_cycl", ds.pay_cycl); 
		rx.add(dataSet, "servcost", ds.servcost);
		rx.addCData(dataSet, "serv_pay_cond", ds.etc_pay_cond);
		rx.add(dataSet, "cntr_dt", ds.cntr_dt);
		rx.add(dataSet, "lvcmpy_dt", ds.lvcmpy_dt);
		rx.add(dataSet, "cntr_expr_dt", ds.cntr_expr_dt);
		rx.add(dataSet, "draft_no", ds.draft_no);
		rx.add(dataSet, "draft_dept_cd", ds.draft_dept_cd);
		rx.add(dataSet, "mang_no", ds.mang_no);
		rx.addCData(dataSet, "tel_no", ds.tel_no);
		rx.addCData(dataSet, "addr", ds.addr);
		rx.add(dataSet, "acct_no", ds.acct_no);
		rx.add(dataSet, "bank_cd", ds.bank_cd);
		rx.addCData(dataSet, "bank_nm", ds.bank_nm);
		rx.addCData(dataSet, "flnm", ds.flnm);
		rx.addCData(dataSet, "prn", ds.prn);
		rx.addCData(dataSet, "zip_code", ds.zip_code);
		rx.add(dataSet, "frlc_no", ds.frlc_no);
		rx.add(dataSet, "incm_clsf_cd", ds.incm_clsf_cd );
		rx.add(dataSet, "incm_clsf_nm", "" );
		rx.add(dataSet, "mode","");		
		rx.add(dataSet, "remk",ds.remk);

		
		String	work_yn = "";
		if("10".equals(ds.work_yn)) 		work_yn = "재직";
		else if("20".equals(ds.work_yn)) 	work_yn = "퇴직";		
				
		rx.add(dataSet, "work_yn", work_yn); 
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
<hd_info_7002_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<flnm/>
				<prn/>
				<tel_no/>
				<addr/>
				<chrg_posk_cd/>
				<thrw_pgm/>
				<pay_cycl/>
				<servcost/>
				<serv_pay_cond/>
				<fst_cntr_dt/>
				<last_cntr_dt/>
				<cntr_expr_dt/>
				<draft_no/>
				<bank_cd/>
				<acct_no/>
				<medi_cd/>
				<mang_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7002_l>
*/
%>

<% /* 작성시간 : Tue Dec 04 16:01:54 KST 2012 */ %>