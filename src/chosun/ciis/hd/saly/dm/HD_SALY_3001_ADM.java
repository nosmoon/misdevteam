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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String saly_yy;
	public String saly_no;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String etc_dduc_nm_1;
	public String etc_dduc_1;
	public String etc_dduc_nm_2;
	public String etc_dduc_2;
	public String etc_dduc_nm_3;
	public String etc_dduc_3;
	public String etc_dduc_nm_4;
	public String etc_dduc_4;
	public String etc_dduc_nm_5;
	public String etc_dduc_5;
	public String prvmm_mstk_dduc;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String etc_dduc_remk;

	public HD_SALY_3001_ADM(){}
	public HD_SALY_3001_ADM(String cmpy_cd, String mode, String saly_yy, String saly_no, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String etc_dduc_nm_1, String etc_dduc_1, String etc_dduc_nm_2, String etc_dduc_2, String etc_dduc_nm_3, String etc_dduc_3, String etc_dduc_nm_4, String etc_dduc_4,String etc_dduc_nm_5, String etc_dduc_5, String prvmm_mstk_dduc, String incmg_pers_ipadd, String incmg_pers, String etc_dduc_remk){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.etc_dduc_nm_1 = etc_dduc_nm_1;
		this.etc_dduc_1 = etc_dduc_1;
		this.etc_dduc_nm_2 = etc_dduc_nm_2;
		this.etc_dduc_2 = etc_dduc_2;
		this.etc_dduc_nm_3 = etc_dduc_nm_3;
		this.etc_dduc_3 = etc_dduc_3;
		this.etc_dduc_nm_4 = etc_dduc_nm_4;
		this.etc_dduc_4 = etc_dduc_4;
		this.etc_dduc_nm_5 = etc_dduc_nm_5;
		this.etc_dduc_5 = etc_dduc_5;
		this.prvmm_mstk_dduc = prvmm_mstk_dduc;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.etc_dduc_remk = etc_dduc_remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setEtc_dduc_nm_1(String etc_dduc_nm_1){
		this.etc_dduc_nm_1 = etc_dduc_nm_1;
	}

	public void setEtc_dduc_1(String etc_dduc_1){
		this.etc_dduc_1 = etc_dduc_1;
	}

	public void setEtc_dduc_nm_2(String etc_dduc_nm_2){
		this.etc_dduc_nm_2 = etc_dduc_nm_2;
	}

	public void setEtc_dduc_2(String etc_dduc_2){
		this.etc_dduc_2 = etc_dduc_2;
	}

	public void setEtc_dduc_nm_3(String etc_dduc_nm_3){
		this.etc_dduc_nm_3 = etc_dduc_nm_3;
	}

	public void setEtc_dduc_3(String etc_dduc_3){
		this.etc_dduc_3 = etc_dduc_3;
	}

	public void setEtc_dduc_nm_4(String etc_dduc_nm_4){
		this.etc_dduc_nm_4 = etc_dduc_nm_4;
	}

	public void setEtc_dduc_4(String etc_dduc_4){
		this.etc_dduc_4 = etc_dduc_4;
	}
	
	public void setEtc_dduc_nm_5(String etc_dduc_nm_5){
		this.etc_dduc_nm_5 = etc_dduc_nm_5;
	}

	public void setEtc_dduc_5(String etc_dduc_5){
		this.etc_dduc_5 = etc_dduc_5;
	}

	public void setPrvmm_mstk_dduc(String prvmm_mstk_dduc){
		this.prvmm_mstk_dduc = prvmm_mstk_dduc;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setEtc_dduc_remk(String etc_dduc_remk){
		this.etc_dduc_remk = etc_dduc_remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getEtc_dduc_nm_1(){
		return this.etc_dduc_nm_1;
	}

	public String getEtc_dduc_1(){
		return this.etc_dduc_1;
	}

	public String getEtc_dduc_nm_2(){
		return this.etc_dduc_nm_2;
	}

	public String getEtc_dduc_2(){
		return this.etc_dduc_2;
	}

	public String getEtc_dduc_nm_3(){
		return this.etc_dduc_nm_3;
	}

	public String getEtc_dduc_3(){
		return this.etc_dduc_3;
	}

	public String getEtc_dduc_nm_4(){
		return this.etc_dduc_nm_4;
	} 

	public String getEtc_dduc_4(){
		return this.etc_dduc_4;
	}
	public String getEtc_dduc_nm_5(){
		return this.etc_dduc_nm_5;
	}

	public String getEtc_dduc_5(){
		return this.etc_dduc_5;
	}
	
	public String getPrvmm_mstk_dduc(){
		return this.prvmm_mstk_dduc;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getEtc_dduc_remk(){
		return this.etc_dduc_remk;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_3001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_3001_ADM dm = (HD_SALY_3001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.saly_yy);
		cstmt.setString(6, dm.saly_no);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.etc_dduc_nm_1);
		cstmt.setString(13, dm.etc_dduc_1);
		cstmt.setString(14, dm.etc_dduc_nm_2);
		cstmt.setString(15, dm.etc_dduc_2);
		cstmt.setString(16, dm.etc_dduc_nm_3);
		cstmt.setString(17, dm.etc_dduc_3);
		cstmt.setString(18, dm.etc_dduc_nm_4);
		cstmt.setString(19, dm.etc_dduc_4);
		cstmt.setString(20, dm.etc_dduc_nm_5);
		cstmt.setString(21, dm.etc_dduc_5);
		cstmt.setString(22, dm.prvmm_mstk_dduc);
		cstmt.setString(23, dm.incmg_pers_ipadd);
		cstmt.setString(24, dm.incmg_pers);
		cstmt.setString(25, dm.etc_dduc_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_3001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("etc_dduc_nm_1 = [" + getEtc_dduc_nm_1() + "]");
		System.out.println("etc_dduc_1 = [" + getEtc_dduc_1() + "]");
		System.out.println("etc_dduc_nm_2 = [" + getEtc_dduc_nm_2() + "]");
		System.out.println("etc_dduc_2 = [" + getEtc_dduc_2() + "]");
		System.out.println("etc_dduc_nm_3 = [" + getEtc_dduc_nm_3() + "]");
		System.out.println("etc_dduc_3 = [" + getEtc_dduc_3() + "]");
		System.out.println("etc_dduc_nm_4 = [" + getEtc_dduc_nm_4() + "]");
		System.out.println("etc_dduc_4 = [" + getEtc_dduc_4() + "]");
		System.out.println("etc_dduc_nm_5 = [" + getEtc_dduc_nm_5() + "]");
		System.out.println("etc_dduc_5 = [" + getEtc_dduc_5() + "]");
		System.out.println("prvmm_mstk_dduc = [" + getPrvmm_mstk_dduc() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("etc_dduc_remk = [" + getEtc_dduc_remk() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String etc_dduc_nm_1 = req.getParameter("etc_dduc_nm_1");
if( etc_dduc_nm_1 == null){
	System.out.println(this.toString+" : etc_dduc_nm_1 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_nm_1 is "+etc_dduc_nm_1 );
}
String etc_dduc_1 = req.getParameter("etc_dduc_1");
if( etc_dduc_1 == null){
	System.out.println(this.toString+" : etc_dduc_1 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_1 is "+etc_dduc_1 );
}
String etc_dduc_nm_2 = req.getParameter("etc_dduc_nm_2");
if( etc_dduc_nm_2 == null){
	System.out.println(this.toString+" : etc_dduc_nm_2 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_nm_2 is "+etc_dduc_nm_2 );
}
String etc_dduc_2 = req.getParameter("etc_dduc_2");
if( etc_dduc_2 == null){
	System.out.println(this.toString+" : etc_dduc_2 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_2 is "+etc_dduc_2 );
}
String etc_dduc_nm_3 = req.getParameter("etc_dduc_nm_3");
if( etc_dduc_nm_3 == null){
	System.out.println(this.toString+" : etc_dduc_nm_3 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_nm_3 is "+etc_dduc_nm_3 );
}
String etc_dduc_3 = req.getParameter("etc_dduc_3");
if( etc_dduc_3 == null){
	System.out.println(this.toString+" : etc_dduc_3 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_3 is "+etc_dduc_3 );
}
String etc_dduc_nm_4 = req.getParameter("etc_dduc_nm_4");
if( etc_dduc_nm_4 == null){
	System.out.println(this.toString+" : etc_dduc_nm_4 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_nm_4 is "+etc_dduc_nm_4 );
}
String etc_dduc_4 = req.getParameter("etc_dduc_4");
if( etc_dduc_4 == null){
	System.out.println(this.toString+" : etc_dduc_4 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_4 is "+etc_dduc_4 );
}
String prvmm_mstk_dduc = req.getParameter("prvmm_mstk_dduc");
if( prvmm_mstk_dduc == null){
	System.out.println(this.toString+" : prvmm_mstk_dduc is null" );
}else{
	System.out.println(this.toString+" : prvmm_mstk_dduc is "+prvmm_mstk_dduc );
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
String etc_dduc_remk = req.getParameter("etc_dduc_remk");
if( etc_dduc_remk == null){
	System.out.println(this.toString+" : etc_dduc_remk is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_remk is "+etc_dduc_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String etc_dduc_nm_1 = Util.checkString(req.getParameter("etc_dduc_nm_1"));
String etc_dduc_1 = Util.checkString(req.getParameter("etc_dduc_1"));
String etc_dduc_nm_2 = Util.checkString(req.getParameter("etc_dduc_nm_2"));
String etc_dduc_2 = Util.checkString(req.getParameter("etc_dduc_2"));
String etc_dduc_nm_3 = Util.checkString(req.getParameter("etc_dduc_nm_3"));
String etc_dduc_3 = Util.checkString(req.getParameter("etc_dduc_3"));
String etc_dduc_nm_4 = Util.checkString(req.getParameter("etc_dduc_nm_4"));
String etc_dduc_4 = Util.checkString(req.getParameter("etc_dduc_4"));
String prvmm_mstk_dduc = Util.checkString(req.getParameter("prvmm_mstk_dduc"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String etc_dduc_remk = Util.checkString(req.getParameter("etc_dduc_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String etc_dduc_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_nm_1")));
String etc_dduc_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_1")));
String etc_dduc_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_nm_2")));
String etc_dduc_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_2")));
String etc_dduc_nm_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_nm_3")));
String etc_dduc_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_3")));
String etc_dduc_nm_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_nm_4")));
String etc_dduc_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_4")));
String prvmm_mstk_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_mstk_dduc")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String etc_dduc_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setEtc_dduc_nm_1(etc_dduc_nm_1);
dm.setEtc_dduc_1(etc_dduc_1);
dm.setEtc_dduc_nm_2(etc_dduc_nm_2);
dm.setEtc_dduc_2(etc_dduc_2);
dm.setEtc_dduc_nm_3(etc_dduc_nm_3);
dm.setEtc_dduc_3(etc_dduc_3);
dm.setEtc_dduc_nm_4(etc_dduc_nm_4);
dm.setEtc_dduc_4(etc_dduc_4);
dm.setPrvmm_mstk_dduc(prvmm_mstk_dduc);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setEtc_dduc_remk(etc_dduc_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 22 11:27:17 KST 2013 */