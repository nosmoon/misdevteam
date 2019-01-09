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


package chosun.ciis.pr.prtcnsg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.ds.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1402_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String issu_dt_yyyy;
	public String issu_dt_mm;
	public String medi_cd;
	public String vat;
	public String emp_no;
	public String clos_dt;

	public PR_PRTCNSG_1402_ADM(){}
	public PR_PRTCNSG_1402_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String issu_dt_yyyy, String issu_dt_mm, String medi_cd, String vat, String emp_no, String clos_dt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.issu_dt_yyyy = issu_dt_yyyy;
		this.issu_dt_mm = issu_dt_mm;
		this.medi_cd = medi_cd;
		this.vat = vat;
		this.emp_no = emp_no;
		this.clos_dt = clos_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIssu_dt_yyyy(String issu_dt_yyyy){
		this.issu_dt_yyyy = issu_dt_yyyy;
	}

	public void setIssu_dt_mm(String issu_dt_mm){
		this.issu_dt_mm = issu_dt_mm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIssu_dt_yyyy(){
		return this.issu_dt_yyyy;
	}

	public String getIssu_dt_mm(){
		return this.issu_dt_mm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getVat(){
		return this.vat;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTCNSG_1402_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTCNSG_1402_ADM dm = (PR_PRTCNSG_1402_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.issu_dt_yyyy);
		cstmt.setString(7, dm.issu_dt_mm);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.vat);
		cstmt.setString(10, dm.emp_no);
		cstmt.setString(11, dm.clos_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1402_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("issu_dt_yyyy = [" + getIssu_dt_yyyy() + "]");
		System.out.println("issu_dt_mm = [" + getIssu_dt_mm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String issu_dt_yyyy = req.getParameter("issu_dt_yyyy");
if( issu_dt_yyyy == null){
	System.out.println(this.toString+" : issu_dt_yyyy is null" );
}else{
	System.out.println(this.toString+" : issu_dt_yyyy is "+issu_dt_yyyy );
}
String issu_dt_mm = req.getParameter("issu_dt_mm");
if( issu_dt_mm == null){
	System.out.println(this.toString+" : issu_dt_mm is null" );
}else{
	System.out.println(this.toString+" : issu_dt_mm is "+issu_dt_mm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String issu_dt_yyyy = Util.checkString(req.getParameter("issu_dt_yyyy"));
String issu_dt_mm = Util.checkString(req.getParameter("issu_dt_mm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String vat = Util.checkString(req.getParameter("vat"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String issu_dt_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_yyyy")));
String issu_dt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_mm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIssu_dt_yyyy(issu_dt_yyyy);
dm.setIssu_dt_mm(issu_dt_mm);
dm.setMedi_cd(medi_cd);
dm.setVat(vat);
dm.setEmp_no(emp_no);
dm.setClos_dt(clos_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 14:31:03 KST 2009 */