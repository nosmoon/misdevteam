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


public class PL_BAS_1270_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String gurt_pers_seq_arr;
	public String setup_stat_arr;
	public String gurt_pers_flnm_arr;
	public String gurt_pers_prn_1_arr;
	public String gurt_pers_prn_2_arr;
	public String tel_no_1_arr;
	public String tel_no_2_arr;
	public String tel_no_3_arr;
	public String ptph_no_1_arr;
	public String ptph_no_2_arr;
	public String ptph_no_3_arr;
	public String zip_1_arr;
	public String zip_2_arr;
	public String addr_arr;
	public String dtls_addr_arr;
	public String rshp_arr;
	public String remk_arr;

	public PL_BAS_1270_ADM(){}
	public PL_BAS_1270_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode_arr, String dlco_cd_arr, String dlco_seq_arr, String gurt_pers_seq_arr, String setup_stat_arr, String gurt_pers_flnm_arr, String gurt_pers_prn_1_arr, String gurt_pers_prn_2_arr, String tel_no_1_arr, String tel_no_2_arr, String tel_no_3_arr, String ptph_no_1_arr, String ptph_no_2_arr, String ptph_no_3_arr, String zip_1_arr, String zip_2_arr, String addr_arr, String dtls_addr_arr, String rshp_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode_arr = mode_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.gurt_pers_seq_arr = gurt_pers_seq_arr;
		this.setup_stat_arr = setup_stat_arr;
		this.gurt_pers_flnm_arr = gurt_pers_flnm_arr;
		this.gurt_pers_prn_1_arr = gurt_pers_prn_1_arr;
		this.gurt_pers_prn_2_arr = gurt_pers_prn_2_arr;
		this.tel_no_1_arr = tel_no_1_arr;
		this.tel_no_2_arr = tel_no_2_arr;
		this.tel_no_3_arr = tel_no_3_arr;
		this.ptph_no_1_arr = ptph_no_1_arr;
		this.ptph_no_2_arr = ptph_no_2_arr;
		this.ptph_no_3_arr = ptph_no_3_arr;
		this.zip_1_arr = zip_1_arr;
		this.zip_2_arr = zip_2_arr;
		this.addr_arr = addr_arr;
		this.dtls_addr_arr = dtls_addr_arr;
		this.rshp_arr = rshp_arr;
		this.remk_arr = remk_arr;
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

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setDlco_cd_arr(String dlco_cd_arr){
		this.dlco_cd_arr = dlco_cd_arr;
	}

	public void setDlco_seq_arr(String dlco_seq_arr){
		this.dlco_seq_arr = dlco_seq_arr;
	}

	public void setGurt_pers_seq_arr(String gurt_pers_seq_arr){
		this.gurt_pers_seq_arr = gurt_pers_seq_arr;
	}

	public void setSetup_stat_arr(String setup_stat_arr){
		this.setup_stat_arr = setup_stat_arr;
	}

	public void setGurt_pers_flnm_arr(String gurt_pers_flnm_arr){
		this.gurt_pers_flnm_arr = gurt_pers_flnm_arr;
	}

	public void setGurt_pers_prn_1_arr(String gurt_pers_prn_1_arr){
		this.gurt_pers_prn_1_arr = gurt_pers_prn_1_arr;
	}

	public void setGurt_pers_prn_2_arr(String gurt_pers_prn_2_arr){
		this.gurt_pers_prn_2_arr = gurt_pers_prn_2_arr;
	}

	public void setTel_no_1_arr(String tel_no_1_arr){
		this.tel_no_1_arr = tel_no_1_arr;
	}

	public void setTel_no_2_arr(String tel_no_2_arr){
		this.tel_no_2_arr = tel_no_2_arr;
	}

	public void setTel_no_3_arr(String tel_no_3_arr){
		this.tel_no_3_arr = tel_no_3_arr;
	}

	public void setPtph_no_1_arr(String ptph_no_1_arr){
		this.ptph_no_1_arr = ptph_no_1_arr;
	}

	public void setPtph_no_2_arr(String ptph_no_2_arr){
		this.ptph_no_2_arr = ptph_no_2_arr;
	}

	public void setPtph_no_3_arr(String ptph_no_3_arr){
		this.ptph_no_3_arr = ptph_no_3_arr;
	}

	public void setZip_1_arr(String zip_1_arr){
		this.zip_1_arr = zip_1_arr;
	}

	public void setZip_2_arr(String zip_2_arr){
		this.zip_2_arr = zip_2_arr;
	}

	public void setAddr_arr(String addr_arr){
		this.addr_arr = addr_arr;
	}

	public void setDtls_addr_arr(String dtls_addr_arr){
		this.dtls_addr_arr = dtls_addr_arr;
	}

	public void setRshp_arr(String rshp_arr){
		this.rshp_arr = rshp_arr;
	}

	public void setRemk_arr(String remk_arr){
		this.remk_arr = remk_arr;
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

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getDlco_cd_arr(){
		return this.dlco_cd_arr;
	}

	public String getDlco_seq_arr(){
		return this.dlco_seq_arr;
	}

	public String getGurt_pers_seq_arr(){
		return this.gurt_pers_seq_arr;
	}

	public String getSetup_stat_arr(){
		return this.setup_stat_arr;
	}

	public String getGurt_pers_flnm_arr(){
		return this.gurt_pers_flnm_arr;
	}

	public String getGurt_pers_prn_1_arr(){
		return this.gurt_pers_prn_1_arr;
	}

	public String getGurt_pers_prn_2_arr(){
		return this.gurt_pers_prn_2_arr;
	}

	public String getTel_no_1_arr(){
		return this.tel_no_1_arr;
	}

	public String getTel_no_2_arr(){
		return this.tel_no_2_arr;
	}

	public String getTel_no_3_arr(){
		return this.tel_no_3_arr;
	}

	public String getPtph_no_1_arr(){
		return this.ptph_no_1_arr;
	}

	public String getPtph_no_2_arr(){
		return this.ptph_no_2_arr;
	}

	public String getPtph_no_3_arr(){
		return this.ptph_no_3_arr;
	}

	public String getZip_1_arr(){
		return this.zip_1_arr;
	}

	public String getZip_2_arr(){
		return this.zip_2_arr;
	}

	public String getAddr_arr(){
		return this.addr_arr;
	}

	public String getDtls_addr_arr(){
		return this.dtls_addr_arr;
	}

	public String getRshp_arr(){
		return this.rshp_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1270_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1270_ADM dm = (PL_BAS_1270_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.mode_arr);
		cstmt.setString(8, dm.dlco_cd_arr);
		cstmt.setString(9, dm.dlco_seq_arr);
		cstmt.setString(10, dm.gurt_pers_seq_arr);
		cstmt.setString(11, dm.setup_stat_arr);
		cstmt.setString(12, dm.gurt_pers_flnm_arr);
		cstmt.setString(13, dm.gurt_pers_prn_1_arr);
		cstmt.setString(14, dm.gurt_pers_prn_2_arr);
		cstmt.setString(15, dm.tel_no_1_arr);
		cstmt.setString(16, dm.tel_no_2_arr);
		cstmt.setString(17, dm.tel_no_3_arr);
		cstmt.setString(18, dm.ptph_no_1_arr);
		cstmt.setString(19, dm.ptph_no_2_arr);
		cstmt.setString(20, dm.ptph_no_3_arr);
		cstmt.setString(21, dm.zip_1_arr);
		cstmt.setString(22, dm.zip_2_arr);
		cstmt.setString(23, dm.addr_arr);
		cstmt.setString(24, dm.dtls_addr_arr);
		cstmt.setString(25, dm.rshp_arr);
		cstmt.setString(26, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1270_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("mode_arr = [" + getMode_arr() + "]");
		System.out.println("dlco_cd_arr = [" + getDlco_cd_arr() + "]");
		System.out.println("dlco_seq_arr = [" + getDlco_seq_arr() + "]");
		System.out.println("gurt_pers_seq_arr = [" + getGurt_pers_seq_arr() + "]");
		System.out.println("setup_stat_arr = [" + getSetup_stat_arr() + "]");
		System.out.println("gurt_pers_flnm_arr = [" + getGurt_pers_flnm_arr() + "]");
		System.out.println("gurt_pers_prn_1_arr = [" + getGurt_pers_prn_1_arr() + "]");
		System.out.println("gurt_pers_prn_2_arr = [" + getGurt_pers_prn_2_arr() + "]");
		System.out.println("tel_no_1_arr = [" + getTel_no_1_arr() + "]");
		System.out.println("tel_no_2_arr = [" + getTel_no_2_arr() + "]");
		System.out.println("tel_no_3_arr = [" + getTel_no_3_arr() + "]");
		System.out.println("ptph_no_1_arr = [" + getPtph_no_1_arr() + "]");
		System.out.println("ptph_no_2_arr = [" + getPtph_no_2_arr() + "]");
		System.out.println("ptph_no_3_arr = [" + getPtph_no_3_arr() + "]");
		System.out.println("zip_1_arr = [" + getZip_1_arr() + "]");
		System.out.println("zip_2_arr = [" + getZip_2_arr() + "]");
		System.out.println("addr_arr = [" + getAddr_arr() + "]");
		System.out.println("dtls_addr_arr = [" + getDtls_addr_arr() + "]");
		System.out.println("rshp_arr = [" + getRshp_arr() + "]");
		System.out.println("remk_arr = [" + getRemk_arr() + "]");
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
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String dlco_cd_arr = req.getParameter("dlco_cd_arr");
if( dlco_cd_arr == null){
	System.out.println(this.toString+" : dlco_cd_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_arr is "+dlco_cd_arr );
}
String dlco_seq_arr = req.getParameter("dlco_seq_arr");
if( dlco_seq_arr == null){
	System.out.println(this.toString+" : dlco_seq_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_seq_arr is "+dlco_seq_arr );
}
String gurt_pers_seq_arr = req.getParameter("gurt_pers_seq_arr");
if( gurt_pers_seq_arr == null){
	System.out.println(this.toString+" : gurt_pers_seq_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_seq_arr is "+gurt_pers_seq_arr );
}
String setup_stat_arr = req.getParameter("setup_stat_arr");
if( setup_stat_arr == null){
	System.out.println(this.toString+" : setup_stat_arr is null" );
}else{
	System.out.println(this.toString+" : setup_stat_arr is "+setup_stat_arr );
}
String gurt_pers_flnm_arr = req.getParameter("gurt_pers_flnm_arr");
if( gurt_pers_flnm_arr == null){
	System.out.println(this.toString+" : gurt_pers_flnm_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_flnm_arr is "+gurt_pers_flnm_arr );
}
String gurt_pers_prn_1_arr = req.getParameter("gurt_pers_prn_1_arr");
if( gurt_pers_prn_1_arr == null){
	System.out.println(this.toString+" : gurt_pers_prn_1_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_prn_1_arr is "+gurt_pers_prn_1_arr );
}
String gurt_pers_prn_2_arr = req.getParameter("gurt_pers_prn_2_arr");
if( gurt_pers_prn_2_arr == null){
	System.out.println(this.toString+" : gurt_pers_prn_2_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_prn_2_arr is "+gurt_pers_prn_2_arr );
}
String tel_no_1_arr = req.getParameter("tel_no_1_arr");
if( tel_no_1_arr == null){
	System.out.println(this.toString+" : tel_no_1_arr is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_arr is "+tel_no_1_arr );
}
String tel_no_2_arr = req.getParameter("tel_no_2_arr");
if( tel_no_2_arr == null){
	System.out.println(this.toString+" : tel_no_2_arr is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_arr is "+tel_no_2_arr );
}
String tel_no_3_arr = req.getParameter("tel_no_3_arr");
if( tel_no_3_arr == null){
	System.out.println(this.toString+" : tel_no_3_arr is null" );
}else{
	System.out.println(this.toString+" : tel_no_3_arr is "+tel_no_3_arr );
}
String ptph_no_1_arr = req.getParameter("ptph_no_1_arr");
if( ptph_no_1_arr == null){
	System.out.println(this.toString+" : ptph_no_1_arr is null" );
}else{
	System.out.println(this.toString+" : ptph_no_1_arr is "+ptph_no_1_arr );
}
String ptph_no_2_arr = req.getParameter("ptph_no_2_arr");
if( ptph_no_2_arr == null){
	System.out.println(this.toString+" : ptph_no_2_arr is null" );
}else{
	System.out.println(this.toString+" : ptph_no_2_arr is "+ptph_no_2_arr );
}
String ptph_no_3_arr = req.getParameter("ptph_no_3_arr");
if( ptph_no_3_arr == null){
	System.out.println(this.toString+" : ptph_no_3_arr is null" );
}else{
	System.out.println(this.toString+" : ptph_no_3_arr is "+ptph_no_3_arr );
}
String zip_1_arr = req.getParameter("zip_1_arr");
if( zip_1_arr == null){
	System.out.println(this.toString+" : zip_1_arr is null" );
}else{
	System.out.println(this.toString+" : zip_1_arr is "+zip_1_arr );
}
String zip_2_arr = req.getParameter("zip_2_arr");
if( zip_2_arr == null){
	System.out.println(this.toString+" : zip_2_arr is null" );
}else{
	System.out.println(this.toString+" : zip_2_arr is "+zip_2_arr );
}
String addr_arr = req.getParameter("addr_arr");
if( addr_arr == null){
	System.out.println(this.toString+" : addr_arr is null" );
}else{
	System.out.println(this.toString+" : addr_arr is "+addr_arr );
}
String dtls_addr_arr = req.getParameter("dtls_addr_arr");
if( dtls_addr_arr == null){
	System.out.println(this.toString+" : dtls_addr_arr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr_arr is "+dtls_addr_arr );
}
String rshp_arr = req.getParameter("rshp_arr");
if( rshp_arr == null){
	System.out.println(this.toString+" : rshp_arr is null" );
}else{
	System.out.println(this.toString+" : rshp_arr is "+rshp_arr );
}
String remk_arr = req.getParameter("remk_arr");
if( remk_arr == null){
	System.out.println(this.toString+" : remk_arr is null" );
}else{
	System.out.println(this.toString+" : remk_arr is "+remk_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String gurt_pers_seq_arr = Util.checkString(req.getParameter("gurt_pers_seq_arr"));
String setup_stat_arr = Util.checkString(req.getParameter("setup_stat_arr"));
String gurt_pers_flnm_arr = Util.checkString(req.getParameter("gurt_pers_flnm_arr"));
String gurt_pers_prn_1_arr = Util.checkString(req.getParameter("gurt_pers_prn_1_arr"));
String gurt_pers_prn_2_arr = Util.checkString(req.getParameter("gurt_pers_prn_2_arr"));
String tel_no_1_arr = Util.checkString(req.getParameter("tel_no_1_arr"));
String tel_no_2_arr = Util.checkString(req.getParameter("tel_no_2_arr"));
String tel_no_3_arr = Util.checkString(req.getParameter("tel_no_3_arr"));
String ptph_no_1_arr = Util.checkString(req.getParameter("ptph_no_1_arr"));
String ptph_no_2_arr = Util.checkString(req.getParameter("ptph_no_2_arr"));
String ptph_no_3_arr = Util.checkString(req.getParameter("ptph_no_3_arr"));
String zip_1_arr = Util.checkString(req.getParameter("zip_1_arr"));
String zip_2_arr = Util.checkString(req.getParameter("zip_2_arr"));
String addr_arr = Util.checkString(req.getParameter("addr_arr"));
String dtls_addr_arr = Util.checkString(req.getParameter("dtls_addr_arr"));
String rshp_arr = Util.checkString(req.getParameter("rshp_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String gurt_pers_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_seq_arr")));
String setup_stat_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_stat_arr")));
String gurt_pers_flnm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_flnm_arr")));
String gurt_pers_prn_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_prn_1_arr")));
String gurt_pers_prn_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_prn_2_arr")));
String tel_no_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_arr")));
String tel_no_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_arr")));
String tel_no_3_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3_arr")));
String ptph_no_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_1_arr")));
String ptph_no_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_2_arr")));
String ptph_no_3_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_3_arr")));
String zip_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1_arr")));
String zip_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2_arr")));
String addr_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_arr")));
String dtls_addr_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr_arr")));
String rshp_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("rshp_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode_arr(mode_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setGurt_pers_seq_arr(gurt_pers_seq_arr);
dm.setSetup_stat_arr(setup_stat_arr);
dm.setGurt_pers_flnm_arr(gurt_pers_flnm_arr);
dm.setGurt_pers_prn_1_arr(gurt_pers_prn_1_arr);
dm.setGurt_pers_prn_2_arr(gurt_pers_prn_2_arr);
dm.setTel_no_1_arr(tel_no_1_arr);
dm.setTel_no_2_arr(tel_no_2_arr);
dm.setTel_no_3_arr(tel_no_3_arr);
dm.setPtph_no_1_arr(ptph_no_1_arr);
dm.setPtph_no_2_arr(ptph_no_2_arr);
dm.setPtph_no_3_arr(ptph_no_3_arr);
dm.setZip_1_arr(zip_1_arr);
dm.setZip_2_arr(zip_2_arr);
dm.setAddr_arr(addr_arr);
dm.setDtls_addr_arr(dtls_addr_arr);
dm.setRshp_arr(rshp_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */