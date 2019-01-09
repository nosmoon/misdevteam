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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1030_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_budg_cd;
	public String to_budg_cd;
	public String outerflag;

	public MC_BUDG_1030_LDM(){}
	public MC_BUDG_1030_LDM(String cmpy_cd, String from_budg_cd, String to_budg_cd, String outerflag){
		this.cmpy_cd = cmpy_cd;
		this.from_budg_cd = from_budg_cd;
		this.to_budg_cd = to_budg_cd;
		this.outerflag = outerflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_budg_cd(String from_budg_cd){
		this.from_budg_cd = from_budg_cd;
	}

	public void setTo_budg_cd(String to_budg_cd){
		this.to_budg_cd = to_budg_cd;
	}

	public void setOuterflag(String outerflag){
		this.outerflag = outerflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_budg_cd(){
		return this.from_budg_cd;
	}

	public String getTo_budg_cd(){
		return this.to_budg_cd;
	}

	public String getOuterflag(){
		return this.outerflag;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1030_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1030_LDM dm = (MC_BUDG_1030_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_budg_cd);
		cstmt.setString(5, dm.to_budg_cd);
		cstmt.setString(6, dm.outerflag);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1030_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_budg_cd = [" + getFrom_budg_cd() + "]");
		System.out.println("to_budg_cd = [" + getTo_budg_cd() + "]");
		System.out.println("outerflag = [" + getOuterflag() + "]");
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
String from_budg_cd = req.getParameter("from_budg_cd");
if( from_budg_cd == null){
	System.out.println(this.toString+" : from_budg_cd is null" );
}else{
	System.out.println(this.toString+" : from_budg_cd is "+from_budg_cd );
}
String to_budg_cd = req.getParameter("to_budg_cd");
if( to_budg_cd == null){
	System.out.println(this.toString+" : to_budg_cd is null" );
}else{
	System.out.println(this.toString+" : to_budg_cd is "+to_budg_cd );
}
String outerflag = req.getParameter("outerflag");
if( outerflag == null){
	System.out.println(this.toString+" : outerflag is null" );
}else{
	System.out.println(this.toString+" : outerflag is "+outerflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_budg_cd = Util.checkString(req.getParameter("from_budg_cd"));
String to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
String outerflag = Util.checkString(req.getParameter("outerflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_budg_cd")));
String to_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_cd")));
String outerflag = Util.Uni2Ksc(Util.checkString(req.getParameter("outerflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_budg_cd(from_budg_cd);
dm.setTo_budg_cd(to_budg_cd);
dm.setOuterflag(outerflag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 12:04:53 KST 2009 */