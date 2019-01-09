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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String estm_dt;
	public String slip_occr_dt;
	public String slip_occr_seq;
	public String acml_yy;
	public String acml_mm;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_3103_ADM(){}
	public HD_LVCMPY_3103_ADM(String cmpy_cd, String estm_dt, String slip_occr_dt, String slip_occr_seq, String acml_yy, String acml_mm, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.estm_dt = estm_dt;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_occr_seq = slip_occr_seq;
		this.acml_yy = acml_yy;
		this.acml_mm = acml_mm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEstm_dt(String estm_dt){
		this.estm_dt = estm_dt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_occr_seq(String slip_occr_seq){
		this.slip_occr_seq = slip_occr_seq;
	}

	public void setAcml_yy(String acml_yy){
		this.acml_yy = acml_yy;
	}

	public void setAcml_mm(String acml_mm){
		this.acml_mm = acml_mm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEstm_dt(){
		return this.estm_dt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_occr_seq(){
		return this.slip_occr_seq;
	}

	public String getAcml_yy(){
		return this.acml_yy;
	}

	public String getAcml_mm(){
		return this.acml_mm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3103_ADM dm = (HD_LVCMPY_3103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.estm_dt);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_occr_seq);
		cstmt.setString(7, dm.acml_yy);
		cstmt.setString(8, dm.acml_mm);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("estm_dt = [" + getEstm_dt() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_occr_seq = [" + getSlip_occr_seq() + "]");
		System.out.println("acml_yy = [" + getAcml_yy() + "]");
		System.out.println("acml_mm = [" + getAcml_mm() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String estm_dt = req.getParameter("estm_dt");
if( estm_dt == null){
	System.out.println(this.toString+" : estm_dt is null" );
}else{
	System.out.println(this.toString+" : estm_dt is "+estm_dt );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_occr_seq = req.getParameter("slip_occr_seq");
if( slip_occr_seq == null){
	System.out.println(this.toString+" : slip_occr_seq is null" );
}else{
	System.out.println(this.toString+" : slip_occr_seq is "+slip_occr_seq );
}
String acml_yy = req.getParameter("acml_yy");
if( acml_yy == null){
	System.out.println(this.toString+" : acml_yy is null" );
}else{
	System.out.println(this.toString+" : acml_yy is "+acml_yy );
}
String acml_mm = req.getParameter("acml_mm");
if( acml_mm == null){
	System.out.println(this.toString+" : acml_mm is null" );
}else{
	System.out.println(this.toString+" : acml_mm is "+acml_mm );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String estm_dt = Util.checkString(req.getParameter("estm_dt"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_occr_seq = Util.checkString(req.getParameter("slip_occr_seq"));
String acml_yy = Util.checkString(req.getParameter("acml_yy"));
String acml_mm = Util.checkString(req.getParameter("acml_mm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String estm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("estm_dt")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_seq")));
String acml_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_yy")));
String acml_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_mm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEstm_dt(estm_dt);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_occr_seq(slip_occr_seq);
dm.setAcml_yy(acml_yy);
dm.setAcml_mm(acml_mm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 21:06:49 KST 2009 */