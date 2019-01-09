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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String ov_cmpy_cd;
	public String ov_occr_dt;
	public String ov_max_seq;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String prz_pnsh_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_PRZ_1004_ADM(){}
	public HD_PRZ_1004_ADM(String mode, String ov_cmpy_cd, String ov_occr_dt, String ov_max_seq, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String prz_pnsh_cd, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.ov_cmpy_cd = ov_cmpy_cd;
		this.ov_occr_dt = ov_occr_dt;
		this.ov_max_seq = ov_max_seq;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.prz_pnsh_cd = prz_pnsh_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOv_cmpy_cd(String ov_cmpy_cd){
		this.ov_cmpy_cd = ov_cmpy_cd;
	}

	public void setOv_occr_dt(String ov_occr_dt){
		this.ov_occr_dt = ov_occr_dt;
	}

	public void setOv_max_seq(String ov_max_seq){
		this.ov_max_seq = ov_max_seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPrz_pnsh_cd(String prz_pnsh_cd){
		this.prz_pnsh_cd = prz_pnsh_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOv_cmpy_cd(){
		return this.ov_cmpy_cd;
	}

	public String getOv_occr_dt(){
		return this.ov_occr_dt;
	}

	public String getOv_max_seq(){
		return this.ov_max_seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPrz_pnsh_cd(){
		return this.prz_pnsh_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1004_ADM dm = (HD_PRZ_1004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.ov_cmpy_cd);
		cstmt.setString(5, dm.ov_occr_dt);
		cstmt.setString(6, dm.ov_max_seq);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.prz_pnsh_cd);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("ov_cmpy_cd = [" + getOv_cmpy_cd() + "]");
		System.out.println("ov_occr_dt = [" + getOv_occr_dt() + "]");
		System.out.println("ov_max_seq = [" + getOv_max_seq() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("prz_pnsh_cd = [" + getPrz_pnsh_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String ov_cmpy_cd = req.getParameter("ov_cmpy_cd");
if( ov_cmpy_cd == null){
	System.out.println(this.toString+" : ov_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : ov_cmpy_cd is "+ov_cmpy_cd );
}
String ov_occr_dt = req.getParameter("ov_occr_dt");
if( ov_occr_dt == null){
	System.out.println(this.toString+" : ov_occr_dt is null" );
}else{
	System.out.println(this.toString+" : ov_occr_dt is "+ov_occr_dt );
}
String ov_max_seq = req.getParameter("ov_max_seq");
if( ov_max_seq == null){
	System.out.println(this.toString+" : ov_max_seq is null" );
}else{
	System.out.println(this.toString+" : ov_max_seq is "+ov_max_seq );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String prz_pnsh_cd = req.getParameter("prz_pnsh_cd");
if( prz_pnsh_cd == null){
	System.out.println(this.toString+" : prz_pnsh_cd is null" );
}else{
	System.out.println(this.toString+" : prz_pnsh_cd is "+prz_pnsh_cd );
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

String mode = Util.checkString(req.getParameter("mode"));
String ov_cmpy_cd = Util.checkString(req.getParameter("ov_cmpy_cd"));
String ov_occr_dt = Util.checkString(req.getParameter("ov_occr_dt"));
String ov_max_seq = Util.checkString(req.getParameter("ov_max_seq"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String prz_pnsh_cd = Util.checkString(req.getParameter("prz_pnsh_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String ov_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ov_cmpy_cd")));
String ov_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ov_occr_dt")));
String ov_max_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ov_max_seq")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String prz_pnsh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_pnsh_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setOv_cmpy_cd(ov_cmpy_cd);
dm.setOv_occr_dt(ov_occr_dt);
dm.setOv_max_seq(ov_max_seq);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setPrz_pnsh_cd(prz_pnsh_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 19:55:03 KST 2009 */