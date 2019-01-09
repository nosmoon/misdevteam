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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1041_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seci_clsf_cd;
	public String seci_stat_cd;

	public FC_CO_1041_LDM(){}
	public FC_CO_1041_LDM(String cmpy_cd, String seci_clsf_cd, String seci_stat_cd){
		this.cmpy_cd = cmpy_cd;
		this.seci_clsf_cd = seci_clsf_cd;
		this.seci_stat_cd = seci_stat_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setSeci_stat_cd(String seci_stat_cd){
		this.seci_stat_cd = seci_stat_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getSeci_stat_cd(){
		return this.seci_stat_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_1041_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_1041_LDM dm = (FC_CO_1041_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seci_clsf_cd);
		cstmt.setString(5, dm.seci_stat_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_1041_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seci_clsf_cd = [" + getSeci_clsf_cd() + "]");
		System.out.println("seci_stat_cd = [" + getSeci_stat_cd() + "]");
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
String seci_clsf_cd = req.getParameter("seci_clsf_cd");
if( seci_clsf_cd == null){
	System.out.println(this.toString+" : seci_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : seci_clsf_cd is "+seci_clsf_cd );
}
String seci_stat_cd = req.getParameter("seci_stat_cd");
if( seci_stat_cd == null){
	System.out.println(this.toString+" : seci_stat_cd is null" );
}else{
	System.out.println(this.toString+" : seci_stat_cd is "+seci_stat_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
String seci_stat_cd = Util.checkString(req.getParameter("seci_stat_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seci_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_clsf_cd")));
String seci_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_stat_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeci_clsf_cd(seci_clsf_cd);
dm.setSeci_stat_cd(seci_stat_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 18:11:36 KST 2009 */