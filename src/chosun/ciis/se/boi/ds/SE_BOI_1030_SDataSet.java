package chosun.ciis.se.boi.ds;

import chosun.ciis.se.boi.rec.SE_BOI_1030_SBOHEADFAMCURRecord;
import chosun.ciis.se.boi.rec.SE_BOI_1030_SBOHEADHSTYCURRecord;
import chosun.ciis.se.boi.rec.SE_BOI_1030_SBOHEADIDEACURRecord;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import somo.framework.db.BaseDataSet;
import somo.framework.util.Util;

public class SE_BOI_1030_SDataSet extends BaseDataSet
  implements Serializable
{
  public ArrayList commcdcur2 = new ArrayList();
  public ArrayList commcdcur1 = new ArrayList();
  public ArrayList boheadideacur = new ArrayList();
  public ArrayList boheadhstycur = new ArrayList();
  public ArrayList boheadfamcur = new ArrayList();
  public String errcode;
  public String errmsg;
  public String bo_head_nm;
  public String bo_head_prn;
  public String tel_no_0;
  public String tel_no_1;
  public String tel_no_2;
  public String tel_no_3;
  public String ptph_no_1;
  public String ptph_no_2;
  public String ptph_no_3;
  public String bo_head_bidt;
  public String luso_clsf;
  public String wedd_anvy_dd;
  public String zip_1;
  public String zip_2;
  public String addr;
  public String dtls_addr;
  public String nativ;
  public String hby;
  public String relg;
  public String drink_qunt;
  public String smok_yn;
  public byte[] bo_head_phot;
  public String phot_size;
  public String dlco_no;
  public String ern;
  public String bank_nm;
  public String acct_no;
  public String rcpm_main_nm;

  public SE_BOI_1030_SDataSet()
  {
  }

  public SE_BOI_1030_SDataSet(String errcode, String errmsg, String bo_head_nm, String bo_head_prn, String tel_no_0, String tel_no_1, String tel_no_2, String tel_no_3, String ptph_no_1, String ptph_no_2, String ptph_no_3, String bo_head_bidt, String luso_clsf, String wedd_anvy_dd, String zip_1, String zip_2, String addr, String dtls_addr, String nativ, String hby, String relg, String drink_qunt, String smok_yn, byte[] bo_head_phot, String phot_size, String dlco_no, String ern, String bank_nm, String acct_no, String rcpm_main_nm)
  {
    this.errcode = errcode;
    this.errmsg = errmsg;
    this.bo_head_nm = bo_head_nm;
    this.bo_head_prn = bo_head_prn;
    this.tel_no_0 = tel_no_0;
    this.tel_no_1 = tel_no_1;
    this.tel_no_2 = tel_no_2;
    this.tel_no_3 = tel_no_3;
    this.ptph_no_1 = ptph_no_1;
    this.ptph_no_2 = ptph_no_2;
    this.ptph_no_3 = ptph_no_3;
    this.bo_head_bidt = bo_head_bidt;
    this.luso_clsf = luso_clsf;
    this.wedd_anvy_dd = wedd_anvy_dd;
    this.zip_1 = zip_1;
    this.zip_2 = zip_2;
    this.addr = addr;
    this.dtls_addr = dtls_addr;
    this.nativ = nativ;
    this.hby = hby;
    this.relg = relg;
    this.drink_qunt = drink_qunt;
    this.smok_yn = smok_yn;
    this.bo_head_phot = bo_head_phot;
    this.phot_size = phot_size;
    this.dlco_no = dlco_no;
    this.ern = ern;
    this.bank_nm = bank_nm;
	this.acct_no = acct_no;
	this.rcpm_main_nm = rcpm_main_nm;
  }

  public void setErrcode(String errcode)
  {
    this.errcode = errcode;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public void setBo_head_nm(String bo_head_nm) {
    this.bo_head_nm = bo_head_nm;
  }

  public void setBo_head_prn(String bo_head_prn) {
    this.bo_head_prn = bo_head_prn;
  }

  public void setTel_no_0(String tel_no_0) {
    this.tel_no_0 = tel_no_0;
  }

  public void setTel_no_1(String tel_no_1) {
    this.tel_no_1 = tel_no_1;
  }

  public void setTel_no_2(String tel_no_2) {
    this.tel_no_2 = tel_no_2;
  }

  public void setTel_no_3(String tel_no_3) {
    this.tel_no_3 = tel_no_3;
  }

  public void setPtph_no_1(String ptph_no_1) {
    this.ptph_no_1 = ptph_no_1;
  }

  public void setPtph_no_2(String ptph_no_2) {
    this.ptph_no_2 = ptph_no_2;
  }

  public void setPtph_no_3(String ptph_no_3) {
    this.ptph_no_3 = ptph_no_3;
  }

  public void setBo_head_bidt(String bo_head_bidt) {
    this.bo_head_bidt = bo_head_bidt;
  }

  public void setLuso_clsf(String luso_clsf) {
    this.luso_clsf = luso_clsf;
  }

  public void setWedd_anvy_dd(String wedd_anvy_dd) {
    this.wedd_anvy_dd = wedd_anvy_dd;
  }

  public void setZip_1(String zip_1) {
    this.zip_1 = zip_1;
  }

  public void setZip_2(String zip_2) {
    this.zip_2 = zip_2;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public void setDtls_addr(String dtls_addr) {
    this.dtls_addr = dtls_addr;
  }

  public void setNativ(String nativ) {
    this.nativ = nativ;
  }

  public void setHby(String hby) {
    this.hby = hby;
  }

  public void setRelg(String relg) {
    this.relg = relg;
  }

  public void setDrink_qunt(String drink_qunt) {
    this.drink_qunt = drink_qunt;
  }

  public void setSmok_yn(String smok_yn) {
    this.smok_yn = smok_yn;
  }

  public void setBo_head_phot(byte[] bo_head_phot) {
    this.bo_head_phot = bo_head_phot;
  }

  public void setPhot_size(String phot_size) {
    this.phot_size = phot_size;
  }

  public void setDlco_no(String dlco_no) {
    this.dlco_no = dlco_no;
  }

  public void setErn(String ern) {
    this.ern = ern;
  }
  
  	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

  public String getErrcode() {
    return this.errcode;
  }

  public String getErrmsg() {
    return this.errmsg;
  }

  public String getBo_head_nm() {
    return this.bo_head_nm;
  }

  public String getBo_head_prn() {
    return this.bo_head_prn;
  }

  public String getTel_no_0() {
    return this.tel_no_0;
  }

  public String getTel_no_1() {
    return this.tel_no_1;
  }

  public String getTel_no_2() {
    return this.tel_no_2;
  }

  public String getTel_no_3() {
    return this.tel_no_3;
  }

  public String getPtph_no_1() {
    return this.ptph_no_1;
  }

  public String getPtph_no_2() {
    return this.ptph_no_2;
  }

  public String getPtph_no_3() {
    return this.ptph_no_3;
  }

  public String getBo_head_bidt() {
    return this.bo_head_bidt;
  }

  public String getLuso_clsf() {
    return this.luso_clsf;
  }

  public String getWedd_anvy_dd() {
    return this.wedd_anvy_dd;
  }

  public String getZip_1() {
    return this.zip_1;
  }

  public String getZip_2() {
    return this.zip_2;
  }

  public String getAddr() {
    return this.addr;
  }

  public String getDtls_addr() {
    return this.dtls_addr;
  }

  public String getNativ() {
    return this.nativ;
  }

  public String getHby() {
    return this.hby;
  }

  public String getRelg() {
    return this.relg;
  }

  public String getDrink_qunt() {
    return this.drink_qunt;
  }

  public String getSmok_yn() {
    return this.smok_yn;
  }

  public byte[] getBo_head_phot() {
    return this.bo_head_phot;
  }

  public String getPhot_size() {
    return this.phot_size;
  }

  public String getDlco_no() {
    return this.dlco_no;
  }

  public String getErn() {
    return this.ern;
  }
  
  	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

  public void getValues(CallableStatement cstmt) throws SQLException
  {
    this.errcode = Util.checkString(cstmt.getString(1));
    this.errmsg = Util.checkString(cstmt.getString(2));
    if (!"".equals(this.errcode)) return;
    this.bo_head_nm = Util.checkString(cstmt.getString(5));
    this.bo_head_prn = Util.checkString(cstmt.getString(6));
    this.tel_no_0 = Util.checkString(cstmt.getString(7));
    this.tel_no_1 = Util.checkString(cstmt.getString(8));
    this.tel_no_2 = Util.checkString(cstmt.getString(9));
    this.tel_no_3 = Util.checkString(cstmt.getString(10));
    this.ptph_no_1 = Util.checkString(cstmt.getString(11));
    this.ptph_no_2 = Util.checkString(cstmt.getString(12));
    this.ptph_no_3 = Util.checkString(cstmt.getString(13));
    this.bo_head_bidt = Util.checkString(cstmt.getString(14));
    this.luso_clsf = Util.checkString(cstmt.getString(15));
    this.wedd_anvy_dd = Util.checkString(cstmt.getString(16));
    this.zip_1 = Util.checkString(cstmt.getString(17));
    this.zip_2 = Util.checkString(cstmt.getString(18));
    this.addr = Util.checkString(cstmt.getString(19));
    this.dtls_addr = Util.checkString(cstmt.getString(20));
    this.nativ = Util.checkString(cstmt.getString(21));
    this.hby = Util.checkString(cstmt.getString(22));
    this.relg = Util.checkString(cstmt.getString(23));
    this.drink_qunt = Util.checkString(cstmt.getString(24));
    this.smok_yn = Util.checkString(cstmt.getString(25));
    this.dlco_no = Util.checkString(cstmt.getString(28));
    this.ern = Util.checkString(cstmt.getString(29));
    this.bank_nm = Util.checkString(cstmt.getString(30));
    this.acct_no = Util.checkString(cstmt.getString(31));
    this.rcpm_main_nm = Util.checkString(cstmt.getString(32));

    Blob blob = cstmt.getBlob(26);
    if (blob != null) this.bo_head_phot = blob.getBytes(1L, (int)blob.length());

    this.phot_size = Util.checkString(cstmt.getString(27));
    ResultSet rset0 = (ResultSet)cstmt.getObject(33);
    while (rset0.next()) {
      SE_BOI_1030_SBOHEADHSTYCURRecord rec = new SE_BOI_1030_SBOHEADHSTYCURRecord();
      rec.hsty_seq = Util.checkString(rset0.getString("hsty_seq"));
      rec.yymm = Util.checkString(rset0.getString("yymm"));
      rec.hsty_matt = Util.checkString(rset0.getString("hsty_matt"));
      this.boheadhstycur.add(rec);
    }
    ResultSet rset1 = (ResultSet)cstmt.getObject(34);
    while (rset1.next()) {
      SE_BOI_1030_SBOHEADFAMCURRecord rec = new SE_BOI_1030_SBOHEADFAMCURRecord();
      rec.faml_seq = Util.checkString(rset1.getString("faml_seq"));
      rec.flnm = Util.checkString(rset1.getString("flnm"));
      rec.faml_rshp_cd = Util.checkString(rset1.getString("faml_rshp_cd"));
      rec.bidt = Util.checkString(rset1.getString("bidt"));
      rec.luso_clsf = Util.checkString(rset1.getString("luso_clsf"));
      this.boheadfamcur.add(rec);
    }
    ResultSet rset2 = (ResultSet)cstmt.getObject(35);
    while (rset2.next()) {
      SE_BOI_1030_SBOHEADIDEACURRecord rec = new SE_BOI_1030_SBOHEADIDEACURRecord();
      rec.idea_seq = Util.checkString(rset2.getString("idea_seq"));
      rec.make_dt = Util.checkString(rset2.getString("make_dt"));
      rec.make_pers_nm = Util.checkString(rset2.getString("make_pers_nm"));
      rec.idea = Util.checkString(rset2.getString("idea"));
      this.boheadideacur.add(rec);
    }
  }
}