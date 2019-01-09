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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1312_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String occr_dt;
	public String occr_seq;
	public String rcpm_shet_no;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String inout_clsf;
	public String remk;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String gurt_rcpm_amt;
	public String cash_sub_seq;
	public String cash_rcpm_amt;
	public String mode;
	public String clam_yymm;
	public String clam_seq;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;

	public AS_LEAS_1312_ADM(){}
	public AS_LEAS_1312_ADM(String mst_mode, String cmpy_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String occr_dt, String occr_seq, String rcpm_shet_no, String dlco_clsf_cd, String dlco_ern, String inout_clsf, String remk, String bldg_cd, String cntr_yy, String cntr_seq, String gurt_rcpm_amt, String cash_sub_seq, String cash_rcpm_amt, String mode, String clam_yymm, String clam_seq, String leas_rcpm_amt, String mang_rcpm_amt, String vat_rcpm_amt){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.rcpm_shet_no = rcpm_shet_no;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_ern = dlco_ern;
		this.inout_clsf = inout_clsf;
		this.remk = remk;
		this.bldg_cd = bldg_cd;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
		this.gurt_rcpm_amt = gurt_rcpm_amt;
		this.cash_sub_seq = cash_sub_seq;
		this.cash_rcpm_amt = cash_rcpm_amt;
		this.mode = mode;
		this.clam_yymm = clam_yymm;
		this.clam_seq = clam_seq;
		this.leas_rcpm_amt = leas_rcpm_amt;
		this.mang_rcpm_amt = mang_rcpm_amt;
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
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

	public String getMst_mode(){
		return this.mst_mode;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
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
		 return "{ call MISAST.SP_AS_LEAS_1312_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1312_ADM dm = (AS_LEAS_1312_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.chg_pers);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.occr_seq);
		cstmt.setString(10, dm.rcpm_shet_no);
		cstmt.setString(11, dm.dlco_clsf_cd);
		cstmt.setString(12, dm.dlco_ern);
		cstmt.setString(13, dm.inout_clsf);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.bldg_cd);
		cstmt.setString(16, dm.cntr_yy);
		cstmt.setString(17, dm.cntr_seq);
		cstmt.setString(18, dm.gurt_rcpm_amt);
		cstmt.setString(19, dm.cash_sub_seq);
		cstmt.setString(20, dm.cash_rcpm_amt);
		cstmt.setString(21, dm.mode);
		cstmt.setString(22, dm.clam_yymm);
		cstmt.setString(23, dm.clam_seq);
		cstmt.setString(24, dm.leas_rcpm_amt);
		cstmt.setString(25, dm.mang_rcpm_amt);
		cstmt.setString(26, dm.vat_rcpm_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1312_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mst_mode = [" + getMst_mode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_ern = [" + getDlco_ern() + "]");
		System.out.println("inout_clsf = [" + getInout_clsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("gurt_rcpm_amt = [" + getGurt_rcpm_amt() + "]");
		System.out.println("cash_sub_seq = [" + getCash_sub_seq() + "]");
		System.out.println("cash_rcpm_amt = [" + getCash_rcpm_amt() + "]");
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

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
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

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));
String cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
String cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
String mode = Util.checkString(req.getParameter("mode"));
String clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
String clam_seq = Util.checkString(req.getParameter("clam_seq"));
String leas_rcpm_amt = Util.checkString(req.getParameter("leas_rcpm_amt"));
String mang_rcpm_amt = Util.checkString(req.getParameter("mang_rcpm_amt"));
String vat_rcpm_amt = Util.checkString(req.getParameter("vat_rcpm_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String inout_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String gurt_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_rcpm_amt")));
String cash_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_sub_seq")));
String cash_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpm_amt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String clam_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm")));
String clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_seq")));
String leas_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_rcpm_amt")));
String mang_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_rcpm_amt")));
String vat_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_rcpm_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_ern(dlco_ern);
dm.setInout_clsf(inout_clsf);
dm.setRemk(remk);
dm.setBldg_cd(bldg_cd);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
dm.setGurt_rcpm_amt(gurt_rcpm_amt);
dm.setCash_sub_seq(cash_sub_seq);
dm.setCash_rcpm_amt(cash_rcpm_amt);
dm.setMode(mode);
dm.setClam_yymm(clam_yymm);
dm.setClam_seq(clam_seq);
dm.setLeas_rcpm_amt(leas_rcpm_amt);
dm.setMang_rcpm_amt(mang_rcpm_amt);
dm.setVat_rcpm_amt(vat_rcpm_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 17:34:49 KST 2009 */