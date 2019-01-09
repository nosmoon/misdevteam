/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_5001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{
	
	public String cmpy_cd;
	public String prn;

	public HD_DDEMP_5001_LDM(){}
	public HD_DDEMP_5001_LDM(String cmpy_cd, String prn){
		this.cmpy_cd = cmpy_cd;
		this.prn = prn;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getPrn(){
		return this.prn;
	}


	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_5001_L(? ,? ,? ,?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_5001_LDM dm = (HD_DDEMP_5001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prn);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_5001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("prn = [" + getPrn() + "]");
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
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setFlnm(flnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 04 16:48:48 KST 2017 */