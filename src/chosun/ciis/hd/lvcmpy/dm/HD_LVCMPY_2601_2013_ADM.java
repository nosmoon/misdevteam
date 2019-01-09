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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2601_2013_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_clsf;
	public String lvcmpy_dt_tm;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String jms_yn;
	public String midl_incd_clsf;
	public String pay_dt;

	public HD_LVCMPY_2601_2013_ADM(){}
	public HD_LVCMPY_2601_2013_ADM(String cmpy_cd, String emp_no, String lvcmpy_clsf, String lvcmpy_dt_tm, String incmg_pers_ipadd, String incmg_pers, String jms_yn, String midl_incd_clsf, String pay_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.lvcmpy_dt_tm = lvcmpy_dt_tm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.jms_yn = jms_yn;
		this.midl_incd_clsf = midl_incd_clsf;
		this.pay_dt = pay_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setLvcmpy_dt_tm(String lvcmpy_dt_tm){
		this.lvcmpy_dt_tm = lvcmpy_dt_tm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJms_yn(String jms_yn){
		this.jms_yn = jms_yn;
	}

	public void setMidl_incd_clsf(String midl_incd_clsf){
		this.midl_incd_clsf = midl_incd_clsf;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getLvcmpy_dt_tm(){
		return this.lvcmpy_dt_tm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJms_yn(){
		return this.jms_yn;
	}

	public String getMidl_incd_clsf(){
		return this.midl_incd_clsf;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2601_2013_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2601_2013_ADM dm = (HD_LVCMPY_2601_2013_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lvcmpy_clsf);
		cstmt.setString(6, dm.lvcmpy_dt_tm);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.jms_yn);
		cstmt.setString(10, dm.midl_incd_clsf);
		cstmt.setString(11, dm.pay_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2601_2013_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("lvcmpy_dt_tm = [" + getLvcmpy_dt_tm() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("jms_yn = [" + getJms_yn() + "]");
		System.out.println("midl_incd_clsf = [" + getMidl_incd_clsf() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
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
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
}
String lvcmpy_dt_tm = req.getParameter("lvcmpy_dt_tm");
if( lvcmpy_dt_tm == null){
	System.out.println(this.toString+" : lvcmpy_dt_tm is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt_tm is "+lvcmpy_dt_tm );
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
String jms_yn = req.getParameter("jms_yn");
if( jms_yn == null){
	System.out.println(this.toString+" : jms_yn is null" );
}else{
	System.out.println(this.toString+" : jms_yn is "+jms_yn );
}
String midl_incd_clsf = req.getParameter("midl_incd_clsf");
if( midl_incd_clsf == null){
	System.out.println(this.toString+" : midl_incd_clsf is null" );
}else{
	System.out.println(this.toString+" : midl_incd_clsf is "+midl_incd_clsf );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String lvcmpy_dt_tm = Util.checkString(req.getParameter("lvcmpy_dt_tm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String jms_yn = Util.checkString(req.getParameter("jms_yn"));
String midl_incd_clsf = Util.checkString(req.getParameter("midl_incd_clsf"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String lvcmpy_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt_tm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String jms_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("jms_yn")));
String midl_incd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("midl_incd_clsf")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setLvcmpy_dt_tm(lvcmpy_dt_tm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setJms_yn(jms_yn);
dm.setMidl_incd_clsf(midl_incd_clsf);
dm.setPay_dt(pay_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 23 17:22:54 KST 2013 */