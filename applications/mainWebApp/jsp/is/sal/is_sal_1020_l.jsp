<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1020_LDataSet ds = (IS_SAL_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_1020_LCURLISTRecord rec = (IS_SAL_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "slip_clsf_cd_dt_seq", rec.slip_clsf_cd+"-"+rec.slip_occr_dt+"-"+rec.slip_seq);	/**계산서번호**/
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "prof_type_cd_nm", rec.prof_type_cd_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "trans_yn", rec.trans_yn);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
			rx.add(record, "ernm", rec.ernm);
			rx.add(record, "prof_type_cd", rec.prof_type_cd); 	/**KEY 증빙유형코드**/
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);	/**KEY 구분**/
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);	/**KEY 일자**/
			rx.add(record, "slip_seq", rec.slip_seq);			/**KEY 순번**/
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
