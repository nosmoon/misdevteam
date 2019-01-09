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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2080_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_cd;
	public String incm_clsf_cd;
	public String prop_equip_cd;

	public FC_ACCT_2080_MDM(){}
	public FC_ACCT_2080_MDM(String cmpy_cd, String budg_cd, String incm_clsf_cd, String prop_equip_cd){
		this.cmpy_cd = cmpy_cd;
		this.budg_cd = budg_cd;
		this.incm_clsf_cd = incm_clsf_cd;
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2080_M(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2080_MDM dm = (FC_ACCT_2080_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_cd);
		cstmt.setString(5, dm.incm_clsf_cd);
		cstmt.setString(6, dm.prop_equip_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2080_MDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("incm_clsf_cd = " + getIncm_clsf_cd());
        System.out.println("prop_equip_cd = " + getProp_equip_cd());
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
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String prop_equip_cd = req.getParameter("prop_equip_cd");
if( prop_equip_cd == null){
	System.out.println(this.toString+" : prop_equip_cd is null" );
}else{
	System.out.println(this.toString+" : prop_equip_cd is "+prop_equip_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String prop_equip_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prop_equip_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_cd(budg_cd);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setProp_equip_cd(prop_equip_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 21:07:42 KST 2009 */