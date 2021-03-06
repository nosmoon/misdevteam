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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1204_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_dt;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String aset_no;
	public String chg_amt;
	public String chg_vat_amt;
	public String hsty_cnt;
	public String hsty_dlco_ern;
	public String dept_cd;
	public String dtls_remk;

	public AS_ASET_1204_IDM(){}
	public AS_ASET_1204_IDM(String cmpy_cd, String chg_dt, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String aset_no, String chg_amt, String chg_vat_amt, String hsty_cnt, String hsty_dlco_ern, String dept_cd, String dtls_remk){
		this.cmpy_cd = cmpy_cd;
		this.chg_dt = chg_dt;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.aset_no = aset_no;
		this.chg_amt = chg_amt;
		this.chg_vat_amt = chg_vat_amt;
		this.hsty_cnt = hsty_cnt;
		this.hsty_dlco_ern = hsty_dlco_ern;
		this.dept_cd = dept_cd;
		this.dtls_remk = dtls_remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setChg_amt(String chg_amt){
		this.chg_amt = chg_amt;
	}

	public void setChg_vat_amt(String chg_vat_amt){
		this.chg_vat_amt = chg_vat_amt;
	}

	public void setHsty_cnt(String hsty_cnt){
		this.hsty_cnt = hsty_cnt;
	}

	public void setHsty_dlco_ern(String hsty_dlco_ern){
		this.hsty_dlco_ern = hsty_dlco_ern;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDtls_remk(String dtls_remk){
		this.dtls_remk = dtls_remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getChg_amt(){
		return this.chg_amt;
	}

	public String getChg_vat_amt(){
		return this.chg_vat_amt;
	}

	public String getHsty_cnt(){
		return this.hsty_cnt;
	}

	public String getHsty_dlco_ern(){
		return this.hsty_dlco_ern;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDtls_remk(){
		return this.dtls_remk;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1204_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1204_IDM dm = (AS_ASET_1204_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_dt);
		cstmt.setString(5, dm.remk);
		cstmt.setString(6, dm.incmg_pers_ipadd);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.chg_pers);
		cstmt.setString(9, dm.aset_no);
		cstmt.setString(10, dm.chg_amt);
		cstmt.setString(11, dm.chg_vat_amt);
		cstmt.setString(12, dm.hsty_cnt);
		cstmt.setString(13, dm.hsty_dlco_ern);
		cstmt.setString(14, dm.dept_cd);
		cstmt.setString(15, dm.dtls_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1204_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("chg_dt = " + getChg_dt());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("chg_amt = " + getChg_amt());
        System.out.println("chg_vat_amt = " + getChg_vat_amt());
        System.out.println("hsty_cnt = " + getHsty_cnt());
        System.out.println("hsty_dlco_ern = " + getHsty_dlco_ern());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dtls_remk = " + getDtls_remk());
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
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String chg_amt = req.getParameter("chg_amt");
if( chg_amt == null){
	System.out.println(this.toString+" : chg_amt is null" );
}else{
	System.out.println(this.toString+" : chg_amt is "+chg_amt );
}
String chg_vat_amt = req.getParameter("chg_vat_amt");
if( chg_vat_amt == null){
	System.out.println(this.toString+" : chg_vat_amt is null" );
}else{
	System.out.println(this.toString+" : chg_vat_amt is "+chg_vat_amt );
}
String hsty_cnt = req.getParameter("hsty_cnt");
if( hsty_cnt == null){
	System.out.println(this.toString+" : hsty_cnt is null" );
}else{
	System.out.println(this.toString+" : hsty_cnt is "+hsty_cnt );
}
String hsty_dlco_ern = req.getParameter("hsty_dlco_ern");
if( hsty_dlco_ern == null){
	System.out.println(this.toString+" : hsty_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hsty_dlco_ern is "+hsty_dlco_ern );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dtls_remk = req.getParameter("dtls_remk");
if( dtls_remk == null){
	System.out.println(this.toString+" : dtls_remk is null" );
}else{
	System.out.println(this.toString+" : dtls_remk is "+dtls_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String chg_amt = Util.checkString(req.getParameter("chg_amt"));
String chg_vat_amt = Util.checkString(req.getParameter("chg_vat_amt"));
String hsty_cnt = Util.checkString(req.getParameter("hsty_cnt"));
String hsty_dlco_ern = Util.checkString(req.getParameter("hsty_dlco_ern"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dtls_remk = Util.checkString(req.getParameter("dtls_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String chg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_amt")));
String chg_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_vat_amt")));
String hsty_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_cnt")));
String hsty_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_dlco_ern")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dtls_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_dt(chg_dt);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setAset_no(aset_no);
dm.setChg_amt(chg_amt);
dm.setChg_vat_amt(chg_vat_amt);
dm.setHsty_cnt(hsty_cnt);
dm.setHsty_dlco_ern(hsty_dlco_ern);
dm.setDept_cd(dept_cd);
dm.setDtls_remk(dtls_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 09:59:20 KST 2009 */