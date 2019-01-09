/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String mang_cd_3;
	public String use_yn;

	public PL_BAS_1820_ADM(){}
	public PL_BAS_1820_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String cd, String cdnm, String cd_abrv_nm, String mang_cd_1, String mang_cd_2, String mang_cd_3, String use_yn){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.cd = cd;
		this.cdnm = cdnm;
		this.cd_abrv_nm = cd_abrv_nm;
		this.mang_cd_1 = mang_cd_1;
		this.mang_cd_2 = mang_cd_2;
		this.mang_cd_3 = mang_cd_3;
		this.use_yn = use_yn;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getAcc_flag(){
		return this.acc_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1820_ADM dm = (PL_BAS_1820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.cd);
		cstmt.setString(8, dm.cdnm);
		cstmt.setString(9, dm.cd_abrv_nm);
		cstmt.setString(10, dm.mang_cd_1);
		cstmt.setString(11, dm.mang_cd_2);
		cstmt.setString(12, dm.mang_cd_3);
		cstmt.setString(13, dm.use_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1820_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("cdnm = [" + getCdnm() + "]");
		System.out.println("cd_abrv_nm = [" + getCd_abrv_nm() + "]");
		System.out.println("mang_cd_1 = [" + getMang_cd_1() + "]");
		System.out.println("mang_cd_2 = [" + getMang_cd_2() + "]");
		System.out.println("mang_cd_3 = [" + getMang_cd_3() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
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
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String cd_abrv_nm = req.getParameter("cd_abrv_nm");
if( cd_abrv_nm == null){
	System.out.println(this.toString+" : cd_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : cd_abrv_nm is "+cd_abrv_nm );
}
String mang_cd_1 = req.getParameter("mang_cd_1");
if( mang_cd_1 == null){
	System.out.println(this.toString+" : mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_1 is "+mang_cd_1 );
}
String mang_cd_2 = req.getParameter("mang_cd_2");
if( mang_cd_2 == null){
	System.out.println(this.toString+" : mang_cd_2 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_2 is "+mang_cd_2 );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));
String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));
String mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_1")));
String mang_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_2")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setCd_abrv_nm(cd_abrv_nm);
dm.setMang_cd_1(mang_cd_1);
dm.setMang_cd_2(mang_cd_2);
dm.setMang_cd_3(mang_cd_3);
dm.setUse_yn(use_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 15:04:08 KST 2009 */