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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1910_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dealmedicd;
	public String rcpm_shet_no1;
	public String rcpm_shet_no2;
	public String proc_clsf;
	public String rmks;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_1910_ADM(){}
	public AD_DEP_1910_ADM(String cmpy_cd, String dealmedicd, String rcpm_shet_no1, String rcpm_shet_no2, String proc_clsf, String rmks, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dealmedicd = dealmedicd;
		this.rcpm_shet_no1 = rcpm_shet_no1;
		this.rcpm_shet_no2 = rcpm_shet_no2;
		this.proc_clsf = proc_clsf;
		this.rmks = rmks;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDealmedicd(String dealmedicd){
		this.dealmedicd = dealmedicd;
	}

	public void setRcpm_shet_no1(String rcpm_shet_no1){
		this.rcpm_shet_no1 = rcpm_shet_no1;
	}

	public void setRcpm_shet_no2(String rcpm_shet_no2){
		this.rcpm_shet_no2 = rcpm_shet_no2;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDealmedicd(){
		return this.dealmedicd;
	}

	public String getRcpm_shet_no1(){
		return this.rcpm_shet_no1;
	}

	public String getRcpm_shet_no2(){
		return this.rcpm_shet_no2;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1910_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1910_ADM dm = (AD_DEP_1910_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dealmedicd);
		cstmt.setString(5, dm.rcpm_shet_no1);
		cstmt.setString(6, dm.rcpm_shet_no2);
		cstmt.setString(7, dm.proc_clsf);
		cstmt.setString(8, dm.rmks);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1910_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dealmedicd = [" + getDealmedicd() + "]");
		System.out.println("rcpm_shet_no1 = [" + getRcpm_shet_no1() + "]");
		System.out.println("rcpm_shet_no2 = [" + getRcpm_shet_no2() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String dealmedicd = req.getParameter("dealmedicd");
if( dealmedicd == null){
	System.out.println(this.toString+" : dealmedicd is null" );
}else{
	System.out.println(this.toString+" : dealmedicd is "+dealmedicd );
}
String rcpm_shet_no1 = req.getParameter("rcpm_shet_no1");
if( rcpm_shet_no1 == null){
	System.out.println(this.toString+" : rcpm_shet_no1 is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no1 is "+rcpm_shet_no1 );
}
String rcpm_shet_no2 = req.getParameter("rcpm_shet_no2");
if( rcpm_shet_no2 == null){
	System.out.println(this.toString+" : rcpm_shet_no2 is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no2 is "+rcpm_shet_no2 );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String dealmedicd = Util.checkString(req.getParameter("dealmedicd"));
String rcpm_shet_no1 = Util.checkString(req.getParameter("rcpm_shet_no1"));
String rcpm_shet_no2 = Util.checkString(req.getParameter("rcpm_shet_no2"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dealmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("dealmedicd")));
String rcpm_shet_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no1")));
String rcpm_shet_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no2")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDealmedicd(dealmedicd);
dm.setRcpm_shet_no1(rcpm_shet_no1);
dm.setRcpm_shet_no2(rcpm_shet_no2);
dm.setProc_clsf(proc_clsf);
dm.setRmks(rmks);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 13:17:00 KST 2009 */