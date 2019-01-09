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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_clsf1;
	public String srch_clsf2;
	public String lvcmpy_yy;

	public HD_SRCH_2000_LDM(){}
	public HD_SRCH_2000_LDM(String cmpy_cd, String srch_clsf1, String srch_clsf2, String lvcmpy_yy){
		this.cmpy_cd = cmpy_cd;
		this.srch_clsf1 = srch_clsf1;
		this.srch_clsf2 = srch_clsf2;
		this.lvcmpy_yy = lvcmpy_yy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_clsf1(String srch_clsf1){
		this.srch_clsf1 = srch_clsf1;
	}

	public void setSrch_clsf2(String srch_clsf2){
		this.srch_clsf2 = srch_clsf2;
	}

	public void setLvcmpy_yy(String lvcmpy_yy){
		this.lvcmpy_yy = lvcmpy_yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_clsf1(){
		return this.srch_clsf1;
	}

	public String getSrch_clsf2(){
		return this.srch_clsf2;
	}

	public String getLvcmpy_yy(){
		return this.lvcmpy_yy;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_2000_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_2000_LDM dm = (HD_SRCH_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_clsf1);
		cstmt.setString(5, dm.srch_clsf2);
		cstmt.setString(6, dm.lvcmpy_yy);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_2000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("srch_clsf1 = [" + getSrch_clsf1() + "]");
		System.out.println("srch_clsf2 = [" + getSrch_clsf2() + "]");
		System.out.println("lvcmpy_yy = [" + getLvcmpy_yy() + "]");
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
String srch_clsf1 = req.getParameter("srch_clsf1");
if( srch_clsf1 == null){
	System.out.println(this.toString+" : srch_clsf1 is null" );
}else{
	System.out.println(this.toString+" : srch_clsf1 is "+srch_clsf1 );
}
String srch_clsf2 = req.getParameter("srch_clsf2");
if( srch_clsf2 == null){
	System.out.println(this.toString+" : srch_clsf2 is null" );
}else{
	System.out.println(this.toString+" : srch_clsf2 is "+srch_clsf2 );
}
String lvcmpy_yy = req.getParameter("lvcmpy_yy");
if( lvcmpy_yy == null){
	System.out.println(this.toString+" : lvcmpy_yy is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_yy is "+lvcmpy_yy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_clsf1 = Util.checkString(req.getParameter("srch_clsf1"));
String srch_clsf2 = Util.checkString(req.getParameter("srch_clsf2"));
String lvcmpy_yy = Util.checkString(req.getParameter("lvcmpy_yy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf1")));
String srch_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf2")));
String lvcmpy_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_yy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_clsf1(srch_clsf1);
dm.setSrch_clsf2(srch_clsf2);
dm.setLvcmpy_yy(lvcmpy_yy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 07 09:57:49 KST 2015 */