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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6012_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yy;
	public String budg_frym;
	public String budg_toym;
	public String tms;
	public String dept_cd;
	public String rate;
	public String total;
	public String budg_clas_cd;
	public String chg_pers;

	public MC_BUDG_6012_UDM(){}
	public MC_BUDG_6012_UDM(String cmpy_cd, String budg_yy, String budg_frym, String budg_toym, String tms, String dept_cd, String rate, String total, String budg_clas_cd, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.budg_yy = budg_yy;
		this.budg_frym = budg_frym;
		this.budg_toym = budg_toym;
		this.tms = tms;
		this.dept_cd = dept_cd;
		this.rate = rate;
		this.total = total;
		this.budg_clas_cd = budg_clas_cd;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBudg_frym(String budg_frym){
		this.budg_frym = budg_frym;
	}

	public void setBudg_toym(String budg_toym){
		this.budg_toym = budg_toym;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getBudg_frym(){
		return this.budg_frym;
	}

	public String getBudg_toym(){
		return this.budg_toym;
	}

	public String getTms(){
		return this.tms;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getRate(){
		return this.rate;
	}

	public String getTotal(){
		return this.total;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6012_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6012_UDM dm = (MC_BUDG_6012_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yy);
		cstmt.setString(5, dm.budg_frym);
		cstmt.setString(6, dm.budg_toym);
		cstmt.setString(7, dm.tms);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.rate);
		cstmt.setString(10, dm.total);
		cstmt.setString(11, dm.budg_clas_cd);
		cstmt.setString(12, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6012_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_frym = [" + getBudg_frym() + "]");
		System.out.println("budg_toym = [" + getBudg_toym() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("rate = [" + getRate() + "]");
		System.out.println("total = [" + getTotal() + "]");
		System.out.println("budg_clas_cd = [" + getBudg_clas_cd() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String budg_frym = req.getParameter("budg_frym");
if( budg_frym == null){
	System.out.println(this.toString+" : budg_frym is null" );
}else{
	System.out.println(this.toString+" : budg_frym is "+budg_frym );
}
String budg_toym = req.getParameter("budg_toym");
if( budg_toym == null){
	System.out.println(this.toString+" : budg_toym is null" );
}else{
	System.out.println(this.toString+" : budg_toym is "+budg_toym );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String rate = req.getParameter("rate");
if( rate == null){
	System.out.println(this.toString+" : rate is null" );
}else{
	System.out.println(this.toString+" : rate is "+rate );
}
String total = req.getParameter("total");
if( total == null){
	System.out.println(this.toString+" : total is null" );
}else{
	System.out.println(this.toString+" : total is "+total );
}
String budg_clas_cd = req.getParameter("budg_clas_cd");
if( budg_clas_cd == null){
	System.out.println(this.toString+" : budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd is "+budg_clas_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String budg_frym = Util.checkString(req.getParameter("budg_frym"));
String budg_toym = Util.checkString(req.getParameter("budg_toym"));
String tms = Util.checkString(req.getParameter("tms"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String rate = Util.checkString(req.getParameter("rate"));
String total = Util.checkString(req.getParameter("total"));
String budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_frym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frym")));
String budg_toym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_toym")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String rate = Util.Uni2Ksc(Util.checkString(req.getParameter("rate")));
String total = Util.Uni2Ksc(Util.checkString(req.getParameter("total")));
String budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yy(budg_yy);
dm.setBudg_frym(budg_frym);
dm.setBudg_toym(budg_toym);
dm.setTms(tms);
dm.setDept_cd(dept_cd);
dm.setRate(rate);
dm.setTotal(total);
dm.setBudg_clas_cd(budg_clas_cd);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 10:47:29 KST 2009 */