
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


public class HD_YADJM_1400_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flnm;
	public String connect_ip;
	public String connect_userid;

	public HD_YADJM_1400_ADM(){}
	public HD_YADJM_1400_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String flnm, String connect_ip, String connect_userid){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1400_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1400_ADM dm = (HD_YADJM_1400_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.connect_ip);
		cstmt.setString(8, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1400_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
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
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:46:42 KST 2009 */