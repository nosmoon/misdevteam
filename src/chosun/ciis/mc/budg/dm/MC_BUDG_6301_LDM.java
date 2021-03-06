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


public class MC_BUDG_6301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String fix_fee;
	public String rate;

	public MC_BUDG_6301_LDM(){}
	public MC_BUDG_6301_LDM(String cmpy_cd, String yymm, String fix_fee, String rate){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.fix_fee = fix_fee;
		this.rate = rate;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFix_fee(String fix_fee){
		this.fix_fee = fix_fee;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFix_fee(){
		return this.fix_fee;
	}

	public String getRate(){
		return this.rate;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6301_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6301_LDM dm = (MC_BUDG_6301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.fix_fee);
		cstmt.setString(6, dm.rate);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fix_fee = [" + getFix_fee() + "]");
		System.out.println("rate = [" + getRate() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String fix_fee = req.getParameter("fix_fee");
if( fix_fee == null){
	System.out.println(this.toString+" : fix_fee is null" );
}else{
	System.out.println(this.toString+" : fix_fee is "+fix_fee );
}
String rate = req.getParameter("rate");
if( rate == null){
	System.out.println(this.toString+" : rate is null" );
}else{
	System.out.println(this.toString+" : rate is "+rate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String fix_fee = Util.checkString(req.getParameter("fix_fee"));
String rate = Util.checkString(req.getParameter("rate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fix_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_fee")));
String rate = Util.Uni2Ksc(Util.checkString(req.getParameter("rate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setFix_fee(fix_fee);
dm.setRate(rate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 13:40:29 KST 2009 */