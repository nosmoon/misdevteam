/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대사업-입출금관리
* 작성일자 : 2009.06.04
* 작성자 : 최승구
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 선급정리로직 추가
* 수정자 : 노상현
* 수정일자 : 2013-05-06
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 임대사업-입출금관리
 */

public class AS_LEAS_1311_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String rcpm_shet_no;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String inout_clsf;
	public String inout_acct_clsf;
	public String gurt_payo_clsf;
	public String remk;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String gurt_rcpm_amt;
	public String cash_sub_seq;
	public String cash_rcpm_amt;
	public String adpay_expn_no;
	public String mode;
	public String clam_yymm;
	public String clam_seq;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;

	public AS_LEAS_1311_IDM(){}
	public AS_LEAS_1311_IDM(String cmpy_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String rcpm_shet_no, String dlco_clsf_cd, String dlco_ern, String inout_clsf, String inout_acct_clsf, String gurt_payo_clsf, String remk, String bldg_cd, String cntr_yy, String cntr_seq, String gurt_rcpm_amt, String cash_sub_seq, String cash_rcpm_amt, String adpay_expn_no, String mode, String clam_yymm, String clam_seq, String leas_rcpm_amt, String mang_rcpm_amt, String vat_rcpm_amt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.rcpm_shet_no = rcpm_shet_no;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_ern = dlco_ern;
		this.inout_clsf = inout_clsf;
		this.inout_acct_clsf = inout_acct_clsf;
		this.gurt_payo_clsf = gurt_payo_clsf;
		this.remk = remk;
		this.bldg_cd = bldg_cd;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
		this.gurt_rcpm_amt = gurt_rcpm_amt;
		this.cash_sub_seq = cash_sub_seq;
		this.cash_rcpm_amt = cash_rcpm_amt;
		this.adpay_expn_no = adpay_expn_no;
		this.mode = mode;
		this.clam_yymm = clam_yymm;
		this.clam_seq = clam_seq;
		this.leas_rcpm_amt = leas_rcpm_amt;
		this.mang_rcpm_amt = mang_rcpm_amt;
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public void setInout_acct_clsf(String inout_acct_clsf){
		this.inout_acct_clsf = inout_acct_clsf;
	}

	public void setGurt_payo_clsf(String gurt_payo_clsf){
		this.gurt_payo_clsf = gurt_payo_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setGurt_rcpm_amt(String gurt_rcpm_amt){
		this.gurt_rcpm_amt = gurt_rcpm_amt;
	}

	public void setCash_sub_seq(String cash_sub_seq){
		this.cash_sub_seq = cash_sub_seq;
	}

	public void setCash_rcpm_amt(String cash_rcpm_amt){
		this.cash_rcpm_amt = cash_rcpm_amt;
	}

	public void setAdpay_expn_no(String adpay_expn_no){
		this.adpay_expn_no = adpay_expn_no;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setLeas_rcpm_amt(String leas_rcpm_amt){
		this.leas_rcpm_amt = leas_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setVat_rcpm_amt(String vat_rcpm_amt){
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getInout_acct_clsf(){
		return this.inout_acct_clsf;
	}

	public String getGurt_payo_clsf(){
		return this.gurt_payo_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getGurt_rcpm_amt(){
		return this.gurt_rcpm_amt;
	}

	public String getCash_sub_seq(){
		return this.cash_sub_seq;
	}

	public String getCash_rcpm_amt(){
		return this.cash_rcpm_amt;
	}

	public String getAdpay_expn_no(){
		return this.adpay_expn_no;
	}

	public String getMode(){
		return this.mode;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getLeas_rcpm_amt(){
		return this.leas_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getVat_rcpm_amt(){
		return this.vat_rcpm_amt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1311_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1311_IDM dm = (AS_LEAS_1311_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipadd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.rcpm_shet_no);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_ern);
		cstmt.setString(10, dm.inout_clsf);
		cstmt.setString(11, dm.inout_acct_clsf);
		cstmt.setString(12, dm.gurt_payo_clsf);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.bldg_cd);
		cstmt.setString(15, dm.cntr_yy);
		cstmt.setString(16, dm.cntr_seq);
		cstmt.setString(17, dm.gurt_rcpm_amt);
		cstmt.setString(18, dm.cash_sub_seq);
		cstmt.setString(19, dm.cash_rcpm_amt);
		cstmt.setString(20, dm.adpay_expn_no);
		cstmt.setString(21, dm.mode);
		cstmt.setString(22, dm.clam_yymm);
		cstmt.setString(23, dm.clam_seq);
		cstmt.setString(24, dm.leas_rcpm_amt);
		cstmt.setString(25, dm.mang_rcpm_amt);
		cstmt.setString(26, dm.vat_rcpm_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1311_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_ern = [" + getDlco_ern() + "]");
		System.out.println("inout_clsf = [" + getInout_clsf() + "]");
		System.out.println("inout_acct_clsf = [" + getInout_acct_clsf() + "]");
		System.out.println("gurt_payo_clsf = [" + getGurt_payo_clsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("gurt_rcpm_amt = [" + getGurt_rcpm_amt() + "]");
		System.out.println("cash_sub_seq = [" + getCash_sub_seq() + "]");
		System.out.println("cash_rcpm_amt = [" + getCash_rcpm_amt() + "]");
		System.out.println("adpay_expn_no = [" + getAdpay_expn_no() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("clam_yymm = [" + getClam_yymm() + "]");
		System.out.println("clam_seq = [" + getClam_seq() + "]");
		System.out.println("leas_rcpm_amt = [" + getLeas_rcpm_amt() + "]");
		System.out.println("mang_rcpm_amt = [" + getMang_rcpm_amt() + "]");
		System.out.println("vat_rcpm_amt = [" + getVat_rcpm_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_ern = req.getParameter("dlco_ern");
if( dlco_ern == null){
	System.out.println(this.toString+" : dlco_ern is null" );
}else{
	System.out.println(this.toString+" : dlco_ern is "+dlco_ern );
}
String inout_clsf = req.getParameter("inout_clsf");
if( inout_clsf == null){
	System.out.println(this.toString+" : inout_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_clsf is "+inout_clsf );
}
String inout_acct_clsf = req.getParameter("inout_acct_clsf");
if( inout_acct_clsf == null){
	System.out.println(this.toString+" : inout_acct_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_acct_clsf is "+inout_acct_clsf );
}
String gurt_payo_clsf = req.getParameter("gurt_payo_clsf");
if( gurt_payo_clsf == null){
	System.out.println(this.toString+" : gurt_payo_clsf is null" );
}else{
	System.out.println(this.toString+" : gurt_payo_clsf is "+gurt_payo_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String cntr_yy = req.getParameter("cntr_yy");
if( cntr_yy == null){
	System.out.println(this.toString+" : cntr_yy is null" );
}else{
	System.out.println(this.toString+" : cntr_yy is "+cntr_yy );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
String gurt_rcpm_amt = req.getParameter("gurt_rcpm_amt");
if( gurt_rcpm_amt == null){
	System.out.println(this.toString+" : gurt_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : gurt_rcpm_amt is "+gurt_rcpm_amt );
}
String cash_sub_seq = req.getParameter("cash_sub_seq");
if( cash_sub_seq == null){
	System.out.println(this.toString+" : cash_sub_seq is null" );
}else{
	System.out.println(this.toString+" : cash_sub_seq is "+cash_sub_seq );
}
String cash_rcpm_amt = req.getParameter("cash_rcpm_amt");
if( cash_rcpm_amt == null){
	System.out.println(this.toString+" : cash_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : cash_rcpm_amt is "+cash_rcpm_amt );
}
String adpay_expn_no = req.getParameter("adpay_expn_no");
if( adpay_expn_no == null){
	System.out.println(this.toString+" : adpay_expn_no is null" );
}else{
	System.out.println(this.toString+" : adpay_expn_no is "+adpay_expn_no );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String clam_yymm = req.getParameter("clam_yymm");
if( clam_yymm == null){
	System.out.println(this.toString+" : clam_yymm is null" );
}else{
	System.out.println(this.toString+" : clam_yymm is "+clam_yymm );
}
String clam_seq = req.getParameter("clam_seq");
if( clam_seq == null){
	System.out.println(this.toString+" : clam_seq is null" );
}else{
	System.out.println(this.toString+" : clam_seq is "+clam_seq );
}
String leas_rcpm_amt = req.getParameter("leas_rcpm_amt");
if( leas_rcpm_amt == null){
	System.out.println(this.toString+" : leas_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : leas_rcpm_amt is "+leas_rcpm_amt );
}
String mang_rcpm_amt = req.getParameter("mang_rcpm_amt");
if( mang_rcpm_amt == null){
	System.out.println(this.toString+" : mang_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : mang_rcpm_amt is "+mang_rcpm_amt );
}
String vat_rcpm_amt = req.getParameter("vat_rcpm_amt");
if( vat_rcpm_amt == null){
	System.out.println(this.toString+" : vat_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : vat_rcpm_amt is "+vat_rcpm_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
String inout_acct_clsf = Util.checkString(req.getParameter("inout_acct_clsf"));
String gurt_payo_clsf = Util.checkString(req.getParameter("gurt_payo_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));
String cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
String cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
String adpay_expn_no = Util.checkString(req.getParameter("adpay_expn_no"));
String mode = Util.checkString(req.getParameter("mode"));
String clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
String clam_seq = Util.checkString(req.getParameter("clam_seq"));
String leas_rcpm_amt = Util.checkString(req.getParameter("leas_rcpm_amt"));
String mang_rcpm_amt = Util.checkString(req.getParameter("mang_rcpm_amt"));
String vat_rcpm_amt = Util.checkString(req.getParameter("vat_rcpm_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String inout_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_clsf")));
String inout_acct_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_acct_clsf")));
String gurt_payo_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_payo_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String gurt_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_rcpm_amt")));
String cash_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_sub_seq")));
String cash_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpm_amt")));
String adpay_expn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_expn_no")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String clam_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm")));
String clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_seq")));
String leas_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_rcpm_amt")));
String mang_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_rcpm_amt")));
String vat_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_rcpm_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_ern(dlco_ern);
dm.setInout_clsf(inout_clsf);
dm.setInout_acct_clsf(inout_acct_clsf);
dm.setGurt_payo_clsf(gurt_payo_clsf);
dm.setRemk(remk);
dm.setBldg_cd(bldg_cd);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
dm.setGurt_rcpm_amt(gurt_rcpm_amt);
dm.setCash_sub_seq(cash_sub_seq);
dm.setCash_rcpm_amt(cash_rcpm_amt);
dm.setAdpay_expn_no(adpay_expn_no);
dm.setMode(mode);
dm.setClam_yymm(clam_yymm);
dm.setClam_seq(clam_seq);
dm.setLeas_rcpm_amt(leas_rcpm_amt);
dm.setMang_rcpm_amt(mang_rcpm_amt);
dm.setVat_rcpm_amt(vat_rcpm_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 06 19:36:20 KST 2013 */