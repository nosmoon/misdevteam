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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String select_dt;
	public String frdt;
	public String todt;
	public String cslcrg_pers;
	public String pubc_slip_no;
	public String acct_cd;
	public String emp_no;

	public AD_PUB_3610_LDM(){}
	public AD_PUB_3610_LDM(String cmpy_cd, String medi_cd, String select_dt, String frdt, String todt, String cslcrg_pers, String pubc_slip_no, String acct_cd, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.cslcrg_pers = cslcrg_pers;
		this.pubc_slip_no = pubc_slip_no;
		this.acct_cd = acct_cd;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setCslcrg_pers(String cslcrg_pers){
		this.cslcrg_pers = cslcrg_pers;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getCslcrg_pers(){
		return this.cslcrg_pers;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3610_LDM dm = (AD_PUB_3610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.select_dt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.cslcrg_pers);
		cstmt.setString(9, dm.pubc_slip_no);
		cstmt.setString(10, dm.acct_cd);
		cstmt.setString(11, dm.emp_no);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("cslcrg_pers = [" + getCslcrg_pers() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String cslcrg_pers = req.getParameter("cslcrg_pers");
if( cslcrg_pers == null){
	System.out.println(this.toString+" : cslcrg_pers is null" );
}else{
	System.out.println(this.toString+" : cslcrg_pers is "+cslcrg_pers );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String cslcrg_pers = Util.checkString(req.getParameter("cslcrg_pers"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String cslcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("cslcrg_pers")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSelect_dt(select_dt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setCslcrg_pers(cslcrg_pers);
dm.setPubc_slip_no(pubc_slip_no);
dm.setAcct_cd(acct_cd);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 14:07:44 KST 2015 */