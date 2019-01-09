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


public class FC_ACCT_2904_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_rmtt_dt;

	public FC_ACCT_2904_LDM(){}
	public FC_ACCT_2904_LDM(String cmpy_cd, String acct_rmtt_dt){
		this.cmpy_cd = cmpy_cd;
		this.acct_rmtt_dt = acct_rmtt_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_rmtt_dt(String acct_rmtt_dt){
		this.acct_rmtt_dt = acct_rmtt_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_rmtt_dt(){
		return this.acct_rmtt_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2904_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2904_LDM dm = (FC_ACCT_2904_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_rmtt_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2904_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_rmtt_dt = [" + getAcct_rmtt_dt() + "]");
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
String acct_rmtt_dt = req.getParameter("acct_rmtt_dt");
if( acct_rmtt_dt == null){
	System.out.println(this.toString+" : acct_rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : acct_rmtt_dt is "+acct_rmtt_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_rmtt_dt = Util.checkString(req.getParameter("acct_rmtt_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_rmtt_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_rmtt_dt(acct_rmtt_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 16:01:18 KST 2009 */