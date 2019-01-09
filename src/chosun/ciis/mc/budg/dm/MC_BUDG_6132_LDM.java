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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6132_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy_bf;
	public String tms_bf;
	public String yyyy_af;
	public String tms_af;

	public MC_BUDG_6132_LDM(){}
	public MC_BUDG_6132_LDM(String cmpy_cd, String yyyy_bf, String tms_bf, String yyyy_af, String tms_af){
		this.cmpy_cd = cmpy_cd;
		this.yyyy_bf = yyyy_bf;
		this.tms_bf = tms_bf;
		this.yyyy_af = yyyy_af;
		this.tms_af = tms_af;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy_bf(String yyyy_bf){
		this.yyyy_bf = yyyy_bf;
	}

	public void setTms_bf(String tms_bf){
		this.tms_bf = tms_bf;
	}

	public void setYyyy_af(String yyyy_af){
		this.yyyy_af = yyyy_af;
	}

	public void setTms_af(String tms_af){
		this.tms_af = tms_af;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy_bf(){
		return this.yyyy_bf;
	}

	public String getTms_bf(){
		return this.tms_bf;
	}

	public String getYyyy_af(){
		return this.yyyy_af;
	}

	public String getTms_af(){
		return this.tms_af;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6132_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6132_LDM dm = (MC_BUDG_6132_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy_bf);
		cstmt.setString(5, dm.tms_bf);
		cstmt.setString(6, dm.yyyy_af);
		cstmt.setString(7, dm.tms_af);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6132_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy_bf = [" + getYyyy_bf() + "]");
		System.out.println("tms_bf = [" + getTms_bf() + "]");
		System.out.println("yyyy_af = [" + getYyyy_af() + "]");
		System.out.println("tms_af = [" + getTms_af() + "]");
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
String yyyy_bf = req.getParameter("yyyy_bf");
if( yyyy_bf == null){
	System.out.println(this.toString+" : yyyy_bf is null" );
}else{
	System.out.println(this.toString+" : yyyy_bf is "+yyyy_bf );
}
String tms_bf = req.getParameter("tms_bf");
if( tms_bf == null){
	System.out.println(this.toString+" : tms_bf is null" );
}else{
	System.out.println(this.toString+" : tms_bf is "+tms_bf );
}
String yyyy_af = req.getParameter("yyyy_af");
if( yyyy_af == null){
	System.out.println(this.toString+" : yyyy_af is null" );
}else{
	System.out.println(this.toString+" : yyyy_af is "+yyyy_af );
}
String tms_af = req.getParameter("tms_af");
if( tms_af == null){
	System.out.println(this.toString+" : tms_af is null" );
}else{
	System.out.println(this.toString+" : tms_af is "+tms_af );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy_bf = Util.checkString(req.getParameter("yyyy_bf"));
String tms_bf = Util.checkString(req.getParameter("tms_bf"));
String yyyy_af = Util.checkString(req.getParameter("yyyy_af"));
String tms_af = Util.checkString(req.getParameter("tms_af"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy_bf = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy_bf")));
String tms_bf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_bf")));
String yyyy_af = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy_af")));
String tms_af = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_af")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy_bf(yyyy_bf);
dm.setTms_bf(tms_bf);
dm.setYyyy_af(yyyy_af);
dm.setTms_af(tms_af);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */