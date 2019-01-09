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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2602_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cmpy_nm;
	public String aply_yymm_fr;
	public String aply_yymm_to;

	public HD_INFO_2602_LDM(){}
	public HD_INFO_2602_LDM(String cmpy_cd, String cmpy_nm, String aply_yymm_fr, String aply_yymm_to){
		this.cmpy_cd = cmpy_cd;
		this.cmpy_nm = cmpy_nm;
		this.aply_yymm_fr = aply_yymm_fr;
		this.aply_yymm_to = aply_yymm_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setAply_yymm_fr(String aply_yymm_fr){
		this.aply_yymm_fr = aply_yymm_fr;
	}

	public void setAply_yymm_to(String aply_yymm_to){
		this.aply_yymm_to = aply_yymm_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getAply_yymm_fr(){
		return this.aply_yymm_fr;
	}

	public String getAply_yymm_to(){
		return this.aply_yymm_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2602_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2602_LDM dm = (HD_INFO_2602_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cmpy_nm);
		cstmt.setString(5, dm.aply_yymm_fr);
		cstmt.setString(6, dm.aply_yymm_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2602_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmpy_nm = [" + getCmpy_nm() + "]");
		System.out.println("aply_yymm_fr = [" + getAply_yymm_fr() + "]");
		System.out.println("aply_yymm_to = [" + getAply_yymm_to() + "]");
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
String cmpy_nm = req.getParameter("cmpy_nm");
if( cmpy_nm == null){
	System.out.println(this.toString+" : cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_nm is "+cmpy_nm );
}
String aply_yymm_fr = req.getParameter("aply_yymm_fr");
if( aply_yymm_fr == null){
	System.out.println(this.toString+" : aply_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_fr is "+aply_yymm_fr );
}
String aply_yymm_to = req.getParameter("aply_yymm_to");
if( aply_yymm_to == null){
	System.out.println(this.toString+" : aply_yymm_to is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_to is "+aply_yymm_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
String aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
String aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_nm")));
String aply_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_fr")));
String aply_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCmpy_nm(cmpy_nm);
dm.setAply_yymm_fr(aply_yymm_fr);
dm.setAply_yymm_to(aply_yymm_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 15:34:37 KST 2009 */