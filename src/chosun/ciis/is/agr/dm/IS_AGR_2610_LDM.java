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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scat_dt_fr;
	public String scat_dt_to;

	public IS_AGR_2610_LDM(){}
	public IS_AGR_2610_LDM(String cmpy_cd, String scat_dt_fr, String scat_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.scat_dt_fr = scat_dt_fr;
		this.scat_dt_to = scat_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_2610_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_2610_LDM dm = (IS_AGR_2610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scat_dt_fr);
		cstmt.setString(5, dm.scat_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_2610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scat_dt_fr = [" + getScat_dt_fr() + "]");
		System.out.println("scat_dt_to = [" + getScat_dt_to() + "]");
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
String scat_dt_fr = req.getParameter("scat_dt_fr");
if( scat_dt_fr == null){
	System.out.println(this.toString+" : scat_dt_fr is null" );
}else{
	System.out.println(this.toString+" : scat_dt_fr is "+scat_dt_fr );
}
String scat_dt_to = req.getParameter("scat_dt_to");
if( scat_dt_to == null){
	System.out.println(this.toString+" : scat_dt_to is null" );
}else{
	System.out.println(this.toString+" : scat_dt_to is "+scat_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
String scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scat_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_fr")));
String scat_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setScat_dt_fr(scat_dt_fr);
dm.setScat_dt_to(scat_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 11:54:14 KST 2012 */