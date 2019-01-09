/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6218_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public long data_cnt;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String clsf_cd;
	public String clos_yn;
	public String md_rmk_26_c;
	public String md_rmk_26_d;
	public String md_rmk_26_e;
	public String md_rmk_26_f;
	public String md_rmk_26_g;
	public String md_rmk_26_h;
	public String md_rmk_26_i;
	public String md_rmk_26_j;
	public String md_rmk_26_k;
	public String me_bizcond_27;
	public String me_item_27;
	public String me_indt_27;
	public long me_amt_27;
	public String me_bizcond_28;
	public String me_item_28;
	public String me_indt_28;
	public long me_amt_28;
	public String me_bizcond_29;
	public String me_item_29;
	public String me_indt_29;
	public long me_amt_29;
	public String me_bizcond_30;
	public String me_item_30;
	public String me_indt_30;
	public long me_amt_30;
	public long me_amt_31;
	public String mf_tax_agnt_nm;
	public String mf_tax_agnt_ern;
	public String mf_tax_agnt_tel_no;
	public String ml_bizcond_78;
	public String ml_item_78;
	public String ml_indt_78;
	public long ml_amt_78;
	public String ml_bizcond_79;
	public String ml_item_79;
	public String ml_indt_79;
	public long ml_amt_79;
	public String ml_bizcond_80;
	public String ml_item_80;
	public String ml_indt_80;
	public long ml_amt_80;
	public long ml_amt_81;
	public long mm_amt_82;
	public long mm_amt_83;
	public String decl_dt;

	public FC_ACCT_6218_SDataSet(){}
	public FC_ACCT_6218_SDataSet(String errcode, String errmsg, String erplace_cd, long data_cnt, String vat_fr_yymm, String vat_to_yymm, String clsf_cd, String clos_yn, String md_rmk_26_c, String md_rmk_26_d, String md_rmk_26_e, String md_rmk_26_f, String md_rmk_26_g, String md_rmk_26_h, String md_rmk_26_i, String md_rmk_26_j, String md_rmk_26_k, String me_bizcond_27, String me_item_27, String me_indt_27, long me_amt_27, String me_bizcond_28, String me_item_28, String me_indt_28, long me_amt_28, String me_bizcond_29, String me_item_29, String me_indt_29, long me_amt_29, String me_bizcond_30, String me_item_30, String me_indt_30, long me_amt_30, long me_amt_31, String mf_tax_agnt_nm, String mf_tax_agnt_ern, String mf_tax_agnt_tel_no, String ml_bizcond_78, String ml_item_78, String ml_indt_78, long ml_amt_78, String ml_bizcond_79, String ml_item_79, String ml_indt_79, long ml_amt_79, String ml_bizcond_80, String ml_item_80, String ml_indt_80, long ml_amt_80, long ml_amt_81, long mm_amt_82, long mm_amt_83, String decl_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.data_cnt = data_cnt;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.clsf_cd = clsf_cd;
		this.clos_yn = clos_yn;
		this.md_rmk_26_c = md_rmk_26_c;
		this.md_rmk_26_d = md_rmk_26_d;
		this.md_rmk_26_e = md_rmk_26_e;
		this.md_rmk_26_f = md_rmk_26_f;
		this.md_rmk_26_g = md_rmk_26_g;
		this.md_rmk_26_h = md_rmk_26_h;
		this.md_rmk_26_i = md_rmk_26_i;
		this.md_rmk_26_j = md_rmk_26_j;
		this.md_rmk_26_k = md_rmk_26_k;
		this.me_bizcond_27 = me_bizcond_27;
		this.me_item_27 = me_item_27;
		this.me_indt_27 = me_indt_27;
		this.me_amt_27 = me_amt_27;
		this.me_bizcond_28 = me_bizcond_28;
		this.me_item_28 = me_item_28;
		this.me_indt_28 = me_indt_28;
		this.me_amt_28 = me_amt_28;
		this.me_bizcond_29 = me_bizcond_29;
		this.me_item_29 = me_item_29;
		this.me_indt_29 = me_indt_29;
		this.me_amt_29 = me_amt_29;
		this.me_bizcond_30 = me_bizcond_30;
		this.me_item_30 = me_item_30;
		this.me_indt_30 = me_indt_30;
		this.me_amt_30 = me_amt_30;
		this.me_amt_31 = me_amt_31;
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
		this.ml_bizcond_78 = ml_bizcond_78;
		this.ml_item_78 = ml_item_78;
		this.ml_indt_78 = ml_indt_78;
		this.ml_amt_78 = ml_amt_78;
		this.ml_bizcond_79 = ml_bizcond_79;
		this.ml_item_79 = ml_item_79;
		this.ml_indt_79 = ml_indt_79;
		this.ml_amt_79 = ml_amt_79;
		this.ml_bizcond_80 = ml_bizcond_80;
		this.ml_item_80 = ml_item_80;
		this.ml_indt_80 = ml_indt_80;
		this.ml_amt_80 = ml_amt_80;
		this.ml_amt_81 = ml_amt_81;
		this.mm_amt_82 = mm_amt_82;
		this.mm_amt_83 = mm_amt_83;
		this.decl_dt = decl_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setData_cnt(long data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMd_rmk_26_c(String md_rmk_26_c){
		this.md_rmk_26_c = md_rmk_26_c;
	}

	public void setMd_rmk_26_d(String md_rmk_26_d){
		this.md_rmk_26_d = md_rmk_26_d;
	}

	public void setMd_rmk_26_e(String md_rmk_26_e){
		this.md_rmk_26_e = md_rmk_26_e;
	}

	public void setMd_rmk_26_f(String md_rmk_26_f){
		this.md_rmk_26_f = md_rmk_26_f;
	}

	public void setMd_rmk_26_g(String md_rmk_26_g){
		this.md_rmk_26_g = md_rmk_26_g;
	}

	public void setMd_rmk_26_h(String md_rmk_26_h){
		this.md_rmk_26_h = md_rmk_26_h;
	}

	public void setMd_rmk_26_i(String md_rmk_26_i){
		this.md_rmk_26_i = md_rmk_26_i;
	}

	public void setMd_rmk_26_j(String md_rmk_26_j){
		this.md_rmk_26_j = md_rmk_26_j;
	}

	public void setMd_rmk_26_k(String md_rmk_26_k){
		this.md_rmk_26_k = md_rmk_26_k;
	}

	public void setMe_bizcond_27(String me_bizcond_27){
		this.me_bizcond_27 = me_bizcond_27;
	}

	public void setMe_item_27(String me_item_27){
		this.me_item_27 = me_item_27;
	}

	public void setMe_indt_27(String me_indt_27){
		this.me_indt_27 = me_indt_27;
	}

	public void setMe_amt_27(long me_amt_27){
		this.me_amt_27 = me_amt_27;
	}

	public void setMe_bizcond_28(String me_bizcond_28){
		this.me_bizcond_28 = me_bizcond_28;
	}

	public void setMe_item_28(String me_item_28){
		this.me_item_28 = me_item_28;
	}

	public void setMe_indt_28(String me_indt_28){
		this.me_indt_28 = me_indt_28;
	}

	public void setMe_amt_28(long me_amt_28){
		this.me_amt_28 = me_amt_28;
	}

	public void setMe_bizcond_29(String me_bizcond_29){
		this.me_bizcond_29 = me_bizcond_29;
	}

	public void setMe_item_29(String me_item_29){
		this.me_item_29 = me_item_29;
	}

	public void setMe_indt_29(String me_indt_29){
		this.me_indt_29 = me_indt_29;
	}

	public void setMe_amt_29(long me_amt_29){
		this.me_amt_29 = me_amt_29;
	}

	public void setMe_bizcond_30(String me_bizcond_30){
		this.me_bizcond_30 = me_bizcond_30;
	}

	public void setMe_item_30(String me_item_30){
		this.me_item_30 = me_item_30;
	}

	public void setMe_indt_30(String me_indt_30){
		this.me_indt_30 = me_indt_30;
	}

	public void setMe_amt_30(long me_amt_30){
		this.me_amt_30 = me_amt_30;
	}

	public void setMe_amt_31(long me_amt_31){
		this.me_amt_31 = me_amt_31;
	}

	public void setMf_tax_agnt_nm(String mf_tax_agnt_nm){
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
	}

	public void setMf_tax_agnt_ern(String mf_tax_agnt_ern){
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
	}

	public void setMf_tax_agnt_tel_no(String mf_tax_agnt_tel_no){
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
	}

	public void setMl_bizcond_78(String ml_bizcond_78){
		this.ml_bizcond_78 = ml_bizcond_78;
	}

	public void setMl_item_78(String ml_item_78){
		this.ml_item_78 = ml_item_78;
	}

	public void setMl_indt_78(String ml_indt_78){
		this.ml_indt_78 = ml_indt_78;
	}

	public void setMl_amt_78(long ml_amt_78){
		this.ml_amt_78 = ml_amt_78;
	}

	public void setMl_bizcond_79(String ml_bizcond_79){
		this.ml_bizcond_79 = ml_bizcond_79;
	}

	public void setMl_item_79(String ml_item_79){
		this.ml_item_79 = ml_item_79;
	}

	public void setMl_indt_79(String ml_indt_79){
		this.ml_indt_79 = ml_indt_79;
	}

	public void setMl_amt_79(long ml_amt_79){
		this.ml_amt_79 = ml_amt_79;
	}

	public void setMl_bizcond_80(String ml_bizcond_80){
		this.ml_bizcond_80 = ml_bizcond_80;
	}

	public void setMl_item_80(String ml_item_80){
		this.ml_item_80 = ml_item_80;
	}

	public void setMl_indt_80(String ml_indt_80){
		this.ml_indt_80 = ml_indt_80;
	}

	public void setMl_amt_80(long ml_amt_80){
		this.ml_amt_80 = ml_amt_80;
	}

	public void setMl_amt_81(long ml_amt_81){
		this.ml_amt_81 = ml_amt_81;
	}

	public void setMm_amt_82(long mm_amt_82){
		this.mm_amt_82 = mm_amt_82;
	}

	public void setMm_amt_83(long mm_amt_83){
		this.mm_amt_83 = mm_amt_83;
	}

	public void setDecl_dt(String decl_dt){
		this.decl_dt = decl_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public long getData_cnt(){
		return this.data_cnt;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMd_rmk_26_c(){
		return this.md_rmk_26_c;
	}

	public String getMd_rmk_26_d(){
		return this.md_rmk_26_d;
	}

	public String getMd_rmk_26_e(){
		return this.md_rmk_26_e;
	}

	public String getMd_rmk_26_f(){
		return this.md_rmk_26_f;
	}

	public String getMd_rmk_26_g(){
		return this.md_rmk_26_g;
	}

	public String getMd_rmk_26_h(){
		return this.md_rmk_26_h;
	}

	public String getMd_rmk_26_i(){
		return this.md_rmk_26_i;
	}

	public String getMd_rmk_26_j(){
		return this.md_rmk_26_j;
	}

	public String getMd_rmk_26_k(){
		return this.md_rmk_26_k;
	}

	public String getMe_bizcond_27(){
		return this.me_bizcond_27;
	}

	public String getMe_item_27(){
		return this.me_item_27;
	}

	public String getMe_indt_27(){
		return this.me_indt_27;
	}

	public long getMe_amt_27(){
		return this.me_amt_27;
	}

	public String getMe_bizcond_28(){
		return this.me_bizcond_28;
	}

	public String getMe_item_28(){
		return this.me_item_28;
	}

	public String getMe_indt_28(){
		return this.me_indt_28;
	}

	public long getMe_amt_28(){
		return this.me_amt_28;
	}

	public String getMe_bizcond_29(){
		return this.me_bizcond_29;
	}

	public String getMe_item_29(){
		return this.me_item_29;
	}

	public String getMe_indt_29(){
		return this.me_indt_29;
	}

	public long getMe_amt_29(){
		return this.me_amt_29;
	}

	public String getMe_bizcond_30(){
		return this.me_bizcond_30;
	}

	public String getMe_item_30(){
		return this.me_item_30;
	}

	public String getMe_indt_30(){
		return this.me_indt_30;
	}

	public long getMe_amt_30(){
		return this.me_amt_30;
	}

	public long getMe_amt_31(){
		return this.me_amt_31;
	}

	public String getMf_tax_agnt_nm(){
		return this.mf_tax_agnt_nm;
	}

	public String getMf_tax_agnt_ern(){
		return this.mf_tax_agnt_ern;
	}

	public String getMf_tax_agnt_tel_no(){
		return this.mf_tax_agnt_tel_no;
	}

	public String getMl_bizcond_78(){
		return this.ml_bizcond_78;
	}

	public String getMl_item_78(){
		return this.ml_item_78;
	}

	public String getMl_indt_78(){
		return this.ml_indt_78;
	}

	public long getMl_amt_78(){
		return this.ml_amt_78;
	}

	public String getMl_bizcond_79(){
		return this.ml_bizcond_79;
	}

	public String getMl_item_79(){
		return this.ml_item_79;
	}

	public String getMl_indt_79(){
		return this.ml_indt_79;
	}

	public long getMl_amt_79(){
		return this.ml_amt_79;
	}

	public String getMl_bizcond_80(){
		return this.ml_bizcond_80;
	}

	public String getMl_item_80(){
		return this.ml_item_80;
	}

	public String getMl_indt_80(){
		return this.ml_indt_80;
	}

	public long getMl_amt_80(){
		return this.ml_amt_80;
	}

	public long getMl_amt_81(){
		return this.ml_amt_81;
	}

	public long getMm_amt_82(){
		return this.mm_amt_82;
	}

	public long getMm_amt_83(){
		return this.mm_amt_83;
	}

	public String getDecl_dt(){
		return this.decl_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.erplace_cd = Util.checkString(cstmt.getString(9));
		this.data_cnt = cstmt.getLong(10);
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.clsf_cd = Util.checkString(cstmt.getString(13));
		this.clos_yn = Util.checkString(cstmt.getString(14));
		this.md_rmk_26_c = Util.checkString(cstmt.getString(15));
		this.md_rmk_26_d = Util.checkString(cstmt.getString(16));
		this.md_rmk_26_e = Util.checkString(cstmt.getString(17));
		this.md_rmk_26_f = Util.checkString(cstmt.getString(18));
		this.md_rmk_26_g = Util.checkString(cstmt.getString(19));
		this.md_rmk_26_h = Util.checkString(cstmt.getString(20));
		this.md_rmk_26_i = Util.checkString(cstmt.getString(21));
		this.md_rmk_26_j = Util.checkString(cstmt.getString(22));
		this.md_rmk_26_k = Util.checkString(cstmt.getString(23));
		this.me_bizcond_27 = Util.checkString(cstmt.getString(24));
		this.me_item_27 = Util.checkString(cstmt.getString(25));
		this.me_indt_27 = Util.checkString(cstmt.getString(26));
		this.me_amt_27 = cstmt.getLong(27);
		this.me_bizcond_28 = Util.checkString(cstmt.getString(28));
		this.me_item_28 = Util.checkString(cstmt.getString(29));
		this.me_indt_28 = Util.checkString(cstmt.getString(30));
		this.me_amt_28 = cstmt.getLong(31);
		this.me_bizcond_29 = Util.checkString(cstmt.getString(32));
		this.me_item_29 = Util.checkString(cstmt.getString(33));
		this.me_indt_29 = Util.checkString(cstmt.getString(34));
		this.me_amt_29 = cstmt.getLong(35);
		this.me_bizcond_30 = Util.checkString(cstmt.getString(36));
		this.me_item_30 = Util.checkString(cstmt.getString(37));
		this.me_indt_30 = Util.checkString(cstmt.getString(38));
		this.me_amt_30 = cstmt.getLong(39);
		this.me_amt_31 = cstmt.getLong(40);
		this.mf_tax_agnt_nm = Util.checkString(cstmt.getString(41));
		this.mf_tax_agnt_ern = Util.checkString(cstmt.getString(42));
		this.mf_tax_agnt_tel_no = Util.checkString(cstmt.getString(43));
		this.ml_bizcond_78 = Util.checkString(cstmt.getString(44));
		this.ml_item_78 = Util.checkString(cstmt.getString(45));
		this.ml_indt_78 = Util.checkString(cstmt.getString(46));
		this.ml_amt_78 = cstmt.getLong(47);
		this.ml_bizcond_79 = Util.checkString(cstmt.getString(48));
		this.ml_item_79 = Util.checkString(cstmt.getString(49));
		this.ml_indt_79 = Util.checkString(cstmt.getString(50));
		this.ml_amt_79 = cstmt.getLong(51);
		this.ml_bizcond_80 = Util.checkString(cstmt.getString(52));
		this.ml_item_80 = Util.checkString(cstmt.getString(53));
		this.ml_indt_80 = Util.checkString(cstmt.getString(54));
		this.ml_amt_80 = cstmt.getLong(55);
		this.ml_amt_81 = cstmt.getLong(56);
		this.mm_amt_82 = cstmt.getLong(57);
		this.mm_amt_83 = cstmt.getLong(58);
		this.decl_dt = Util.checkString(cstmt.getString(59));
		ResultSet rset0 = (ResultSet) cstmt.getObject(60);
		while(rset0.next()){
			FC_ACCT_6218_SCURLIST1Record rec = new FC_ACCT_6218_SCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(61);
		while(rset1.next()){
			FC_ACCT_6218_SCURLIST2Record rec = new FC_ACCT_6218_SCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6218_SDataSet ds = (FC_ACCT_6218_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6218_SCURLIST1Record curlist1Rec = (FC_ACCT_6218_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6218_SCURLIST2Record curlist2Rec = (FC_ACCT_6218_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getErplace_cd()%>
<%= ds.getData_cnt()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getClsf_cd()%>
<%= ds.getClos_yn()%>
<%= ds.getMd_rmk_26_c()%>
<%= ds.getMd_rmk_26_d()%>
<%= ds.getMd_rmk_26_e()%>
<%= ds.getMd_rmk_26_f()%>
<%= ds.getMd_rmk_26_g()%>
<%= ds.getMd_rmk_26_h()%>
<%= ds.getMd_rmk_26_i()%>
<%= ds.getMd_rmk_26_j()%>
<%= ds.getMd_rmk_26_k()%>
<%= ds.getMe_bizcond_27()%>
<%= ds.getMe_item_27()%>
<%= ds.getMe_indt_27()%>
<%= ds.getMe_amt_27()%>
<%= ds.getMe_bizcond_28()%>
<%= ds.getMe_item_28()%>
<%= ds.getMe_indt_28()%>
<%= ds.getMe_amt_28()%>
<%= ds.getMe_bizcond_29()%>
<%= ds.getMe_item_29()%>
<%= ds.getMe_indt_29()%>
<%= ds.getMe_amt_29()%>
<%= ds.getMe_bizcond_30()%>
<%= ds.getMe_item_30()%>
<%= ds.getMe_indt_30()%>
<%= ds.getMe_amt_30()%>
<%= ds.getMe_amt_31()%>
<%= ds.getMf_tax_agnt_nm()%>
<%= ds.getMf_tax_agnt_ern()%>
<%= ds.getMf_tax_agnt_tel_no()%>
<%= ds.getMl_bizcond_78()%>
<%= ds.getMl_item_78()%>
<%= ds.getMl_indt_78()%>
<%= ds.getMl_amt_78()%>
<%= ds.getMl_bizcond_79()%>
<%= ds.getMl_item_79()%>
<%= ds.getMl_indt_79()%>
<%= ds.getMl_amt_79()%>
<%= ds.getMl_bizcond_80()%>
<%= ds.getMl_item_80()%>
<%= ds.getMl_indt_80()%>
<%= ds.getMl_amt_80()%>
<%= ds.getMl_amt_81()%>
<%= ds.getMm_amt_82()%>
<%= ds.getMm_amt_83()%>
<%= ds.getDecl_dt()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 18:12:51 KST 2015 */