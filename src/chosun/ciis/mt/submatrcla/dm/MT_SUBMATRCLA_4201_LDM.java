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


public class MT_SUBMATRCLA_4201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt_fr;
	public String clam_dt_to;
	public String fac_clsf;
	public String part_cd;
	public String part_nm;
	public String part_clas1;

	public MT_SUBMATRCLA_4201_LDM(){}
	public MT_SUBMATRCLA_4201_LDM(String cmpy_cd, String clam_dt_fr, String clam_dt_to, String fac_clsf, String part_cd, String part_nm, String part_clas1){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt_fr = clam_dt_fr;
		this.clam_dt_to = clam_dt_to;
		this.fac_clsf = fac_clsf;
		this.part_cd = part_cd;
		this.part_nm = part_nm;
		this.part_clas1 = part_clas1;
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

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_clas1(String part_clas1){
		this.part_clas1 = part_clas1;
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

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPart_clas1(){
		return this.part_clas1;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_4201_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_4201_LDM dm = (MT_SUBMATRCLA_4201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt_fr);
		cstmt.setString(5, dm.clam_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.part_cd);
		cstmt.setString(8, dm.part_nm);
		cstmt.setString(9, dm.part_clas1);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_4201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt_fr = [" + getClam_dt_fr() + "]");
		System.out.println("clam_dt_to = [" + getClam_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("part_nm = [" + getPart_nm() + "]");
		System.out.println("part_clas1 = [" + getPart_clas1() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String part_nm = req.getParameter("part_nm");
if( part_nm == null){
	System.out.println(this.toString+" : part_nm is null" );
}else{
	System.out.println(this.toString+" : part_nm is "+part_nm );
}
String part_clas1 = req.getParameter("part_clas1");
if( part_clas1 == null){
	System.out.println(this.toString+" : part_clas1 is null" );
}else{
	System.out.println(this.toString+" : part_clas1 is "+part_clas1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
String clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String part_nm = Util.checkString(req.getParameter("part_nm"));
String part_clas1 = Util.checkString(req.getParameter("part_clas1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_fr")));
String clam_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String part_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_nm")));
String part_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("part_clas1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt_fr(clam_dt_fr);
dm.setClam_dt_to(clam_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setPart_cd(part_cd);
dm.setPart_nm(part_nm);
dm.setPart_clas1(part_clas1);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 13 17:19:37 KST 2016 */