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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8035_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String comp_dt;
	public String mtry_dt;
	public String flu_altn_slip_occr_dt;
	public String flu_altn_slip_clsf_cd;
	public String flu_altn_slip_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_8035_DDM(){}
	public FC_FUNC_8035_DDM(String cmpy_cd, String leas_clsf_cd, String leas_no, String comp_dt, String mtry_dt, String flu_altn_slip_occr_dt, String flu_altn_slip_clsf_cd, String flu_altn_slip_seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.flu_altn_slip_occr_dt = flu_altn_slip_occr_dt;
		this.flu_altn_slip_clsf_cd = flu_altn_slip_clsf_cd;
		this.flu_altn_slip_seq = flu_altn_slip_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setFlu_altn_slip_occr_dt(String flu_altn_slip_occr_dt){
		this.flu_altn_slip_occr_dt = flu_altn_slip_occr_dt;
	}

	public void setFlu_altn_slip_clsf_cd(String flu_altn_slip_clsf_cd){
		this.flu_altn_slip_clsf_cd = flu_altn_slip_clsf_cd;
	}

	public void setFlu_altn_slip_seq(String flu_altn_slip_seq){
		this.flu_altn_slip_seq = flu_altn_slip_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getFlu_altn_slip_occr_dt(){
		return this.flu_altn_slip_occr_dt;
	}

	public String getFlu_altn_slip_clsf_cd(){
		return this.flu_altn_slip_clsf_cd;
	}

	public String getFlu_altn_slip_seq(){
		return this.flu_altn_slip_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8035_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8035_DDM dm = (FC_FUNC_8035_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_clsf_cd);
		cstmt.setString(5, dm.leas_no);
		cstmt.setString(6, dm.comp_dt);
		cstmt.setString(7, dm.mtry_dt);
		cstmt.setString(8, dm.flu_altn_slip_occr_dt);
		cstmt.setString(9, dm.flu_altn_slip_clsf_cd);
		cstmt.setString(10, dm.flu_altn_slip_seq);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8035_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("flu_altn_slip_occr_dt = [" + getFlu_altn_slip_occr_dt() + "]");
		System.out.println("flu_altn_slip_clsf_cd = [" + getFlu_altn_slip_clsf_cd() + "]");
		System.out.println("flu_altn_slip_seq = [" + getFlu_altn_slip_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String leas_clsf_cd = req.getParameter("leas_clsf_cd");
if( leas_clsf_cd == null){
	System.out.println(this.toString+" : leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_clsf_cd is "+leas_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String flu_altn_slip_occr_dt = req.getParameter("flu_altn_slip_occr_dt");
if( flu_altn_slip_occr_dt == null){
	System.out.println(this.toString+" : flu_altn_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : flu_altn_slip_occr_dt is "+flu_altn_slip_occr_dt );
}
String flu_altn_slip_clsf_cd = req.getParameter("flu_altn_slip_clsf_cd");
if( flu_altn_slip_clsf_cd == null){
	System.out.println(this.toString+" : flu_altn_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : flu_altn_slip_clsf_cd is "+flu_altn_slip_clsf_cd );
}
String flu_altn_slip_seq = req.getParameter("flu_altn_slip_seq");
if( flu_altn_slip_seq == null){
	System.out.println(this.toString+" : flu_altn_slip_seq is null" );
}else{
	System.out.println(this.toString+" : flu_altn_slip_seq is "+flu_altn_slip_seq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String flu_altn_slip_occr_dt = Util.checkString(req.getParameter("flu_altn_slip_occr_dt"));
String flu_altn_slip_clsf_cd = Util.checkString(req.getParameter("flu_altn_slip_clsf_cd"));
String flu_altn_slip_seq = Util.checkString(req.getParameter("flu_altn_slip_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String flu_altn_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("flu_altn_slip_occr_dt")));
String flu_altn_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("flu_altn_slip_clsf_cd")));
String flu_altn_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("flu_altn_slip_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setFlu_altn_slip_occr_dt(flu_altn_slip_occr_dt);
dm.setFlu_altn_slip_clsf_cd(flu_altn_slip_clsf_cd);
dm.setFlu_altn_slip_seq(flu_altn_slip_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 15:37:32 KST 2009 */