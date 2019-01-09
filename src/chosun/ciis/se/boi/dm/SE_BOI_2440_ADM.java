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


public class SE_BOI_2440_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String tot_amt;
	public String yymm;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String mode_ar;
	public String area_cd_ar;
	public String bo_cdseq_ar;
	public String chrg_pers_ar;
	public String amt3_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_2440_ADM(){}
	public SE_BOI_2440_ADM(String cmpy_cd, String accflag, String tot_amt, String yymm, String occr_dt, String slip_clsf, String seq, String mode_ar, String area_cd_ar, String bo_cdseq_ar, String chrg_pers_ar, String amt3_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.tot_amt = tot_amt;
		this.yymm = yymm;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.mode_ar = mode_ar;
		this.area_cd_ar = area_cd_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.amt3_ar = amt3_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setAmt3_ar(String amt3_ar){
		this.amt3_ar = amt3_ar;
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

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getAmt3_ar(){
		return this.amt3_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2440_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2440_ADM dm = (SE_BOI_2440_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.tot_amt);
		cstmt.setString(6, dm.yymm);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.slip_clsf);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.mode_ar);
		cstmt.setString(11, dm.area_cd_ar);
		cstmt.setString(12, dm.bo_cdseq_ar);
		cstmt.setString(13, dm.chrg_pers_ar);
		cstmt.setString(14, dm.amt3_ar);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2440_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("tot_amt = " + getTot_amt());
        System.out.println("yymm = " + getYymm());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("area_cd_ar = " + getArea_cd_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("chrg_pers_ar = " + getChrg_pers_ar());
        System.out.println("amt3_ar = " + getAmt3_ar());
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
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
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
String amt3_ar = req.getParameter("amt3_ar");
if( amt3_ar == null){
	System.out.println(this.toString+" : amt3_ar is null" );
}else{
	System.out.println(this.toString+" : amt3_ar is "+amt3_ar );
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
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String yymm = Util.checkString(req.getParameter("yymm"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String amt3_ar = Util.checkString(req.getParameter("amt3_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String amt3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt3_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setTot_amt(tot_amt);
dm.setYymm(yymm);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setMode_ar(mode_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setAmt3_ar(amt3_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 11:40:47 KST 2009 */