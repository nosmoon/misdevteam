/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList gurtperslist = new ArrayList();
	public ArrayList coltlist = new ArrayList();
	public ArrayList sendplaclist = new ArrayList();
	public ArrayList hndlmedilist = new ArrayList();
	public ArrayList dlcodtllist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1220_LDataSet(){}
	public PL_BAS_1220_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PL_BAS_1220_LDLCODTLLISTRecord rec = new PL_BAS_1220_LDLCODTLLISTRecord();
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset1.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset1.getString("dlco_abrv_nm"));
			rec.comn_mang_no = Util.checkString(rset1.getString("comn_mang_no"));
			rec.rptv_flnm = Util.checkString(rset1.getString("rptv_flnm"));
			rec.dlco_clsf = Util.checkString(rset1.getString("dlco_clsf"));
			rec.area = Util.checkString(rset1.getString("area"));
			rec.prv_curr_clsf = Util.checkString(rset1.getString("prv_curr_clsf"));
			rec.prv_curr_clsf_nm = Util.checkString(rset1.getString("prv_curr_clsf_nm"));
			rec.bkst_cnt = Util.checkString(rset1.getString("bkst_cnt"));
			rec.tel_no_1 = Util.checkString(rset1.getString("tel_no_1"));
			rec.tel_no_2 = Util.checkString(rset1.getString("tel_no_2"));
			rec.tel_no_3 = Util.checkString(rset1.getString("tel_no_3"));
			rec.tel_no_etc = Util.checkString(rset1.getString("tel_no_etc"));
			rec.ptph_no_1 = Util.checkString(rset1.getString("ptph_no_1"));
			rec.ptph_no_2 = Util.checkString(rset1.getString("ptph_no_2"));
			rec.ptph_no_3 = Util.checkString(rset1.getString("ptph_no_3"));
			rec.fax_no_1 = Util.checkString(rset1.getString("fax_no_1"));
			rec.fax_no_2 = Util.checkString(rset1.getString("fax_no_2"));
			rec.fax_no_3 = Util.checkString(rset1.getString("fax_no_3"));
			rec.email = Util.checkString(rset1.getString("email"));
			rec.zip_1 = Util.checkString(rset1.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset1.getString("zip_2"));
			rec.addr = Util.checkString(rset1.getString("addr"));
			rec.dtls_addr = Util.checkString(rset1.getString("dtls_addr"));
			rec.magz_deal_yn = Util.checkString(rset1.getString("magz_deal_yn"));
			rec.magz_deal_frdt = Util.checkString(rset1.getString("magz_deal_frdt"));
			rec.magz_deal_todt = Util.checkString(rset1.getString("magz_deal_todt"));
			rec.sep_book_deal_yn = Util.checkString(rset1.getString("sep_book_deal_yn"));
			rec.sep_book_deal_frdt = Util.checkString(rset1.getString("sep_book_deal_frdt"));
			rec.sep_book_deal_todt = Util.checkString(rset1.getString("sep_book_deal_todt"));
			rec.elec_tax_stmt_yn = Util.checkString(rset1.getString("elec_tax_stmt_yn"));
			rec.gurt_amt_tot_amt = Util.checkString(rset1.getString("gurt_amt_tot_amt"));
			rec.gurt_amt_altn = Util.checkString(rset1.getString("gurt_amt_altn"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.dlcodtllist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PL_BAS_1220_LHNDLMEDILISTRecord rec = new PL_BAS_1220_LHNDLMEDILISTRecord();
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset2.getString("dlco_seq"));
			rec.medi_clsf = Util.checkString(rset2.getString("medi_clsf"));
			rec.medi_clsf_nm = Util.checkString(rset2.getString("medi_clsf_nm"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset2.getString("medi_cd_nm"));
			rec.deal_yn = Util.checkString(rset2.getString("deal_yn"));
			rec.no_val_exne = Util.checkString(rset2.getString("no_val_exne"));
			rec.dcrate = Util.checkString(rset2.getString("dcrate"));
			rec.wh_cd = Util.checkString(rset2.getString("wh_cd"));
			rec.sendclsf = Util.checkString(rset2.getString("sendclsf"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.hndlmedilist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PL_BAS_1220_LSENDPLACLISTRecord rec = new PL_BAS_1220_LSENDPLACLISTRecord();
			rec.dlco_cd = Util.checkString(rset3.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset3.getString("dlco_seq"));
			rec.send_plac_seq = Util.checkString(rset3.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset3.getString("send_plac_nm"));
			rec.magz_deal_yn = Util.checkString(rset3.getString("magz_deal_yn"));
			rec.sep_book_deal_yn = Util.checkString(rset3.getString("sep_book_deal_yn"));
			rec.vexc_dlco_cd = Util.checkString(rset3.getString("vexc_dlco_cd"));
			rec.tel_no = Util.checkString(rset3.getString("tel_no"));
			rec.fax_no = Util.checkString(rset3.getString("fax_no"));
			rec.zip_1 = Util.checkString(rset3.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset3.getString("zip_2"));
			rec.addr = Util.checkString(rset3.getString("addr"));
			rec.dtls_addr = Util.checkString(rset3.getString("dtls_addr"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			this.sendplaclist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			PL_BAS_1220_LCOLTLISTRecord rec = new PL_BAS_1220_LCOLTLISTRecord();
			rec.dlco_cd = Util.checkString(rset4.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset4.getString("dlco_seq"));
			rec.colt_seq = Util.checkString(rset4.getString("colt_seq"));
			rec.colt_clsf = Util.checkString(rset4.getString("colt_clsf"));
			rec.setup_stat = Util.checkString(rset4.getString("setup_stat"));
			rec.colt_obj_nm = Util.checkString(rset4.getString("colt_obj_nm"));
			rec.prty_rank = Util.checkString(rset4.getString("prty_rank"));
			rec.acqr_dt = Util.checkString(rset4.getString("acqr_dt"));
			rec.colt_setup_amt = Util.checkString(rset4.getString("colt_setup_amt"));
			rec.pub_ann_amt = Util.checkString(rset4.getString("pub_ann_amt"));
			rec.plcw = Util.checkString(rset4.getString("plcw"));
			rec.gurt_strt_dd = Util.checkString(rset4.getString("gurt_strt_dd"));
			rec.gurt_end_dd = Util.checkString(rset4.getString("gurt_end_dd"));
			rec.insr_stock_no = Util.checkString(rset4.getString("insr_stock_no"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			this.coltlist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			PL_BAS_1220_LGURTPERSLISTRecord rec = new PL_BAS_1220_LGURTPERSLISTRecord();
			rec.dlco_cd = Util.checkString(rset5.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset5.getString("dlco_seq"));
			rec.setup_stat = Util.checkString(rset5.getString("setup_stat"));
			rec.gurt_pers_seq = Util.checkString(rset5.getString("gurt_pers_seq"));
			rec.gurt_pers_flnm = Util.checkString(rset5.getString("gurt_pers_flnm"));
			rec.gurt_pers_prn_1 = Util.checkString(rset5.getString("gurt_pers_prn_1"));
			rec.gurt_pers_prn_2 = Util.checkString(rset5.getString("gurt_pers_prn_2"));
			rec.tel_no_1 = Util.checkString(rset5.getString("tel_no_1"));
			rec.tel_no_2 = Util.checkString(rset5.getString("tel_no_2"));
			rec.tel_no_3 = Util.checkString(rset5.getString("tel_no_3"));
			rec.ptph_no_1 = Util.checkString(rset5.getString("ptph_no_1"));
			rec.ptph_no_2 = Util.checkString(rset5.getString("ptph_no_2"));
			rec.ptph_no_3 = Util.checkString(rset5.getString("ptph_no_3"));
			rec.zip_1 = Util.checkString(rset5.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset5.getString("zip_2"));
			rec.addr = Util.checkString(rset5.getString("addr"));
			rec.dtls_addr = Util.checkString(rset5.getString("dtls_addr"));
			rec.rshp = Util.checkString(rset5.getString("rshp"));
			rec.remk = Util.checkString(rset5.getString("remk"));
			this.gurtperslist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1220_LDataSet ds = (PL_BAS_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcodtllist.size(); i++){
		PL_BAS_1220_LDLCODTLLISTRecord dlcodtllistRec = (PL_BAS_1220_LDLCODTLLISTRecord)ds.dlcodtllist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hndlmedilist.size(); i++){
		PL_BAS_1220_LHNDLMEDILISTRecord hndlmedilistRec = (PL_BAS_1220_LHNDLMEDILISTRecord)ds.hndlmedilist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendplaclist.size(); i++){
		PL_BAS_1220_LSENDPLACLISTRecord sendplaclistRec = (PL_BAS_1220_LSENDPLACLISTRecord)ds.sendplaclist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.coltlist.size(); i++){
		PL_BAS_1220_LCOLTLISTRecord coltlistRec = (PL_BAS_1220_LCOLTLISTRecord)ds.coltlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.gurtperslist.size(); i++){
		PL_BAS_1220_LGURTPERSLISTRecord gurtperslistRec = (PL_BAS_1220_LGURTPERSLISTRecord)ds.gurtperslist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlcodtllist()%>
<%= ds.getHndlmedilist()%>
<%= ds.getSendplaclist()%>
<%= ds.getColtlist()%>
<%= ds.getGurtperslist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlcodtllistRec.dlco_cd%>
<%= dlcodtllistRec.dlco_seq%>
<%= dlcodtllistRec.dlco_nm%>
<%= dlcodtllistRec.dlco_abrv_nm%>
<%= dlcodtllistRec.comn_mang_no%>
<%= dlcodtllistRec.rptv_flnm%>
<%= dlcodtllistRec.dlco_clsf%>
<%= dlcodtllistRec.area%>
<%= dlcodtllistRec.prv_curr_clsf%>
<%= dlcodtllistRec.prv_curr_clsf_nm%>
<%= dlcodtllistRec.bkst_cnt%>
<%= dlcodtllistRec.tel_no_1%>
<%= dlcodtllistRec.tel_no_2%>
<%= dlcodtllistRec.tel_no_3%>
<%= dlcodtllistRec.tel_no_etc%>
<%= dlcodtllistRec.ptph_no_1%>
<%= dlcodtllistRec.ptph_no_2%>
<%= dlcodtllistRec.ptph_no_3%>
<%= dlcodtllistRec.fax_no_1%>
<%= dlcodtllistRec.fax_no_2%>
<%= dlcodtllistRec.fax_no_3%>
<%= dlcodtllistRec.email%>
<%= dlcodtllistRec.zip_1%>
<%= dlcodtllistRec.zip_2%>
<%= dlcodtllistRec.addr%>
<%= dlcodtllistRec.dtls_addr%>
<%= dlcodtllistRec.magz_deal_yn%>
<%= dlcodtllistRec.magz_deal_frdt%>
<%= dlcodtllistRec.magz_deal_todt%>
<%= dlcodtllistRec.sep_book_deal_yn%>
<%= dlcodtllistRec.sep_book_deal_frdt%>
<%= dlcodtllistRec.sep_book_deal_todt%>
<%= dlcodtllistRec.elec_tax_stmt_yn%>
<%= dlcodtllistRec.gurt_amt_tot_amt%>
<%= dlcodtllistRec.gurt_amt_altn%>
<%= dlcodtllistRec.remk%>
<%= hndlmedilistRec.dlco_cd%>
<%= hndlmedilistRec.dlco_seq%>
<%= hndlmedilistRec.medi_clsf%>
<%= hndlmedilistRec.medi_clsf_nm%>
<%= hndlmedilistRec.medi_cd%>
<%= hndlmedilistRec.medi_cd_nm%>
<%= hndlmedilistRec.deal_yn%>
<%= hndlmedilistRec.no_val_exne%>
<%= hndlmedilistRec.dcrate%>
<%= hndlmedilistRec.wh_cd%>
<%= hndlmedilistRec.sendclsf%>
<%= hndlmedilistRec.remk%>
<%= sendplaclistRec.dlco_cd%>
<%= sendplaclistRec.dlco_seq%>
<%= sendplaclistRec.send_plac_seq%>
<%= sendplaclistRec.send_plac_nm%>
<%= sendplaclistRec.magz_deal_yn%>
<%= sendplaclistRec.sep_book_deal_yn%>
<%= sendplaclistRec.vexc_dlco_cd%>
<%= sendplaclistRec.tel_no%>
<%= sendplaclistRec.fax_no%>
<%= sendplaclistRec.zip_1%>
<%= sendplaclistRec.zip_2%>
<%= sendplaclistRec.addr%>
<%= sendplaclistRec.dtls_addr%>
<%= sendplaclistRec.remk%>
<%= coltlistRec.dlco_cd%>
<%= coltlistRec.dlco_seq%>
<%= coltlistRec.colt_seq%>
<%= coltlistRec.colt_clsf%>
<%= coltlistRec.setup_stat%>
<%= coltlistRec.colt_obj_nm%>
<%= coltlistRec.prty_rank%>
<%= coltlistRec.acqr_dt%>
<%= coltlistRec.colt_setup_amt%>
<%= coltlistRec.pub_ann_amt%>
<%= coltlistRec.plcw%>
<%= coltlistRec.gurt_strt_dd%>
<%= coltlistRec.gurt_end_dd%>
<%= coltlistRec.insr_stock_no%>
<%= coltlistRec.remk%>
<%= gurtperslistRec.dlco_cd%>
<%= gurtperslistRec.dlco_seq%>
<%= gurtperslistRec.setup_stat%>
<%= gurtperslistRec.gurt_pers_seq%>
<%= gurtperslistRec.gurt_pers_flnm%>
<%= gurtperslistRec.gurt_pers_prn_1%>
<%= gurtperslistRec.gurt_pers_prn_2%>
<%= gurtperslistRec.tel_no_1%>
<%= gurtperslistRec.tel_no_2%>
<%= gurtperslistRec.tel_no_3%>
<%= gurtperslistRec.ptph_no_1%>
<%= gurtperslistRec.ptph_no_2%>
<%= gurtperslistRec.ptph_no_3%>
<%= gurtperslistRec.zip_1%>
<%= gurtperslistRec.zip_2%>
<%= gurtperslistRec.addr%>
<%= gurtperslistRec.dtls_addr%>
<%= gurtperslistRec.rshp%>
<%= gurtperslistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */