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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1301_344_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String send;
	public String retu;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String emp_no_tm;
	public String ep_seq;
	public String duty_clsf;

	public HD_DUTY_1301_344_ADM(){}
	public HD_DUTY_1301_344_ADM(String cmpy_cd, String duty_dt, String emp_no, String send, String retu, String incmg_pers_ipadd, String incmg_pers, String emp_no_tm, String ep_seq, String duty_clsf){
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.emp_no = emp_no;
		this.send = send;
		this.retu = retu;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.emp_no_tm = emp_no_tm;
		this.ep_seq = ep_seq;
		this.duty_clsf = duty_clsf;
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

	public void setSend(String send){
		this.send = send;
	}

	public void setRetu(String retu){
		this.retu = retu;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
	}

	public void setEp_seq(String ep_seq){
		this.ep_seq = ep_seq;
	}

	public void setDuty_clsf(String duty_clsf){
		this.duty_clsf = duty_clsf;
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

	public String getSend(){
		return this.send;
	}

	public String getRetu(){
		return this.retu;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getEp_seq(){
		return this.ep_seq;
	}

	public String getDuty_clsf(){
		return this.duty_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1301_344_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1301_344_ADM dm = (HD_DUTY_1301_344_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.duty_dt);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.send);
		cstmt.setString(7, dm.retu);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.emp_no_tm);
		cstmt.setString(11, dm.ep_seq);
		cstmt.setString(12, dm.duty_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1301_344_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("send = [" + getSend() + "]");
		System.out.println("retu = [" + getRetu() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
		System.out.println("ep_seq = [" + getEp_seq() + "]");
		System.out.println("duty_clsf = [" + getDuty_clsf() + "]");
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
String send = req.getParameter("send");
if( send == null){
	System.out.println(this.toString+" : send is null" );
}else{
	System.out.println(this.toString+" : send is "+send );
}
String retu = req.getParameter("retu");
if( retu == null){
	System.out.println(this.toString+" : retu is null" );
}else{
	System.out.println(this.toString+" : retu is "+retu );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
String duty_clsf = req.getParameter("duty_clsf");
if( duty_clsf == null){
	System.out.println(this.toString+" : duty_clsf is null" );
}else{
	System.out.println(this.toString+" : duty_clsf is "+duty_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String send = Util.checkString(req.getParameter("send"));
String retu = Util.checkString(req.getParameter("retu"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String ep_seq = Util.checkString(req.getParameter("ep_seq"));
String duty_clsf = Util.checkString(req.getParameter("duty_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String send = Util.Uni2Ksc(Util.checkString(req.getParameter("send")));
String retu = Util.Uni2Ksc(Util.checkString(req.getParameter("retu")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String ep_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ep_seq")));
String duty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setEmp_no(emp_no);
dm.setSend(send);
dm.setRetu(retu);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setEmp_no_tm(emp_no_tm);
dm.setEp_seq(ep_seq);
dm.setDuty_clsf(duty_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 31 17:31:34 KST 2012 */