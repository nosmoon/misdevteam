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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1303_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String chk;
	public String re_chk;
	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String alvc_use_dt;
	public String alvc_use_yn;
	public String alvc_plan_dt;
	public String base_alon;
	public String cmpn_alon;
	public String alon_pay_mm;
	public String u_id;

	public HD_HLYWRK_1303_ADM(){}
	public HD_HLYWRK_1303_ADM(String mode, String chk, String re_chk, String cmpy_cd, String duty_dt, String emp_no, String alvc_use_dt, String alvc_use_yn, String alvc_plan_dt, String base_alon, String cmpn_alon, String alon_pay_mm, String u_id){
		this.mode = mode;
		this.chk = chk;
		this.re_chk = re_chk;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.emp_no = emp_no;
		this.alvc_use_dt = alvc_use_dt;
		this.alvc_use_yn = alvc_use_yn;
		this.alvc_plan_dt = alvc_plan_dt;
		this.base_alon = base_alon;
		this.cmpn_alon = cmpn_alon;
		this.alon_pay_mm = alon_pay_mm;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setRe_chk(String re_chk){
		this.re_chk = re_chk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setAlvc_use_yn(String alvc_use_yn){
		this.alvc_use_yn = alvc_use_yn;
	}

	public void setAlvc_plan_dt(String alvc_plan_dt){
		this.alvc_plan_dt = alvc_plan_dt;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public void setAlon_pay_mm(String alon_pay_mm){
		this.alon_pay_mm = alon_pay_mm;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getChk(){
		return this.chk;
	}

	public String getRe_chk(){
		return this.re_chk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getAlvc_use_yn(){
		return this.alvc_use_yn;
	}

	public String getAlvc_plan_dt(){
		return this.alvc_plan_dt;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}

	public String getAlon_pay_mm(){
		return this.alon_pay_mm;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1303_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1303_ADM dm = (HD_HLYWRK_1303_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.chk);
		cstmt.setString(5, dm.re_chk);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.duty_dt);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.alvc_use_dt);
		cstmt.setString(10, dm.alvc_use_yn);
		cstmt.setString(11, dm.alvc_plan_dt);
		cstmt.setString(12, dm.base_alon);
		cstmt.setString(13, dm.cmpn_alon);
		cstmt.setString(14, dm.alon_pay_mm);
		cstmt.setString(15, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1303_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("chk = [" + getChk() + "]");
		System.out.println("re_chk = [" + getRe_chk() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("alvc_use_dt = [" + getAlvc_use_dt() + "]");
		System.out.println("alvc_use_yn = [" + getAlvc_use_yn() + "]");
		System.out.println("alvc_plan_dt = [" + getAlvc_plan_dt() + "]");
		System.out.println("base_alon = [" + getBase_alon() + "]");
		System.out.println("cmpn_alon = [" + getCmpn_alon() + "]");
		System.out.println("alon_pay_mm = [" + getAlon_pay_mm() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String chk = req.getParameter("chk");
if( chk == null){
	System.out.println(this.toString+" : chk is null" );
}else{
	System.out.println(this.toString+" : chk is "+chk );
}
String re_chk = req.getParameter("re_chk");
if( re_chk == null){
	System.out.println(this.toString+" : re_chk is null" );
}else{
	System.out.println(this.toString+" : re_chk is "+re_chk );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String alvc_use_dt = req.getParameter("alvc_use_dt");
if( alvc_use_dt == null){
	System.out.println(this.toString+" : alvc_use_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_use_dt is "+alvc_use_dt );
}
String alvc_use_yn = req.getParameter("alvc_use_yn");
if( alvc_use_yn == null){
	System.out.println(this.toString+" : alvc_use_yn is null" );
}else{
	System.out.println(this.toString+" : alvc_use_yn is "+alvc_use_yn );
}
String alvc_plan_dt = req.getParameter("alvc_plan_dt");
if( alvc_plan_dt == null){
	System.out.println(this.toString+" : alvc_plan_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_plan_dt is "+alvc_plan_dt );
}
String base_alon = req.getParameter("base_alon");
if( base_alon == null){
	System.out.println(this.toString+" : base_alon is null" );
}else{
	System.out.println(this.toString+" : base_alon is "+base_alon );
}
String cmpn_alon = req.getParameter("cmpn_alon");
if( cmpn_alon == null){
	System.out.println(this.toString+" : cmpn_alon is null" );
}else{
	System.out.println(this.toString+" : cmpn_alon is "+cmpn_alon );
}
String alon_pay_mm = req.getParameter("alon_pay_mm");
if( alon_pay_mm == null){
	System.out.println(this.toString+" : alon_pay_mm is null" );
}else{
	System.out.println(this.toString+" : alon_pay_mm is "+alon_pay_mm );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String chk = Util.checkString(req.getParameter("chk"));
String re_chk = Util.checkString(req.getParameter("re_chk"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String alvc_use_dt = Util.checkString(req.getParameter("alvc_use_dt"));
String alvc_use_yn = Util.checkString(req.getParameter("alvc_use_yn"));
String alvc_plan_dt = Util.checkString(req.getParameter("alvc_plan_dt"));
String base_alon = Util.checkString(req.getParameter("base_alon"));
String cmpn_alon = Util.checkString(req.getParameter("cmpn_alon"));
String alon_pay_mm = Util.checkString(req.getParameter("alon_pay_mm"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String chk = Util.Uni2Ksc(Util.checkString(req.getParameter("chk")));
String re_chk = Util.Uni2Ksc(Util.checkString(req.getParameter("re_chk")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String alvc_use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_dt")));
String alvc_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_yn")));
String alvc_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_plan_dt")));
String base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("base_alon")));
String cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpn_alon")));
String alon_pay_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_pay_mm")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setChk(chk);
dm.setRe_chk(re_chk);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setEmp_no(emp_no);
dm.setAlvc_use_dt(alvc_use_dt);
dm.setAlvc_use_yn(alvc_use_yn);
dm.setAlvc_plan_dt(alvc_plan_dt);
dm.setBase_alon(base_alon);
dm.setCmpn_alon(cmpn_alon);
dm.setAlon_pay_mm(alon_pay_mm);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 19:22:05 KST 2009 */