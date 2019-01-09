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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2908_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aprv_slip_occr_dt;
	public String aprv_slip_clsf_cd;
	public String aprv_slip_seq;
	public String aprv_slip_sub_seq;
	public String incmg_emp_no;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2908_DDM(){}
	public FC_ACCT_2908_DDM(String cmpy_cd, String aprv_slip_occr_dt, String aprv_slip_clsf_cd, String aprv_slip_seq, String aprv_slip_sub_seq, String incmg_emp_no, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
		this.aprv_slip_clsf_cd = aprv_slip_clsf_cd;
		this.aprv_slip_seq = aprv_slip_seq;
		this.aprv_slip_sub_seq = aprv_slip_sub_seq;
		this.incmg_emp_no = incmg_emp_no;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAprv_slip_occr_dt(String aprv_slip_occr_dt){
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
	}

	public void setAprv_slip_clsf_cd(String aprv_slip_clsf_cd){
		this.aprv_slip_clsf_cd = aprv_slip_clsf_cd;
	}

	public void setAprv_slip_seq(String aprv_slip_seq){
		this.aprv_slip_seq = aprv_slip_seq;
	}

	public void setAprv_slip_sub_seq(String aprv_slip_sub_seq){
		this.aprv_slip_sub_seq = aprv_slip_sub_seq;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAprv_slip_occr_dt(){
		return this.aprv_slip_occr_dt;
	}

	public String getAprv_slip_clsf_cd(){
		return this.aprv_slip_clsf_cd;
	}

	public String getAprv_slip_seq(){
		return this.aprv_slip_seq;
	}

	public String getAprv_slip_sub_seq(){
		return this.aprv_slip_sub_seq;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2908_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2908_DDM dm = (FC_ACCT_2908_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aprv_slip_occr_dt);
		cstmt.setString(5, dm.aprv_slip_clsf_cd);
		cstmt.setString(6, dm.aprv_slip_seq);
		cstmt.setString(7, dm.aprv_slip_sub_seq);
		cstmt.setString(8, dm.incmg_emp_no);
		cstmt.setString(9, dm.chg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2908_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aprv_slip_occr_dt = [" + getAprv_slip_occr_dt() + "]");
		System.out.println("aprv_slip_clsf_cd = [" + getAprv_slip_clsf_cd() + "]");
		System.out.println("aprv_slip_seq = [" + getAprv_slip_seq() + "]");
		System.out.println("aprv_slip_sub_seq = [" + getAprv_slip_sub_seq() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String aprv_slip_occr_dt = req.getParameter("aprv_slip_occr_dt");
if( aprv_slip_occr_dt == null){
	System.out.println(this.toString+" : aprv_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_dt is "+aprv_slip_occr_dt );
}
String aprv_slip_clsf_cd = req.getParameter("aprv_slip_clsf_cd");
if( aprv_slip_clsf_cd == null){
	System.out.println(this.toString+" : aprv_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_clsf_cd is "+aprv_slip_clsf_cd );
}
String aprv_slip_seq = req.getParameter("aprv_slip_seq");
if( aprv_slip_seq == null){
	System.out.println(this.toString+" : aprv_slip_seq is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_seq is "+aprv_slip_seq );
}
String aprv_slip_sub_seq = req.getParameter("aprv_slip_sub_seq");
if( aprv_slip_sub_seq == null){
	System.out.println(this.toString+" : aprv_slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_sub_seq is "+aprv_slip_sub_seq );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aprv_slip_occr_dt = Util.checkString(req.getParameter("aprv_slip_occr_dt"));
String aprv_slip_clsf_cd = Util.checkString(req.getParameter("aprv_slip_clsf_cd"));
String aprv_slip_seq = Util.checkString(req.getParameter("aprv_slip_seq"));
String aprv_slip_sub_seq = Util.checkString(req.getParameter("aprv_slip_sub_seq"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aprv_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_dt")));
String aprv_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_clsf_cd")));
String aprv_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_seq")));
String aprv_slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_sub_seq")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAprv_slip_occr_dt(aprv_slip_occr_dt);
dm.setAprv_slip_clsf_cd(aprv_slip_clsf_cd);
dm.setAprv_slip_seq(aprv_slip_seq);
dm.setAprv_slip_sub_seq(aprv_slip_sub_seq);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 10:28:57 KST 2009 */