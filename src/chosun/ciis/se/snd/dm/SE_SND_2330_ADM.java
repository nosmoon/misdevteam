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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String tran_cmpy_cd;
	public String dlco_no;
	public String setl_bank;
	public String acct_no;
	public String car_no;
	public String tran_cmpy_nm;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String ptph_no_1;
	public String ptph_no_2;
	public String ptph_no_3;
	public String cntr_dt;
	public String cctr_dt;
	public String use_yn;
	public String mode_sub;
	public String tran_cmpy_cd_sub;
	public String tran_uprc_cd;
	public String uprc_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SND_2330_ADM(){}
	public SE_SND_2330_ADM(String cmpy_cd, String mode, String tran_cmpy_cd, String dlco_no, String setl_bank, String acct_no, String car_no, String tran_cmpy_nm, String zip_1, String zip_2, String addr, String dtls_addr, String tel_no_1, String tel_no_2, String tel_no_3, String ptph_no_1, String ptph_no_2, String ptph_no_3, String cntr_dt, String cctr_dt, String use_yn, String mode_sub, String tran_cmpy_cd_sub, String tran_uprc_cd, String uprc_seq, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.tran_cmpy_cd = tran_cmpy_cd;
		this.dlco_no = dlco_no;
		this.setl_bank = setl_bank;
		this.acct_no = acct_no;
		this.car_no = car_no;
		this.tran_cmpy_nm = tran_cmpy_nm;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.tel_no_1 = tel_no_1;
		this.tel_no_2 = tel_no_2;
		this.tel_no_3 = tel_no_3;
		this.ptph_no_1 = ptph_no_1;
		this.ptph_no_2 = ptph_no_2;
		this.ptph_no_3 = ptph_no_3;
		this.cntr_dt = cntr_dt;
		this.cctr_dt = cctr_dt;
		this.use_yn = use_yn;
		this.mode_sub = mode_sub;
		this.tran_cmpy_cd_sub = tran_cmpy_cd_sub;
		this.tran_uprc_cd = tran_uprc_cd;
		this.uprc_seq = uprc_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setMode_sub(String mode_sub){
		this.mode_sub = mode_sub;
	}

	public void setTran_cmpy_cd_sub(String tran_cmpy_cd_sub){
		this.tran_cmpy_cd_sub = tran_cmpy_cd_sub;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setUprc_seq(String uprc_seq){
		this.uprc_seq = uprc_seq;
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

	public String getMode(){
		return this.mode;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getMode_sub(){
		return this.mode_sub;
	}

	public String getTran_cmpy_cd_sub(){
		return this.tran_cmpy_cd_sub;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getUprc_seq(){
		return this.uprc_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2330_ADM dm = (SE_SND_2330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.tran_cmpy_cd);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.setl_bank);
		cstmt.setString(8, dm.acct_no);
		cstmt.setString(9, dm.car_no);
		cstmt.setString(10, dm.tran_cmpy_nm);
		cstmt.setString(11, dm.zip_1);
		cstmt.setString(12, dm.zip_2);
		cstmt.setString(13, dm.addr);
		cstmt.setString(14, dm.dtls_addr);
		cstmt.setString(15, dm.tel_no_1);
		cstmt.setString(16, dm.tel_no_2);
		cstmt.setString(17, dm.tel_no_3);
		cstmt.setString(18, dm.ptph_no_1);
		cstmt.setString(19, dm.ptph_no_2);
		cstmt.setString(20, dm.ptph_no_3);
		cstmt.setString(21, dm.cntr_dt);
		cstmt.setString(22, dm.cctr_dt);
		cstmt.setString(23, dm.use_yn);
		cstmt.setString(24, dm.mode_sub);
		cstmt.setString(25, dm.tran_cmpy_cd_sub);
		cstmt.setString(26, dm.tran_uprc_cd);
		cstmt.setString(27, dm.uprc_seq);
		cstmt.setString(28, dm.incmg_pers_ip);
		cstmt.setString(29, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2330_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("tran_cmpy_cd = [" + getTran_cmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("setl_bank = [" + getSetl_bank() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("tran_cmpy_nm = [" + getTran_cmpy_nm() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("tel_no_1 = [" + getTel_no_1() + "]");
		System.out.println("tel_no_2 = [" + getTel_no_2() + "]");
		System.out.println("tel_no_3 = [" + getTel_no_3() + "]");
		System.out.println("ptph_no_1 = [" + getPtph_no_1() + "]");
		System.out.println("ptph_no_2 = [" + getPtph_no_2() + "]");
		System.out.println("ptph_no_3 = [" + getPtph_no_3() + "]");
		System.out.println("cntr_dt = [" + getCntr_dt() + "]");
		System.out.println("cctr_dt = [" + getCctr_dt() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("mode_sub = [" + getMode_sub() + "]");
		System.out.println("tran_cmpy_cd_sub = [" + getTran_cmpy_cd_sub() + "]");
		System.out.println("tran_uprc_cd = [" + getTran_uprc_cd() + "]");
		System.out.println("uprc_seq = [" + getUprc_seq() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String tran_cmpy_cd = req.getParameter("tran_cmpy_cd");
if( tran_cmpy_cd == null){
	System.out.println(this.toString+" : tran_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : tran_cmpy_cd is "+tran_cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String setl_bank = req.getParameter("setl_bank");
if( setl_bank == null){
	System.out.println(this.toString+" : setl_bank is null" );
}else{
	System.out.println(this.toString+" : setl_bank is "+setl_bank );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String tran_cmpy_nm = req.getParameter("tran_cmpy_nm");
if( tran_cmpy_nm == null){
	System.out.println(this.toString+" : tran_cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : tran_cmpy_nm is "+tran_cmpy_nm );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String tel_no_1 = req.getParameter("tel_no_1");
if( tel_no_1 == null){
	System.out.println(this.toString+" : tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1 is "+tel_no_1 );
}
String tel_no_2 = req.getParameter("tel_no_2");
if( tel_no_2 == null){
	System.out.println(this.toString+" : tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2 is "+tel_no_2 );
}
String tel_no_3 = req.getParameter("tel_no_3");
if( tel_no_3 == null){
	System.out.println(this.toString+" : tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_3 is "+tel_no_3 );
}
String ptph_no_1 = req.getParameter("ptph_no_1");
if( ptph_no_1 == null){
	System.out.println(this.toString+" : ptph_no_1 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_1 is "+ptph_no_1 );
}
String ptph_no_2 = req.getParameter("ptph_no_2");
if( ptph_no_2 == null){
	System.out.println(this.toString+" : ptph_no_2 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_2 is "+ptph_no_2 );
}
String ptph_no_3 = req.getParameter("ptph_no_3");
if( ptph_no_3 == null){
	System.out.println(this.toString+" : ptph_no_3 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_3 is "+ptph_no_3 );
}
String cntr_dt = req.getParameter("cntr_dt");
if( cntr_dt == null){
	System.out.println(this.toString+" : cntr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_dt is "+cntr_dt );
}
String cctr_dt = req.getParameter("cctr_dt");
if( cctr_dt == null){
	System.out.println(this.toString+" : cctr_dt is null" );
}else{
	System.out.println(this.toString+" : cctr_dt is "+cctr_dt );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String mode_sub = req.getParameter("mode_sub");
if( mode_sub == null){
	System.out.println(this.toString+" : mode_sub is null" );
}else{
	System.out.println(this.toString+" : mode_sub is "+mode_sub );
}
String tran_cmpy_cd_sub = req.getParameter("tran_cmpy_cd_sub");
if( tran_cmpy_cd_sub == null){
	System.out.println(this.toString+" : tran_cmpy_cd_sub is null" );
}else{
	System.out.println(this.toString+" : tran_cmpy_cd_sub is "+tran_cmpy_cd_sub );
}
String tran_uprc_cd = req.getParameter("tran_uprc_cd");
if( tran_uprc_cd == null){
	System.out.println(this.toString+" : tran_uprc_cd is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_cd is "+tran_uprc_cd );
}
String uprc_seq = req.getParameter("uprc_seq");
if( uprc_seq == null){
	System.out.println(this.toString+" : uprc_seq is null" );
}else{
	System.out.println(this.toString+" : uprc_seq is "+uprc_seq );
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
String mode = Util.checkString(req.getParameter("mode"));
String tran_cmpy_cd = Util.checkString(req.getParameter("tran_cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String setl_bank = Util.checkString(req.getParameter("setl_bank"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String car_no = Util.checkString(req.getParameter("car_no"));
String tran_cmpy_nm = Util.checkString(req.getParameter("tran_cmpy_nm"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
String ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));
String ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));
String ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));
String cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
String cctr_dt = Util.checkString(req.getParameter("cctr_dt"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String mode_sub = Util.checkString(req.getParameter("mode_sub"));
String tran_cmpy_cd_sub = Util.checkString(req.getParameter("tran_cmpy_cd_sub"));
String tran_uprc_cd = Util.checkString(req.getParameter("tran_uprc_cd"));
String uprc_seq = Util.checkString(req.getParameter("uprc_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String tran_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String setl_bank = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_bank")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String tran_cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cmpy_nm")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1")));
String tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2")));
String tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3")));
String ptph_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_1")));
String ptph_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_2")));
String ptph_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_3")));
String cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt")));
String cctr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cctr_dt")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String mode_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_sub")));
String tran_cmpy_cd_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cmpy_cd_sub")));
String tran_uprc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_cd")));
String uprc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setTran_cmpy_cd(tran_cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setSetl_bank(setl_bank);
dm.setAcct_no(acct_no);
dm.setCar_no(car_no);
dm.setTran_cmpy_nm(tran_cmpy_nm);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setTel_no_1(tel_no_1);
dm.setTel_no_2(tel_no_2);
dm.setTel_no_3(tel_no_3);
dm.setPtph_no_1(ptph_no_1);
dm.setPtph_no_2(ptph_no_2);
dm.setPtph_no_3(ptph_no_3);
dm.setCntr_dt(cntr_dt);
dm.setCctr_dt(cctr_dt);
dm.setUse_yn(use_yn);
dm.setMode_sub(mode_sub);
dm.setTran_cmpy_cd_sub(tran_cmpy_cd_sub);
dm.setTran_uprc_cd(tran_uprc_cd);
dm.setUprc_seq(uprc_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 18 20:01:13 KST 2009 */