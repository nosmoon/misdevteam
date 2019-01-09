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


public class FC_FUNC_3073_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_cd;
	public String from_expn_yymm;
	public String to_expn_yymm;

	public FC_FUNC_3073_LDM(){}
	public FC_FUNC_3073_LDM(String cmpy_cd, String fund_cd, String from_expn_yymm, String to_expn_yymm){
		this.cmpy_cd = cmpy_cd;
		this.fund_cd = fund_cd;
		this.from_expn_yymm = from_expn_yymm;
		this.to_expn_yymm = to_expn_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setFrom_expn_yymm(String from_expn_yymm){
		this.from_expn_yymm = from_expn_yymm;
	}

	public void setTo_expn_yymm(String to_expn_yymm){
		this.to_expn_yymm = to_expn_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getFrom_expn_yymm(){
		return this.from_expn_yymm;
	}

	public String getTo_expn_yymm(){
		return this.to_expn_yymm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3073_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3073_LDM dm = (FC_FUNC_3073_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_cd);
		cstmt.setString(5, dm.from_expn_yymm);
		cstmt.setString(6, dm.to_expn_yymm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3073_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_cd = [" + getFund_cd() + "]");
		System.out.println("from_expn_yymm = [" + getFrom_expn_yymm() + "]");
		System.out.println("to_expn_yymm = [" + getTo_expn_yymm() + "]");
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
String from_expn_yymm = req.getParameter("from_expn_yymm");
if( from_expn_yymm == null){
	System.out.println(this.toString+" : from_expn_yymm is null" );
}else{
	System.out.println(this.toString+" : from_expn_yymm is "+from_expn_yymm );
}
String to_expn_yymm = req.getParameter("to_expn_yymm");
if( to_expn_yymm == null){
	System.out.println(this.toString+" : to_expn_yymm is null" );
}else{
	System.out.println(this.toString+" : to_expn_yymm is "+to_expn_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_cd = Util.checkString(req.getParameter("fund_cd"));
String from_expn_yymm = Util.checkString(req.getParameter("from_expn_yymm"));
String to_expn_yymm = Util.checkString(req.getParameter("to_expn_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_cd")));
String from_expn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("from_expn_yymm")));
String to_expn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_expn_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_cd(fund_cd);
dm.setFrom_expn_yymm(from_expn_yymm);
dm.setTo_expn_yymm(to_expn_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 14:18:03 KST 2009 */