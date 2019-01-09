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


public class HD_AFFR_8011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String sply_ward_fee;
	public String hospz_med_exam_frdt;
	public String hospz_med_exam_todt;
	public String sply_clsf_cd;

	public HD_AFFR_8011_LDM(){}
	public HD_AFFR_8011_LDM(String cmpy_cd, String emp_no, String occr_dt, String seq, String sply_ward_fee, String hospz_med_exam_frdt, String hospz_med_exam_todt, String sply_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sply_ward_fee = sply_ward_fee;
		this.hospz_med_exam_frdt = hospz_med_exam_frdt;
		this.hospz_med_exam_todt = hospz_med_exam_todt;
		this.sply_clsf_cd = sply_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSply_ward_fee(String sply_ward_fee){
		this.sply_ward_fee = sply_ward_fee;
	}

	public void setHospz_med_exam_frdt(String hospz_med_exam_frdt){
		this.hospz_med_exam_frdt = hospz_med_exam_frdt;
	}

	public void setHospz_med_exam_todt(String hospz_med_exam_todt){
		this.hospz_med_exam_todt = hospz_med_exam_todt;
	}

	public void setSply_clsf_cd(String sply_clsf_cd){
		this.sply_clsf_cd = sply_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSply_ward_fee(){
		return this.sply_ward_fee;
	}

	public String getHospz_med_exam_frdt(){
		return this.hospz_med_exam_frdt;
	}

	public String getHospz_med_exam_todt(){
		return this.hospz_med_exam_todt;
	}

	public String getSply_clsf_cd(){
		return this.sply_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_8011_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_8011_LDM dm = (HD_AFFR_8011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sply_ward_fee);
		cstmt.setString(8, dm.hospz_med_exam_frdt);
		cstmt.setString(9, dm.hospz_med_exam_todt);
		cstmt.setString(10, dm.sply_clsf_cd);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_8011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sply_ward_fee = [" + getSply_ward_fee() + "]");
		System.out.println("hospz_med_exam_frdt = [" + getHospz_med_exam_frdt() + "]");
		System.out.println("hospz_med_exam_todt = [" + getHospz_med_exam_todt() + "]");
		System.out.println("sply_clsf_cd = [" + getSply_clsf_cd() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String sply_ward_fee = req.getParameter("sply_ward_fee");
if( sply_ward_fee == null){
	System.out.println(this.toString+" : sply_ward_fee is null" );
}else{
	System.out.println(this.toString+" : sply_ward_fee is "+sply_ward_fee );
}
String hospz_med_exam_frdt = req.getParameter("hospz_med_exam_frdt");
if( hospz_med_exam_frdt == null){
	System.out.println(this.toString+" : hospz_med_exam_frdt is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_frdt is "+hospz_med_exam_frdt );
}
String hospz_med_exam_todt = req.getParameter("hospz_med_exam_todt");
if( hospz_med_exam_todt == null){
	System.out.println(this.toString+" : hospz_med_exam_todt is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_todt is "+hospz_med_exam_todt );
}
String sply_clsf_cd = req.getParameter("sply_clsf_cd");
if( sply_clsf_cd == null){
	System.out.println(this.toString+" : sply_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sply_clsf_cd is "+sply_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sply_ward_fee = Util.checkString(req.getParameter("sply_ward_fee"));
String hospz_med_exam_frdt = Util.checkString(req.getParameter("hospz_med_exam_frdt"));
String hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
String sply_clsf_cd = Util.checkString(req.getParameter("sply_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sply_ward_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_ward_fee")));
String hospz_med_exam_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_frdt")));
String hospz_med_exam_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_todt")));
String sply_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSply_ward_fee(sply_ward_fee);
dm.setHospz_med_exam_frdt(hospz_med_exam_frdt);
dm.setHospz_med_exam_todt(hospz_med_exam_todt);
dm.setSply_clsf_cd(sply_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 17 17:18:27 KST 2012 */