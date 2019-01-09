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


public class SE_BOI_2040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String bo_cdseq1;
	public String area_cd1;
	public String chrg_pers1;
	public String bo_cdseq2;
	public String area_cd2;
	public String chrg_pers2;
	public String amt1;
	public String amt2;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_2040_ADM(){}
	public SE_BOI_2040_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String bo_cdseq1, String area_cd1, String chrg_pers1, String bo_cdseq2, String area_cd2, String chrg_pers2, String amt1, String amt2, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.bo_cdseq1 = bo_cdseq1;
		this.area_cd1 = area_cd1;
		this.chrg_pers1 = chrg_pers1;
		this.bo_cdseq2 = bo_cdseq2;
		this.area_cd2 = area_cd2;
		this.chrg_pers2 = chrg_pers2;
		this.amt1 = amt1;
		this.amt2 = amt2;
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

	public void setBo_cdseq1(String bo_cdseq1){
		this.bo_cdseq1 = bo_cdseq1;
	}

	public void setArea_cd1(String area_cd1){
		this.area_cd1 = area_cd1;
	}

	public void setChrg_pers1(String chrg_pers1){
		this.chrg_pers1 = chrg_pers1;
	}

	public void setBo_cdseq2(String bo_cdseq2){
		this.bo_cdseq2 = bo_cdseq2;
	}

	public void setArea_cd2(String area_cd2){
		this.area_cd2 = area_cd2;
	}

	public void setChrg_pers2(String chrg_pers2){
		this.chrg_pers2 = chrg_pers2;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
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

	public String getBo_cdseq1(){
		return this.bo_cdseq1;
	}

	public String getArea_cd1(){
		return this.area_cd1;
	}

	public String getChrg_pers1(){
		return this.chrg_pers1;
	}

	public String getBo_cdseq2(){
		return this.bo_cdseq2;
	}

	public String getArea_cd2(){
		return this.area_cd2;
	}

	public String getChrg_pers2(){
		return this.chrg_pers2;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2040_ADM dm = (SE_BOI_2040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.bo_cdseq1);
		cstmt.setString(9, dm.area_cd1);
		cstmt.setString(10, dm.chrg_pers1);
		cstmt.setString(11, dm.bo_cdseq2);
		cstmt.setString(12, dm.area_cd2);
		cstmt.setString(13, dm.chrg_pers2);
		cstmt.setString(14, dm.amt1);
		cstmt.setString(15, dm.amt2);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2040_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("bo_cdseq1 = " + getBo_cdseq1());
        System.out.println("area_cd1 = " + getArea_cd1());
        System.out.println("chrg_pers1 = " + getChrg_pers1());
        System.out.println("bo_cdseq2 = " + getBo_cdseq2());
        System.out.println("area_cd2 = " + getArea_cd2());
        System.out.println("chrg_pers2 = " + getChrg_pers2());
        System.out.println("amt1 = " + getAmt1());
        System.out.println("amt2 = " + getAmt2());
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
String bo_cdseq1 = req.getParameter("bo_cdseq1");
if( bo_cdseq1 == null){
	System.out.println(this.toString+" : bo_cdseq1 is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq1 is "+bo_cdseq1 );
}
String area_cd1 = req.getParameter("area_cd1");
if( area_cd1 == null){
	System.out.println(this.toString+" : area_cd1 is null" );
}else{
	System.out.println(this.toString+" : area_cd1 is "+area_cd1 );
}
String chrg_pers1 = req.getParameter("chrg_pers1");
if( chrg_pers1 == null){
	System.out.println(this.toString+" : chrg_pers1 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers1 is "+chrg_pers1 );
}
String bo_cdseq2 = req.getParameter("bo_cdseq2");
if( bo_cdseq2 == null){
	System.out.println(this.toString+" : bo_cdseq2 is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq2 is "+bo_cdseq2 );
}
String area_cd2 = req.getParameter("area_cd2");
if( area_cd2 == null){
	System.out.println(this.toString+" : area_cd2 is null" );
}else{
	System.out.println(this.toString+" : area_cd2 is "+area_cd2 );
}
String chrg_pers2 = req.getParameter("chrg_pers2");
if( chrg_pers2 == null){
	System.out.println(this.toString+" : chrg_pers2 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers2 is "+chrg_pers2 );
}
String amt1 = req.getParameter("amt1");
if( amt1 == null){
	System.out.println(this.toString+" : amt1 is null" );
}else{
	System.out.println(this.toString+" : amt1 is "+amt1 );
}
String amt2 = req.getParameter("amt2");
if( amt2 == null){
	System.out.println(this.toString+" : amt2 is null" );
}else{
	System.out.println(this.toString+" : amt2 is "+amt2 );
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
String bo_cdseq1 = Util.checkString(req.getParameter("bo_cdseq1"));
String area_cd1 = Util.checkString(req.getParameter("area_cd1"));
String chrg_pers1 = Util.checkString(req.getParameter("chrg_pers1"));
String bo_cdseq2 = Util.checkString(req.getParameter("bo_cdseq2"));
String area_cd2 = Util.checkString(req.getParameter("area_cd2"));
String chrg_pers2 = Util.checkString(req.getParameter("chrg_pers2"));
String amt1 = Util.checkString(req.getParameter("amt1"));
String amt2 = Util.checkString(req.getParameter("amt2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bo_cdseq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq1")));
String area_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd1")));
String chrg_pers1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers1")));
String bo_cdseq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq2")));
String area_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd2")));
String chrg_pers2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers2")));
String amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt1")));
String amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt2")));
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
dm.setBo_cdseq1(bo_cdseq1);
dm.setArea_cd1(area_cd1);
dm.setChrg_pers1(chrg_pers1);
dm.setBo_cdseq2(bo_cdseq2);
dm.setArea_cd2(area_cd2);
dm.setChrg_pers2(chrg_pers2);
dm.setAmt1(amt1);
dm.setAmt2(amt2);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 17:02:44 KST 2009 */