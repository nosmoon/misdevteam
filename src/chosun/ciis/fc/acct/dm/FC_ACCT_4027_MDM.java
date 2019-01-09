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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_4027_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String extnc_acct_cd;

	public FC_ACCT_4027_MDM(){}
	public FC_ACCT_4027_MDM(String cmpy_cd, String extnc_acct_cd){
		this.cmpy_cd = cmpy_cd;
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setExtnc_acct_cd(String extnc_acct_cd){
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getExtnc_acct_cd(){
		return this.extnc_acct_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_4027_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_4027_MDM dm = (FC_ACCT_4027_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.extnc_acct_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_4027_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("extnc_acct_cd = [" + getExtnc_acct_cd() + "]");
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
String extnc_acct_cd = req.getParameter("extnc_acct_cd");
if( extnc_acct_cd == null){
	System.out.println(this.toString+" : extnc_acct_cd is null" );
}else{
	System.out.println(this.toString+" : extnc_acct_cd is "+extnc_acct_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String extnc_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_acct_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setExtnc_acct_cd(extnc_acct_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 13:42:01 KST 2009 */