/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String podr_occr_dt;
	public String podr_occr_seq;
	public String podr_dt;
	public String dlco_no;
	public String dlco_nm;
	public String expct_amt;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String pre_podr_slip_no;
	public String upd_yn;
	public String clos_stat;
	public String seq_clsf;

	public AD_PUB_3410_LDataSet(){}
	public AD_PUB_3410_LDataSet(String errcode, String errmsg, String podr_occr_dt, String podr_occr_seq, String podr_dt, String dlco_no, String dlco_nm, String expct_amt, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String pre_podr_slip_no, String upd_yn, String clos_stat, String seq_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.podr_occr_dt = podr_occr_dt;
		this.podr_occr_seq = podr_occr_seq;
		this.podr_dt = podr_dt;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.expct_amt = expct_amt;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.pre_podr_slip_no = pre_podr_slip_no;
		this.upd_yn = upd_yn;
		this.clos_stat = clos_stat;
		this.seq_clsf = seq_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPodr_occr_dt(String podr_occr_dt){
		this.podr_occr_dt = podr_occr_dt;
	}

	public void setPodr_occr_seq(String podr_occr_seq){
		this.podr_occr_seq = podr_occr_seq;
	}

	public void setPodr_dt(String podr_dt){
		this.podr_dt = podr_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setExpct_amt(String expct_amt){
		this.expct_amt = expct_amt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setPre_podr_slip_no(String pre_podr_slip_no){
		this.pre_podr_slip_no = pre_podr_slip_no;
	}

	public void setUpd_yn(String upd_yn){
		this.upd_yn = upd_yn;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setSeq_clsf(String seq_clsf){
		this.seq_clsf = seq_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPodr_occr_dt(){
		return this.podr_occr_dt;
	}

	public String getPodr_occr_seq(){
		return this.podr_occr_seq;
	}

	public String getPodr_dt(){
		return this.podr_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getExpct_amt(){
		return this.expct_amt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getPre_podr_slip_no(){
		return this.pre_podr_slip_no;
	}

	public String getUpd_yn(){
		return this.upd_yn;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getSeq_clsf(){
		return this.seq_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.podr_occr_dt = Util.checkString(cstmt.getString(7));
		this.podr_occr_seq = Util.checkString(cstmt.getString(8));
		this.podr_dt = Util.checkString(cstmt.getString(9));
		this.dlco_no = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.expct_amt = Util.checkString(cstmt.getString(12));
		this.slcrg_pers = Util.checkString(cstmt.getString(13));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(14));
		this.dept_cd = Util.checkString(cstmt.getString(15));
		this.dept_nm = Util.checkString(cstmt.getString(16));
		this.mchrg_pers = Util.checkString(cstmt.getString(17));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(18));
		this.pre_podr_slip_no = Util.checkString(cstmt.getString(19));
		this.upd_yn = Util.checkString(cstmt.getString(20));
		this.clos_stat = Util.checkString(cstmt.getString(21));
		this.seq_clsf = Util.checkString(cstmt.getString(22));
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			AD_PUB_3410_LCURLISTRecord rec = new AD_PUB_3410_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.occr_arow = Util.checkString(rset0.getString("occr_arow"));
			rec.spl_dlco = Util.checkString(rset0.getString("spl_dlco"));
			rec.brnd_cd = Util.checkString(rset0.getString("brnd_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.podr_cnt = Util.checkString(rset0.getString("podr_cnt"));
			rec.podr_uprc = Util.checkString(rset0.getString("podr_uprc"));
			rec.podr_amt = Util.checkString(rset0.getString("podr_amt"));
			rec.uprc_fee = Util.checkString(rset0.getString("uprc_fee"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.exct_yn = Util.checkString(rset0.getString("exct_yn"));
			rec.clamt_stat = Util.checkString(rset0.getString("clamt_stat"));
			rec.mms_uprc = Util.checkString(rset0.getString("mms_uprc"));
			rec.mms_cnt = Util.checkString(rset0.getString("mms_cnt"));
			rec.mms_fee = Util.checkString(rset0.getString("mms_fee"));
			rec.mms_vat = Util.checkString(rset0.getString("mms_vat"));
			rec.expct_amt = Util.checkString(rset0.getString("expct_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			AD_PUB_3410_LCURLIST2Record rec = new AD_PUB_3410_LCURLIST2Record();
			rec.podr_slip_no = Util.checkString(rset1.getString("podr_slip_no"));
			rec.sale_stmt_issu_yn = Util.checkString(rset1.getString("sale_stmt_issu_yn"));
			rec.exct_dt = Util.checkString(rset1.getString("exct_dt"));
			rec.exct_seq = Util.checkString(rset1.getString("exct_seq"));
			rec.spl_dlco = Util.checkString(rset1.getString("spl_dlco"));
			rec.brnd_cd = Util.checkString(rset1.getString("brnd_cd"));
			rec.item_nm = Util.checkString(rset1.getString("item_nm"));
			rec.fee_rate = Util.checkString(rset1.getString("fee_rate"));
			rec.fee = Util.checkString(rset1.getString("fee"));
			rec.fee_vat = Util.checkString(rset1.getString("fee_vat"));
			rec.tot_fee = Util.checkString(rset1.getString("tot_fee"));
			rec.exct_uprc = Util.checkString(rset1.getString("exct_uprc"));
			rec.exct_cnt = Util.checkString(rset1.getString("exct_cnt"));
			rec.exct_amt = Util.checkString(rset1.getString("exct_amt"));
			rec.easy_amt = Util.checkString(rset1.getString("easy_amt"));
			rec.cntrct_yn = Util.checkString(rset1.getString("cntrct_yn"));
			rec.clos_stat = Util.checkString(rset1.getString("clos_stat"));
			rec.easy_yn = Util.checkString(rset1.getString("easy_yn"));
			rec.uprc_fee = Util.checkString(rset1.getString("uprc_fee"));
			rec.sale_amt = Util.checkString(rset1.getString("sale_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3410_LDataSet ds = (AD_PUB_3410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3410_LCURLISTRecord curlistRec = (AD_PUB_3410_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_3410_LCURLIST2Record curlist2Rec = (AD_PUB_3410_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPodr_occr_dt()%>
<%= ds.getPodr_occr_seq()%>
<%= ds.getPodr_dt()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getExpct_amt()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getPre_podr_slip_no()%>
<%= ds.getUpd_yn()%>
<%= ds.getClos_stat()%>
<%= ds.getSeq_clsf()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.occr_arow%>
<%= curlistRec.spl_dlco%>
<%= curlistRec.brnd_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.podr_cnt%>
<%= curlistRec.podr_uprc%>
<%= curlistRec.podr_amt%>
<%= curlistRec.uprc_fee%>
<%= curlistRec.misu_amt%>
<%= curlistRec.exct_yn%>
<%= curlistRec.clamt_stat%>
<%= curlistRec.mms_uprc%>
<%= curlistRec.mms_cnt%>
<%= curlistRec.mms_fee%>
<%= curlistRec.mms_vat%>
<%= curlistRec.expct_amt%>
<%= curlist2Rec.podr_slip_no%>
<%= curlist2Rec.sale_stmt_issu_yn%>
<%= curlist2Rec.exct_dt%>
<%= curlist2Rec.exct_seq%>
<%= curlist2Rec.spl_dlco%>
<%= curlist2Rec.brnd_cd%>
<%= curlist2Rec.item_nm%>
<%= curlist2Rec.fee_rate%>
<%= curlist2Rec.fee%>
<%= curlist2Rec.fee_vat%>
<%= curlist2Rec.tot_fee%>
<%= curlist2Rec.exct_uprc%>
<%= curlist2Rec.exct_cnt%>
<%= curlist2Rec.exct_amt%>
<%= curlist2Rec.easy_amt%>
<%= curlist2Rec.cntrct_yn%>
<%= curlist2Rec.clos_stat%>
<%= curlist2Rec.easy_yn%>
<%= curlist2Rec.uprc_fee%>
<%= curlist2Rec.sale_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 11:16:27 KST 2015 */