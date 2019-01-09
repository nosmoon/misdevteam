/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9502_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String mang_no;
	public String flnm;
	public String memb_clsf;
	public String emp_birthday;
	public String dth_yn;
	public String spos_name;
	public String spos_birthday;
	public String spos_yn;
	public String zipcode;
	public String addr;
	public String phon_no;
	public String tel_no;
	public String bank_cd;
	public String acct_no;
	public String deps_per;
	public String lvcmpy_dty;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_AFFR_9502_ADM(){}
	public HD_AFFR_9502_ADM(String mode, String cmpy_cd, String mang_no, String flnm, String memb_clsf, String emp_birthday, String dth_yn, String spos_name, String spos_birthday, String spos_yn, String zipcode, String addr, String phon_no, String tel_no, String bank_cd, String acct_no, String deps_per, String lvcmpy_dty, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.flnm = flnm;
		this.memb_clsf = memb_clsf;
		this.emp_birthday = emp_birthday;
		this.dth_yn = dth_yn;
		this.spos_name = spos_name;
		this.spos_birthday = spos_birthday;
		this.spos_yn = spos_yn;
		this.zipcode = zipcode;
		this.addr = addr;
		this.phon_no = phon_no;
		this.tel_no = tel_no;
		this.bank_cd = bank_cd;
		this.acct_no = acct_no;
		this.deps_per = deps_per;
		this.lvcmpy_dty = lvcmpy_dty;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setEmp_birthday(String emp_birthday){
		this.emp_birthday = emp_birthday;
	}

	public void setDth_yn(String dth_yn){
		this.dth_yn = dth_yn;
	}

	public void setSpos_name(String spos_name){
		this.spos_name = spos_name;
	}

	public void setSpos_birthday(String spos_birthday){
		this.spos_birthday = spos_birthday;
	}

	public void setSpos_yn(String spos_yn){
		this.spos_yn = spos_yn;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPhon_no(String phon_no){
		this.phon_no = phon_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_per(String deps_per){
		this.deps_per = deps_per;
	}

	public void setLvcmpy_dty(String lvcmpy_dty){
		this.lvcmpy_dty = lvcmpy_dty;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getEmp_birthday(){
		return this.emp_birthday;
	}

	public String getDth_yn(){
		return this.dth_yn;
	}

	public String getSpos_name(){
		return this.spos_name;
	}

	public String getSpos_birthday(){
		return this.spos_birthday;
	}

	public String getSpos_yn(){
		return this.spos_yn;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPhon_no(){
		return this.phon_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_per(){
		return this.deps_per;
	}

	public String getLvcmpy_dty(){
		return this.lvcmpy_dty;
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

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9502_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9502_ADM dm = (HD_AFFR_9502_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.mang_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.memb_clsf);
		cstmt.setString(8, dm.emp_birthday);
		cstmt.setString(9, dm.dth_yn);
		cstmt.setString(10, dm.spos_name);
		cstmt.setString(11, dm.spos_birthday);
		cstmt.setString(12, dm.spos_yn);
		cstmt.setString(13, dm.zipcode);
		cstmt.setString(14, dm.addr);
		cstmt.setString(15, dm.phon_no);
		cstmt.setString(16, dm.tel_no);
		cstmt.setString(17, dm.bank_cd);
		cstmt.setString(18, dm.acct_no);
		cstmt.setString(19, dm.deps_per);
		cstmt.setString(20, dm.lvcmpy_dty);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.incmg_pers_ipadd);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.chg_pers);
		cstmt.registerOutParameter(25, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9502_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("memb_clsf = [" + getMemb_clsf() + "]");
		System.out.println("emp_birthday = [" + getEmp_birthday() + "]");
		System.out.println("dth_yn = [" + getDth_yn() + "]");
		System.out.println("spos_name = [" + getSpos_name() + "]");
		System.out.println("spos_birthday = [" + getSpos_birthday() + "]");
		System.out.println("spos_yn = [" + getSpos_yn() + "]");
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("phon_no = [" + getPhon_no() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("deps_per = [" + getDeps_per() + "]");
		System.out.println("lvcmpy_dty = [" + getLvcmpy_dty() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String memb_clsf = req.getParameter("memb_clsf");
if( memb_clsf == null){
	System.out.println(this.toString+" : memb_clsf is null" );
}else{
	System.out.println(this.toString+" : memb_clsf is "+memb_clsf );
}
String emp_birthday = req.getParameter("emp_birthday");
if( emp_birthday == null){
	System.out.println(this.toString+" : emp_birthday is null" );
}else{
	System.out.println(this.toString+" : emp_birthday is "+emp_birthday );
}
String dth_yn = req.getParameter("dth_yn");
if( dth_yn == null){
	System.out.println(this.toString+" : dth_yn is null" );
}else{
	System.out.println(this.toString+" : dth_yn is "+dth_yn );
}
String spos_name = req.getParameter("spos_name");
if( spos_name == null){
	System.out.println(this.toString+" : spos_name is null" );
}else{
	System.out.println(this.toString+" : spos_name is "+spos_name );
}
String spos_birthday = req.getParameter("spos_birthday");
if( spos_birthday == null){
	System.out.println(this.toString+" : spos_birthday is null" );
}else{
	System.out.println(this.toString+" : spos_birthday is "+spos_birthday );
}
String spos_yn = req.getParameter("spos_yn");
if( spos_yn == null){
	System.out.println(this.toString+" : spos_yn is null" );
}else{
	System.out.println(this.toString+" : spos_yn is "+spos_yn );
}
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String phon_no = req.getParameter("phon_no");
if( phon_no == null){
	System.out.println(this.toString+" : phon_no is null" );
}else{
	System.out.println(this.toString+" : phon_no is "+phon_no );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String deps_per = req.getParameter("deps_per");
if( deps_per == null){
	System.out.println(this.toString+" : deps_per is null" );
}else{
	System.out.println(this.toString+" : deps_per is "+deps_per );
}
String lvcmpy_dty = req.getParameter("lvcmpy_dty");
if( lvcmpy_dty == null){
	System.out.println(this.toString+" : lvcmpy_dty is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dty is "+lvcmpy_dty );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
String emp_birthday = Util.checkString(req.getParameter("emp_birthday"));
String dth_yn = Util.checkString(req.getParameter("dth_yn"));
String spos_name = Util.checkString(req.getParameter("spos_name"));
String spos_birthday = Util.checkString(req.getParameter("spos_birthday"));
String spos_yn = Util.checkString(req.getParameter("spos_yn"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String addr = Util.checkString(req.getParameter("addr"));
String phon_no = Util.checkString(req.getParameter("phon_no"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String deps_per = Util.checkString(req.getParameter("deps_per"));
String lvcmpy_dty = Util.checkString(req.getParameter("lvcmpy_dty"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String memb_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_clsf")));
String emp_birthday = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_birthday")));
String dth_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_yn")));
String spos_name = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_name")));
String spos_birthday = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_birthday")));
String spos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_yn")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String phon_no = Util.Uni2Ksc(Util.checkString(req.getParameter("phon_no")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String deps_per = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_per")));
String lvcmpy_dty = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dty")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setFlnm(flnm);
dm.setMemb_clsf(memb_clsf);
dm.setEmp_birthday(emp_birthday);
dm.setDth_yn(dth_yn);
dm.setSpos_name(spos_name);
dm.setSpos_birthday(spos_birthday);
dm.setSpos_yn(spos_yn);
dm.setZipcode(zipcode);
dm.setAddr(addr);
dm.setPhon_no(phon_no);
dm.setTel_no(tel_no);
dm.setBank_cd(bank_cd);
dm.setAcct_no(acct_no);
dm.setDeps_per(deps_per);
dm.setLvcmpy_dty(lvcmpy_dty);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 31 11:45:19 KST 2017 */