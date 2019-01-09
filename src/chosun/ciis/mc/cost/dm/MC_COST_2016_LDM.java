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


public class MC_COST_2016_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String cd;
	public String cost_dstb_cd;
	public String cost_dstb_fr;
	public String cost_dstb_to;

	public MC_COST_2016_LDM(){}
	public MC_COST_2016_LDM(String cmpy_cd, String yymm, String cd, String cost_dstb_cd, String cost_dstb_fr, String cost_dstb_to){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.cd = cd;
		this.cost_dstb_cd = cost_dstb_cd;
		this.cost_dstb_fr = cost_dstb_fr;
		this.cost_dstb_to = cost_dstb_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_fr(String cost_dstb_fr){
		this.cost_dstb_fr = cost_dstb_fr;
	}

	public void setCost_dstb_to(String cost_dstb_to){
		this.cost_dstb_to = cost_dstb_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_fr(){
		return this.cost_dstb_fr;
	}

	public String getCost_dstb_to(){
		return this.cost_dstb_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2016_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2016_LDM dm = (MC_COST_2016_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.cd);
		cstmt.setString(6, dm.cost_dstb_cd);
		cstmt.setString(7, dm.cost_dstb_fr);
		cstmt.setString(8, dm.cost_dstb_to);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2016_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("cost_dstb_cd = [" + getCost_dstb_cd() + "]");
		System.out.println("cost_dstb_fr = [" + getCost_dstb_fr() + "]");
		System.out.println("cost_dstb_to = [" + getCost_dstb_to() + "]");
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
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cost_dstb_cd = req.getParameter("cost_dstb_cd");
if( cost_dstb_cd == null){
	System.out.println(this.toString+" : cost_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd is "+cost_dstb_cd );
}
String cost_dstb_fr = req.getParameter("cost_dstb_fr");
if( cost_dstb_fr == null){
	System.out.println(this.toString+" : cost_dstb_fr is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_fr is "+cost_dstb_fr );
}
String cost_dstb_to = req.getParameter("cost_dstb_to");
if( cost_dstb_to == null){
	System.out.println(this.toString+" : cost_dstb_to is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_to is "+cost_dstb_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String cd = Util.checkString(req.getParameter("cd"));
String cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
String cost_dstb_fr = Util.checkString(req.getParameter("cost_dstb_fr"));
String cost_dstb_to = Util.checkString(req.getParameter("cost_dstb_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cost_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd")));
String cost_dstb_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_fr")));
String cost_dstb_to = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setCd(cd);
dm.setCost_dstb_cd(cost_dstb_cd);
dm.setCost_dstb_fr(cost_dstb_fr);
dm.setCost_dstb_to(cost_dstb_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 15:01:54 KST 2009 */