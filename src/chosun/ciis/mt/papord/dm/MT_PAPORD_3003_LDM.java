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


public class MT_PAPORD_3003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt_fr_s;
	public String aply_dt_to_s;
	public String fac_clsf_s;
	public String papcmpy_cd_s;

	public MT_PAPORD_3003_LDM(){}
	public MT_PAPORD_3003_LDM(String cmpy_cd, String aply_dt_fr_s, String aply_dt_to_s, String fac_clsf_s, String papcmpy_cd_s){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt_fr_s = aply_dt_fr_s;
		this.aply_dt_to_s = aply_dt_to_s;
		this.fac_clsf_s = fac_clsf_s;
		this.papcmpy_cd_s = papcmpy_cd_s;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt_fr_s(String aply_dt_fr_s){
		this.aply_dt_fr_s = aply_dt_fr_s;
	}

	public void setAply_dt_to_s(String aply_dt_to_s){
		this.aply_dt_to_s = aply_dt_to_s;
	}

	public void setFac_clsf_s(String fac_clsf_s){
		this.fac_clsf_s = fac_clsf_s;
	}

	public void setPapcmpy_cd_s(String papcmpy_cd_s){
		this.papcmpy_cd_s = papcmpy_cd_s;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt_fr_s(){
		return this.aply_dt_fr_s;
	}

	public String getAply_dt_to_s(){
		return this.aply_dt_to_s;
	}

	public String getFac_clsf_s(){
		return this.fac_clsf_s;
	}

	public String getPapcmpy_cd_s(){
		return this.papcmpy_cd_s;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_3003_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_3003_LDM dm = (MT_PAPORD_3003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt_fr_s);
		cstmt.setString(5, dm.aply_dt_to_s);
		cstmt.setString(6, dm.fac_clsf_s);
		cstmt.setString(7, dm.papcmpy_cd_s);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_3003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt_fr_s = [" + getAply_dt_fr_s() + "]");
		System.out.println("aply_dt_to_s = [" + getAply_dt_to_s() + "]");
		System.out.println("fac_clsf_s = [" + getFac_clsf_s() + "]");
		System.out.println("papcmpy_cd_s = [" + getPapcmpy_cd_s() + "]");
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
String aply_dt_fr_s = req.getParameter("aply_dt_fr_s");
if( aply_dt_fr_s == null){
	System.out.println(this.toString+" : aply_dt_fr_s is null" );
}else{
	System.out.println(this.toString+" : aply_dt_fr_s is "+aply_dt_fr_s );
}
String aply_dt_to_s = req.getParameter("aply_dt_to_s");
if( aply_dt_to_s == null){
	System.out.println(this.toString+" : aply_dt_to_s is null" );
}else{
	System.out.println(this.toString+" : aply_dt_to_s is "+aply_dt_to_s );
}
String fac_clsf_s = req.getParameter("fac_clsf_s");
if( fac_clsf_s == null){
	System.out.println(this.toString+" : fac_clsf_s is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_s is "+fac_clsf_s );
}
String papcmpy_cd_s = req.getParameter("papcmpy_cd_s");
if( papcmpy_cd_s == null){
	System.out.println(this.toString+" : papcmpy_cd_s is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd_s is "+papcmpy_cd_s );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
String aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
String fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
String papcmpy_cd_s = Util.checkString(req.getParameter("papcmpy_cd_s"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt_fr_s = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_fr_s")));
String aply_dt_to_s = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_to_s")));
String fac_clsf_s = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_s")));
String papcmpy_cd_s = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd_s")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt_fr_s(aply_dt_fr_s);
dm.setAply_dt_to_s(aply_dt_to_s);
dm.setFac_clsf_s(fac_clsf_s);
dm.setPapcmpy_cd_s(papcmpy_cd_s);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 13:02:06 KST 2009 */