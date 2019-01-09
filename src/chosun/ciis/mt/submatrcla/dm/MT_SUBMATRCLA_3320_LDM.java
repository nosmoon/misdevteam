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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_3320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt_fr;
	public String clam_dt_to;
	public String dlco_no;
	public String fac_clsf;
	public String part_cd;
	public String part_clas1;
	public String acpn_dt_fr;
	public String acpn_dt_to;
	public String ewh_clsf;
	
	public MT_SUBMATRCLA_3320_LDM(){}
	public MT_SUBMATRCLA_3320_LDM(String cmpy_cd, String clam_dt_fr, String clam_dt_to, String dlco_no, String fac_clsf, String part_cd, String part_clas1, String acpn_dt_fr, String acpn_dt_to, String ewh_clsf ){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt_fr = clam_dt_fr;
		this.clam_dt_to = clam_dt_to;
		this.fac_clsf = fac_clsf;
		this.part_cd = part_cd;
		this.part_clas1 = part_clas1;
		this.acpn_dt_fr = acpn_dt_fr;
		this.acpn_dt_to = acpn_dt_to;
		this.ewh_clsf = ewh_clsf;
		
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dt_fr(String clam_dt_fr){
		this.clam_dt_fr = clam_dt_fr;
	}

	public void setClam_dt_to(String clam_dt_to){
		this.clam_dt_to = clam_dt_to;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}
	
	public void setPart_cd(String part_cd) {
		this.part_cd = part_cd;
	}
	
	public void setPart_clas1(String part_clas1) {
		this.part_clas1 = part_clas1;
	}
	
	public void setAcpn_dt_fr(String acpn_dt_fr){
		this.acpn_dt_fr = acpn_dt_fr;
	}

	public void setAcpn_dt_to(String acpn_dt_to){
		this.acpn_dt_to = acpn_dt_to;
	}

	public void setEwh_clsf(String ewh_clsf) {
		this.ewh_clsf = ewh_clsf;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dt_fr(){
		return this.clam_dt_fr;
	}

	public String getClam_dt_to(){
		return this.clam_dt_to;
	}
	
	public String getDlco_no(){
		return this.dlco_no;
	}
	
	public String getFac_clsf(){
		return this.fac_clsf;
	}
	
	public String getPart_cd() {
		return part_cd;
	}
	
	public String getPart_clas1() {
		return part_clas1;
	}
	
	public String getAcpn_dt_fr(){
		return this.acpn_dt_fr;
	}

	public String getAcpn_dt_to(){
		return this.acpn_dt_to;
	}

	public String getEwh_clsf() {
		return ewh_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_3320_L(? ,? ,? ,? ,? ,? ,? ,?, ? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_3320_LDM dm = (MT_SUBMATRCLA_3320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt_fr);
		cstmt.setString(5, dm.clam_dt_to);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.part_cd);
		cstmt.setString(9, dm.part_clas1);
		cstmt.setString(10, dm.acpn_dt_fr);
		cstmt.setString(11, dm.acpn_dt_to);
		cstmt.setString(12, dm.ewh_clsf);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_3320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt_fr = [" + getClam_dt_fr() + "]");
		System.out.println("clam_dt_to = [" + getClam_dt_to() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("part_clas1 = [" + getPart_clas1() + "]");
		System.out.println("acpn_dt_fr = [" + getAcpn_dt_fr() + "]");
		System.out.println("acpn_dt_to = [" + getAcpn_dt_to() + "]");
		System.out.println("ewh_clsf = [" + getEwh_clsf() + "]");
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
String clam_dt_fr = req.getParameter("clam_dt_fr");
if( clam_dt_fr == null){
	System.out.println(this.toString+" : clam_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clam_dt_fr is "+clam_dt_fr );
}
String clam_dt_to = req.getParameter("clam_dt_to");
if( clam_dt_to == null){
	System.out.println(this.toString+" : clam_dt_to is null" );
}else{
	System.out.println(this.toString+" : clam_dt_to is "+clam_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
String clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_fr")));
String clam_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt_fr(clam_dt_fr);
dm.setClam_dt_to(clam_dt_to);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Nov 29 19:50:17 KST 2009 */