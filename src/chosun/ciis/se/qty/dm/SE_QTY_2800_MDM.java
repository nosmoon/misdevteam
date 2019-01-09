/***************************************************************************************************
* 파일명 : SE_QTY_2800_MDM.java
* 기능 : 부수관리 - 발송부수 - 본지일자별발행부수
* 작성일자 : 2009-03-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2800_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String auth_gb	;
	public String incmg_pers;
	public String base_dt	;
	public String feat_clsf	;
	
	public SE_QTY_2800_MDM(){}
	public SE_QTY_2800_MDM(String cmpy_cd, String auth_gb, String incmg_pers, String base_dt, String feat_clsf){
		this.cmpy_cd 	= cmpy_cd	;
		this.auth_gb	= auth_gb	;
		this.incmg_pers = incmg_pers;
		this.base_dt	= base_dt	;
		this.feat_clsf	= feat_clsf	;
	}

	public String getSQL(){
		 return "{ call SP_SE_QTY_2800_M( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2800_MDM dm = (SE_QTY_2800_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.auth_gb	);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.base_dt	);
		cstmt.setString(7, dm.feat_clsf	);
		cstmt.registerOutParameter( 8, OracleTypes.CURSOR);
		cstmt.registerOutParameter( 9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2800_MDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("auth_gb		= " + getAuth_gb	());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
        System.out.println("base_dt		= " + getBase_dt	());
        System.out.println("feat_clsf	= " + getFeat_clsf	());
    }
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	public String getAuth_gb() {
		return auth_gb;
	}
	public void setAuth_gb(String auth_gb) {
		this.auth_gb = auth_gb;
	}
	public String getBase_dt() {
		return base_dt;
	}
	public void setBase_dt(String base_dt) {
		this.base_dt = base_dt;
	}
	public String getFeat_clsf() {
		return feat_clsf;
	}
	public void setFeat_clsf(String feat_clsf) {
		this.feat_clsf = feat_clsf;
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 17:40:16 KST 2009 */