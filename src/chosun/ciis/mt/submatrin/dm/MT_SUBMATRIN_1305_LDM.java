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


public class MT_SUBMATRIN_1305_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String matr_cd;
	public String dept_cd;
	public String fac_clsf;
	public String incmg_slip_dt_fr;
	public String incmg_slip_dt_to;
	public String ern;
	public String matr_clas;
	public String chg_emp_no;
	public String ewh_budg_cd;

	public MT_SUBMATRIN_1305_LDM(){}
	public MT_SUBMATRIN_1305_LDM(String cmpy_cd, String occr_dt_fr, String occr_dt_to, String matr_cd, String dept_cd, String fac_clsf, String incmg_slip_dt_fr, String incmg_slip_dt_to, String ern, String matr_clas, String chg_emp_no, String ewh_budg_cd){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.matr_cd = matr_cd;
		this.dept_cd = dept_cd;
		this.fac_clsf = fac_clsf;
		this.incmg_slip_dt_fr = incmg_slip_dt_fr;
		this.incmg_slip_dt_to = incmg_slip_dt_to;
		this.ern = ern;
		this.matr_clas = matr_clas;
		this.chg_emp_no = chg_emp_no;
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIncmg_slip_dt_fr(String incmg_slip_dt_fr){
		this.incmg_slip_dt_fr = incmg_slip_dt_fr;
	}

	public void setIncmg_slip_dt_to(String incmg_slip_dt_to){
		this.incmg_slip_dt_to = incmg_slip_dt_to;
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

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIncmg_slip_dt_fr(){
		return this.incmg_slip_dt_fr;
	}

	public String getIncmg_slip_dt_to(){
		return this.incmg_slip_dt_to;
	}

	public String getErn(){
		return this.ern;
	}

	public String matr_clas(){
		return this.matr_clas;
	}

	public String chg_emp_no(){
		return this.chg_emp_no;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1305_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1305_LDM dm = (MT_SUBMATRIN_1305_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_fr);
		cstmt.setString(5, dm.occr_dt_to);
		cstmt.setString(6, dm.matr_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.incmg_slip_dt_fr);
		cstmt.setString(10, dm.incmg_slip_dt_to);
		cstmt.setString(11, dm.ern);
		cstmt.setString(12, dm.matr_clas);
		cstmt.setString(13, dm.chg_emp_no);
		cstmt.setString(14, dm.ewh_budg_cd);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1305_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt_fr = " + getOccr_dt_fr());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
        System.out.println("matr_cd = " + getMatr_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("incmg_slip_dt_fr = " + getIncmg_slip_dt_fr());
        System.out.println("incmg_slip_dt_to = " + getIncmg_slip_dt_to());
        System.out.println("ern = " + getErn());
        System.out.println("ewh_budg_cd = " + getEwh_budg_cd());
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
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String incmg_slip_dt_fr = req.getParameter("incmg_slip_dt_fr");
if( incmg_slip_dt_fr == null){
	System.out.println(this.toString+" : incmg_slip_dt_fr is null" );
}else{
	System.out.println(this.toString+" : incmg_slip_dt_fr is "+incmg_slip_dt_fr );
}
String incmg_slip_dt_to = req.getParameter("incmg_slip_dt_to");
if( incmg_slip_dt_to == null){
	System.out.println(this.toString+" : incmg_slip_dt_to is null" );
}else{
	System.out.println(this.toString+" : incmg_slip_dt_to is "+incmg_slip_dt_to );
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
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String incmg_slip_dt_fr = Util.checkString(req.getParameter("incmg_slip_dt_fr"));
String incmg_slip_dt_to = Util.checkString(req.getParameter("incmg_slip_dt_to"));
String ern = Util.checkString(req.getParameter("ern"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String incmg_slip_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_slip_dt_fr")));
String incmg_slip_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_slip_dt_to")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setMatr_cd(matr_cd);
dm.setDept_cd(dept_cd);
dm.setFac_clsf(fac_clsf);
dm.setIncmg_slip_dt_fr(incmg_slip_dt_fr);
dm.setIncmg_slip_dt_to(incmg_slip_dt_to);
dm.setErn(ern);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 21:40:53 KST 2009 */