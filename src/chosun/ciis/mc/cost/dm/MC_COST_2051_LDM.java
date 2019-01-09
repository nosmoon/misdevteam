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


public class MC_COST_2051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String cost_clsf;
	public String cost_dstb_cd;
	public String cost_dstb_cdfr;
	public String cost_dstb_cdto;

	public MC_COST_2051_LDM(){}
	public MC_COST_2051_LDM(String cmpy_cd, String yymm, String cost_clsf, String cost_dstb_cd, String cost_dstb_cdfr, String cost_dstb_cdto){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.cost_clsf = cost_clsf;
		this.cost_dstb_cd = cost_dstb_cd;
		this.cost_dstb_cdfr = cost_dstb_cdfr;
		this.cost_dstb_cdto = cost_dstb_cdto;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_cdfr(String cost_dstb_cdfr){
		this.cost_dstb_cdfr = cost_dstb_cdfr;
	}

	public void setCost_dstb_cdto(String cost_dstb_cdto){
		this.cost_dstb_cdto = cost_dstb_cdto;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_cdfr(){
		return this.cost_dstb_cdfr;
	}

	public String getCost_dstb_cdto(){
		return this.cost_dstb_cdto;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2051_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2051_LDM dm = (MC_COST_2051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.cost_clsf);
		cstmt.setString(6, dm.cost_dstb_cd);
		cstmt.setString(7, dm.cost_dstb_cdfr);
		cstmt.setString(8, dm.cost_dstb_cdto);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
		System.out.println("cost_dstb_cd = [" + getCost_dstb_cd() + "]");
		System.out.println("cost_dstb_cdfr = [" + getCost_dstb_cdfr() + "]");
		System.out.println("cost_dstb_cdto = [" + getCost_dstb_cdto() + "]");
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
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
String cost_dstb_cd = req.getParameter("cost_dstb_cd");
if( cost_dstb_cd == null){
	System.out.println(this.toString+" : cost_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd is "+cost_dstb_cd );
}
String cost_dstb_cdfr = req.getParameter("cost_dstb_cdfr");
if( cost_dstb_cdfr == null){
	System.out.println(this.toString+" : cost_dstb_cdfr is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cdfr is "+cost_dstb_cdfr );
}
String cost_dstb_cdto = req.getParameter("cost_dstb_cdto");
if( cost_dstb_cdto == null){
	System.out.println(this.toString+" : cost_dstb_cdto is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cdto is "+cost_dstb_cdto );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
String cost_dstb_cdfr = Util.checkString(req.getParameter("cost_dstb_cdfr"));
String cost_dstb_cdto = Util.checkString(req.getParameter("cost_dstb_cdto"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String cost_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd")));
String cost_dstb_cdfr = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cdfr")));
String cost_dstb_cdto = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cdto")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setCost_clsf(cost_clsf);
dm.setCost_dstb_cd(cost_dstb_cd);
dm.setCost_dstb_cdfr(cost_dstb_cdfr);
dm.setCost_dstb_cdto(cost_dstb_cdto);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 15:26:36 KST 2009 */