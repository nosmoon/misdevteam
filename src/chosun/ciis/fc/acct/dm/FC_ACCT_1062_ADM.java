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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1062_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode;
	public String cd;
	public String cdnm;
	public String remk;
	public String cd_abrv_nm;
	public String use_yn;
	public String mang_cd_3;

	public FC_ACCT_1062_ADM(){}
	public FC_ACCT_1062_ADM(String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode, String cd, String cdnm, String remk, String cd_abrv_nm, String use_yn, String mang_cd_3){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode = mode;
		this.cd = cd;
		this.cdnm = cdnm;
		this.remk = remk;
		this.cd_abrv_nm = cd_abrv_nm;
		this.use_yn = use_yn;
		this.mang_cd_3 = mang_cd_3;
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

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
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

	public String getMode(){
		return this.mode;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1062_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1062_ADM dm = (FC_ACCT_1062_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.cd);
		cstmt.setString(8, dm.cdnm);
		cstmt.setString(9, dm.remk);
		cstmt.setString(10, dm.cd_abrv_nm);
		cstmt.setString(11, dm.use_yn);
		cstmt.setString(12, dm.mang_cd_3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1062_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("mode = " + getMode());
        System.out.println("cd = " + getCd());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("remk = " + getRemk());
        System.out.println("cd_abrv_nm = " + getCd_abrv_nm());
        System.out.println("use_yn = " + getUse_yn());
        System.out.println("mang_cd_3 = " + getMang_cd_3());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cd_abrv_nm = req.getParameter("cd_abrv_nm");
if( cd_abrv_nm == null){
	System.out.println(this.toString+" : cd_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : cd_abrv_nm is "+cd_abrv_nm );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode = Util.checkString(req.getParameter("mode"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String remk = Util.checkString(req.getParameter("remk"));
String cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode(mode);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setRemk(remk);
dm.setCd_abrv_nm(cd_abrv_nm);
dm.setUse_yn(use_yn);
dm.setMang_cd_3(mang_cd_3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 11:49:26 KST 2009 */