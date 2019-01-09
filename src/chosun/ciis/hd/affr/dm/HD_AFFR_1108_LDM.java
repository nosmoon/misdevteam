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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1108_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String preng_condo_area_cd_1;
	public String preng_condo_area_cd_2;
	public String real_preng_condo_area_cd;

	public HD_AFFR_1108_LDM(){}
	public HD_AFFR_1108_LDM(String cmpy_cd, String preng_condo_area_cd_1, String preng_condo_area_cd_2, String real_preng_condo_area_cd){
		this.cmpy_cd = cmpy_cd;
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
		this.real_preng_condo_area_cd = real_preng_condo_area_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPreng_condo_area_cd_1(String preng_condo_area_cd_1){
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
	}

	public void setPreng_condo_area_cd_2(String preng_condo_area_cd_2){
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
	}

	public void setReal_preng_condo_area_cd(String real_preng_condo_area_cd){
		this.real_preng_condo_area_cd = real_preng_condo_area_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPreng_condo_area_cd_1(){
		return this.preng_condo_area_cd_1;
	}

	public String getPreng_condo_area_cd_2(){
		return this.preng_condo_area_cd_2;
	}

	public String getReal_preng_condo_area_cd(){
		return this.real_preng_condo_area_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1108_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1108_LDM dm = (HD_AFFR_1108_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.preng_condo_area_cd_1);
		cstmt.setString(5, dm.preng_condo_area_cd_2);
		cstmt.setString(6, dm.real_preng_condo_area_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1108_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("preng_condo_area_cd_1 = [" + getPreng_condo_area_cd_1() + "]");
		System.out.println("preng_condo_area_cd_2 = [" + getPreng_condo_area_cd_2() + "]");
		System.out.println("real_preng_condo_area_cd = [" + getReal_preng_condo_area_cd() + "]");
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
String preng_condo_area_cd_1 = req.getParameter("preng_condo_area_cd_1");
if( preng_condo_area_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_1 is "+preng_condo_area_cd_1 );
}
String preng_condo_area_cd_2 = req.getParameter("preng_condo_area_cd_2");
if( preng_condo_area_cd_2 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_2 is "+preng_condo_area_cd_2 );
}
String real_preng_condo_area_cd = req.getParameter("real_preng_condo_area_cd");
if( real_preng_condo_area_cd == null){
	System.out.println(this.toString+" : real_preng_condo_area_cd is null" );
}else{
	System.out.println(this.toString+" : real_preng_condo_area_cd is "+real_preng_condo_area_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String preng_condo_area_cd_1 = Util.checkString(req.getParameter("preng_condo_area_cd_1"));
String preng_condo_area_cd_2 = Util.checkString(req.getParameter("preng_condo_area_cd_2"));
String real_preng_condo_area_cd = Util.checkString(req.getParameter("real_preng_condo_area_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String preng_condo_area_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_1")));
String preng_condo_area_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_2")));
String real_preng_condo_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("real_preng_condo_area_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPreng_condo_area_cd_1(preng_condo_area_cd_1);
dm.setPreng_condo_area_cd_2(preng_condo_area_cd_2);
dm.setReal_preng_condo_area_cd(real_preng_condo_area_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 16:44:03 KST 2009 */