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


public class FC_ACCT_5510_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_yymm;
	public String from_insd_acct_cd;
	public String to_insd_acct_cd;

	public FC_ACCT_5510_PDM(){}
	public FC_ACCT_5510_PDM(String cmpy_cd, String fisc_yymm, String from_insd_acct_cd, String to_insd_acct_cd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_yymm = fisc_yymm;
		this.from_insd_acct_cd = from_insd_acct_cd;
		this.to_insd_acct_cd = to_insd_acct_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_yymm(String fisc_yymm){
		this.fisc_yymm = fisc_yymm;
	}

	public void setFrom_insd_acct_cd(String from_insd_acct_cd){
		this.from_insd_acct_cd = from_insd_acct_cd;
	}

	public void setTo_insd_acct_cd(String to_insd_acct_cd){
		this.to_insd_acct_cd = to_insd_acct_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_yymm(){
		return this.fisc_yymm;
	}

	public String getFrom_insd_acct_cd(){
		return this.from_insd_acct_cd;
	}

	public String getTo_insd_acct_cd(){
		return this.to_insd_acct_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5510_P(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5510_PDM dm = (FC_ACCT_5510_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_yymm);
		cstmt.setString(5, dm.from_insd_acct_cd);
		cstmt.setString(6, dm.to_insd_acct_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5510_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_yymm = [" + getFisc_yymm() + "]");
		System.out.println("from_insd_acct_cd = [" + getFrom_insd_acct_cd() + "]");
		System.out.println("to_insd_acct_cd = [" + getTo_insd_acct_cd() + "]");
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
String fisc_yymm = req.getParameter("fisc_yymm");
if( fisc_yymm == null){
	System.out.println(this.toString+" : fisc_yymm is null" );
}else{
	System.out.println(this.toString+" : fisc_yymm is "+fisc_yymm );
}
String from_insd_acct_cd = req.getParameter("from_insd_acct_cd");
if( from_insd_acct_cd == null){
	System.out.println(this.toString+" : from_insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : from_insd_acct_cd is "+from_insd_acct_cd );
}
String to_insd_acct_cd = req.getParameter("to_insd_acct_cd");
if( to_insd_acct_cd == null){
	System.out.println(this.toString+" : to_insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : to_insd_acct_cd is "+to_insd_acct_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
String from_insd_acct_cd = Util.checkString(req.getParameter("from_insd_acct_cd"));
String to_insd_acct_cd = Util.checkString(req.getParameter("to_insd_acct_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_yymm")));
String from_insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_insd_acct_cd")));
String to_insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_insd_acct_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_yymm(fisc_yymm);
dm.setFrom_insd_acct_cd(from_insd_acct_cd);
dm.setTo_insd_acct_cd(to_insd_acct_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 10 15:16:58 KST 2009 */