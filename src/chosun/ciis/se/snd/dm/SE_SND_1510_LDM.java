/***************************************************************************************************
* 파일명 : SE_SND_1510_LDM.java
* 기능 : 판매 - 발송관리 - 공장별부수
* 작성일자 : 2009.02.03
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String route_clsf	;
	public String medi_cd		;
	public String issu_dt		;
	public String incmg_pers	;
	
	public SE_SND_1510_LDM(){}
	public SE_SND_1510_LDM(String cmpy_cd, String route_clsf, String medi_cd, String issu_dt, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.route_clsf		= route_clsf	;
		this.medi_cd		= medi_cd		;
		this.issu_dt		= issu_dt		;
		this.incmg_pers		= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	public String getIssu_dt() {
		return issu_dt;
	}
	public void setIssu_dt(String issu_dt) {
		this.issu_dt = issu_dt;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_SND_1510_L( ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1510_LDM dm = (SE_SND_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.issu_dt);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1510_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd()		);
        System.out.println("route_clsf 		= " + getRoute_clsf()	);
        System.out.println("medi_cd 		= " + getMedi_cd()		);
        System.out.println("issu_dt 		= " + getIssu_dt()		);
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


/* 작성시간 : Thu Jan 29 20:43:48 KST 2009 */