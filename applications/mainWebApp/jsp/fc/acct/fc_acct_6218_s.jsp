<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6218_SDataSet ds = (FC_ACCT_6218_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int resForm = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");

	try {
		resForm = rx.add(tempData,"resForm","");
		rx.add(resForm,"erplace_cd",ds.erplace_cd);
		rx.add(resForm,"data_cnt",ds.data_cnt);
		rx.add(resForm,"vat_fr_yymm",ds.vat_fr_yymm);
		rx.add(resForm,"vat_to_yymm",ds.vat_to_yymm);
		rx.add(resForm,"clsf_cd",ds.clsf_cd);
		rx.add(resForm,"clos_yn",ds.clos_yn);
		rx.add(resForm,"md_rmk_26_e",ds.md_rmk_26_e);
		rx.add(resForm,"md_rmk_26_f",ds.md_rmk_26_f);
		rx.add(resForm,"md_rmk_26_g",ds.md_rmk_26_g);
		rx.add(resForm,"md_rmk_26_h",ds.md_rmk_26_h);
		rx.add(resForm,"md_rmk_26_i",ds.md_rmk_26_i);
		rx.add(resForm,"md_rmk_26_j",ds.md_rmk_26_j);

		rx.add(resForm,"me_bizcond_27",ds.me_bizcond_27);
		rx.add(resForm,"me_item_27",ds.me_item_27);
		rx.add(resForm,"me_indt_27",ds.me_indt_27);
		rx.add(resForm,"me_amt_27",ds.me_amt_27);
		rx.add(resForm,"me_bizcond_28",ds.me_bizcond_28);
		rx.add(resForm,"me_item_28",ds.me_item_28);
		rx.add(resForm,"me_indt_28",ds.me_indt_28);
		rx.add(resForm,"me_amt_28",ds.me_amt_28);
		rx.add(resForm,"me_bizcond_29",ds.me_bizcond_29);
		rx.add(resForm,"me_item_29",ds.me_item_29);
		rx.add(resForm,"me_indt_29",ds.me_indt_29);
		rx.add(resForm,"me_amt_29",ds.me_amt_29);
		rx.add(resForm,"me_bizcond_30",ds.me_bizcond_30);
		rx.add(resForm,"me_item_30",ds.me_item_30);
		rx.add(resForm,"me_indt_30",ds.me_indt_30);
		rx.add(resForm,"me_amt_30",ds.me_amt_30);
		
		rx.add(resForm,"me_amt_31",ds.me_amt_31);
		
		rx.add(resForm,"mf_tax_agnt_nm",ds.mf_tax_agnt_nm);
		rx.add(resForm,"mf_tax_agnt_ern",ds.mf_tax_agnt_ern);
		rx.add(resForm,"mf_tax_agnt_tel_no",ds.mf_tax_agnt_tel_no);
		
		rx.add(resForm,"ml_bizcond_78",ds.ml_bizcond_78);
		rx.add(resForm,"ml_item_78",ds.ml_item_78);
		rx.add(resForm,"ml_indt_78",ds.ml_indt_78);
		rx.add(resForm,"ml_amt_78",ds.ml_amt_78);
		rx.add(resForm,"ml_bizcond_79",ds.ml_bizcond_79);
		rx.add(resForm,"ml_item_79",ds.ml_item_79);
		rx.add(resForm,"ml_indt_79",ds.ml_indt_79);
		rx.add(resForm,"ml_amt_79",ds.ml_amt_79);
		rx.add(resForm,"ml_bizcond_80",ds.ml_bizcond_80);
		rx.add(resForm,"ml_item_80",ds.ml_item_80);
		rx.add(resForm,"ml_indt_80",ds.ml_indt_80);
		rx.add(resForm,"ml_amt_80",ds.ml_amt_80);
		
		rx.add(resForm,"ml_amt_81",ds.ml_amt_81);
		rx.add(resForm,"mm_amt_82",ds.mm_amt_82);
		rx.add(resForm,"mm_amt_83",ds.mm_amt_83);
		
		rx.add(resForm,"decl_dt",ds.decl_dt); 
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(tempData, "comboSet", "");
		int bank_cd = rx.add(recordSet, "bank_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_6218_SCURLIST2Record rec = (FC_ACCT_6218_SCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(bank_cd, "item", "");
			rx.add(item, "value", rec.cd);
			//rx.add(item, "cdnm", rec.cdnm);
			//rx.add(item, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(item, "cdnm_cd", rec.cdnm_cd);
			rx.add(item, "label", rec.cdabrvnm_cd);
		}		
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		/****** CURLIST1 BEGIN */
		int clsf = rx.add(recordSet, "clsf", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6218_SCURLIST1Record rec = (FC_ACCT_6218_SCURLIST1Record)ds.curlist1.get(i);
			int item = rx.add(clsf, "item", "");
			rx.add(item, "value", rec.cd);
			//rx.add(item, "cdnm", rec.cdnm);
			//rx.add(item, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(item, "cdnm_cd", rec.cdnm_cd);
			rx.add(item, "label", rec.cdabrvnm_cd);
		}		
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(tempData, "errcode", errcode);
		rx.add(tempData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6218_s>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_6218_s>
*/
%>

<% /* 작성시간 : Wed Jun 18 18:52:40 KST 2014 */ %>