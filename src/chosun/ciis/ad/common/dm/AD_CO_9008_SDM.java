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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_9008_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String action;
	public String cmpy_cd;
	public String dlco_clsf;
	public String srch_nm;

	public AD_CO_9008_SDM(){}
	public AD_CO_9008_SDM(String action, String cmpy_cd, String dlco_clsf, String srch_nm){
		this.action = action;
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf = dlco_clsf;
		this.srch_nm = srch_nm;
	}

	public void setAction(String action){
		this.action = action;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setSrch_nm(String srch_nm){
		this.srch_nm = srch_nm;
	}

	public String getAction(){
		return this.action;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getSrch_nm(){
		return this.srch_nm;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_9008_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_9008_SDM dm = (AD_CO_9008_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.action);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_clsf);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.srch_nm);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_9008_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("action = [" + getAction() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("srch_nm = [" + getSrch_nm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String action = req.getParameter("action");
if( action == null){
	System.out.println(this.toString+" : action is null" );
}else{
	System.out.println(this.toString+" : action is "+action );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String srch_nm = req.getParameter("srch_nm");
if( srch_nm == null){
	System.out.println(this.toString+" : srch_nm is null" );
}else{
	System.out.println(this.toString+" : srch_nm is "+srch_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String action = Util.checkString(req.getParameter("action"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String srch_nm = Util.checkString(req.getParameter("srch_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String action = Util.Uni2Ksc(Util.checkString(req.getParameter("action")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String srch_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAction(action);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setSrch_nm(srch_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 17:25:04 KST 2009 */