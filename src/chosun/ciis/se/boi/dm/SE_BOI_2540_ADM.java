/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2540_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String area_cd;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String bank_cd;
	public String mode_ar;
	public String area_cd_ar;
	public String bo_cdseq_ar;
	public String chrg_pers_ar;
	public String amt4_ar;
	public String rcpm_shet_no_ar;
	public String rmtt_dt_ar;
	public String rmtt_plac_ar;
	public String biz_reg_no_ar;
	public String bank_id_ar;
	public String acct_num_ar;
	public String tran_date_seq_ar;
	public String tran_amt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_2540_ADM(){}
	public SE_BOI_2540_ADM(String cmpy_cd, String accflag, String area_cd, String occr_dt, String slip_clsf, String seq, String bank_cd, String mode_ar, String area_cd_ar, String bo_cdseq_ar, String chrg_pers_ar, String amt4_ar, String rcpm_shet_no_ar, String rmtt_dt_ar, String rmtt_plac_ar, String biz_reg_no_ar, String bank_id_ar, String acct_num_ar, String tran_date_seq_ar, String tran_amt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.area_cd = area_cd;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.bank_cd = bank_cd;
		this.mode_ar = mode_ar;
		this.area_cd_ar = area_cd_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.amt4_ar = amt4_ar;
		this.rcpm_shet_no_ar = rcpm_shet_no_ar;
		this.rmtt_dt_ar = rmtt_dt_ar;
		this.rmtt_plac_ar = rmtt_plac_ar;
		this.biz_reg_no_ar = biz_reg_no_ar;
		this.bank_id_ar = bank_id_ar;
		this.acct_num_ar = acct_num_ar;
		this.tran_date_seq_ar = tran_date_seq_ar;
		this.tran_amt_ar = tran_amt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setArea_cd_ar(String area_cd_ar){
		this.area_cd_ar = area_cd_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setChrg_pers_ar(String chrg_pers_ar){
		this.chrg_pers_ar = chrg_pers_ar;
	}

	public void setAmt4_ar(String amt4_ar){
		this.amt4_ar = amt4_ar;
	}

	public void setRcpm_shet_no_ar(String rcpm_shet_no_ar){
		this.rcpm_shet_no_ar = rcpm_shet_no_ar;
	}

	public void setRmtt_dt_ar(String rmtt_dt_ar){
		this.rmtt_dt_ar = rmtt_dt_ar;
	}

	public void setRmtt_plac_ar(String rmtt_plac_ar){
		this.rmtt_plac_ar = rmtt_plac_ar;
	}

	public void setBiz_reg_no_ar(String biz_reg_no_ar){
		this.biz_reg_no_ar = biz_reg_no_ar;
	}

	public void setBank_id_ar(String bank_id_ar){
		this.bank_id_ar = bank_id_ar;
	}

	public void setAcct_num_ar(String acct_num_ar){
		this.acct_num_ar = acct_num_ar;
	}

	public void setTran_date_seq_ar(String tran_date_seq_ar){
		this.tran_date_seq_ar = tran_date_seq_ar;
	}

	public void setTran_amt_ar(String tran_amt_ar){
		this.tran_amt_ar = tran_amt_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getArea_cd_ar(){
		return this.area_cd_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getChrg_pers_ar(){
		return this.chrg_pers_ar;
	}

	public String getAmt4_ar(){
		return this.amt4_ar;
	}

	public String getRcpm_shet_no_ar(){
		return this.rcpm_shet_no_ar;
	}

	public String getRmtt_dt_ar(){
		return this.rmtt_dt_ar;
	}

	public String getRmtt_plac_ar(){
		return this.rmtt_plac_ar;
	}

	public String getBiz_reg_no_ar(){
		return this.biz_reg_no_ar;
	}

	public String getBank_id_ar(){
		return this.bank_id_ar;
	}

	public String getAcct_num_ar(){
		return this.acct_num_ar;
	}

	public String getTran_date_seq_ar(){
		return this.tran_date_seq_ar;
	}

	public String getTran_amt_ar(){
		return this.tran_amt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2540_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2540_ADM dm = (SE_BOI_2540_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.slip_clsf);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.bank_cd);
		cstmt.setString(10, dm.mode_ar);
		cstmt.setString(11, dm.area_cd_ar);
		cstmt.setString(12, dm.bo_cdseq_ar);
		cstmt.setString(13, dm.chrg_pers_ar);
		cstmt.setString(14, dm.amt4_ar);
		cstmt.setString(15, dm.rcpm_shet_no_ar);
		cstmt.setString(16, dm.rmtt_dt_ar);
		cstmt.setString(17, dm.rmtt_plac_ar);
		cstmt.setString(18, dm.biz_reg_no_ar);
		cstmt.setString(19, dm.bank_id_ar);
		cstmt.setString(20, dm.acct_num_ar);
		cstmt.setString(21, dm.tran_date_seq_ar);
		cstmt.setString(22, dm.tran_amt_ar);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2540_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("area_cd_ar = " + getArea_cd_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("chrg_pers_ar = " + getChrg_pers_ar());
        System.out.println("amt4_ar = " + getAmt4_ar());
        System.out.println("rcpm_shet_no_ar = " + getRcpm_shet_no_ar());
        System.out.println("rmtt_dt_ar = " + getRmtt_dt_ar());
        System.out.println("rmtt_plac_ar = " + getRmtt_plac_ar());
        System.out.println("biz_reg_no_ar = " + getBiz_reg_no_ar());
        System.out.println("bank_id_ar = " + getBank_id_ar());
        System.out.println("acct_num_ar = " + getAcct_num_ar());
        System.out.println("tran_date_seq_ar = " + getTran_date_seq_ar());
        System.out.println("tran_amt_ar = " + getTran_amt_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String area_cd_ar = req.getParameter("area_cd_ar");
if( area_cd_ar == null){
	System.out.println(this.toString+" : area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd_ar is "+area_cd_ar );
}
String bo_cdseq_ar = req.getParameter("bo_cdseq_ar");
if( bo_cdseq_ar == null){
	System.out.println(this.toString+" : bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_ar is "+bo_cdseq_ar );
}
String chrg_pers_ar = req.getParameter("chrg_pers_ar");
if( chrg_pers_ar == null){
	System.out.println(this.toString+" : chrg_pers_ar is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_ar is "+chrg_pers_ar );
}
String amt4_ar = req.getParameter("amt4_ar");
if( amt4_ar == null){
	System.out.println(this.toString+" : amt4_ar is null" );
}else{
	System.out.println(this.toString+" : amt4_ar is "+amt4_ar );
}
String rcpm_shet_no_ar = req.getParameter("rcpm_shet_no_ar");
if( rcpm_shet_no_ar == null){
	System.out.println(this.toString+" : rcpm_shet_no_ar is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_ar is "+rcpm_shet_no_ar );
}
String rmtt_dt_ar = req.getParameter("rmtt_dt_ar");
if( rmtt_dt_ar == null){
	System.out.println(this.toString+" : rmtt_dt_ar is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt_ar is "+rmtt_dt_ar );
}
String rmtt_plac_ar = req.getParameter("rmtt_plac_ar");
if( rmtt_plac_ar == null){
	System.out.println(this.toString+" : rmtt_plac_ar is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac_ar is "+rmtt_plac_ar );
}
String biz_reg_no_ar = req.getParameter("biz_reg_no_ar");
if( biz_reg_no_ar == null){
	System.out.println(this.toString+" : biz_reg_no_ar is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no_ar is "+biz_reg_no_ar );
}
String bank_id_ar = req.getParameter("bank_id_ar");
if( bank_id_ar == null){
	System.out.println(this.toString+" : bank_id_ar is null" );
}else{
	System.out.println(this.toString+" : bank_id_ar is "+bank_id_ar );
}
String acct_num_ar = req.getParameter("acct_num_ar");
if( acct_num_ar == null){
	System.out.println(this.toString+" : acct_num_ar is null" );
}else{
	System.out.println(this.toString+" : acct_num_ar is "+acct_num_ar );
}
String tran_date_seq_ar = req.getParameter("tran_date_seq_ar");
if( tran_date_seq_ar == null){
	System.out.println(this.toString+" : tran_date_seq_ar is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq_ar is "+tran_date_seq_ar );
}
String tran_amt_ar = req.getParameter("tran_amt_ar");
if( tran_amt_ar == null){
	System.out.println(this.toString+" : tran_amt_ar is null" );
}else{
	System.out.println(this.toString+" : tran_amt_ar is "+tran_amt_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String amt4_ar = Util.checkString(req.getParameter("amt4_ar"));
String rcpm_shet_no_ar = Util.checkString(req.getParameter("rcpm_shet_no_ar"));
String rmtt_dt_ar = Util.checkString(req.getParameter("rmtt_dt_ar"));
String rmtt_plac_ar = Util.checkString(req.getParameter("rmtt_plac_ar"));
String biz_reg_no_ar = Util.checkString(req.getParameter("biz_reg_no_ar"));
String bank_id_ar = Util.checkString(req.getParameter("bank_id_ar"));
String acct_num_ar = Util.checkString(req.getParameter("acct_num_ar"));
String tran_date_seq_ar = Util.checkString(req.getParameter("tran_date_seq_ar"));
String tran_amt_ar = Util.checkString(req.getParameter("tran_amt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String amt4_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt4_ar")));
String rcpm_shet_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_ar")));
String rmtt_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt_ar")));
String rmtt_plac_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac_ar")));
String biz_reg_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no_ar")));
String bank_id_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id_ar")));
String acct_num_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num_ar")));
String tran_date_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq_ar")));
String tran_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setArea_cd(area_cd);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setBank_cd(bank_cd);
dm.setMode_ar(mode_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setAmt4_ar(amt4_ar);
dm.setRcpm_shet_no_ar(rcpm_shet_no_ar);
dm.setRmtt_dt_ar(rmtt_dt_ar);
dm.setRmtt_plac_ar(rmtt_plac_ar);
dm.setBiz_reg_no_ar(biz_reg_no_ar);
dm.setBank_id_ar(bank_id_ar);
dm.setAcct_num_ar(acct_num_ar);
dm.setTran_date_seq_ar(tran_date_seq_ar);
dm.setTran_amt_ar(tran_amt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 21:19:26 KST 2009 */