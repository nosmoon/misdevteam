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


public class MC_COST_1022_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_cd;
	public String medi_dstb_cd;
	public String whco_ndstb_cd;
	public String whco_comn_cost_yn;
	public String dtls_medi_dstb_cd;
	public String incmg_pers;

	public MC_COST_1022_UDM(){}
	public MC_COST_1022_UDM(String cmpy_cd, String budg_cd, String medi_dstb_cd, String whco_ndstb_cd, String whco_comn_cost_yn, String dtls_medi_dstb_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.budg_cd = budg_cd;
		this.medi_dstb_cd = medi_dstb_cd;
		this.whco_ndstb_cd = whco_ndstb_cd;
		this.whco_comn_cost_yn = whco_comn_cost_yn;
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setMedi_dstb_cd(String medi_dstb_cd){
		this.medi_dstb_cd = medi_dstb_cd;
	}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public void setDtls_medi_dstb_cd(String dtls_medi_dstb_cd){
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getMedi_dstb_cd(){
		return this.medi_dstb_cd;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}
	
	public String getDtls_medi_dstb_cd(){
		return this.dtls_medi_dstb_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1022_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1022_UDM dm = (MC_COST_1022_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_cd);
		cstmt.setString(5, dm.medi_dstb_cd);
		cstmt.setString(6, dm.whco_ndstb_cd);
		cstmt.setString(7, dm.whco_comn_cost_yn);
		cstmt.setString(8, dm.dtls_medi_dstb_cd);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1022_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("medi_dstb_cd = [" + getMedi_dstb_cd() + "]");
		System.out.println("whco_ndstb_cd = [" + getWhco_ndstb_cd() + "]");
		System.out.println("whco_comn_cost_yn = [" + getWhco_comn_cost_yn() + "]");
		System.out.println("dtls_medi_dstb_cd = [" + getWhco_comn_cost_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String medi_dstb_cd = req.getParameter("medi_dstb_cd");
if( medi_dstb_cd == null){
	System.out.println(this.toString+" : medi_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : medi_dstb_cd is "+medi_dstb_cd );
}
String whco_ndstb_cd = req.getParameter("whco_ndstb_cd");
if( whco_ndstb_cd == null){
	System.out.println(this.toString+" : whco_ndstb_cd is null" );
}else{
	System.out.println(this.toString+" : whco_ndstb_cd is "+whco_ndstb_cd );
}
String whco_comn_cost_yn = req.getParameter("whco_comn_cost_yn");
if( whco_comn_cost_yn == null){
	System.out.println(this.toString+" : whco_comn_cost_yn is null" );
}else{
	System.out.println(this.toString+" : whco_comn_cost_yn is "+whco_comn_cost_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String medi_dstb_cd = Util.checkString(req.getParameter("medi_dstb_cd"));
String whco_ndstb_cd = Util.checkString(req.getParameter("whco_ndstb_cd"));
String whco_comn_cost_yn = Util.checkString(req.getParameter("whco_comn_cost_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String medi_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_dstb_cd")));
String whco_ndstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_ndstb_cd")));
String whco_comn_cost_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_comn_cost_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_cd(budg_cd);
dm.setMedi_dstb_cd(medi_dstb_cd);
dm.setWhco_ndstb_cd(whco_ndstb_cd);
dm.setWhco_comn_cost_yn(whco_comn_cost_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 22:11:16 KST 2009 */