/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1130_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String sct_term;
	public String day_sdt;
	public String day_tdt;
	public String month_sdt;
	public String month_tdt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_1130_IDM(){}
	public AD_RES_1130_IDM(String cmpy_cd, String medi_cd, String sct_term, String day_sdt, String day_tdt, String month_sdt, String month_tdt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.sct_term = sct_term;
		this.day_sdt = day_sdt;
		this.day_tdt = day_tdt;
		this.month_sdt = month_sdt;
		this.month_tdt = month_tdt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSct_term(String sct_term){
		this.sct_term = sct_term;
	}

	public void setDay_sdt(String day_sdt){
		this.day_sdt = day_sdt;
	}

	public void setDay_tdt(String day_tdt){
		this.day_tdt = day_tdt;
	}

	public void setMonth_sdt(String month_sdt){
		this.month_sdt = month_sdt;
	}

	public void setMonth_tdt(String month_tdt){
		this.month_tdt = month_tdt;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSct_term(){
		return this.sct_term;
	}

	public String getDay_sdt(){
		return this.day_sdt;
	}

	public String getDay_tdt(){
		return this.day_tdt;
	}

	public String getMonth_sdt(){
		return this.month_sdt;
	}

	public String getMonth_tdt(){
		return this.month_tdt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_RES_1130_I( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1130_IDM dm = (AD_RES_1130_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.sct_term);
		cstmt.setString(6, dm.day_sdt);
		cstmt.setString(7, dm.day_tdt);
		cstmt.setString(8, dm.month_sdt);
		cstmt.setString(9, dm.month_tdt);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}	
	

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1130_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("sct_term = " + getSct_term());
        System.out.println("day_sdt = " + getDay_sdt());
        System.out.println("day_tdt = " + getDay_tdt());
        System.out.println("month_sdt = " + getMonth_sdt());
        System.out.println("month_tdt = " + getMonth_tdt());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sct_term = req.getParameter("sct_term");
if( sct_term == null){
	System.out.println(this.toString+" : sct_term is null" );
}else{
	System.out.println(this.toString+" : sct_term is "+sct_term );
}
String day_sdt = req.getParameter("day_sdt");
if( day_sdt == null){
	System.out.println(this.toString+" : day_sdt is null" );
}else{
	System.out.println(this.toString+" : day_sdt is "+day_sdt );
}
String day_tdt = req.getParameter("day_tdt");
if( day_tdt == null){
	System.out.println(this.toString+" : day_tdt is null" );
}else{
	System.out.println(this.toString+" : day_tdt is "+day_tdt );
}
String month_sdt = req.getParameter("month_sdt");
if( month_sdt == null){
	System.out.println(this.toString+" : month_sdt is null" );
}else{
	System.out.println(this.toString+" : month_sdt is "+month_sdt );
}
String month_tdt = req.getParameter("month_tdt");
if( month_tdt == null){
	System.out.println(this.toString+" : month_tdt is null" );
}else{
	System.out.println(this.toString+" : month_tdt is "+month_tdt );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sct_term = Util.checkString(req.getParameter("sct_term"));
String day_sdt = Util.checkString(req.getParameter("day_sdt"));
String day_tdt = Util.checkString(req.getParameter("day_tdt"));
String month_sdt = Util.checkString(req.getParameter("month_sdt"));
String month_tdt = Util.checkString(req.getParameter("month_tdt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sct_term = Util.Uni2Ksc(Util.checkString(req.getParameter("sct_term")));
String day_sdt = Util.Uni2Ksc(Util.checkString(req.getParameter("day_sdt")));
String day_tdt = Util.Uni2Ksc(Util.checkString(req.getParameter("day_tdt")));
String month_sdt = Util.Uni2Ksc(Util.checkString(req.getParameter("month_sdt")));
String month_tdt = Util.Uni2Ksc(Util.checkString(req.getParameter("month_tdt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSct_term(sct_term);
dm.setDay_sdt(day_sdt);
dm.setDay_tdt(day_tdt);
dm.setMonth_sdt(month_sdt);
dm.setMonth_tdt(month_tdt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 15:29:08 KST 2009 */