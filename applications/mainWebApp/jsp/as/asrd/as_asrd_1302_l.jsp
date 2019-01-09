<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.asrd.rec.*
	,	chosun.ciis.as.asrd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASRD_1302_LDataSet ds = (AS_ASRD_1302_LDataSet)request.getAttribute("ds");
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
			AS_ASRD_1302_LCURLISTRecord rec = (AS_ASRD_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "bund_nm", rec.bund_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "cur_acqr_amt", rec.cur_acqr_amt);
			rx.add(record, "un_redm_amt", rec.un_redm_amt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.addCData(record, "aset_stat_nm", rec.aset_stat_nm);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.addCData(record, "aset_size", rec.aset_size);
			rx.addCData(record, "aset_loca", rec.aset_loca);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "bund_nm", StringUtil.replaceToXml(rec.bund_nm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "orgin_acqr_amt", StringUtil.replaceToXml(rec.orgin_acqr_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "cur_acqr_amt", StringUtil.replaceToXml(rec.cur_acqr_amt));
			//rx.add(record, "un_redm_amt", StringUtil.replaceToXml(rec.un_redm_amt));
			//rx.add(record, "sale_dt", StringUtil.replaceToXml(rec.sale_dt));
			//rx.add(record, "sale_amt", StringUtil.replaceToXml(rec.sale_amt));
			//rx.add(record, "aset_stat_nm", StringUtil.replaceToXml(rec.aset_stat_nm));
			//rx.add(record, "aset_qunt_cnt", StringUtil.replaceToXml(rec.aset_qunt_cnt));
			//rx.add(record, "aset_usag", StringUtil.replaceToXml(rec.aset_usag));
			//rx.add(record, "aset_size", StringUtil.replaceToXml(rec.aset_size));
			//rx.add(record, "aset_loca", StringUtil.replaceToXml(rec.aset_loca));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_ASRD_1302_LCURLIST1Record rec = (AS_ASRD_1302_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record,"aset_no"          ,rec.aset_no        ); 
			rx.addCData(record,"aset_nm"          ,rec.aset_nm        ); 
			rx.add(record,"item_cd"          ,rec.item_cd        ); 
			rx.addCData(record,"item_nm"          ,rec.item_nm        ); 
			rx.add(record,"buy_clsf"         ,rec.buy_clsf       ); 
			rx.add(record,"buy_clsf_nm"      ,rec.buy_clsf_nm    ); 
			rx.add(record,"aset_stat"        ,rec.aset_stat      ); 
			rx.add(record,"aset_stat_nm"     ,rec.aset_stat_nm   ); 
			rx.add(record,"acqr_dt"          ,rec.acqr_dt        ); 
			rx.add(record,"orgin_acqr_amt"   ,rec.orgin_acqr_amt ); 
			rx.add(record,"cur_acqr_amt"     ,rec.cur_acqr_amt   ); 
			rx.add(record,"sale_dt"          ,rec.sale_dt        ); 
			rx.add(record,"sale_amt"         ,rec.sale_amt       ); 
			rx.add(record,"dept_cd"          ,rec.dept_cd        ); 
			rx.addCData(record,"dept_nm"          ,rec.dept_nm        ); 
			rx.add(record,"dlco_ern"         ,rec.dlco_ern       ); 
			rx.addCData(record,"dlco_nm"          ,rec.dlco_nm        ); 
			rx.add(record,"bund_cd"          ,rec.bund_cd        ); 
			rx.addCData(record,"bund_cd_nm"       ,rec.bund_cd_nm     ); 
			rx.addCData(record,"aset_size"        ,rec.aset_size      ); 
			rx.addCData(record,"aset_loca"        ,rec.aset_loca      ); 
			rx.add(record,"aset_qunt_cnt"    ,rec.aset_qunt_cnt  ); 
			rx.add(record,"aset_qunt_cnt2"   ,rec.aset_qunt_cnt2 ); 
			rx.add(record,"aset_usag"        ,rec.aset_usag      ); 
			rx.add(record,"unit_cd"          ,rec.unit_cd        ); 
			rx.addCData(record,"unit_nm"          ,rec.unit_nm        ); 
			rx.add(record,"budg_cd"          ,rec.budg_cd        ); 
			rx.addCData(record,"budg_nm"          ,rec.budg_nm        ); 
			rx.add(record,"redm_clsf"        ,rec.redm_clsf      ); 
			rx.add(record,"redm_clsf_nm"     ,rec.redm_clsf_nm   ); 
			rx.add(record,"redm_mthd_cd"     ,rec.redm_mthd_cd   ); 
			rx.add(record,"redm_mthd_cd_nm"  ,rec.redm_mthd_cd_nm); 
			rx.add(record,"svc_yys_cnt"      ,rec.svc_yys_cnt    ); 
			rx.addCData(record,"make_natn"        ,rec.make_natn      ); 
			rx.addCData(record,"make_cmpy"        ,rec.make_cmpy      ); 
			rx.addCData(record,"make_yymm"        ,rec.make_yymm      ); 
			rx.addCData(record,"make_no"          ,rec.make_no        ); 
			rx.addCData(record,"mang_no"          ,rec.mang_no        ); 
			rx.addCData(record,"remk"             ,rec.remk           ); 
			rx.add(record,"insr_type_cd"     ,rec.insr_type_cd   );
			rx.add(record,"insr_type_nm"     ,rec.insr_type_nm   );
			rx.add(record,"use_emp_no"       ,rec.use_emp_no     );
			rx.add(record,"use_emp_nm"       ,rec.use_emp_nm     );
			rx.add(record,"use_cmpy_nm"      ,rec.use_cmpy_nm    );
			rx.add(record,"use_dept_nm"      ,rec.use_dept_nm    );
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
<as_asrd_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<aset_no/>
				<aset_nm/>
				<dept_nm/>
				<bund_nm/>
				<acqr_dt/>
				<orgin_acqr_amt/>
				<vat_amt/>
				<cur_acqr_amt/>
				<un_redm_amt/>
				<sale_dt/>
				<sale_amt/>
				<aset_stat_nm/>
				<aset_qunt_cnt/>
				<aset_usag/>
				<aset_size/>
				<aset_loca/>
			</record>
		</CURLIST>
	</dataSet>
</as_asrd_1302_l>
*/
%>

<% /* 작성시간 : Sat Aug 15 10:02:19 KST 2009 */ %>