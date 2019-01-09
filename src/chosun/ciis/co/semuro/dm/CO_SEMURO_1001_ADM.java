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


package chosun.ciis.co.semuro.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.ds.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String emp_no;
	public String flnm;
	public String tel_no;
	public String email;
	public String dept_cd;
	public String semuro_id;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public CO_SEMURO_1001_ADM(){}
	public CO_SEMURO_1001_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String emp_no, String flnm, String tel_no, String email, String dept_cd, String semuro_id, String incmg_pers, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.tel_no = tel_no;
		this.email = email;
		this.dept_cd = dept_cd;
		this.semuro_id = semuro_id;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call SP_CO_SEMURO_1001_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1001_ADM dm = (CO_SEMURO_1001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.tel_no);
		cstmt.setString(10, dm.email);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setString(12, dm.semuro_id);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1001_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("flnm = " + getFlnm());
        System.out.println("tel_no = " + getTel_no());
        System.out.println("email = " + getEmail());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("semuro_id = " + getSemuro_id());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String semuro_id = req.getParameter("semuro_id");
if( semuro_id == null){
	System.out.println(this.toString+" : semuro_id is null" );
}else{
	System.out.println(this.toString+" : semuro_id is "+semuro_id );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String email = Util.checkString(req.getParameter("email"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String semuro_id = Util.checkString(req.getParameter("semuro_id"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_id")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setTel_no(tel_no);
dm.setEmail(email);
dm.setDept_cd(dept_cd);
dm.setSemuro_id(semuro_id);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 18:11:50 KST 2009 */