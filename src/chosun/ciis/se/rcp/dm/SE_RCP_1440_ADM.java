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


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1440_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String bo_cdseq;
	public String area_cd;
	public String chrg_pers;
	public String hjamt;
	public String rcpm_amt;
	public String budg_cd;
	public String bank_cd;
	public String rmtt_dt;
	public String rmtt_plac;
	public String yhcs;
	public String yhci;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String tran_amt;
	public String acct_tonghwa;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_1440_ADM(){}
	public SE_RCP_1440_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String bo_cdseq, String area_cd, String chrg_pers, String hjamt, String rcpm_amt, String budg_cd, String bank_cd, String rmtt_dt, String rmtt_plac, String yhcs, String yhci, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq, String tran_amt, String acct_tonghwa, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.bo_cdseq = bo_cdseq;
		this.area_cd = area_cd;
		this.chrg_pers = chrg_pers;
		this.hjamt = hjamt;
		this.rcpm_amt = rcpm_amt;
		this.budg_cd = budg_cd;
		this.bank_cd = bank_cd;
		this.rmtt_dt = rmtt_dt;
		this.rmtt_plac = rmtt_plac;
		this.yhcs = yhcs;
		this.yhci = yhci;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
		this.tran_amt = tran_amt;
		this.acct_tonghwa = acct_tonghwa;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
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

	public void setBo_cdseq(String bo_cdseq){
		this.bo_cdseq = bo_cdseq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setHjamt(String hjamt){
		this.hjamt = hjamt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setYhcs(String yhcs){
		this.yhcs = yhcs;
	}

	public void setYhci(String yhci){
		this.yhci = yhci;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setAcct_tonghwa(String acct_tonghwa){
		this.acct_tonghwa = acct_tonghwa;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBo_cdseq(){
		return this.bo_cdseq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getHjamt(){
		return this.hjamt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getYhcs(){
		return this.yhcs;
	}

	public String getYhci(){
		return this.yhci;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getAcct_tonghwa(){
		return this.acct_tonghwa;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1440_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1440_ADM dm = (SE_RCP_1440_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.bo_cdseq);
		cstmt.setString(9, dm.area_cd);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.hjamt);
		cstmt.setString(12, dm.rcpm_amt);
		cstmt.setString(13, dm.budg_cd);
		cstmt.setString(14, dm.bank_cd);
		cstmt.setString(15, dm.rmtt_dt);
		cstmt.setString(16, dm.rmtt_plac);
		cstmt.setString(17, dm.yhcs);
		cstmt.setString(18, dm.yhci);
		cstmt.setString(19, dm.biz_reg_no);
		cstmt.setString(20, dm.bank_id);
		cstmt.setString(21, dm.acct_num);
		cstmt.setString(22, dm.tran_date_seq);
		cstmt.setString(23, dm.tran_amt);
		cstmt.setString(24, dm.acct_tonghwa);
		cstmt.setString(25, dm.incmg_pers);
		cstmt.setString(26, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1440_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("bo_cdseq = " + getBo_cdseq());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("chrg_pers = " + getChrg_pers());
        System.out.println("hjamt = " + getHjamt());
        System.out.println("rcpm_amt = " + getRcpm_amt());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("rmtt_dt = " + getRmtt_dt());
        System.out.println("rmtt_plac = " + getRmtt_plac());
        System.out.println("yhcs = " + getYhcs());
        System.out.println("yhci = " + getYhci());
        System.out.println("biz_reg_no = " + getBiz_reg_no());
        System.out.println("bank_id = " + getBank_id());
        System.out.println("acct_num = " + getAcct_num());
        System.out.println("tran_date_seq = " + getTran_date_seq());
        System.out.println("tran_amt = " + getTran_amt());
        System.out.println("acct_tonghwa = " + getAcct_tonghwa());
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
String bo_cdseq = req.getParameter("bo_cdseq");
if( bo_cdseq == null){
	System.out.println(this.toString+" : bo_cdseq is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq is "+bo_cdseq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String hjamt = req.getParameter("hjamt");
if( hjamt == null){
	System.out.println(this.toString+" : hjamt is null" );
}else{
	System.out.println(this.toString+" : hjamt is "+hjamt );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String rmtt_dt = req.getParameter("rmtt_dt");
if( rmtt_dt == null){
	System.out.println(this.toString+" : rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt is "+rmtt_dt );
}
String rmtt_plac = req.getParameter("rmtt_plac");
if( rmtt_plac == null){
	System.out.println(this.toString+" : rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac is "+rmtt_plac );
}
String yhcs = req.getParameter("yhcs");
if( yhcs == null){
	System.out.println(this.toString+" : yhcs is null" );
}else{
	System.out.println(this.toString+" : yhcs is "+yhcs );
}
String yhci = req.getParameter("yhci");
if( yhci == null){
	System.out.println(this.toString+" : yhci is null" );
}else{
	System.out.println(this.toString+" : yhci is "+yhci );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String acct_tonghwa = req.getParameter("acct_tonghwa");
if( acct_tonghwa == null){
	System.out.println(this.toString+" : acct_tonghwa is null" );
}else{
	System.out.println(this.toString+" : acct_tonghwa is "+acct_tonghwa );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String hjamt = Util.checkString(req.getParameter("hjamt"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
String rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
String yhcs = Util.checkString(req.getParameter("yhcs"));
String yhci = Util.checkString(req.getParameter("yhci"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String acct_tonghwa = Util.checkString(req.getParameter("acct_tonghwa"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bo_cdseq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String hjamt = Util.Uni2Ksc(Util.checkString(req.getParameter("hjamt")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt")));
String rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac")));
String yhcs = Util.Uni2Ksc(Util.checkString(req.getParameter("yhcs")));
String yhci = Util.Uni2Ksc(Util.checkString(req.getParameter("yhci")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String acct_tonghwa = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_tonghwa")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setBo_cdseq(bo_cdseq);
dm.setArea_cd(area_cd);
dm.setChrg_pers(chrg_pers);
dm.setHjamt(hjamt);
dm.setRcpm_amt(rcpm_amt);
dm.setBudg_cd(budg_cd);
dm.setBank_cd(bank_cd);
dm.setRmtt_dt(rmtt_dt);
dm.setRmtt_plac(rmtt_plac);
dm.setYhcs(yhcs);
dm.setYhci(yhci);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
dm.setTran_amt(tran_amt);
dm.setAcct_tonghwa(acct_tonghwa);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 12:05:38 KST 2009 */