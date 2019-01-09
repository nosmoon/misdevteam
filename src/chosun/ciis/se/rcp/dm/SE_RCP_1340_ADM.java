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


public class SE_RCP_1340_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String area_cd;
	public String altn_trgt;
	public String mode_ar;
	public String bo_cdseq_ar;
	public String chrg_pers_ar;
	public String amt1_ar;
	public String amt2_ar;
	public String amt3_ar;
	public String amt4_ar;
	public String amt5_ar;
	public String amt6_ar;
	public String misuamt_ar;
	public String occr_slip_clsf_ar;
	public String occr_slip_no_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_1340_ADM(){}
	public SE_RCP_1340_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String area_cd, String altn_trgt, String mode_ar, String bo_cdseq_ar, String chrg_pers_ar, String amt1_ar, String amt2_ar, String amt3_ar, String amt4_ar, String amt5_ar, String amt6_ar, String misuamt_ar, String occr_slip_clsf_ar, String occr_slip_no_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.area_cd = area_cd;
		this.altn_trgt = altn_trgt;
		this.mode_ar = mode_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.amt1_ar = amt1_ar;
		this.amt2_ar = amt2_ar;
		this.amt3_ar = amt3_ar;
		this.amt4_ar = amt4_ar;
		this.amt5_ar = amt5_ar;
		this.amt6_ar = amt6_ar;
		this.misuamt_ar = misuamt_ar;
		this.occr_slip_clsf_ar = occr_slip_clsf_ar;
		this.occr_slip_no_ar = occr_slip_no_ar;
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

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setAltn_trgt(String altn_trgt){
		this.altn_trgt = altn_trgt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setChrg_pers_ar(String chrg_pers_ar){
		this.chrg_pers_ar = chrg_pers_ar;
	}

	public void setAmt1_ar(String amt1_ar){
		this.amt1_ar = amt1_ar;
	}

	public void setAmt2_ar(String amt2_ar){
		this.amt2_ar = amt2_ar;
	}

	public void setAmt3_ar(String amt3_ar){
		this.amt3_ar = amt3_ar;
	}

	public void setAmt4_ar(String amt4_ar){
		this.amt4_ar = amt4_ar;
	}

	public void setAmt5_ar(String amt5_ar){
		this.amt5_ar = amt5_ar;
	}

	public void setAmt6_ar(String amt6_ar){
		this.amt6_ar = amt6_ar;
	}

	public void setMisuamt_ar(String misuamt_ar){
		this.misuamt_ar = misuamt_ar;
	}

	public void setOccr_slip_clsf_ar(String occr_slip_clsf_ar){
		this.occr_slip_clsf_ar = occr_slip_clsf_ar;
	}

	public void setOccr_slip_no_ar(String occr_slip_no_ar){
		this.occr_slip_no_ar = occr_slip_no_ar;
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

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getAltn_trgt(){
		return this.altn_trgt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getChrg_pers_ar(){
		return this.chrg_pers_ar;
	}

	public String getAmt1_ar(){
		return this.amt1_ar;
	}

	public String getAmt2_ar(){
		return this.amt2_ar;
	}

	public String getAmt3_ar(){
		return this.amt3_ar;
	}

	public String getAmt4_ar(){
		return this.amt4_ar;
	}

	public String getAmt5_ar(){
		return this.amt5_ar;
	}

	public String getAmt6_ar(){
		return this.amt6_ar;
	}

	public String getMisuamt_ar(){
		return this.misuamt_ar;
	}

	public String getOccr_slip_clsf_ar(){
		return this.occr_slip_clsf_ar;
	}

	public String getOccr_slip_no_ar(){
		return this.occr_slip_no_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1340_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1340_ADM dm = (SE_RCP_1340_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.area_cd);
		cstmt.setString(9, dm.altn_trgt);
		cstmt.setString(10, dm.mode_ar);
		cstmt.setString(11, dm.bo_cdseq_ar);
		cstmt.setString(12, dm.chrg_pers_ar);
		cstmt.setString(13, dm.amt1_ar);
		cstmt.setString(14, dm.amt2_ar);
		cstmt.setString(15, dm.amt3_ar);
		cstmt.setString(16, dm.amt4_ar);
		cstmt.setString(17, dm.amt5_ar);
		cstmt.setString(18, dm.amt6_ar);
		cstmt.setString(19, dm.misuamt_ar);
		cstmt.setString(20, dm.occr_slip_clsf_ar);
		cstmt.setString(21, dm.occr_slip_no_ar);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1340_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("altn_trgt = " + getAltn_trgt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("chrg_pers_ar = " + getChrg_pers_ar());
        System.out.println("amt1_ar = " + getAmt1_ar());
        System.out.println("amt2_ar = " + getAmt2_ar());
        System.out.println("amt3_ar = " + getAmt3_ar());
        System.out.println("amt4_ar = " + getAmt4_ar());
        System.out.println("amt5_ar = " + getAmt5_ar());
        System.out.println("amt6_ar = " + getAmt6_ar());
        System.out.println("misuamt_ar = " + getMisuamt_ar());
        System.out.println("occr_slip_clsf_ar = " + getOccr_slip_clsf_ar());
        System.out.println("occr_slip_no_ar = " + getOccr_slip_no_ar());
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
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String altn_trgt = req.getParameter("altn_trgt");
if( altn_trgt == null){
	System.out.println(this.toString+" : altn_trgt is null" );
}else{
	System.out.println(this.toString+" : altn_trgt is "+altn_trgt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
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
String amt1_ar = req.getParameter("amt1_ar");
if( amt1_ar == null){
	System.out.println(this.toString+" : amt1_ar is null" );
}else{
	System.out.println(this.toString+" : amt1_ar is "+amt1_ar );
}
String amt2_ar = req.getParameter("amt2_ar");
if( amt2_ar == null){
	System.out.println(this.toString+" : amt2_ar is null" );
}else{
	System.out.println(this.toString+" : amt2_ar is "+amt2_ar );
}
String amt3_ar = req.getParameter("amt3_ar");
if( amt3_ar == null){
	System.out.println(this.toString+" : amt3_ar is null" );
}else{
	System.out.println(this.toString+" : amt3_ar is "+amt3_ar );
}
String amt4_ar = req.getParameter("amt4_ar");
if( amt4_ar == null){
	System.out.println(this.toString+" : amt4_ar is null" );
}else{
	System.out.println(this.toString+" : amt4_ar is "+amt4_ar );
}
String amt5_ar = req.getParameter("amt5_ar");
if( amt5_ar == null){
	System.out.println(this.toString+" : amt5_ar is null" );
}else{
	System.out.println(this.toString+" : amt5_ar is "+amt5_ar );
}
String amt6_ar = req.getParameter("amt6_ar");
if( amt6_ar == null){
	System.out.println(this.toString+" : amt6_ar is null" );
}else{
	System.out.println(this.toString+" : amt6_ar is "+amt6_ar );
}
String misuamt_ar = req.getParameter("misuamt_ar");
if( misuamt_ar == null){
	System.out.println(this.toString+" : misuamt_ar is null" );
}else{
	System.out.println(this.toString+" : misuamt_ar is "+misuamt_ar );
}
String occr_slip_clsf_ar = req.getParameter("occr_slip_clsf_ar");
if( occr_slip_clsf_ar == null){
	System.out.println(this.toString+" : occr_slip_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf_ar is "+occr_slip_clsf_ar );
}
String occr_slip_no_ar = req.getParameter("occr_slip_no_ar");
if( occr_slip_no_ar == null){
	System.out.println(this.toString+" : occr_slip_no_ar is null" );
}else{
	System.out.println(this.toString+" : occr_slip_no_ar is "+occr_slip_no_ar );
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
String area_cd = Util.checkString(req.getParameter("area_cd"));
String altn_trgt = Util.checkString(req.getParameter("altn_trgt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String amt1_ar = Util.checkString(req.getParameter("amt1_ar"));
String amt2_ar = Util.checkString(req.getParameter("amt2_ar"));
String amt3_ar = Util.checkString(req.getParameter("amt3_ar"));
String amt4_ar = Util.checkString(req.getParameter("amt4_ar"));
String amt5_ar = Util.checkString(req.getParameter("amt5_ar"));
String amt6_ar = Util.checkString(req.getParameter("amt6_ar"));
String misuamt_ar = Util.checkString(req.getParameter("misuamt_ar"));
String occr_slip_clsf_ar = Util.checkString(req.getParameter("occr_slip_clsf_ar"));
String occr_slip_no_ar = Util.checkString(req.getParameter("occr_slip_no_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String altn_trgt = Util.Uni2Ksc(Util.checkString(req.getParameter("altn_trgt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String amt1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt1_ar")));
String amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2_ar")));
String amt3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt3_ar")));
String amt4_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt4_ar")));
String amt5_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt5_ar")));
String amt6_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt6_ar")));
String misuamt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("misuamt_ar")));
String occr_slip_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf_ar")));
String occr_slip_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_no_ar")));
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
dm.setArea_cd(area_cd);
dm.setAltn_trgt(altn_trgt);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setAmt1_ar(amt1_ar);
dm.setAmt2_ar(amt2_ar);
dm.setAmt3_ar(amt3_ar);
dm.setAmt4_ar(amt4_ar);
dm.setAmt5_ar(amt5_ar);
dm.setAmt6_ar(amt6_ar);
dm.setMisuamt_ar(misuamt_ar);
dm.setOccr_slip_clsf_ar(occr_slip_clsf_ar);
dm.setOccr_slip_no_ar(occr_slip_no_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 13:06:19 KST 2009 */