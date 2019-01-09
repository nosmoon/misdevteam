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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2012_1231_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String stok_savg_type;

	public HD_YADJM_2012_1231_LDM(){}
	public HD_YADJM_2012_1231_LDM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String stok_savg_type){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.stok_savg_type = stok_savg_type;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setStok_savg_type(String stok_savg_type){
		this.stok_savg_type = stok_savg_type;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getStok_savg_type(){
		return this.stok_savg_type;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2012_1231_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2012_1231_LDM dm = (HD_YADJM_2012_1231_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.stok_savg_type);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2012_1231_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("stok_savg_type = [" + getStok_savg_type() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String stok_savg_type = req.getParameter("stok_savg_type");
if( stok_savg_type == null){
	System.out.println(this.toString+" : stok_savg_type is null" );
}else{
	System.out.println(this.toString+" : stok_savg_type is "+stok_savg_type );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String stok_savg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_savg_type")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setStok_savg_type(stok_savg_type);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 11 15:24:32 KST 2013 */