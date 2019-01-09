/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_5903_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String tgt_evlu_pers_emp_no;
	public String evlu_pers_emp_no;
	public String evlu_pers_gbn;

	public HD_EVLU_5903_LDM(){}
	public HD_EVLU_5903_LDM(String cmpy_cd, String evlu_yy, String tms_clsf, String tgt_evlu_pers_emp_no, String evlu_pers_emp_no, String evlu_pers_gbn){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
		this.evlu_pers_emp_no = evlu_pers_emp_no;
		this.evlu_pers_gbn = evlu_pers_gbn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setEvlu_pers_emp_no(String evlu_pers_emp_no){
		this.evlu_pers_emp_no = evlu_pers_emp_no;
	}

	public void setEvlu_pers_gbn(String evlu_pers_gbn){
		this.evlu_pers_gbn = evlu_pers_gbn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getEvlu_pers_emp_no(){
		return this.evlu_pers_emp_no;
	}

	public String getEvlu_pers_gbn(){
		return this.evlu_pers_gbn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_5903_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5903_LDM dm = (HD_EVLU_5903_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.tgt_evlu_pers_emp_no);
		cstmt.setString(7, dm.evlu_pers_emp_no);
		cstmt.setString(8, dm.evlu_pers_gbn);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_5903_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("tgt_evlu_pers_emp_no = [" + getTgt_evlu_pers_emp_no() + "]");
		System.out.println("evlu_pers_emp_no = [" + getEvlu_pers_emp_no() + "]");
		System.out.println("evlu_pers_gbn = [" + getEvlu_pers_gbn() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String tgt_evlu_pers_emp_no = req.getParameter("tgt_evlu_pers_emp_no");
if( tgt_evlu_pers_emp_no == null){
	System.out.println(this.toString+" : tgt_evlu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : tgt_evlu_pers_emp_no is "+tgt_evlu_pers_emp_no );
}
String evlu_pers_emp_no = req.getParameter("evlu_pers_emp_no");
if( evlu_pers_emp_no == null){
	System.out.println(this.toString+" : evlu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_emp_no is "+evlu_pers_emp_no );
}
String evlu_pers_gbn = req.getParameter("evlu_pers_gbn");
if( evlu_pers_gbn == null){
	System.out.println(this.toString+" : evlu_pers_gbn is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_gbn is "+evlu_pers_gbn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
String evlu_pers_emp_no = Util.checkString(req.getParameter("evlu_pers_emp_no"));
String evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String tgt_evlu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tgt_evlu_pers_emp_no")));
String evlu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_emp_no")));
String evlu_pers_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_gbn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
dm.setEvlu_pers_emp_no(evlu_pers_emp_no);
dm.setEvlu_pers_gbn(evlu_pers_gbn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 09 15:39:14 KST 2015 */