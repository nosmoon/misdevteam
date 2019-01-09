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


public class HD_AFFR_2704_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String hospz_med_exam_todt;
	public String faml_rshp_cd;

	public HD_AFFR_2704_LDM(){}
	public HD_AFFR_2704_LDM(String cmpy_cd, String hospz_med_exam_todt, String faml_rshp_cd){
		this.cmpy_cd = cmpy_cd;
		this.hospz_med_exam_todt = hospz_med_exam_todt;
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setHospz_med_exam_todt(String hospz_med_exam_todt){
		this.hospz_med_exam_todt = hospz_med_exam_todt;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getHospz_med_exam_todt(){
		return this.hospz_med_exam_todt;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2704_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2704_LDM dm = (HD_AFFR_2704_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.hospz_med_exam_todt);
		cstmt.setString(5, dm.faml_rshp_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2704_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("hospz_med_exam_todt = [" + getHospz_med_exam_todt() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
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
String hospz_med_exam_todt = req.getParameter("hospz_med_exam_todt");
if( hospz_med_exam_todt == null){
	System.out.println(this.toString+" : hospz_med_exam_todt is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_todt is "+hospz_med_exam_todt );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String hospz_med_exam_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_todt")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setHospz_med_exam_todt(hospz_med_exam_todt);
dm.setFaml_rshp_cd(faml_rshp_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 13:56:20 KST 2009 */