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


package chosun.ciis.ad.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.ds.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_yyyy;

	public AD_EVLU_2000_LDM(){}
	public AD_EVLU_2000_LDM(String cmpy_cd, String pubc_yyyy){
		this.cmpy_cd = cmpy_cd;
		this.pubc_yyyy = pubc_yyyy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_yyyy(String pubc_yyyy){
		this.pubc_yyyy = pubc_yyyy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_yyyy(){
		return this.pubc_yyyy;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_EVLU_2000_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_EVLU_2000_LDM dm = (AD_EVLU_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_yyyy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new AD_EVLU_2000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pubc_yyyy = [" + getPubc_yyyy() + "]");
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
String pubc_yyyy = req.getParameter("pubc_yyyy");
if( pubc_yyyy == null){
	System.out.println(this.toString+" : pubc_yyyy is null" );
}else{
	System.out.println(this.toString+" : pubc_yyyy is "+pubc_yyyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_yyyy = Util.checkString(req.getParameter("pubc_yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_yyyy(pubc_yyyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 18:22:02 KST 2010 */