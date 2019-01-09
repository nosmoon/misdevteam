/***************************************************************************************************
* 파일명 : SE_COMM_2510_LDataSet.java
* 기능 :  섹션 팝업
* 작성일자 : 2009.06.10
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd           ;
	public String medi_cd			;
	public String sect_cd			;
	public String sect_nm			;
	public String incmg_pers        ;

	public SE_COMM_2510_LDM(){}
	public SE_COMM_2510_LDM(String cmpy_cd, String medi_cd, String sect_cd, String sect_nm, String incmg_pers){
		this.cmpy_cd           	= cmpy_cd           ;
		this.medi_cd			= medi_cd			;
		this.sect_cd			= sect_cd			;
		this.sect_nm			= sect_nm			;
		this.incmg_pers        	= incmg_pers        ;
	}

	
	public String getSQL(){
		 return "{ call SP_SE_COMM_2510_L( ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_2510_LDM dm = (SE_COMM_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd				);
		cstmt.setString( 4, dm.medi_cd				);
		cstmt.setString( 5, dm.sect_cd				);
		cstmt.setString( 6, dm.sect_nm				);
		cstmt.setString( 7, dm.incmg_pers			);
		cstmt.registerOutParameter( 8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_2510_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd			());
        System.out.println("medi_cd 		= " + getMedi_cd			());
        System.out.println("sect_cd 		= " + getSect_cd			());
        System.out.println("sect_nm 		= " + getSect_nm			());
        System.out.println("incmg_pers 		= " + getIncmg_pers			());
    }
    
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getSect_cd() {
		return sect_cd;
	}
	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}
	public String getSect_nm() {
		return sect_nm;
	}
	public void setSect_nm(String sect_nm) {
		this.sect_nm = sect_nm;
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */