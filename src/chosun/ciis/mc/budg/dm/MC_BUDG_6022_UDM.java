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


public class MC_BUDG_6022_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yy;
	public String budg_yymm;
	public String job_clsf_cd;
	public String dtls_clsf_cd;
	public String medi_cd;
	public String dept_cd;
	public String tms;
	public String qunt;
	public String chg_pers;

	public MC_BUDG_6022_UDM(){}
	public MC_BUDG_6022_UDM(String cmpy_cd, String budg_yy, String budg_yymm, String job_clsf_cd, String dtls_clsf_cd, String medi_cd, String dept_cd, String tms, String qunt, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.budg_yy = budg_yy;
		this.budg_yymm = budg_yymm;
		this.job_clsf_cd = job_clsf_cd;
		this.dtls_clsf_cd = dtls_clsf_cd;
		this.medi_cd = medi_cd;
		this.dept_cd = dept_cd;
		this.tms = tms;
		this.qunt = qunt;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
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

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6022_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6022_UDM dm = (MC_BUDG_6022_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yy);
		cstmt.setString(5, dm.budg_yymm);
		cstmt.setString(6, dm.job_clsf_cd);
		cstmt.setString(7, dm.dtls_clsf_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.tms);
		cstmt.setString(11, dm.qunt);
		cstmt.setString(12, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6022_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("job_clsf_cd = [" + getJob_clsf_cd() + "]");
		System.out.println("dtls_clsf_cd = [" + getDtls_clsf_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
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
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String job_clsf_cd = req.getParameter("job_clsf_cd");
if( job_clsf_cd == null){
	System.out.println(this.toString+" : job_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : job_clsf_cd is "+job_clsf_cd );
}
String dtls_clsf_cd = req.getParameter("dtls_clsf_cd");
if( dtls_clsf_cd == null){
	System.out.println(this.toString+" : dtls_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd is "+dtls_clsf_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
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
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
String dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String qunt = Util.checkString(req.getParameter("qunt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String job_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf_cd")));
String dtls_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yy(budg_yy);
dm.setBudg_yymm(budg_yymm);
dm.setJob_clsf_cd(job_clsf_cd);
dm.setDtls_clsf_cd(dtls_clsf_cd);
dm.setMedi_cd(medi_cd);
dm.setDept_cd(dept_cd);
dm.setTms(tms);
dm.setQunt(qunt);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 09:42:36 KST 2009 */