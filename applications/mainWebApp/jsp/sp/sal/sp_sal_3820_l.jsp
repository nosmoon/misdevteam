<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3820_LDataSet ds = (SP_SAL_3820_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3820_LCURLISTRecord rec = (SP_SAL_3820_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "slip_clsf_cd_dt_seq", rec.slip_clsf_cd+"-"+rec.slip_occr_dt+"-"+rec.slip_seq);	/**계산서번호**/
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "prof_type_cd_nm", rec.prof_type_cd_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "trans_yn", rec.trans_yn);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
			rx.add(record, "ernm", rec.ernm);
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<sp_sal_3820_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_clsf_cd/>
				<slip_occr_dt/>
				<slip_seq/>
				<make_dt/>
				<prof_type_cd/>
				<prof_type_cd_nm/>
				<dlco_cd/>
				<dlco_nm/>
				<presi_nm/>
				<ern/>
				<suply_amt/>
				<vat_amt/>
				<amt/>
				<trans_yn/>
				<occr_slip_no/>
				<ernm/>
			</record>
		</CURLIST>
	</dataSet>
</sp_sal_3820_l>
*/
%>

<% /* 작성시간 : Thu Aug 02 17:32:16 KST 2012 */ %>