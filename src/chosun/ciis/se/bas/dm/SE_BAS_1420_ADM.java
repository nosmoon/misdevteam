/***************************************************************************************************
* 파일명 : SE_BAS_1420_ADM.java
* 기능 :  판매 - 기준정보 - 담당자 등록 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{
	 
	String mode 		;
    String rownum       ;
    String chrg_pers    ;
    String flnm         ;
    String clsf         ;
    String dept_cd      ;
    String use_yn       ;
    String cmpy_cd      ;
    String chrg_pers_key;
    String incmg_pers_ip;
    String incmg_pers   ;

	public SE_BAS_1420_ADM(){}
	public SE_BAS_1420_ADM( String mode, String rownum, String chrg_pers, String flnm, String clsf, String dept_cd, String use_yn, String cmpy_cd, String chrg_pers_key, String incmg_pers_ip, String incmg_pers){
		this.mode 			= mode;
		this.chrg_pers 		= chrg_pers;
		this.flnm 			= flnm;
		this.clsf			= clsf;
		this.dept_cd		= dept_cd;
		this.use_yn			= use_yn;
		this.cmpy_cd        = cmpy_cd;
		this.chrg_pers_key	= chrg_pers_key;
		this.incmg_pers_ip  = incmg_pers_ip;
		this.incmg_pers		= incmg_pers;
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1420_ADataSet();
	}
	public String getChrg_pers() {
		return chrg_pers;
	}
	public void setChrg_pers(String chrg_pers) {
		this.chrg_pers = chrg_pers;
	}
	public String getClsf() {
		return clsf;
	}
	public void setClsf(String clsf) {
		this.clsf = clsf;
	}
	public String getDept_cd() {
		return dept_cd;
	}
	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}
	public String getFlnm() {
		return flnm;
	}
	public void setFlnm(String flnm) {
		this.flnm = flnm;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getChrg_pers_key() {
		return chrg_pers_key;
	}
	public void setChrg_pers_key(String chrg_pers_key) {
		this.chrg_pers_key = chrg_pers_key;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_BAS_1420_A( ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1420_ADM dm = (SE_BAS_1420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chrg_pers_key);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.chrg_pers);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.clsf);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.use_yn);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlnm(flnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 15 13:28:22 KST 2009 */