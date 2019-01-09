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


public class HD_AFFR_1900_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String congr_condl_dt_fr;
	public String congr_condl_dt_to;

	public HD_AFFR_1900_LDM(){}
	public HD_AFFR_1900_LDM(String cmpy_cd, String emp_no, String congr_condl_dt_fr, String congr_condl_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.congr_condl_dt_fr = congr_condl_dt_fr;
		this.congr_condl_dt_to = congr_condl_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCongr_condl_dt_fr(String congr_condl_dt_fr){
		this.congr_condl_dt_fr = congr_condl_dt_fr;
	}

	public void setCongr_condl_dt_to(String congr_condl_dt_to){
		this.congr_condl_dt_to = congr_condl_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCongr_condl_dt_fr(){
		return this.congr_condl_dt_fr;
	}

	public String getCongr_condl_dt_to(){
		return this.congr_condl_dt_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1900_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1900_LDM dm = (HD_AFFR_1900_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.congr_condl_dt_fr);
		cstmt.setString(6, dm.congr_condl_dt_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1900_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("congr_condl_dt_fr = " + getCongr_condl_dt_fr());
        System.out.println("congr_condl_dt_to = " + getCongr_condl_dt_to());
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
String congr_condl_dt_fr = req.getParameter("congr_condl_dt_fr");
if( congr_condl_dt_fr == null){
	System.out.println(this.toString+" : congr_condl_dt_fr is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_fr is "+congr_condl_dt_fr );
}
String congr_condl_dt_to = req.getParameter("congr_condl_dt_to");
if( congr_condl_dt_to == null){
	System.out.println(this.toString+" : congr_condl_dt_to is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_to is "+congr_condl_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String congr_condl_dt_fr = Util.checkString(req.getParameter("congr_condl_dt_fr"));
String congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String congr_condl_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_fr")));
String congr_condl_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCongr_condl_dt_fr(congr_condl_dt_fr);
dm.setCongr_condl_dt_to(congr_condl_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 14:22:21 KST 2009 */