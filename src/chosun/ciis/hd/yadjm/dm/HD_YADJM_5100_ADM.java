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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_5100_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String zip_1_1;
	public String zip_2_1;
	public String addr_1;
	public String dtls_addr_1;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_YADJM_5100_ADM(){}
	public HD_YADJM_5100_ADM(String cmpy_cd, String emp_no, String zip_1_1, String zip_2_1, String addr_1, String addr_dtls_1, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.zip_1_1 = zip_1_1;
		this.zip_2_1 = zip_2_1;
		this.addr_1 = addr_1;
		this.dtls_addr_1 = addr_dtls_1;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setZip_1_1(String zip_1_1){
		this.zip_1_1 = zip_1_1;
	}

	public void setZip_2_1(String zip_2_1){
		this.zip_2_1 = zip_2_1;
	}

	public void setAddr_1(String addr_1){
		this.addr_1 = addr_1;
	}

	public void setAddr_dtls_1(String dtls_addr_1){
		this.dtls_addr_1 = dtls_addr_1;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getZip_1_1(){
		return this.zip_1_1;
	}

	public String getZip_2_1(){
		return this.zip_2_1;
	}

	public String getAddr_1(){
		return this.addr_1;
	}

	public String getAddr_dtls_1(){
		return this.dtls_addr_1;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_5100_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_5100_ADM dm = (HD_YADJM_5100_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.zip_1_1);
		cstmt.setString(6, dm.zip_2_1);
		cstmt.setString(7, dm.addr_1);
		cstmt.setString(8, dm.dtls_addr_1);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_YADJM_5100_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("zip_1_1 = [" + getZip_1_1() + "]");
		System.out.println("zip_2_1 = [" + getZip_2_1() + "]");
		System.out.println("addr_1 = [" + getAddr_1() + "]");
		System.out.println("addr_dtls_1 = [" + getAddr_dtls_1() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String zip_1_1 = req.getParameter("zip_1_1");
if( zip_1_1 == null){
	System.out.println(this.toString+" : zip_1_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1_1 is "+zip_1_1 );
}
String zip_2_1 = req.getParameter("zip_2_1");
if( zip_2_1 == null){
	System.out.println(this.toString+" : zip_2_1 is null" );
}else{
	System.out.println(this.toString+" : zip_2_1 is "+zip_2_1 );
}
String addr_1 = req.getParameter("addr_1");
if( addr_1 == null){
	System.out.println(this.toString+" : addr_1 is null" );
}else{
	System.out.println(this.toString+" : addr_1 is "+addr_1 );
}
String addr_dtls_1 = req.getParameter("addr_dtls_1");
if( addr_dtls_1 == null){
	System.out.println(this.toString+" : addr_dtls_1 is null" );
}else{
	System.out.println(this.toString+" : addr_dtls_1 is "+addr_dtls_1 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String zip_1_1 = Util.checkString(req.getParameter("zip_1_1"));
String zip_2_1 = Util.checkString(req.getParameter("zip_2_1"));
String addr_1 = Util.checkString(req.getParameter("addr_1"));
String addr_dtls_1 = Util.checkString(req.getParameter("addr_dtls_1"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String zip_1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1_1")));
String zip_2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2_1")));
String addr_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_1")));
String addr_dtls_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_dtls_1")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setZip_1_1(zip_1_1);
dm.setZip_2_1(zip_2_1);
dm.setAddr_1(addr_1);
dm.setAddr_dtls_1(addr_dtls_1);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 19 16:05:01 KST 2010 */