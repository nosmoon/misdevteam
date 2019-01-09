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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_4003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt_s;
	public String fac_clsf_s;
	public String medi_cd_s;
	public String sect_cd_s;

	public MT_PAPORD_4003_LDM(){}
	public MT_PAPORD_4003_LDM(String cmpy_cd, String issu_dt_s, String fac_clsf_s, String medi_cd_s, String sect_cd_s){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt_s = issu_dt_s;
		this.fac_clsf_s = fac_clsf_s;
		this.medi_cd_s = medi_cd_s;
		this.sect_cd_s = sect_cd_s;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt_s(String issu_dt_s){
		this.issu_dt_s = issu_dt_s;
	}

	public void setFac_clsf_s(String fac_clsf_s){
		this.fac_clsf_s = fac_clsf_s;
	}

	public void setMedi_cd_s(String medi_cd_s){
		this.medi_cd_s = medi_cd_s;
	}

	public void setSect_cd_s(String sect_cd_s){
		this.sect_cd_s = sect_cd_s;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt_s(){
		return this.issu_dt_s;
	}

	public String getFac_clsf_s(){
		return this.fac_clsf_s;
	}

	public String getMedi_cd_s(){
		return this.medi_cd_s;
	}

	public String getSect_cd_s(){
		return this.sect_cd_s;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_4003_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_4003_LDM dm = (MT_PAPORD_4003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt_s);
		cstmt.setString(5, dm.fac_clsf_s);
		cstmt.setString(6, dm.medi_cd_s);
		cstmt.setString(7, dm.sect_cd_s);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_4003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt_s = [" + getIssu_dt_s() + "]");
		System.out.println("fac_clsf_s = [" + getFac_clsf_s() + "]");
		System.out.println("medi_cd_s = [" + getMedi_cd_s() + "]");
		System.out.println("sect_cd_s = [" + getSect_cd_s() + "]");
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
String issu_dt_s = req.getParameter("issu_dt_s");
if( issu_dt_s == null){
	System.out.println(this.toString+" : issu_dt_s is null" );
}else{
	System.out.println(this.toString+" : issu_dt_s is "+issu_dt_s );
}
String fac_clsf_s = req.getParameter("fac_clsf_s");
if( fac_clsf_s == null){
	System.out.println(this.toString+" : fac_clsf_s is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_s is "+fac_clsf_s );
}
String medi_cd_s = req.getParameter("medi_cd_s");
if( medi_cd_s == null){
	System.out.println(this.toString+" : medi_cd_s is null" );
}else{
	System.out.println(this.toString+" : medi_cd_s is "+medi_cd_s );
}
String sect_cd_s = req.getParameter("sect_cd_s");
if( sect_cd_s == null){
	System.out.println(this.toString+" : sect_cd_s is null" );
}else{
	System.out.println(this.toString+" : sect_cd_s is "+sect_cd_s );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt_s = Util.checkString(req.getParameter("issu_dt_s"));
String fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
String medi_cd_s = Util.checkString(req.getParameter("medi_cd_s"));
String sect_cd_s = Util.checkString(req.getParameter("sect_cd_s"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt_s = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_s")));
String fac_clsf_s = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_s")));
String medi_cd_s = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_s")));
String sect_cd_s = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_s")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt_s(issu_dt_s);
dm.setFac_clsf_s(fac_clsf_s);
dm.setMedi_cd_s(medi_cd_s);
dm.setSect_cd_s(sect_cd_s);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 13:06:09 KST 2009 */