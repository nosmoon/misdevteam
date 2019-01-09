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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1303_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt_fr;
	public String ewh_dt_to;
	public String matr_cd;
	public String use_deptcd;
	public String fac_clsf_cd;
	public String imcmg_slip_dt_fr;
	public String imcmg_slip_dt_to;
	public String ern;
	public String matr_clas;
	public String chg_emp_no;
	public String ewh_budg_cd;

	public MT_SUBMATRIN_1303_LDM(){}
	public MT_SUBMATRIN_1303_LDM(String cmpy_cd, String ewh_dt_fr, String ewh_dt_to, String matr_cd, String use_deptcd, String fac_clsf_cd, String imcmg_slip_dt_fr, String imcmg_slip_dt_to, String ern, String matr_clas, String chg_emp_no, String ewh_budg_cd){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt_fr = ewh_dt_fr;
		this.ewh_dt_to = ewh_dt_to;
		this.matr_cd = matr_cd;
		this.use_deptcd = use_deptcd;
		this.fac_clsf_cd = fac_clsf_cd;
		this.imcmg_slip_dt_fr = imcmg_slip_dt_fr;
		this.imcmg_slip_dt_to = imcmg_slip_dt_to;
		this.ern = ern;
		this.matr_clas = matr_clas;
		this.chg_emp_no = chg_emp_no;
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt_fr(String ewh_dt_fr){
		this.ewh_dt_fr = ewh_dt_fr;
	}

	public void setEwh_dt_to(String ewh_dt_to){
		this.ewh_dt_to = ewh_dt_to;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setFac_clsf_cd(String fac_clsf_cd){
		this.fac_clsf_cd = fac_clsf_cd;
	}

	public void setImcmg_slip_dt_fr(String imcmg_slip_dt_fr){
		this.imcmg_slip_dt_fr = imcmg_slip_dt_fr;
	}

	public void setImcmg_slip_dt_to(String imcmg_slip_dt_to){
		this.imcmg_slip_dt_to = imcmg_slip_dt_to;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}

	public void setChg_emp_no(String chg_emp_no){
		this.chg_emp_no = chg_emp_no;
	}
	
	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt_fr(){
		return this.ewh_dt_fr;
	}

	public String getEwh_dt_to(){
		return this.ewh_dt_to;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getFac_clsf_cd(){
		return this.fac_clsf_cd;
	}

	public String getImcmg_slip_dt_fr(){
		return this.imcmg_slip_dt_fr;
	}

	public String getImcmg_slip_dt_to(){
		return this.imcmg_slip_dt_to;
	}

	public String getErn(){
		return this.ern;
	}

	public String getMatr_clas(){
		return this.matr_clas;
	}

	public String getChg_emp_no(){
		return this.chg_emp_no;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1303_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1303_LDM dm = (MT_SUBMATRIN_1303_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt_fr);
		cstmt.setString(5, dm.ewh_dt_to);
		cstmt.setString(6, dm.matr_cd);
		cstmt.setString(7, dm.use_deptcd);
		cstmt.setString(8, dm.fac_clsf_cd);
		cstmt.setString(9, dm.imcmg_slip_dt_fr);
		cstmt.setString(10, dm.imcmg_slip_dt_to);
		cstmt.setString(11, dm.ern);
		cstmt.setString(12, dm.matr_clas);
		cstmt.setString(13, dm.chg_emp_no);
		cstmt.setString(14, dm.ewh_budg_cd);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1303_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt_fr = [" + getEwh_dt_fr() + "]");
		System.out.println("ewh_dt_to = [" + getEwh_dt_to() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("use_deptcd = [" + getUse_deptcd() + "]");
		System.out.println("fac_clsf_cd = [" + getFac_clsf_cd() + "]");
		System.out.println("imcmg_slip_dt_fr = [" + getImcmg_slip_dt_fr() + "]");
		System.out.println("imcmg_slip_dt_to = [" + getImcmg_slip_dt_to() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("matr_clas = [" + getMatr_clas() + "]");
		System.out.println("chg_emp_no = [" + getChg_emp_no() + "]");
		System.out.println("ewh_budg_cd = [" + getEwh_budg_cd() + "]");
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
String ewh_dt_fr = req.getParameter("ewh_dt_fr");
if( ewh_dt_fr == null){
	System.out.println(this.toString+" : ewh_dt_fr is null" );
}else{
	System.out.println(this.toString+" : ewh_dt_fr is "+ewh_dt_fr );
}
String ewh_dt_to = req.getParameter("ewh_dt_to");
if( ewh_dt_to == null){
	System.out.println(this.toString+" : ewh_dt_to is null" );
}else{
	System.out.println(this.toString+" : ewh_dt_to is "+ewh_dt_to );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String use_deptcd = req.getParameter("use_deptcd");
if( use_deptcd == null){
	System.out.println(this.toString+" : use_deptcd is null" );
}else{
	System.out.println(this.toString+" : use_deptcd is "+use_deptcd );
}
String fac_clsf_cd = req.getParameter("fac_clsf_cd");
if( fac_clsf_cd == null){
	System.out.println(this.toString+" : fac_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_cd is "+fac_clsf_cd );
}
String imcmg_slip_dt_fr = req.getParameter("imcmg_slip_dt_fr");
if( imcmg_slip_dt_fr == null){
	System.out.println(this.toString+" : imcmg_slip_dt_fr is null" );
}else{
	System.out.println(this.toString+" : imcmg_slip_dt_fr is "+imcmg_slip_dt_fr );
}
String imcmg_slip_dt_to = req.getParameter("imcmg_slip_dt_to");
if( imcmg_slip_dt_to == null){
	System.out.println(this.toString+" : imcmg_slip_dt_to is null" );
}else{
	System.out.println(this.toString+" : imcmg_slip_dt_to is "+imcmg_slip_dt_to );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt_fr = Util.checkString(req.getParameter("ewh_dt_fr"));
String ewh_dt_to = Util.checkString(req.getParameter("ewh_dt_to"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
String fac_clsf_cd = Util.checkString(req.getParameter("fac_clsf_cd"));
String imcmg_slip_dt_fr = Util.checkString(req.getParameter("imcmg_slip_dt_fr"));
String imcmg_slip_dt_to = Util.checkString(req.getParameter("imcmg_slip_dt_to"));
String ern = Util.checkString(req.getParameter("ern"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt_fr")));
String ewh_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt_to")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String use_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_deptcd")));
String fac_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_cd")));
String imcmg_slip_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("imcmg_slip_dt_fr")));
String imcmg_slip_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("imcmg_slip_dt_to")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt_fr(ewh_dt_fr);
dm.setEwh_dt_to(ewh_dt_to);
dm.setMatr_cd(matr_cd);
dm.setUse_deptcd(use_deptcd);
dm.setFac_clsf_cd(fac_clsf_cd);
dm.setImcmg_slip_dt_fr(imcmg_slip_dt_fr);
dm.setImcmg_slip_dt_to(imcmg_slip_dt_to);
dm.setErn(ern);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 09:50:27 KST 2009 */