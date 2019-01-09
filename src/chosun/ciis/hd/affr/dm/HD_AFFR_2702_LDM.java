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


public class HD_AFFR_2702_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String hospz_med_exam_pers_flnm;

	public HD_AFFR_2702_LDM(){}
	public HD_AFFR_2702_LDM(String cmpy_cd, String emp_no, String hospz_med_exam_pers_flnm){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.hospz_med_exam_pers_flnm = hospz_med_exam_pers_flnm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setHospz_med_exam_pers_flnm(String hospz_med_exam_pers_flnm){
		this.hospz_med_exam_pers_flnm = hospz_med_exam_pers_flnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getHospz_med_exam_pers_flnm(){
		return this.hospz_med_exam_pers_flnm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2702_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2702_LDM dm = (HD_AFFR_2702_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.hospz_med_exam_pers_flnm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2702_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("hospz_med_exam_pers_flnm = [" + getHospz_med_exam_pers_flnm() + "]");
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
String hospz_med_exam_pers_flnm = req.getParameter("hospz_med_exam_pers_flnm");
if( hospz_med_exam_pers_flnm == null){
	System.out.println(this.toString+" : hospz_med_exam_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_pers_flnm is "+hospz_med_exam_pers_flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String hospz_med_exam_pers_flnm = Util.checkString(req.getParameter("hospz_med_exam_pers_flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String hospz_med_exam_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_pers_flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setHospz_med_exam_pers_flnm(hospz_med_exam_pers_flnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 13:28:09 KST 2009 */