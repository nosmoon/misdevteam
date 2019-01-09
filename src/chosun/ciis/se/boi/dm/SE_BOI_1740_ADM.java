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


public class SE_BOI_1740_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String area_cd;
	public String bo_cdseq_g;
	public String bo_cdseq_s;
	public String chrg_pers;
	public String jd_amt_g;
	public String gy_amt_g;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1740_ADM(){}
	public SE_BOI_1740_ADM(String cmpy_cd, String accflag, String occr_dt, String slip_clsf, String seq, String area_cd, String bo_cdseq_g, String bo_cdseq_s, String chrg_pers, String jd_amt_g, String gy_amt_g, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.area_cd = area_cd;
		this.bo_cdseq_g = bo_cdseq_g;
		this.bo_cdseq_s = bo_cdseq_s;
		this.chrg_pers = chrg_pers;
		this.jd_amt_g = jd_amt_g;
		this.gy_amt_g = gy_amt_g;
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

	public void setBo_cdseq_g(String bo_cdseq_g){
		this.bo_cdseq_g = bo_cdseq_g;
	}

	public void setBo_cdseq_s(String bo_cdseq_s){
		this.bo_cdseq_s = bo_cdseq_s;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setJd_amt_g(String jd_amt_g){
		this.jd_amt_g = jd_amt_g;
	}

	public void setGy_amt_g(String gy_amt_g){
		this.gy_amt_g = gy_amt_g;
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

	public String getBo_cdseq_g(){
		return this.bo_cdseq_g;
	}

	public String getBo_cdseq_s(){
		return this.bo_cdseq_s;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getJd_amt_g(){
		return this.jd_amt_g;
	}

	public String getGy_amt_g(){
		return this.gy_amt_g;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1740_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1740_ADM dm = (SE_BOI_1740_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.area_cd);
		cstmt.setString(9, dm.bo_cdseq_g);
		cstmt.setString(10, dm.bo_cdseq_s);
		cstmt.setString(11, dm.chrg_pers);
		cstmt.setString(12, dm.jd_amt_g);
		cstmt.setString(13, dm.gy_amt_g);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1740_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("bo_cdseq_g = " + getBo_cdseq_g());
        System.out.println("bo_cdseq_s = " + getBo_cdseq_s());
        System.out.println("chrg_pers = " + getChrg_pers());
        System.out.println("jd_amt_g = " + getJd_amt_g());
        System.out.println("gy_amt_g = " + getGy_amt_g());
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
String bo_cdseq_g = req.getParameter("bo_cdseq_g");
if( bo_cdseq_g == null){
	System.out.println(this.toString+" : bo_cdseq_g is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_g is "+bo_cdseq_g );
}
String bo_cdseq_s = req.getParameter("bo_cdseq_s");
if( bo_cdseq_s == null){
	System.out.println(this.toString+" : bo_cdseq_s is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_s is "+bo_cdseq_s );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String jd_amt_g = req.getParameter("jd_amt_g");
if( jd_amt_g == null){
	System.out.println(this.toString+" : jd_amt_g is null" );
}else{
	System.out.println(this.toString+" : jd_amt_g is "+jd_amt_g );
}
String gy_amt_g = req.getParameter("gy_amt_g");
if( gy_amt_g == null){
	System.out.println(this.toString+" : gy_amt_g is null" );
}else{
	System.out.println(this.toString+" : gy_amt_g is "+gy_amt_g );
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
String bo_cdseq_g = Util.checkString(req.getParameter("bo_cdseq_g"));
String bo_cdseq_s = Util.checkString(req.getParameter("bo_cdseq_s"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String jd_amt_g = Util.checkString(req.getParameter("jd_amt_g"));
String gy_amt_g = Util.checkString(req.getParameter("gy_amt_g"));
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
String bo_cdseq_g = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_g")));
String bo_cdseq_s = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_s")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String jd_amt_g = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_amt_g")));
String gy_amt_g = Util.Uni2Ksc(Util.checkString(req.getParameter("gy_amt_g")));
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
dm.setBo_cdseq_g(bo_cdseq_g);
dm.setBo_cdseq_s(bo_cdseq_s);
dm.setChrg_pers(chrg_pers);
dm.setJd_amt_g(jd_amt_g);
dm.setGy_amt_g(gy_amt_g);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 13:56:36 KST 2009 */