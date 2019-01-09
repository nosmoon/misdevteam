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


package chosun.ciis.as.lear.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.ds.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String interest_rate;

	public AS_LEAR_1301_LDM(){}
	public AS_LEAR_1301_LDM(String cmpy_cd, String leas_fr_dt, String leas_to_dt, String interest_rate){
		this.cmpy_cd = cmpy_cd;
		this.leas_fr_dt = leas_fr_dt;
		this.leas_to_dt = leas_to_dt;
		this.interest_rate = interest_rate;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setInterest_rate(String interest_rate){
		this.interest_rate = interest_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getInterest_rate(){
		return this.interest_rate;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAR_1301_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAR_1301_LDM dm = (AS_LEAR_1301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_fr_dt);
		cstmt.setString(5, dm.leas_to_dt);
		cstmt.setString(6, dm.interest_rate);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.lear.ds.AS_LEAR_1301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_fr_dt = [" + getLeas_fr_dt() + "]");
		System.out.println("leas_to_dt = [" + getLeas_to_dt() + "]");
		System.out.println("interest_rate = [" + getInterest_rate() + "]");
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
String leas_fr_dt = req.getParameter("leas_fr_dt");
if( leas_fr_dt == null){
	System.out.println(this.toString+" : leas_fr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt is "+leas_fr_dt );
}
String leas_to_dt = req.getParameter("leas_to_dt");
if( leas_to_dt == null){
	System.out.println(this.toString+" : leas_to_dt is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt is "+leas_to_dt );
}
String interest_rate = req.getParameter("interest_rate");
if( interest_rate == null){
	System.out.println(this.toString+" : interest_rate is null" );
}else{
	System.out.println(this.toString+" : interest_rate is "+interest_rate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
String leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
String interest_rate = Util.checkString(req.getParameter("interest_rate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt")));
String leas_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt")));
String interest_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("interest_rate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_fr_dt(leas_fr_dt);
dm.setLeas_to_dt(leas_to_dt);
dm.setInterest_rate(interest_rate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 17:44:15 KST 2009 */