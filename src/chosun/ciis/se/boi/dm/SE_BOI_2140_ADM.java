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


public class SE_BOI_2140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String bo_cdseq;
	public String area_cd;
	public String chrg_pers;
	public String amt;
	public String leas_sply_amt_unrcp_occr_dt;
	public String mode_ar;
	public String bo_cdseq2_ar;
	public String area_cd2_ar;
	public String chrg_pers2_ar;
	public String amt2_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_2140_ADM(){}
	public SE_BOI_2140_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String bo_cdseq, String area_cd, String chrg_pers, String amt, String leas_sply_amt_unrcp_occr_dt, String mode_ar, String bo_cdseq2_ar, String area_cd2_ar, String chrg_pers2_ar, String amt2_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.bo_cdseq = bo_cdseq;
		this.area_cd = area_cd;
		this.chrg_pers = chrg_pers;
		this.amt = amt;
		this.leas_sply_amt_unrcp_occr_dt = leas_sply_amt_unrcp_occr_dt;
		this.mode_ar = mode_ar;
		this.bo_cdseq2_ar = bo_cdseq2_ar;
		this.area_cd2_ar = area_cd2_ar;
		this.chrg_pers2_ar = chrg_pers2_ar;
		this.amt2_ar = amt2_ar;
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

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setLeas_sply_amt_unrcp_occr_dt(String leas_sply_amt_unrcp_occr_dt){
		this.leas_sply_amt_unrcp_occr_dt = leas_sply_amt_unrcp_occr_dt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq2_ar(String bo_cdseq2_ar){
		this.bo_cdseq2_ar = bo_cdseq2_ar;
	}

	public void setArea_cd2_ar(String area_cd2_ar){
		this.area_cd2_ar = area_cd2_ar;
	}

	public void setChrg_pers2_ar(String chrg_pers2_ar){
		this.chrg_pers2_ar = chrg_pers2_ar;
	}

	public void setAmt2_ar(String amt2_ar){
		this.amt2_ar = amt2_ar;
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

	public String getAmt(){
		return this.amt;
	}

	public String getLeas_sply_amt_unrcp_occr_dt(){
		return this.leas_sply_amt_unrcp_occr_dt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq2_ar(){
		return this.bo_cdseq2_ar;
	}

	public String getArea_cd2_ar(){
		return this.area_cd2_ar;
	}

	public String getChrg_pers2_ar(){
		return this.chrg_pers2_ar;
	}

	public String getAmt2_ar(){
		return this.amt2_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2140_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2140_ADM dm = (SE_BOI_2140_ADM)bdm;
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
		cstmt.setString(11, dm.amt);
		cstmt.setString(12, dm.leas_sply_amt_unrcp_occr_dt);
		cstmt.setString(13, dm.mode_ar);
		cstmt.setString(14, dm.bo_cdseq2_ar);
		cstmt.setString(15, dm.area_cd2_ar);
		cstmt.setString(16, dm.chrg_pers2_ar);
		cstmt.setString(17, dm.amt2_ar);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2140_ADataSet();
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
        System.out.println("amt = " + getAmt());
        System.out.println("leas_sply_amt_unrcp_occr_dt = " + getLeas_sply_amt_unrcp_occr_dt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq2_ar = " + getBo_cdseq2_ar());
        System.out.println("area_cd2_ar = " + getArea_cd2_ar());
        System.out.println("chrg_pers2_ar = " + getChrg_pers2_ar());
        System.out.println("amt2_ar = " + getAmt2_ar());
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
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String leas_sply_amt_unrcp_occr_dt = req.getParameter("leas_sply_amt_unrcp_occr_dt");
if( leas_sply_amt_unrcp_occr_dt == null){
	System.out.println(this.toString+" : leas_sply_amt_unrcp_occr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_sply_amt_unrcp_occr_dt is "+leas_sply_amt_unrcp_occr_dt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cdseq2_ar = req.getParameter("bo_cdseq2_ar");
if( bo_cdseq2_ar == null){
	System.out.println(this.toString+" : bo_cdseq2_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq2_ar is "+bo_cdseq2_ar );
}
String area_cd2_ar = req.getParameter("area_cd2_ar");
if( area_cd2_ar == null){
	System.out.println(this.toString+" : area_cd2_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd2_ar is "+area_cd2_ar );
}
String chrg_pers2_ar = req.getParameter("chrg_pers2_ar");
if( chrg_pers2_ar == null){
	System.out.println(this.toString+" : chrg_pers2_ar is null" );
}else{
	System.out.println(this.toString+" : chrg_pers2_ar is "+chrg_pers2_ar );
}
String amt2_ar = req.getParameter("amt2_ar");
if( amt2_ar == null){
	System.out.println(this.toString+" : amt2_ar is null" );
}else{
	System.out.println(this.toString+" : amt2_ar is "+amt2_ar );
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
String amt = Util.checkString(req.getParameter("amt"));
String leas_sply_amt_unrcp_occr_dt = Util.checkString(req.getParameter("leas_sply_amt_unrcp_occr_dt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq2_ar = Util.checkString(req.getParameter("bo_cdseq2_ar"));
String area_cd2_ar = Util.checkString(req.getParameter("area_cd2_ar"));
String chrg_pers2_ar = Util.checkString(req.getParameter("chrg_pers2_ar"));
String amt2_ar = Util.checkString(req.getParameter("amt2_ar"));
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
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String leas_sply_amt_unrcp_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_sply_amt_unrcp_occr_dt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq2_ar")));
String area_cd2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd2_ar")));
String chrg_pers2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers2_ar")));
String amt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2_ar")));
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
dm.setAmt(amt);
dm.setLeas_sply_amt_unrcp_occr_dt(leas_sply_amt_unrcp_occr_dt);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq2_ar(bo_cdseq2_ar);
dm.setArea_cd2_ar(area_cd2_ar);
dm.setChrg_pers2_ar(chrg_pers2_ar);
dm.setAmt2_ar(amt2_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 17:02:49 KST 2009 */