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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_3075_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_cd;
	public String expn_yymm;
	public String expn_dt;

	public FC_FUNC_3075_DDM(){}
	public FC_FUNC_3075_DDM(String cmpy_cd, String fund_cd, String expn_yymm, String expn_dt){
		this.cmpy_cd = cmpy_cd;
		this.fund_cd = fund_cd;
		this.expn_yymm = expn_yymm;
		this.expn_dt = expn_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setExpn_yymm(String expn_yymm){
		this.expn_yymm = expn_yymm;
	}

	public void setExpn_dt(String expn_dt){
		this.expn_dt = expn_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getExpn_yymm(){
		return this.expn_yymm;
	}

	public String getExpn_dt(){
		return this.expn_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3075_D(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3075_DDM dm = (FC_FUNC_3075_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_cd);
		cstmt.setString(5, dm.expn_yymm);
		cstmt.setString(6, dm.expn_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3075_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_cd = [" + getFund_cd() + "]");
		System.out.println("expn_yymm = [" + getExpn_yymm() + "]");
		System.out.println("expn_dt = [" + getExpn_dt() + "]");
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
String fund_cd = req.getParameter("fund_cd");
if( fund_cd == null){
	System.out.println(this.toString+" : fund_cd is null" );
}else{
	System.out.println(this.toString+" : fund_cd is "+fund_cd );
}
String expn_yymm = req.getParameter("expn_yymm");
if( expn_yymm == null){
	System.out.println(this.toString+" : expn_yymm is null" );
}else{
	System.out.println(this.toString+" : expn_yymm is "+expn_yymm );
}
String expn_dt = req.getParameter("expn_dt");
if( expn_dt == null){
	System.out.println(this.toString+" : expn_dt is null" );
}else{
	System.out.println(this.toString+" : expn_dt is "+expn_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_cd = Util.checkString(req.getParameter("fund_cd"));
String expn_yymm = Util.checkString(req.getParameter("expn_yymm"));
String expn_dt = Util.checkString(req.getParameter("expn_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_cd")));
String expn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_yymm")));
String expn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_cd(fund_cd);
dm.setExpn_yymm(expn_yymm);
dm.setExpn_dt(expn_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 09:38:41 KST 2009 */