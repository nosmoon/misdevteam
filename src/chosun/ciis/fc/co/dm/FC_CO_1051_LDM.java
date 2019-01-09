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


public class FC_CO_1051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insr_clsf_cd;
	public String insr_stat_cd;

	public FC_CO_1051_LDM(){}
	public FC_CO_1051_LDM(String cmpy_cd, String insr_clsf_cd, String insr_stat_cd){
		this.cmpy_cd = cmpy_cd;
		this.insr_clsf_cd = insr_clsf_cd;
		this.insr_stat_cd = insr_stat_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsr_clsf_cd(String insr_clsf_cd){
		this.insr_clsf_cd = insr_clsf_cd;
	}

	public void setInsr_stat_cd(String insr_stat_cd){
		this.insr_stat_cd = insr_stat_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsr_clsf_cd(){
		return this.insr_clsf_cd;
	}

	public String getInsr_stat_cd(){
		return this.insr_stat_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_1051_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_1051_LDM dm = (FC_CO_1051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insr_clsf_cd);
		cstmt.setString(5, dm.insr_stat_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_1051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insr_clsf_cd = [" + getInsr_clsf_cd() + "]");
		System.out.println("insr_stat_cd = [" + getInsr_stat_cd() + "]");
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
String insr_clsf_cd = req.getParameter("insr_clsf_cd");
if( insr_clsf_cd == null){
	System.out.println(this.toString+" : insr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : insr_clsf_cd is "+insr_clsf_cd );
}
String insr_stat_cd = req.getParameter("insr_stat_cd");
if( insr_stat_cd == null){
	System.out.println(this.toString+" : insr_stat_cd is null" );
}else{
	System.out.println(this.toString+" : insr_stat_cd is "+insr_stat_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
String insr_stat_cd = Util.checkString(req.getParameter("insr_stat_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf_cd")));
String insr_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_stat_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsr_clsf_cd(insr_clsf_cd);
dm.setInsr_stat_cd(insr_stat_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 15:11:20 KST 2009 */