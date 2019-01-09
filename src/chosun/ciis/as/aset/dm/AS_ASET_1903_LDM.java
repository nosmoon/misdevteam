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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1903_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String base_dt;
	public String eis_aset_clsf;

	public AS_ASET_1903_LDM(){}
	public AS_ASET_1903_LDM(String cmpy_cd, String base_dt, String eis_aset_clsf){
		this.cmpy_cd = cmpy_cd;
		this.base_dt = base_dt;
		this.eis_aset_clsf = eis_aset_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setEis_aset_clsf(String eis_aset_clsf){
		this.eis_aset_clsf = eis_aset_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getEis_aset_clsf(){
		return this.eis_aset_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1903_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1903_LDM dm = (AS_ASET_1903_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.base_dt);
		cstmt.setString(5, dm.eis_aset_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1903_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
		System.out.println("eis_aset_clsf = [" + getEis_aset_clsf() + "]");
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
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
String eis_aset_clsf = req.getParameter("eis_aset_clsf");
if( eis_aset_clsf == null){
	System.out.println(this.toString+" : eis_aset_clsf is null" );
}else{
	System.out.println(this.toString+" : eis_aset_clsf is "+eis_aset_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
String eis_aset_clsf = Util.checkString(req.getParameter("eis_aset_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String eis_aset_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("eis_aset_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBase_dt(base_dt);
dm.setEis_aset_clsf(eis_aset_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 16:40:18 KST 2009 */