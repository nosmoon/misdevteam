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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1044_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String cd1;
	public String cd2;

	public MC_COST_1044_UDM(){}
	public MC_COST_1044_UDM(String cmpy_cd, String yymm, String cd1, String cd2){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.cd1 = cd1;
		this.cd2 = cd2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setCd1(String cd1){
		this.cd1 = cd1;
	}

	public void setCd2(String cd2){
		this.cd2 = cd2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getCd1(){
		return this.cd1;
	}

	public String getCd2(){
		return this.cd2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1044_U(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1044_UDM dm = (MC_COST_1044_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.cd1);
		cstmt.setString(6, dm.cd2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1044_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("cd1 = [" + getCd1() + "]");
		System.out.println("cd2 = [" + getCd2() + "]");
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
String cd1 = req.getParameter("cd1");
if( cd1 == null){
	System.out.println(this.toString+" : cd1 is null" );
}else{
	System.out.println(this.toString+" : cd1 is "+cd1 );
}
String cd2 = req.getParameter("cd2");
if( cd2 == null){
	System.out.println(this.toString+" : cd2 is null" );
}else{
	System.out.println(this.toString+" : cd2 is "+cd2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String cd1 = Util.checkString(req.getParameter("cd1"));
String cd2 = Util.checkString(req.getParameter("cd2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cd1")));
String cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cd2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setCd1(cd1);
dm.setCd2(cd2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 21:19:46 KST 2009 */