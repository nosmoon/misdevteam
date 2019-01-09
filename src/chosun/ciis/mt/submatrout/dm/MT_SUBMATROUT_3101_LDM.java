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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String ordr_dt_fr;
	public String ordr_dt_to;
	public String fac_clsf;
	public String dlco_no;

	public MT_SUBMATROUT_3101_LDM(){}
	public MT_SUBMATROUT_3101_LDM(String cmpy_cd, String emp_no, String ordr_dt_fr, String ordr_dt_to, String fac_clsf, String dlco_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.ordr_dt_fr = ordr_dt_fr;
		this.ordr_dt_to = ordr_dt_to;
		this.fac_clsf = fac_clsf;
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOrdr_dt_fr(String ordr_dt_fr){
		this.ordr_dt_fr = ordr_dt_fr;
	}

	public void setOrdr_dt_to(String ordr_dt_to){
		this.ordr_dt_to = ordr_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOrdr_dt_fr(){
		return this.ordr_dt_fr;
	}

	public String getOrdr_dt_to(){
		return this.ordr_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_3101_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_3101_LDM dm = (MT_SUBMATROUT_3101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.ordr_dt_fr);
		cstmt.setString(6, dm.ordr_dt_to);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.dlco_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_3101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("ordr_dt_fr = [" + getOrdr_dt_fr() + "]");
		System.out.println("ordr_dt_to = [" + getOrdr_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String ordr_dt_fr = req.getParameter("ordr_dt_fr");
if( ordr_dt_fr == null){
	System.out.println(this.toString+" : ordr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : ordr_dt_fr is "+ordr_dt_fr );
}
String ordr_dt_to = req.getParameter("ordr_dt_to");
if( ordr_dt_to == null){
	System.out.println(this.toString+" : ordr_dt_to is null" );
}else{
	System.out.println(this.toString+" : ordr_dt_to is "+ordr_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
String ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String ordr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt_fr")));
String ordr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOrdr_dt_fr(ordr_dt_fr);
dm.setOrdr_dt_to(ordr_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 18:41:36 KST 2009 */