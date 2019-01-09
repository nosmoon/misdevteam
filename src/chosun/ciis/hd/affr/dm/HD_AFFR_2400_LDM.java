/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_occr_dt;
	public String to_occr_dt;
	public String pay_plac_clsf;
	public String emp_no;
	public String proc_stat;
	public String chk_dt;
	public String chk_obj_pers_rshp;
	public String actu_slip_no;
	public String incmg_pers;

	public HD_AFFR_2400_LDM(){}
	public HD_AFFR_2400_LDM(String cmpy_cd, String fr_occr_dt, String to_occr_dt, String pay_plac_clsf, String emp_no, String proc_stat, String chk_dt, String chk_obj_pers_rshp, String actu_slip_no, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fr_occr_dt = fr_occr_dt;
		this.to_occr_dt = to_occr_dt;
		this.pay_plac_clsf = pay_plac_clsf;
		this.emp_no = emp_no;
		this.proc_stat = proc_stat;
		this.chk_dt = chk_dt;
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
		this.actu_slip_no = actu_slip_no;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_occr_dt(String fr_occr_dt){
		this.fr_occr_dt = fr_occr_dt;
	}

	public void setTo_occr_dt(String to_occr_dt){
		this.to_occr_dt = to_occr_dt;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setChk_obj_pers_rshp(String chk_obj_pers_rshp){
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_occr_dt(){
		return this.fr_occr_dt;
	}

	public String getTo_occr_dt(){
		return this.to_occr_dt;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getChk_obj_pers_rshp(){
		return this.chk_obj_pers_rshp;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2400_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2400_LDM dm = (HD_AFFR_2400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_occr_dt);
		cstmt.setString(5, dm.to_occr_dt);
		cstmt.setString(6, dm.pay_plac_clsf);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.proc_stat);
		cstmt.setString(9, dm.chk_dt);
		cstmt.setString(10, dm.chk_obj_pers_rshp);
		cstmt.setString(11, dm.actu_slip_no);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_occr_dt = [" + getFr_occr_dt() + "]");
		System.out.println("to_occr_dt = [" + getTo_occr_dt() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("chk_dt = [" + getChk_dt() + "]");
		System.out.println("chk_obj_pers_rshp = [" + getChk_obj_pers_rshp() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String fr_occr_dt = req.getParameter("fr_occr_dt");
if( fr_occr_dt == null){
	System.out.println(this.toString+" : fr_occr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_occr_dt is "+fr_occr_dt );
}
String to_occr_dt = req.getParameter("to_occr_dt");
if( to_occr_dt == null){
	System.out.println(this.toString+" : to_occr_dt is null" );
}else{
	System.out.println(this.toString+" : to_occr_dt is "+to_occr_dt );
}
String pay_plac_clsf = req.getParameter("pay_plac_clsf");
if( pay_plac_clsf == null){
	System.out.println(this.toString+" : pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_plac_clsf is "+pay_plac_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String chk_dt = req.getParameter("chk_dt");
if( chk_dt == null){
	System.out.println(this.toString+" : chk_dt is null" );
}else{
	System.out.println(this.toString+" : chk_dt is "+chk_dt );
}
String chk_obj_pers_rshp = req.getParameter("chk_obj_pers_rshp");
if( chk_obj_pers_rshp == null){
	System.out.println(this.toString+" : chk_obj_pers_rshp is null" );
}else{
	System.out.println(this.toString+" : chk_obj_pers_rshp is "+chk_obj_pers_rshp );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
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
String fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
String to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String chk_dt = Util.checkString(req.getParameter("chk_dt"));
String chk_obj_pers_rshp = Util.checkString(req.getParameter("chk_obj_pers_rshp"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_occr_dt")));
String to_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_occr_dt")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_dt")));
String chk_obj_pers_rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_obj_pers_rshp")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_occr_dt(fr_occr_dt);
dm.setTo_occr_dt(to_occr_dt);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setEmp_no(emp_no);
dm.setProc_stat(proc_stat);
dm.setChk_dt(chk_dt);
dm.setChk_obj_pers_rshp(chk_obj_pers_rshp);
dm.setActu_slip_no(actu_slip_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 28 16:53:28 KST 2012 */