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


public class HD_AFFR_1721_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_flnm;
	public String srch_emp_no;
	public String srch_scl_exps_pay_yy_ft;
	public String srch_scl_exps_pay_qq_ft;
	public String srch_scl_exps_pay_yy_to;
	public String srch_scl_exps_pay_qq_to;
	public String srch_scl_exps_clsf;

	public HD_AFFR_1721_LDM(){}
	public HD_AFFR_1721_LDM(String cmpy_cd, String srch_flnm, String srch_emp_no, String srch_scl_exps_pay_yy_ft, String srch_scl_exps_pay_qq_ft, String srch_scl_exps_pay_yy_to, String srch_scl_exps_pay_qq_to, String srch_scl_exps_clsf){
		this.cmpy_cd = cmpy_cd;
		this.srch_flnm = srch_flnm;
		this.srch_emp_no = srch_emp_no;
		this.srch_scl_exps_pay_yy_ft = srch_scl_exps_pay_yy_ft;
		this.srch_scl_exps_pay_qq_ft = srch_scl_exps_pay_qq_ft;
		this.srch_scl_exps_pay_yy_to = srch_scl_exps_pay_yy_to;
		this.srch_scl_exps_pay_qq_to = srch_scl_exps_pay_qq_to;
		this.srch_scl_exps_clsf = srch_scl_exps_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_flnm(String srch_flnm){
		this.srch_flnm = srch_flnm;
	}

	public void setSrch_emp_no(String srch_emp_no){
		this.srch_emp_no = srch_emp_no;
	}

	public void setSrch_scl_exps_pay_yy_ft(String srch_scl_exps_pay_yy_ft){
		this.srch_scl_exps_pay_yy_ft = srch_scl_exps_pay_yy_ft;
	}

	public void setSrch_scl_exps_pay_qq_ft(String srch_scl_exps_pay_qq_ft){
		this.srch_scl_exps_pay_qq_ft = srch_scl_exps_pay_qq_ft;
	}

	public void setSrch_scl_exps_pay_yy_to(String srch_scl_exps_pay_yy_to){
		this.srch_scl_exps_pay_yy_to = srch_scl_exps_pay_yy_to;
	}

	public void setSrch_scl_exps_pay_qq_to(String srch_scl_exps_pay_qq_to){
		this.srch_scl_exps_pay_qq_to = srch_scl_exps_pay_qq_to;
	}

	public void setSrch_scl_exps_clsf(String srch_scl_exps_clsf){
		this.srch_scl_exps_clsf = srch_scl_exps_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_flnm(){
		return this.srch_flnm;
	}

	public String getSrch_emp_no(){
		return this.srch_emp_no;
	}

	public String getSrch_scl_exps_pay_yy_ft(){
		return this.srch_scl_exps_pay_yy_ft;
	}

	public String getSrch_scl_exps_pay_qq_ft(){
		return this.srch_scl_exps_pay_qq_ft;
	}

	public String getSrch_scl_exps_pay_yy_to(){
		return this.srch_scl_exps_pay_yy_to;
	}

	public String getSrch_scl_exps_pay_qq_to(){
		return this.srch_scl_exps_pay_qq_to;
	}

	public String getSrch_scl_exps_clsf(){
		return this.srch_scl_exps_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1721_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1721_LDM dm = (HD_AFFR_1721_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_flnm);
		cstmt.setString(5, dm.srch_emp_no);
		cstmt.setString(6, dm.srch_scl_exps_pay_yy_ft);
		cstmt.setString(7, dm.srch_scl_exps_pay_qq_ft);
		cstmt.setString(8, dm.srch_scl_exps_pay_yy_to);
		cstmt.setString(9, dm.srch_scl_exps_pay_qq_to);
		cstmt.setString(10, dm.srch_scl_exps_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1721_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("srch_flnm = [" + getSrch_flnm() + "]");
		System.out.println("srch_emp_no = [" + getSrch_emp_no() + "]");
		System.out.println("srch_scl_exps_pay_yy_ft = [" + getSrch_scl_exps_pay_yy_ft() + "]");
		System.out.println("srch_scl_exps_pay_qq_ft = [" + getSrch_scl_exps_pay_qq_ft() + "]");
		System.out.println("srch_scl_exps_pay_yy_to = [" + getSrch_scl_exps_pay_yy_to() + "]");
		System.out.println("srch_scl_exps_pay_qq_to = [" + getSrch_scl_exps_pay_qq_to() + "]");
		System.out.println("srch_scl_exps_clsf = [" + getSrch_scl_exps_clsf() + "]");
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
String srch_flnm = req.getParameter("srch_flnm");
if( srch_flnm == null){
	System.out.println(this.toString+" : srch_flnm is null" );
}else{
	System.out.println(this.toString+" : srch_flnm is "+srch_flnm );
}
String srch_emp_no = req.getParameter("srch_emp_no");
if( srch_emp_no == null){
	System.out.println(this.toString+" : srch_emp_no is null" );
}else{
	System.out.println(this.toString+" : srch_emp_no is "+srch_emp_no );
}
String srch_scl_exps_pay_yy_ft = req.getParameter("srch_scl_exps_pay_yy_ft");
if( srch_scl_exps_pay_yy_ft == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_yy_ft is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_yy_ft is "+srch_scl_exps_pay_yy_ft );
}
String srch_scl_exps_pay_qq_ft = req.getParameter("srch_scl_exps_pay_qq_ft");
if( srch_scl_exps_pay_qq_ft == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_qq_ft is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_qq_ft is "+srch_scl_exps_pay_qq_ft );
}
String srch_scl_exps_pay_yy_to = req.getParameter("srch_scl_exps_pay_yy_to");
if( srch_scl_exps_pay_yy_to == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_yy_to is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_yy_to is "+srch_scl_exps_pay_yy_to );
}
String srch_scl_exps_pay_qq_to = req.getParameter("srch_scl_exps_pay_qq_to");
if( srch_scl_exps_pay_qq_to == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_qq_to is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_qq_to is "+srch_scl_exps_pay_qq_to );
}
String srch_scl_exps_clsf = req.getParameter("srch_scl_exps_clsf");
if( srch_scl_exps_clsf == null){
	System.out.println(this.toString+" : srch_scl_exps_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_clsf is "+srch_scl_exps_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_flnm = Util.checkString(req.getParameter("srch_flnm"));
String srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
String srch_scl_exps_pay_yy_ft = Util.checkString(req.getParameter("srch_scl_exps_pay_yy_ft"));
String srch_scl_exps_pay_qq_ft = Util.checkString(req.getParameter("srch_scl_exps_pay_qq_ft"));
String srch_scl_exps_pay_yy_to = Util.checkString(req.getParameter("srch_scl_exps_pay_yy_to"));
String srch_scl_exps_pay_qq_to = Util.checkString(req.getParameter("srch_scl_exps_pay_qq_to"));
String srch_scl_exps_clsf = Util.checkString(req.getParameter("srch_scl_exps_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_flnm")));
String srch_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_emp_no")));
String srch_scl_exps_pay_yy_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_yy_ft")));
String srch_scl_exps_pay_qq_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_qq_ft")));
String srch_scl_exps_pay_yy_to = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_yy_to")));
String srch_scl_exps_pay_qq_to = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_qq_to")));
String srch_scl_exps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_flnm(srch_flnm);
dm.setSrch_emp_no(srch_emp_no);
dm.setSrch_scl_exps_pay_yy_ft(srch_scl_exps_pay_yy_ft);
dm.setSrch_scl_exps_pay_qq_ft(srch_scl_exps_pay_qq_ft);
dm.setSrch_scl_exps_pay_yy_to(srch_scl_exps_pay_yy_to);
dm.setSrch_scl_exps_pay_qq_to(srch_scl_exps_pay_qq_to);
dm.setSrch_scl_exps_clsf(srch_scl_exps_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 20 16:34:39 KST 2017 */