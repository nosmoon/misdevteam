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


public class HD_AFFR_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String fr_occr_dt;
	public String to_occr_dt;
	public String pay_plac_clsf;
	public String actu_slip_no;

	public HD_AFFR_1410_LDM(){}
	public HD_AFFR_1410_LDM(String cmpy_cd, String emp_no, String fr_occr_dt, String to_occr_dt, String pay_plac_clsf, String actu_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.fr_occr_dt = fr_occr_dt;
		this.to_occr_dt = to_occr_dt;
		this.pay_plac_clsf = pay_plac_clsf;
		this.actu_slip_no = actu_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1410_LDM dm = (HD_AFFR_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.fr_occr_dt);
		cstmt.setString(6, dm.to_occr_dt);
		cstmt.setString(7, dm.pay_plac_clsf);
		cstmt.setString(8, dm.actu_slip_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("fr_occr_dt = [" + getFr_occr_dt() + "]");
		System.out.println("to_occr_dt = [" + getTo_occr_dt() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
String to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String fr_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_occr_dt")));
String to_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_occr_dt")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFr_occr_dt(fr_occr_dt);
dm.setTo_occr_dt(to_occr_dt);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setActu_slip_no(actu_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 14:49:40 KST 2009 */