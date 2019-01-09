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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_4301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_frdt;
	public String occr_todt;

	public HD_AFFR_4301_LDM(){}
	public HD_AFFR_4301_LDM(String cmpy_cd, String occr_frdt, String occr_todt){
		this.cmpy_cd = cmpy_cd;
		this.occr_frdt = occr_frdt;
		this.occr_todt = occr_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_frdt(String occr_frdt){
		this.occr_frdt = occr_frdt;
	}

	public void setOccr_todt(String occr_todt){
		this.occr_todt = occr_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_frdt(){
		return this.occr_frdt;
	}

	public String getOccr_todt(){
		return this.occr_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4301_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4301_LDM dm = (HD_AFFR_4301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_frdt);
		cstmt.setString(5, dm.occr_todt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_frdt = [" + getOccr_frdt() + "]");
		System.out.println("occr_todt = [" + getOccr_todt() + "]");
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
String occr_frdt = req.getParameter("occr_frdt");
if( occr_frdt == null){
	System.out.println(this.toString+" : occr_frdt is null" );
}else{
	System.out.println(this.toString+" : occr_frdt is "+occr_frdt );
}
String occr_todt = req.getParameter("occr_todt");
if( occr_todt == null){
	System.out.println(this.toString+" : occr_todt is null" );
}else{
	System.out.println(this.toString+" : occr_todt is "+occr_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
String occr_todt = Util.checkString(req.getParameter("occr_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_frdt")));
String occr_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_frdt(occr_frdt);
dm.setOccr_todt(occr_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:28:45 KST 2009 */