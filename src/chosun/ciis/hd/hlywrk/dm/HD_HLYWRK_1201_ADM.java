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


public class HD_HLYWRK_1201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String u_id;
	public String emp_no_tm;
	public String ep_seq;

	public HD_HLYWRK_1201_ADM(){}
	public HD_HLYWRK_1201_ADM(String mode, String cmpy_cd, String duty_dt, String emp_no, String u_id, String emp_no_tm, String ep_seq){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.emp_no = emp_no;
		this.u_id = u_id;
		this.emp_no_tm = emp_no_tm;
		this.ep_seq = ep_seq;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
	}

	public void setEp_seq(String ep_seq){
		this.ep_seq = ep_seq;
	}

	public String getMode(){
		return this.mode;
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

	public String getU_id(){
		return this.u_id;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getEp_seq(){
		return this.ep_seq;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1201_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1201_ADM dm = (HD_HLYWRK_1201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.u_id);
		cstmt.setString(8, dm.emp_no_tm);
		cstmt.setString(9, dm.ep_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
		System.out.println("ep_seq = [" + getEp_seq() + "]");
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
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String emp_no_tm = req.getParameter("emp_no_tm");
if( emp_no_tm == null){
	System.out.println(this.toString+" : emp_no_tm is null" );
}else{
	System.out.println(this.toString+" : emp_no_tm is "+emp_no_tm );
}
String ep_seq = req.getParameter("ep_seq");
if( ep_seq == null){
	System.out.println(this.toString+" : ep_seq is null" );
}else{
	System.out.println(this.toString+" : ep_seq is "+ep_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String u_id = Util.checkString(req.getParameter("u_id"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String ep_seq = Util.checkString(req.getParameter("ep_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String ep_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ep_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setEmp_no(emp_no);
dm.setU_id(u_id);
dm.setEmp_no_tm(emp_no_tm);
dm.setEp_seq(ep_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 20:47:51 KST 2015 */