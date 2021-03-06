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


public class MC_COST_1003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cost_dstb_cd;

	public MC_COST_1003_LDM(){}
	public MC_COST_1003_LDM(String cmpy_cd, String cost_dstb_cd){
		this.cmpy_cd = cmpy_cd;
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1003_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1003_LDM dm = (MC_COST_1003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cost_dstb_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cost_dstb_cd = [" + getCost_dstb_cd() + "]");
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
String cost_dstb_cd = req.getParameter("cost_dstb_cd");
if( cost_dstb_cd == null){
	System.out.println(this.toString+" : cost_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd is "+cost_dstb_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cost_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCost_dstb_cd(cost_dstb_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 10:41:54 KST 2009 */